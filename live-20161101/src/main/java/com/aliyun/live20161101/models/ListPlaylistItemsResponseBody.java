// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListPlaylistItemsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ProgramItems")
    public java.util.List<ListPlaylistItemsResponseBodyProgramItems> programItems;

    @NameInMap("Total")
    public Integer total;

    public static ListPlaylistItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPlaylistItemsResponseBody self = new ListPlaylistItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPlaylistItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPlaylistItemsResponseBody setProgramItems(java.util.List<ListPlaylistItemsResponseBodyProgramItems> programItems) {
        this.programItems = programItems;
        return this;
    }
    public java.util.List<ListPlaylistItemsResponseBodyProgramItems> getProgramItems() {
        return this.programItems;
    }

    public ListPlaylistItemsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListPlaylistItemsResponseBodyProgramItems extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("ProgramItemId")
        public String programItemId;

        @NameInMap("ProgramId")
        public String programId;

        @NameInMap("ProgramItemName")
        public String programItemName;

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

        public ListPlaylistItemsResponseBodyProgramItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListPlaylistItemsResponseBodyProgramItems setProgramItemId(String programItemId) {
            this.programItemId = programItemId;
            return this;
        }
        public String getProgramItemId() {
            return this.programItemId;
        }

        public ListPlaylistItemsResponseBodyProgramItems setProgramId(String programId) {
            this.programId = programId;
            return this;
        }
        public String getProgramId() {
            return this.programId;
        }

        public ListPlaylistItemsResponseBodyProgramItems setProgramItemName(String programItemName) {
            this.programItemName = programItemName;
            return this;
        }
        public String getProgramItemName() {
            return this.programItemName;
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
