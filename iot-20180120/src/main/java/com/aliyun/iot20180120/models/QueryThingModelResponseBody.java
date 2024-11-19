// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public QueryThingModelResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The <strong>ProductKey</strong> of the product.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryThingModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryThingModelResponseBody self = new QueryThingModelResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryThingModelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryThingModelResponseBody setData(QueryThingModelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryThingModelResponseBodyData getData() {
        return this.data;
    }

    public QueryThingModelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryThingModelResponseBody setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryThingModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryThingModelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryThingModelResponseBodyData extends TeaModel {
        /**
         * <p>The features of the TSL model. The TSL data format of the default module is different from the TSL data format of a custom module.</p>
         * <p>For more information about the data format of the ThingModelJson parameter, see <a href="https://help.aliyun.com/document_detail/150457.html">Data structure of ThingModelJson</a>.</p>
         */
        @NameInMap("ThingModelJson")
        public String thingModelJson;

        public static QueryThingModelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryThingModelResponseBodyData self = new QueryThingModelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryThingModelResponseBodyData setThingModelJson(String thingModelJson) {
            this.thingModelJson = thingModelJson;
            return this;
        }
        public String getThingModelJson() {
            return this.thingModelJson;
        }

    }

}
