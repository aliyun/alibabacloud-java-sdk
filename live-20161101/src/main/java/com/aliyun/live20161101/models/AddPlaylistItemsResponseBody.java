// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddPlaylistItemsResponseBody extends TeaModel {
    /**
     * <p>The information about the episodes.</p>
     */
    @NameInMap("Items")
    public AddPlaylistItemsResponseBodyItems items;

    /**
     * <p>The ID of the episode list. You can use the ID as a request parameter in the API operation that is used to remove episodes, query episodes, edit an episode list, delete an episode list, query the information about an episode list, start playing an episode list, or stop playing an episode list.</p>
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
        /**
         * <p>The ID of the episode.</p>
         * 
         * <strong>example:</strong>
         * <p>c09f3d63-eacf-4fbf-bd48-a07a6ba7****</p>
         */
        @NameInMap("ItemId")
        public String itemId;

        /**
         * <p>The name of the episode.</p>
         * 
         * <strong>example:</strong>
         * <p>item1</p>
         */
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
        /**
         * <p>The ID of the episode.</p>
         * 
         * <strong>example:</strong>
         * <p>c09f3d63-eacf-4fbf-bd48-a07a6ba7****</p>
         */
        @NameInMap("ItemId")
        public String itemId;

        /**
         * <p>The name of the episode.</p>
         * 
         * <strong>example:</strong>
         * <p>item2</p>
         */
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
        /**
         * <p>The episodes that failed to be added.</p>
         */
        @NameInMap("FailedItems")
        public java.util.List<AddPlaylistItemsResponseBodyItemsFailedItems> failedItems;

        /**
         * <p>The episodes that were added.</p>
         */
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
