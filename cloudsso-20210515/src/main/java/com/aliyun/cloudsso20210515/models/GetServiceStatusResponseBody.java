// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetServiceStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("PrerequisiteCheckResult")
        public String prerequisiteCheckResult;

        @NameInMap("RegionsInUse")
        public java.util.List<String> regionsInUse;

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
