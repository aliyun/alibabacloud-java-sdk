// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterEpisodeGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ProgramId")
    @Validation(required = true)
    public String programId;

    @NameInMap("ItemIds")
    @Validation(required = true)
    public AddCasterEpisodeGroupResponseItemIds itemIds;

    public static AddCasterEpisodeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCasterEpisodeGroupResponse self = new AddCasterEpisodeGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddCasterEpisodeGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCasterEpisodeGroupResponse setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

    public AddCasterEpisodeGroupResponse setItemIds(AddCasterEpisodeGroupResponseItemIds itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public AddCasterEpisodeGroupResponseItemIds getItemIds() {
        return this.itemIds;
    }

    public static class AddCasterEpisodeGroupResponseItemIds extends TeaModel {
        @NameInMap("ItemId")
        @Validation(required = true)
        public java.util.List<String> itemId;

        public static AddCasterEpisodeGroupResponseItemIds build(java.util.Map<String, ?> map) throws Exception {
            AddCasterEpisodeGroupResponseItemIds self = new AddCasterEpisodeGroupResponseItemIds();
            return TeaModel.build(map, self);
        }

        public AddCasterEpisodeGroupResponseItemIds setItemId(java.util.List<String> itemId) {
            this.itemId = itemId;
            return this;
        }
        public java.util.List<String> getItemId() {
            return this.itemId;
        }

    }

}
