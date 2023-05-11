// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAVerifyJobResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The task information returned if the call is successful. For more information, see the following parameters.</p>
     */
    @NameInMap("Data")
    public CreateOTAVerifyJobResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request. The ID uniquely identifies this request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateOTAVerifyJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOTAVerifyJobResponseBody self = new CreateOTAVerifyJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOTAVerifyJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOTAVerifyJobResponseBody setData(CreateOTAVerifyJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateOTAVerifyJobResponseBodyData getData() {
        return this.data;
    }

    public CreateOTAVerifyJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateOTAVerifyJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOTAVerifyJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateOTAVerifyJobResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the verification task.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The time when the verification task was created. The time is displayed in UTC.</p>
         */
        @NameInMap("UtcCreate")
        public String utcCreate;

        public static CreateOTAVerifyJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateOTAVerifyJobResponseBodyData self = new CreateOTAVerifyJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateOTAVerifyJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CreateOTAVerifyJobResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

    }

}
