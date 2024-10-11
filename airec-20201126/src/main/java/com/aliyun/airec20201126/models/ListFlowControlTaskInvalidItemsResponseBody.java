// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListFlowControlTaskInvalidItemsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListFlowControlTaskInvalidItemsResponseBodyResult> result;

    public static ListFlowControlTaskInvalidItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowControlTaskInvalidItemsResponseBody self = new ListFlowControlTaskInvalidItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowControlTaskInvalidItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowControlTaskInvalidItemsResponseBody setResult(java.util.List<ListFlowControlTaskInvalidItemsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListFlowControlTaskInvalidItemsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListFlowControlTaskInvalidItemsResponseBodyResultInvalidItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>287723</p>
         */
        @NameInMap("itemId")
        public String itemId;

        /**
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("itemType")
        public String itemType;

        public static ListFlowControlTaskInvalidItemsResponseBodyResultInvalidItems build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlTaskInvalidItemsResponseBodyResultInvalidItems self = new ListFlowControlTaskInvalidItemsResponseBodyResultInvalidItems();
            return TeaModel.build(map, self);
        }

        public ListFlowControlTaskInvalidItemsResponseBodyResultInvalidItems setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public ListFlowControlTaskInvalidItemsResponseBodyResultInvalidItems setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

    }

    public static class ListFlowControlTaskInvalidItemsResponseBodyResult extends TeaModel {
        @NameInMap("invalidItems")
        public java.util.List<ListFlowControlTaskInvalidItemsResponseBodyResultInvalidItems> invalidItems;

        public static ListFlowControlTaskInvalidItemsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListFlowControlTaskInvalidItemsResponseBodyResult self = new ListFlowControlTaskInvalidItemsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListFlowControlTaskInvalidItemsResponseBodyResult setInvalidItems(java.util.List<ListFlowControlTaskInvalidItemsResponseBodyResultInvalidItems> invalidItems) {
            this.invalidItems = invalidItems;
            return this;
        }
        public java.util.List<ListFlowControlTaskInvalidItemsResponseBodyResultInvalidItems> getInvalidItems() {
            return this.invalidItems;
        }

    }

}
