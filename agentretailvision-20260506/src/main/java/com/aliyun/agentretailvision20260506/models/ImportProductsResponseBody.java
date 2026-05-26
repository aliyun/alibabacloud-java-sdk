// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentretailvision20260506.models;

import com.aliyun.tea.*;

public class ImportProductsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ImportProductsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImportProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportProductsResponseBody self = new ImportProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportProductsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImportProductsResponseBody setData(ImportProductsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImportProductsResponseBodyData getData() {
        return this.data;
    }

    public ImportProductsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportProductsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImportProductsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ITEM_001</p>
         */
        @NameInMap("ItemUniqueId")
        public String itemUniqueId;

        /**
         * <strong>example:</strong>
         * <p>PLAT_001</p>
         */
        @NameInMap("PlatformItemId")
        public String platformItemId;

        public static ImportProductsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImportProductsResponseBodyData self = new ImportProductsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImportProductsResponseBodyData setItemUniqueId(String itemUniqueId) {
            this.itemUniqueId = itemUniqueId;
            return this;
        }
        public String getItemUniqueId() {
            return this.itemUniqueId;
        }

        public ImportProductsResponseBodyData setPlatformItemId(String platformItemId) {
            this.platformItemId = platformItemId;
            return this;
        }
        public String getPlatformItemId() {
            return this.platformItemId;
        }

    }

}
