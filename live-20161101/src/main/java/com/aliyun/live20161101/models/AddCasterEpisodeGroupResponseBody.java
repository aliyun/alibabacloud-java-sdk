// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterEpisodeGroupResponseBody extends TeaModel {
    @NameInMap("ItemIds")
    public AddCasterEpisodeGroupResponseBodyItemIds itemIds;

    /**
     * <p>The ID of the episode list that was added. Record the ID as it can be used to manage the program being added.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68X****</p>
     */
    @NameInMap("ProgramId")
    public String programId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddCasterEpisodeGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCasterEpisodeGroupResponseBody self = new AddCasterEpisodeGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCasterEpisodeGroupResponseBody setItemIds(AddCasterEpisodeGroupResponseBodyItemIds itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public AddCasterEpisodeGroupResponseBodyItemIds getItemIds() {
        return this.itemIds;
    }

    public AddCasterEpisodeGroupResponseBody setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

    public AddCasterEpisodeGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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
