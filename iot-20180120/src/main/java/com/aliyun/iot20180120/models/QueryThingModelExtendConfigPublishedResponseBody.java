// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryThingModelExtendConfigPublishedResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public QueryThingModelExtendConfigPublishedResponseBodyData data;

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

    public static QueryThingModelExtendConfigPublishedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryThingModelExtendConfigPublishedResponseBody self = new QueryThingModelExtendConfigPublishedResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryThingModelExtendConfigPublishedResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryThingModelExtendConfigPublishedResponseBody setData(QueryThingModelExtendConfigPublishedResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryThingModelExtendConfigPublishedResponseBodyData getData() {
        return this.data;
    }

    public QueryThingModelExtendConfigPublishedResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryThingModelExtendConfigPublishedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryThingModelExtendConfigPublishedResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryThingModelExtendConfigPublishedResponseBodyData extends TeaModel {
        /**
         * <p>The information about the extended TSL parameters. For more information about the definition of extended parameters, see [CreateThingModel](~~150323~~).</p>
         * <br>
         * <p>For more information, see [Data structure of ThingModelJson](~~150457~~).</p>
         */
        @NameInMap("Configuration")
        public String configuration;

        public static QueryThingModelExtendConfigPublishedResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryThingModelExtendConfigPublishedResponseBodyData self = new QueryThingModelExtendConfigPublishedResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryThingModelExtendConfigPublishedResponseBodyData setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

    }

}
