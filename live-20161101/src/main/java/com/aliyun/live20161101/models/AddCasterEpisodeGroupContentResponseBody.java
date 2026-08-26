// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterEpisodeGroupContentResponseBody extends TeaModel {
    @NameInMap("ItemIds")
    public AddCasterEpisodeGroupContentResponseBodyItemIds itemIds;

    /**
     * <p>The program ID. You can use this ID as a request parameter when you create, add, delete, or query program items. You can also use this ID to edit, delete, query, start, or stop a program.</p>
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
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddCasterEpisodeGroupContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCasterEpisodeGroupContentResponseBody self = new AddCasterEpisodeGroupContentResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCasterEpisodeGroupContentResponseBody setItemIds(AddCasterEpisodeGroupContentResponseBodyItemIds itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public AddCasterEpisodeGroupContentResponseBodyItemIds getItemIds() {
        return this.itemIds;
    }

    public AddCasterEpisodeGroupContentResponseBody setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

    public AddCasterEpisodeGroupContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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
