// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingModelTslResponseBody extends TeaModel {
    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The URI that is used to store the TSL data in Object Storage Service (OSS). The URI is valid for 60 minutes.</p>
     */
    @NameInMap("Data")
    public GetThingModelTslResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The TSL data returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetThingModelTslResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetThingModelTslResponseBody self = new GetThingModelTslResponseBody();
        return TeaModel.build(map, self);
    }

    public GetThingModelTslResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetThingModelTslResponseBody setData(GetThingModelTslResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetThingModelTslResponseBodyData getData() {
        return this.data;
    }

    public GetThingModelTslResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetThingModelTslResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetThingModelTslResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetThingModelTslResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{\&quot;schema\&quot;:\&quot;<a href="https://iotx-tsl.oss-ap-southeast-1.aliyuncs.com/schema.json%5C%5C%22,%5C%5C%22profile%5C%5C%22:%7B%5C%5C%22productKey%5C%5C%22:%5C%5C%22a14TeWI****%5C%5C%22%7D,%5C%5C%22properties%5C%5C%22:%5B%7B%5C%5C%22identifier%5C%5C%22:%5C%5C%22Humidity%5C%5C%22%7D%5D%7D">https://iotx-tsl.oss-ap-southeast-1.aliyuncs.com/schema.json\\&quot;,\\&quot;profile\\&quot;:{\\&quot;productKey\\&quot;:\\&quot;a14TeWI****\\&quot;},\\&quot;properties\\&quot;:[{\\&quot;identifier\\&quot;:\\&quot;Humidity\\&quot;}]}</a></p>
         */
        @NameInMap("TslStr")
        public String tslStr;

        /**
         * <p>The string of the TSL model.</p>
         */
        @NameInMap("TslUri")
        public String tslUri;

        public static GetThingModelTslResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetThingModelTslResponseBodyData self = new GetThingModelTslResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetThingModelTslResponseBodyData setTslStr(String tslStr) {
            this.tslStr = tslStr;
            return this;
        }
        public String getTslStr() {
            return this.tslStr;
        }

        public GetThingModelTslResponseBodyData setTslUri(String tslUri) {
            this.tslUri = tslUri;
            return this;
        }
        public String getTslUri() {
            return this.tslUri;
        }

    }

}
