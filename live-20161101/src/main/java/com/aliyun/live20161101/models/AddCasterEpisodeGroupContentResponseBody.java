// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterEpisodeGroupContentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ProgramId")
    public String programId;

    @NameInMap("ItemIds")
    public AddCasterEpisodeGroupContentResponseBodyItemIds itemIds;

    public static AddCasterEpisodeGroupContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCasterEpisodeGroupContentResponseBody self = new AddCasterEpisodeGroupContentResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCasterEpisodeGroupContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCasterEpisodeGroupContentResponseBody setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

    public AddCasterEpisodeGroupContentResponseBody setItemIds(AddCasterEpisodeGroupContentResponseBodyItemIds itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public AddCasterEpisodeGroupContentResponseBodyItemIds getItemIds() {
        return this.itemIds;
    }

    public static class AddCasterEpisodeGroupContentResponseBodyItemIds extends TeaModel {
        @NameInMap("ItemId")
        public java.util.List<String> itemId;

        public static AddCasterEpisodeGroupContentResponseBodyItemIds build(java.util.Map<String, ?> map) throws Exception {
            AddCasterEpisodeGroupContentResponseBodyItemIds self = new AddCasterEpisodeGroupContentResponseBodyItemIds();
            return TeaModel.build(map, self);
        }

        public AddCasterEpisodeGroupContentResponseBodyItemIds setItemId(java.util.List<String> itemId) {
            this.itemId = itemId;
            return this;
        }
        public java.util.List<String> getItemId() {
            return this.itemId;
        }

    }

}
