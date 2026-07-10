// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentretailvision20260506.models;

import com.aliyun.tea.*;

public class ImportProductsResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The product information.</p>
     */
    @NameInMap("Data")
    public ImportProductsResponseBodyData data;

    /**
     * <p>The error message. This parameter is not returned if the call is successful.</p>
     * 
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
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
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
         * <p>The product ID assigned by the business party. This ID must be unique within the same business party.</p>
         * 
         * <strong>example:</strong>
         * <p>ITEM_001</p>
         */
        @NameInMap("ItemUniqueId")
        public String itemUniqueId;

        /**
         * <p>The platform product ID, which is globally unique.</p>
         * 
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
