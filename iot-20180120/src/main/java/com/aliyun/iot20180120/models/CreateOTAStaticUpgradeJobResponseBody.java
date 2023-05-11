// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAStaticUpgradeJobResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The update batch information returned if the call is successful. For more information, see Data.</p>
     */
    @NameInMap("Data")
    public CreateOTAStaticUpgradeJobResponseBodyData data;

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
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateOTAStaticUpgradeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOTAStaticUpgradeJobResponseBody self = new CreateOTAStaticUpgradeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOTAStaticUpgradeJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOTAStaticUpgradeJobResponseBody setData(CreateOTAStaticUpgradeJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateOTAStaticUpgradeJobResponseBodyData getData() {
        return this.data;
    }

    public CreateOTAStaticUpgradeJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateOTAStaticUpgradeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOTAStaticUpgradeJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateOTAStaticUpgradeJobResponseBodyData extends TeaModel {
        /**
         * <p>The unique identifier of the update batch.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The time when the update batch was created. The time is displayed in UTC.</p>
         */
        @NameInMap("UtcCreate")
        public String utcCreate;

        public static CreateOTAStaticUpgradeJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateOTAStaticUpgradeJobResponseBodyData self = new CreateOTAStaticUpgradeJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateOTAStaticUpgradeJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CreateOTAStaticUpgradeJobResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

    }

}
