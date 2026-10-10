// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AppendCasesResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of processing results for appending outbound call cases.</p>
     */
    @NameInMap("Data")
    public java.util.List<AppendCasesResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BC976D32-AC4C-4E0F-8AA9-F4BC6C4E2B3E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AppendCasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppendCasesResponseBody self = new AppendCasesResponseBody();
        return TeaModel.build(map, self);
    }

    public AppendCasesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AppendCasesResponseBody setData(java.util.List<AppendCasesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AppendCasesResponseBodyData> getData() {
        return this.data;
    }

    public AppendCasesResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AppendCasesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AppendCasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AppendCasesResponseBodyData extends TeaModel {
        /**
         * <p>The custom variables of the contact, represented as a JSON string.</p>
         */
        @NameInMap("CustomVariables")
        public String customVariables;

        /**
         * <p>The phone number of the contact.</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The unique identifier of the contact in the customer\&quot;s business system.</p>
         */
        @NameInMap("ReferenceId")
        public String referenceId;

        public static AppendCasesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AppendCasesResponseBodyData self = new AppendCasesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AppendCasesResponseBodyData setCustomVariables(String customVariables) {
            this.customVariables = customVariables;
            return this;
        }
        public String getCustomVariables() {
            return this.customVariables;
        }

        public AppendCasesResponseBodyData setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public AppendCasesResponseBodyData setReferenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public String getReferenceId() {
            return this.referenceId;
        }

    }

}
