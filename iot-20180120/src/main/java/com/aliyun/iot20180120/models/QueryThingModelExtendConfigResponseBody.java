// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelExtendConfigResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public QueryThingModelExtendConfigResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

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

    public static QueryThingModelExtendConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryThingModelExtendConfigResponseBody self = new QueryThingModelExtendConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryThingModelExtendConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryThingModelExtendConfigResponseBody setData(QueryThingModelExtendConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryThingModelExtendConfigResponseBodyData getData() {
        return this.data;
    }

    public QueryThingModelExtendConfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryThingModelExtendConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryThingModelExtendConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryThingModelExtendConfigResponseBodyData extends TeaModel {
        /**
         * <p>The information of the extended TSL parameters. For more information about the definition of extended parameters, see [CreateThingModel](~~150323~~).</p>
         */
        @NameInMap("Configuration")
        public String configuration;

        public static QueryThingModelExtendConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryThingModelExtendConfigResponseBodyData self = new QueryThingModelExtendConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryThingModelExtendConfigResponseBodyData setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

    }

}
