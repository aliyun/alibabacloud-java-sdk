// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EditPlaylistResponseBody extends TeaModel {
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("Items")
    public EditPlaylistResponseBodyItems items;

    @NameInMap("ProgramId")
    public String programId;

    @NameInMap("RequestId")
    public String requestId;

    public static EditPlaylistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditPlaylistResponseBody self = new EditPlaylistResponseBody();
        return TeaModel.build(map, self);
    }

    public EditPlaylistResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
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

    public EditPlaylistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class EditPlaylistResponseBodyItemsFailedItems extends TeaModel {
        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ItemName")
        public String itemName;

        public static EditPlaylistResponseBodyItemsFailedItems build(java.util.Map<String, ?> map) throws Exception {
            EditPlaylistResponseBodyItemsFailedItems self = new EditPlaylistResponseBodyItemsFailedItems();
            return TeaModel.build(map, self);
        }

        public EditPlaylistResponseBodyItemsFailedItems setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public EditPlaylistResponseBodyItemsFailedItems setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

    }

    public static class EditPlaylistResponseBodyItemsSuccessItems extends TeaModel {
        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ItemName")
        public String itemName;

        public static EditPlaylistResponseBodyItemsSuccessItems build(java.util.Map<String, ?> map) throws Exception {
            EditPlaylistResponseBodyItemsSuccessItems self = new EditPlaylistResponseBodyItemsSuccessItems();
            return TeaModel.build(map, self);
        }

        public EditPlaylistResponseBodyItemsSuccessItems setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public EditPlaylistResponseBodyItemsSuccessItems setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

    }

    public static class EditPlaylistResponseBodyItems extends TeaModel {
        @NameInMap("FailedItems")
        public java.util.List<EditPlaylistResponseBodyItemsFailedItems> failedItems;

        @NameInMap("SuccessItems")
        public java.util.List<EditPlaylistResponseBodyItemsSuccessItems> successItems;

        public static EditPlaylistResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            EditPlaylistResponseBodyItems self = new EditPlaylistResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public EditPlaylistResponseBodyItems setFailedItems(java.util.List<EditPlaylistResponseBodyItemsFailedItems> failedItems) {
            this.failedItems = failedItems;
            return this;
        }
        public java.util.List<EditPlaylistResponseBodyItemsFailedItems> getFailedItems() {
            return this.failedItems;
        }

        public EditPlaylistResponseBodyItems setSuccessItems(java.util.List<EditPlaylistResponseBodyItemsSuccessItems> successItems) {
            this.successItems = successItems;
            return this;
        }
        public java.util.List<EditPlaylistResponseBodyItemsSuccessItems> getSuccessItems() {
            return this.successItems;
        }

    }

}
