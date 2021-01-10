// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterEpisodeGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ProgramId")
    public String programId;

    @NameInMap("ItemIds")
    public AddCasterEpisodeGroupResponseBodyItemIds itemIds;

    public static AddCasterEpisodeGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCasterEpisodeGroupResponseBody self = new AddCasterEpisodeGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCasterEpisodeGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCasterEpisodeGroupResponseBody setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

    public AddCasterEpisodeGroupResponseBody setItemIds(AddCasterEpisodeGroupResponseBodyItemIds itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public AddCasterEpisodeGroupResponseBodyItemIds getItemIds() {
        return this.itemIds;
    }

    public static class AddCasterEpisodeGroupResponseBodyItemIds extends TeaModel {
        @NameInMap("ItemId")
        public java.util.List<String> itemId;

        public static AddCasterEpisodeGroupResponseBodyItemIds build(java.util.Map<String, ?> map) throws Exception {
            AddCasterEpisodeGroupResponseBodyItemIds self = new AddCasterEpisodeGroupResponseBodyItemIds();
            return TeaModel.build(map, self);
        }

        public AddCasterEpisodeGroupResponseBodyItemIds setItemId(java.util.List<String> itemId) {
            this.itemId = itemId;
            return this;
        }
        public java.util.List<String> getItemId() {
            return this.itemId;
        }

    }

}
