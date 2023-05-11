// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingModelTslPublishedResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetThingModelTslPublishedResponseBodyData data;

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

    public static GetThingModelTslPublishedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetThingModelTslPublishedResponseBody self = new GetThingModelTslPublishedResponseBody();
        return TeaModel.build(map, self);
    }

    public GetThingModelTslPublishedResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetThingModelTslPublishedResponseBody setData(GetThingModelTslPublishedResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetThingModelTslPublishedResponseBodyData getData() {
        return this.data;
    }

    public GetThingModelTslPublishedResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetThingModelTslPublishedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetThingModelTslPublishedResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetThingModelTslPublishedResponseBodyData extends TeaModel {
        /**
         * <p>The string of the TSL model.</p>
         */
        @NameInMap("TslStr")
        public String tslStr;

        /**
         * <p>The URI that is used to store the TSL data in Object Storage Service (OSS). The URI is valid for 60 minutes.</p>
         */
        @NameInMap("TslUri")
        public String tslUri;

        public static GetThingModelTslPublishedResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetThingModelTslPublishedResponseBodyData self = new GetThingModelTslPublishedResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetThingModelTslPublishedResponseBodyData setTslStr(String tslStr) {
            this.tslStr = tslStr;
            return this;
        }
        public String getTslStr() {
            return this.tslStr;
        }

        public GetThingModelTslPublishedResponseBodyData setTslUri(String tslUri) {
            this.tslUri = tslUri;
            return this;
        }
        public String getTslUri() {
            return this.tslUri;
        }

    }

}
