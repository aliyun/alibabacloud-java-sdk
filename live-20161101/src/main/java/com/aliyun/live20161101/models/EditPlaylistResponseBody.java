// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EditPlaylistResponseBody extends TeaModel {
    /**
     * <p>The ID of the production studio. Use this ID as a request parameter to add a callback or a virtual studio layout.</p>
     * 
     * <strong>example:</strong>
     * <p>0e94d1f4-1a65-445c-9dcf-de8b3b8d****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The list of added playlist items.</p>
     */
    @NameInMap("Items")
    public EditPlaylistResponseBodyItems items;

    /**
     * <p>The playlist ID. Use this ID as a request parameter to delete, query, start, or stop the playlist.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
     */
    @NameInMap("ProgramId")
    public String programId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0d-f228-4a64-af62-20e91b96****</p>
     */
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
        /**
         * <p>The ID of the playlist item.</p>
         * 
         * <strong>example:</strong>
         * <p>c09f3d63-eacf-4fbf-bd48-a07a6ba7****</p>
         */
        @NameInMap("ItemId")
        public String itemId;

        /**
         * <p>The name of the playlist item.</p>
         * 
         * <strong>example:</strong>
         * <p>item2</p>
         */
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
        /**
         * <p>The ID of the playlist item.</p>
         * 
         * <strong>example:</strong>
         * <p>c09f3d63-eacf-4fbf-bd48-a07a6ba7****</p>
         */
        @NameInMap("ItemId")
        public String itemId;

        /**
         * <p>The name of the playlist item.</p>
         * 
         * <strong>example:</strong>
         * <p>item1</p>
         */
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
        /**
         * <p>The list of playlist items that failed to be added.</p>
         */
        @NameInMap("FailedItems")
        public java.util.List<EditPlaylistResponseBodyItemsFailedItems> failedItems;

        /**
         * <p>The list of playlist items that were successfully added.</p>
         */
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
