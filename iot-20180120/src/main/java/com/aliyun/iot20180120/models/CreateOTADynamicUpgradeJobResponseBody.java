// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTADynamicUpgradeJobResponseBody extends TeaModel {
    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The unique identifier of the update batch.</p>
     */
    @NameInMap("Data")
    public CreateOTADynamicUpgradeJobResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The update batch information returned if the call is successful. For more information, see Data.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateOTADynamicUpgradeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOTADynamicUpgradeJobResponseBody self = new CreateOTADynamicUpgradeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOTADynamicUpgradeJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOTADynamicUpgradeJobResponseBody setData(CreateOTADynamicUpgradeJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateOTADynamicUpgradeJobResponseBodyData getData() {
        return this.data;
    }

    public CreateOTADynamicUpgradeJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateOTADynamicUpgradeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOTADynamicUpgradeJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateOTADynamicUpgradeJobResponseBodyData extends TeaModel {
        /**
         * <p>The time when the update batch was created. The time is displayed in UTC.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("UtcCreate")
        public String utcCreate;

        public static CreateOTADynamicUpgradeJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateOTADynamicUpgradeJobResponseBodyData self = new CreateOTADynamicUpgradeJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateOTADynamicUpgradeJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CreateOTADynamicUpgradeJobResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

    }

}
