// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddPlaylistItemsResponseBody extends TeaModel {
    @NameInMap("Items")
    public AddPlaylistItemsResponseBodyItems items;

    @NameInMap("ProgramId")
    public String programId;

    @NameInMap("RequestId")
    public String requestId;

    public static AddPlaylistItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPlaylistItemsResponseBody self = new AddPlaylistItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPlaylistItemsResponseBody setItems(AddPlaylistItemsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public AddPlaylistItemsResponseBodyItems getItems() {
        return this.items;
    }

    public AddPlaylistItemsResponseBody setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

    public AddPlaylistItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddPlaylistItemsResponseBodyItemsFailedItems extends TeaModel {
        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ItemName")
        public String itemName;

        public static AddPlaylistItemsResponseBodyItemsFailedItems build(java.util.Map<String, ?> map) throws Exception {
            AddPlaylistItemsResponseBodyItemsFailedItems self = new AddPlaylistItemsResponseBodyItemsFailedItems();
            return TeaModel.build(map, self);
        }

        public AddPlaylistItemsResponseBodyItemsFailedItems setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public AddPlaylistItemsResponseBodyItemsFailedItems setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

    }

    public static class AddPlaylistItemsResponseBodyItemsSuccessItems extends TeaModel {
        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ItemName")
        public String itemName;

        public static AddPlaylistItemsResponseBodyItemsSuccessItems build(java.util.Map<String, ?> map) throws Exception {
            AddPlaylistItemsResponseBodyItemsSuccessItems self = new AddPlaylistItemsResponseBodyItemsSuccessItems();
            return TeaModel.build(map, self);
        }

        public AddPlaylistItemsResponseBodyItemsSuccessItems setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public AddPlaylistItemsResponseBodyItemsSuccessItems setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

    }

    public static class AddPlaylistItemsResponseBodyItems extends TeaModel {
        @NameInMap("FailedItems")
        public java.util.List<AddPlaylistItemsResponseBodyItemsFailedItems> failedItems;

        @NameInMap("SuccessItems")
        public java.util.List<AddPlaylistItemsResponseBodyItemsSuccessItems> successItems;

        public static AddPlaylistItemsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            AddPlaylistItemsResponseBodyItems self = new AddPlaylistItemsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public AddPlaylistItemsResponseBodyItems setFailedItems(java.util.List<AddPlaylistItemsResponseBodyItemsFailedItems> failedItems) {
            this.failedItems = failedItems;
            return this;
        }
        public java.util.List<AddPlaylistItemsResponseBodyItemsFailedItems> getFailedItems() {
            return this.failedItems;
        }

        public AddPlaylistItemsResponseBodyItems setSuccessItems(java.util.List<AddPlaylistItemsResponseBodyItemsSuccessItems> successItems) {
            this.successItems = successItems;
            return this;
        }
        public java.util.List<AddPlaylistItemsResponseBodyItemsSuccessItems> getSuccessItems() {
            return this.successItems;
        }

    }

}
