// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelPublishedResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public QueryThingModelPublishedResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ProductKey of the product.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryThingModelPublishedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryThingModelPublishedResponseBody self = new QueryThingModelPublishedResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryThingModelPublishedResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryThingModelPublishedResponseBody setData(QueryThingModelPublishedResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryThingModelPublishedResponseBodyData getData() {
        return this.data;
    }

    public QueryThingModelPublishedResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryThingModelPublishedResponseBody setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryThingModelPublishedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryThingModelPublishedResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryThingModelPublishedResponseBodyData extends TeaModel {
        /**
         * <p>Define features for the TSL model. For more information about the data format of the ThingModelJson parameter, see [Data structure of ThingModelJson](~~150457~~).</p>
         */
        @NameInMap("ThingModelJson")
        public String thingModelJson;

        public static QueryThingModelPublishedResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryThingModelPublishedResponseBodyData self = new QueryThingModelPublishedResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryThingModelPublishedResponseBodyData setThingModelJson(String thingModelJson) {
            this.thingModelJson = thingModelJson;
            return this;
        }
        public String getThingModelJson() {
            return this.thingModelJson;
        }

    }

}
