// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetServiceStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status information of CloudSSO.</p>
     */
    @NameInMap("ServiceStatus")
    public GetServiceStatusResponseBodyServiceStatus serviceStatus;

    public static GetServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceStatusResponseBody self = new GetServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceStatusResponseBody setServiceStatus(GetServiceStatusResponseBodyServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public GetServiceStatusResponseBodyServiceStatus getServiceStatus() {
        return this.serviceStatus;
    }

    public static class GetServiceStatusResponseBodyServiceStatus extends TeaModel {
        /**
         * <p>The ID of your Alibaba Cloud account.</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>Indicates whether you have permissions to enable CloudSSO. Valid values:</p>
         * <br>
         * <p>*   Success: You have permissions to enable CloudSSO.</p>
         * <p>*   Failed: You do not have permissions to enable CloudSSO.</p>
         * <br>
         * <p>>  The value of this parameter is returned only if the value of `Status` is `Disabled`.</p>
         */
        @NameInMap("PrerequisiteCheckResult")
        public String prerequisiteCheckResult;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionsInUse")
        public java.util.List<String> regionsInUse;

        /**
         * <p>Indicates whether CloudSSO is enabled. Valid values:</p>
         * <br>
         * <p>*   Enabled</p>
         * <p>*   Disabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetServiceStatusResponseBodyServiceStatus build(java.util.Map<String, ?> map) throws Exception {
            GetServiceStatusResponseBodyServiceStatus self = new GetServiceStatusResponseBodyServiceStatus();
            return TeaModel.build(map, self);
        }

        public GetServiceStatusResponseBodyServiceStatus setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetServiceStatusResponseBodyServiceStatus setPrerequisiteCheckResult(String prerequisiteCheckResult) {
            this.prerequisiteCheckResult = prerequisiteCheckResult;
            return this;
        }
        public String getPrerequisiteCheckResult() {
            return this.prerequisiteCheckResult;
        }

        public GetServiceStatusResponseBodyServiceStatus setRegionsInUse(java.util.List<String> regionsInUse) {
            this.regionsInUse = regionsInUse;
            return this;
        }
        public java.util.List<String> getRegionsInUse() {
            return this.regionsInUse;
        }

        public GetServiceStatusResponseBodyServiceStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
