// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListPlaylistItemsResponseBody extends TeaModel {
    /**
     * <p>The episodes.</p>
     */
    @NameInMap("ProgramItems")
    public java.util.List<ListPlaylistItemsResponseBodyProgramItems> programItems;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0d-f228-4a64-af62-20e91b9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of episodes.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListPlaylistItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPlaylistItemsResponseBody self = new ListPlaylistItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPlaylistItemsResponseBody setProgramItems(java.util.List<ListPlaylistItemsResponseBodyProgramItems> programItems) {
        this.programItems = programItems;
        return this;
    }
    public java.util.List<ListPlaylistItemsResponseBodyProgramItems> getProgramItems() {
        return this.programItems;
    }

    public ListPlaylistItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPlaylistItemsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListPlaylistItemsResponseBodyProgramItems extends TeaModel {
        /**
         * <p>The sequence number of the episode in the query result.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The ID of the episode list. You can use the ID as a request parameter in the API operation that is used to edit the episode list, delete the episode list, query the information about the episode list, start the episode list, or stop the episode list.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
         */
        @NameInMap("ProgramId")
        public String programId;

        /**
         * <p>The ID of the episode.</p>
         * 
         * <strong>example:</strong>
         * <p>c10f3d63-eacf-4fbf-bd48-a07a6ba7****</p>
         */
        @NameInMap("ProgramItemId")
        public String programItemId;

        /**
         * <p>The name of the episode.</p>
         * 
         * <strong>example:</strong>
         * <p>playlistItem1</p>
         */
        @NameInMap("ProgramItemName")
        public String programItemName;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>vod</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>asdfasdf8as9df8sa9df89****</p>
         */
        @NameInMap("ResourceValue")
        public String resourceValue;

        public static ListPlaylistItemsResponseBodyProgramItems build(java.util.Map<String, ?> map) throws Exception {
            ListPlaylistItemsResponseBodyProgramItems self = new ListPlaylistItemsResponseBodyProgramItems();
            return TeaModel.build(map, self);
        }

        public ListPlaylistItemsResponseBodyProgramItems setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListPlaylistItemsResponseBodyProgramItems setProgramId(String programId) {
            this.programId = programId;
            return this;
        }
        public String getProgramId() {
            return this.programId;
        }

        public ListPlaylistItemsResponseBodyProgramItems setProgramItemId(String programItemId) {
            this.programItemId = programItemId;
            return this;
        }
        public String getProgramItemId() {
            return this.programItemId;
        }

        public ListPlaylistItemsResponseBodyProgramItems setProgramItemName(String programItemName) {
            this.programItemName = programItemName;
            return this;
        }
        public String getProgramItemName() {
            return this.programItemName;
        }

        public ListPlaylistItemsResponseBodyProgramItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListPlaylistItemsResponseBodyProgramItems setResourceValue(String resourceValue) {
            this.resourceValue = resourceValue;
            return this;
        }
        public String getResourceValue() {
            return this.resourceValue;
        }

    }

}
