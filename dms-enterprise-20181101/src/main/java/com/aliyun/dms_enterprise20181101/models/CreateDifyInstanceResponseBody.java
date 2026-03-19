// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDifyInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateDifyInstanceResponseBodyData data;

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
     * <p>ABCF54A2-4D74-5DE1-9F0F-5221DDEDD9AD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDifyInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDifyInstanceResponseBody self = new CreateDifyInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDifyInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDifyInstanceResponseBody setData(CreateDifyInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDifyInstanceResponseBodyData getData() {
        return this.data;
    }

    public CreateDifyInstanceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateDifyInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateDifyInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDifyInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDifyInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDifyInstanceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("AppUuid")
        public String appUuid;

        /**
         * <strong>example:</strong>
         * <p>abc1-def2-ghi3-jkl4</p>
         */
        @NameInMap("DifyInstanceId")
        public String difyInstanceId;

        /**
         * <strong>example:</strong>
         * <p>Dify Instance</p>
         */
        @NameInMap("DifyInstanceName")
        public String difyInstanceName;

        /**
         * <strong>example:</strong>
         * <p>291XXX</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>trScore</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Replicas")
        public Integer replicas;

        /**
         * <strong>example:</strong>
         * <p>4CU</p>
         */
        @NameInMap("ResourceQuota")
        public String resourceQuota;

        /**
         * <strong>example:</strong>
         * <p>sg-uf6hs6f3m6j5gm6jj0we</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>vsw-bp1m5bwgv41nfoi5el6y1</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>vpc-xxxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>863020290155****</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing-f</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateDifyInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDifyInstanceResponseBodyData self = new CreateDifyInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDifyInstanceResponseBodyData setAppUuid(String appUuid) {
            this.appUuid = appUuid;
            return this;
        }
        public String getAppUuid() {
            return this.appUuid;
        }

        public CreateDifyInstanceResponseBodyData setDifyInstanceId(String difyInstanceId) {
            this.difyInstanceId = difyInstanceId;
            return this;
        }
        public String getDifyInstanceId() {
            return this.difyInstanceId;
        }

        public CreateDifyInstanceResponseBodyData setDifyInstanceName(String difyInstanceName) {
            this.difyInstanceName = difyInstanceName;
            return this;
        }
        public String getDifyInstanceName() {
            return this.difyInstanceName;
        }

        public CreateDifyInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateDifyInstanceResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public CreateDifyInstanceResponseBodyData setReplicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }
        public Integer getReplicas() {
            return this.replicas;
        }

        public CreateDifyInstanceResponseBodyData setResourceQuota(String resourceQuota) {
            this.resourceQuota = resourceQuota;
            return this;
        }
        public String getResourceQuota() {
            return this.resourceQuota;
        }

        public CreateDifyInstanceResponseBodyData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateDifyInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateDifyInstanceResponseBodyData setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateDifyInstanceResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public CreateDifyInstanceResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public CreateDifyInstanceResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
