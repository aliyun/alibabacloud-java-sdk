// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeCloudServiceTypeStatusResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeCloudServiceTypeStatusResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCloudServiceTypeStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudServiceTypeStatusResponseBody self = new DescribeCloudServiceTypeStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudServiceTypeStatusResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeCloudServiceTypeStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudServiceTypeStatusResponseBody setResult(DescribeCloudServiceTypeStatusResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeCloudServiceTypeStatusResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeCloudServiceTypeStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCloudServiceTypeStatusResponseBodyResult extends TeaModel {
        @NameInMap("GrantPrivilegeUrl")
        public String grantPrivilegeUrl;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("ServiceOpenStatus")
        public Boolean serviceOpenStatus;

        @NameInMap("ServiceOpenUrl")
        public String serviceOpenUrl;

        @NameInMap("ServicePrivilegeStatus")
        public Boolean servicePrivilegeStatus;

        @NameInMap("ServiceType")
        public String serviceType;

        public static DescribeCloudServiceTypeStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudServiceTypeStatusResponseBodyResult self = new DescribeCloudServiceTypeStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeCloudServiceTypeStatusResponseBodyResult setGrantPrivilegeUrl(String grantPrivilegeUrl) {
            this.grantPrivilegeUrl = grantPrivilegeUrl;
            return this;
        }
        public String getGrantPrivilegeUrl() {
            return this.grantPrivilegeUrl;
        }

        public DescribeCloudServiceTypeStatusResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public DescribeCloudServiceTypeStatusResponseBodyResult setServiceOpenStatus(Boolean serviceOpenStatus) {
            this.serviceOpenStatus = serviceOpenStatus;
            return this;
        }
        public Boolean getServiceOpenStatus() {
            return this.serviceOpenStatus;
        }

        public DescribeCloudServiceTypeStatusResponseBodyResult setServiceOpenUrl(String serviceOpenUrl) {
            this.serviceOpenUrl = serviceOpenUrl;
            return this;
        }
        public String getServiceOpenUrl() {
            return this.serviceOpenUrl;
        }

        public DescribeCloudServiceTypeStatusResponseBodyResult setServicePrivilegeStatus(Boolean servicePrivilegeStatus) {
            this.servicePrivilegeStatus = servicePrivilegeStatus;
            return this;
        }
        public Boolean getServicePrivilegeStatus() {
            return this.servicePrivilegeStatus;
        }

        public DescribeCloudServiceTypeStatusResponseBodyResult setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

    }

}
