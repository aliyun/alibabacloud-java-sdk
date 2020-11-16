// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterEpisodeGroupContentResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ProgramId")
    @Validation(required = true)
    public String programId;

    @NameInMap("ItemIds")
    @Validation(required = true)
    public AddCasterEpisodeGroupContentResponseItemIds itemIds;

    public static AddCasterEpisodeGroupContentResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCasterEpisodeGroupContentResponse self = new AddCasterEpisodeGroupContentResponse();
        return TeaModel.build(map, self);
    }

    public AddCasterEpisodeGroupContentResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCasterEpisodeGroupContentResponse setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

    public AddCasterEpisodeGroupContentResponse setItemIds(AddCasterEpisodeGroupContentResponseItemIds itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public AddCasterEpisodeGroupContentResponseItemIds getItemIds() {
        return this.itemIds;
    }

    public static class AddCasterEpisodeGroupContentResponseItemIds extends TeaModel {
        @NameInMap("ItemId")
        @Validation(required = true)
        public java.util.List<String> itemId;

        public static AddCasterEpisodeGroupContentResponseItemIds build(java.util.Map<String, ?> map) throws Exception {
            AddCasterEpisodeGroupContentResponseItemIds self = new AddCasterEpisodeGroupContentResponseItemIds();
            return TeaModel.build(map, self);
        }

        public AddCasterEpisodeGroupContentResponseItemIds setItemId(java.util.List<String> itemId) {
            this.itemId = itemId;
            return this;
        }
        public java.util.List<String> getItemId() {
            return this.itemId;
        }

    }

}
