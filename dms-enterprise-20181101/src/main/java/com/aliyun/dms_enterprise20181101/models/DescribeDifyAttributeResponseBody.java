// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DescribeDifyAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>427688B8-ADFB-4C4E-9D45-EF5C1FD6E23D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Root")
    public DescribeDifyAttributeResponseBodyRoot root;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeDifyAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDifyAttributeResponseBody self = new DescribeDifyAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDifyAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDifyAttributeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeDifyAttributeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDifyAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDifyAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDifyAttributeResponseBody setRoot(DescribeDifyAttributeResponseBodyRoot root) {
        this.root = root;
        return this;
    }
    public DescribeDifyAttributeResponseBodyRoot getRoot() {
        return this.root;
    }

    public DescribeDifyAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDifyAttributeResponseBodyRoot extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>92748163-af62-4ca4-ad85-1****</p>
         */
        @NameInMap("AppUuid")
        public String appUuid;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Replicas")
        public String replicas;

        /**
         * <strong>example:</strong>
         * <p>4CU</p>
         */
        @NameInMap("ResourceQuota")
        public String resourceQuota;

        /**
         * <strong>example:</strong>
         * <p>sg-bp1ik7t5d5f24b****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <strong>example:</strong>
         * <p>DEPLOYED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>vsw-bp1tzpv5jfsuoqy****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>vpc-bp1n16nsg8z1kn6****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>339170706****</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDifyAttributeResponseBodyRoot build(java.util.Map<String, ?> map) throws Exception {
            DescribeDifyAttributeResponseBodyRoot self = new DescribeDifyAttributeResponseBodyRoot();
            return TeaModel.build(map, self);
        }

        public DescribeDifyAttributeResponseBodyRoot setAppUuid(String appUuid) {
            this.appUuid = appUuid;
            return this;
        }
        public String getAppUuid() {
            return this.appUuid;
        }

        public DescribeDifyAttributeResponseBodyRoot setReplicas(String replicas) {
            this.replicas = replicas;
            return this;
        }
        public String getReplicas() {
            return this.replicas;
        }

        public DescribeDifyAttributeResponseBodyRoot setResourceQuota(String resourceQuota) {
            this.resourceQuota = resourceQuota;
            return this;
        }
        public String getResourceQuota() {
            return this.resourceQuota;
        }

        public DescribeDifyAttributeResponseBodyRoot setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeDifyAttributeResponseBodyRoot setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDifyAttributeResponseBodyRoot setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDifyAttributeResponseBodyRoot setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDifyAttributeResponseBodyRoot setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public DescribeDifyAttributeResponseBodyRoot setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
