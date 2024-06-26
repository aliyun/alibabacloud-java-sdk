// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeCloudServiceOrganizationStatusResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeCloudServiceOrganizationStatusResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCloudServiceOrganizationStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudServiceOrganizationStatusResponseBody self = new DescribeCloudServiceOrganizationStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudServiceOrganizationStatusResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeCloudServiceOrganizationStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudServiceOrganizationStatusResponseBody setResult(java.util.List<DescribeCloudServiceOrganizationStatusResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeCloudServiceOrganizationStatusResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeCloudServiceOrganizationStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCloudServiceOrganizationStatusResponseBodyResult extends TeaModel {
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

        public static DescribeCloudServiceOrganizationStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudServiceOrganizationStatusResponseBodyResult self = new DescribeCloudServiceOrganizationStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeCloudServiceOrganizationStatusResponseBodyResult setGrantPrivilegeUrl(String grantPrivilegeUrl) {
            this.grantPrivilegeUrl = grantPrivilegeUrl;
            return this;
        }
        public String getGrantPrivilegeUrl() {
            return this.grantPrivilegeUrl;
        }

        public DescribeCloudServiceOrganizationStatusResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public DescribeCloudServiceOrganizationStatusResponseBodyResult setServiceOpenStatus(Boolean serviceOpenStatus) {
            this.serviceOpenStatus = serviceOpenStatus;
            return this;
        }
        public Boolean getServiceOpenStatus() {
            return this.serviceOpenStatus;
        }

        public DescribeCloudServiceOrganizationStatusResponseBodyResult setServiceOpenUrl(String serviceOpenUrl) {
            this.serviceOpenUrl = serviceOpenUrl;
            return this;
        }
        public String getServiceOpenUrl() {
            return this.serviceOpenUrl;
        }

        public DescribeCloudServiceOrganizationStatusResponseBodyResult setServicePrivilegeStatus(Boolean servicePrivilegeStatus) {
            this.servicePrivilegeStatus = servicePrivilegeStatus;
            return this;
        }
        public Boolean getServicePrivilegeStatus() {
            return this.servicePrivilegeStatus;
        }

        public DescribeCloudServiceOrganizationStatusResponseBodyResult setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

    }

}
