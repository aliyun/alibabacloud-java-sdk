// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EditPlaylistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Items")
    public EditPlaylistResponseBodyItems items;

    @NameInMap("ProgramId")
    public String programId;

    @NameInMap("CasterId")
    public String casterId;

    public static EditPlaylistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditPlaylistResponseBody self = new EditPlaylistResponseBody();
        return TeaModel.build(map, self);
    }

    public EditPlaylistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EditPlaylistResponseBody setItems(EditPlaylistResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public EditPlaylistResponseBodyItems getItems() {
        return this.items;
    }

    public EditPlaylistResponseBody setProgramId(String programId) {
        this.programId = programId;
        return this;
    }
    public String getProgramId() {
        return this.programId;
    }

    public EditPlaylistResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public static class EditPlaylistResponseBodyItemsSuccessItems extends TeaModel {
        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("ItemId")
        public String itemId;

        public static EditPlaylistResponseBodyItemsSuccessItems build(java.util.Map<String, ?> map) throws Exception {
            EditPlaylistResponseBodyItemsSuccessItems self = new EditPlaylistResponseBodyItemsSuccessItems();
            return TeaModel.build(map, self);
        }

        public EditPlaylistResponseBodyItemsSuccessItems setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public EditPlaylistResponseBodyItemsSuccessItems setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

    }

    public static class EditPlaylistResponseBodyItemsFailedItems extends TeaModel {
        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("ItemId")
        public String itemId;

        public static EditPlaylistResponseBodyItemsFailedItems build(java.util.Map<String, ?> map) throws Exception {
            EditPlaylistResponseBodyItemsFailedItems self = new EditPlaylistResponseBodyItemsFailedItems();
            return TeaModel.build(map, self);
        }

        public EditPlaylistResponseBodyItemsFailedItems setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public EditPlaylistResponseBodyItemsFailedItems setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

    }

    public static class EditPlaylistResponseBodyItems extends TeaModel {
        @NameInMap("SuccessItems")
        public java.util.List<EditPlaylistResponseBodyItemsSuccessItems> successItems;

        @NameInMap("FailedItems")
        public java.util.List<EditPlaylistResponseBodyItemsFailedItems> failedItems;

        public static EditPlaylistResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            EditPlaylistResponseBodyItems self = new EditPlaylistResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public EditPlaylistResponseBodyItems setSuccessItems(java.util.List<EditPlaylistResponseBodyItemsSuccessItems> successItems) {
            this.successItems = successItems;
            return this;
        }
        public java.util.List<EditPlaylistResponseBodyItemsSuccessItems> getSuccessItems() {
            return this.successItems;
        }

        public EditPlaylistResponseBodyItems setFailedItems(java.util.List<EditPlaylistResponseBodyItemsFailedItems> failedItems) {
            this.failedItems = failedItems;
            return this;
        }
        public java.util.List<EditPlaylistResponseBodyItemsFailedItems> getFailedItems() {
            return this.failedItems;
        }

    }

}
