// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListPlaylistItemsResponseBody extends TeaModel {
    /**
     * <p>The list of playlist items.</p>
     */
    @NameInMap("ProgramItems")
    public java.util.List<ListPlaylistItemsResponseBodyProgramItems> programItems;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0d-f228-4a64-af62-20e91b9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of playlist items.</p>
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
         * <p>The orchestration index.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The ID of the playlist. You can use this ID as a request parameter when you edit, delete, query, start, or stop the playlist.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
         */
        @NameInMap("ProgramId")
        public String programId;

        /**
         * <p>The ID of the playlist item.</p>
         * 
         * <strong>example:</strong>
         * <p>c10f3d63-eacf-4fbf-bd48-a07a6ba7****</p>
         */
        @NameInMap("ProgramItemId")
        public String programItemId;

        /**
         * <p>The name of the playlist item.</p>
         * 
         * <strong>example:</strong>
         * <p>playlistItem1</p>
         */
        @NameInMap("ProgramItemName")
        public String programItemName;

        /**
         * <p>The type of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>vod</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the resource.</p>
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
