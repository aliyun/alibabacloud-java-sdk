// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UpdateGatewayApiGroupResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("ApiGroup")
    public UpdateGatewayApiGroupResponseBodyApiGroup apiGroup;

    @NameInMap("ErrorField")
    public String errorField;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateGatewayApiGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayApiGroupResponseBody self = new UpdateGatewayApiGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayApiGroupResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UpdateGatewayApiGroupResponseBody setApiGroup(UpdateGatewayApiGroupResponseBodyApiGroup apiGroup) {
        this.apiGroup = apiGroup;
        return this;
    }
    public UpdateGatewayApiGroupResponseBodyApiGroup getApiGroup() {
        return this.apiGroup;
    }

    public UpdateGatewayApiGroupResponseBody setErrorField(String errorField) {
        this.errorField = errorField;
        return this;
    }
    public String getErrorField() {
        return this.errorField;
    }

    public UpdateGatewayApiGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateGatewayApiGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateGatewayApiGroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateGatewayApiGroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateGatewayApiGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateGatewayApiGroupResponseBodyApiGroup extends TeaModel {
        @NameInMap("Centers")
        public java.util.Map<String, ?> centers;

        @NameInMap("Description")
        public String description;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("EnableMTLS")
        public Boolean enableMTLS;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Host")
        public String host;

        @NameInMap("HttpsModel")
        public Boolean httpsModel;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstancePort")
        public Integer instancePort;

        @NameInMap("RegionMode")
        public Boolean regionMode;

        @NameInMap("Timeout")
        public Integer timeout;

        @NameInMap("UpstreamType")
        public String upstreamType;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcModel")
        public Boolean vpcModel;

        public static UpdateGatewayApiGroupResponseBodyApiGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayApiGroupResponseBodyApiGroup self = new UpdateGatewayApiGroupResponseBodyApiGroup();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayApiGroupResponseBodyApiGroup setCenters(java.util.Map<String, ?> centers) {
            this.centers = centers;
            return this;
        }
        public java.util.Map<String, ?> getCenters() {
            return this.centers;
        }

        public UpdateGatewayApiGroupResponseBodyApiGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateGatewayApiGroupResponseBodyApiGroup setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public UpdateGatewayApiGroupResponseBodyApiGroup setEnableMTLS(Boolean enableMTLS) {
            this.enableMTLS = enableMTLS;
            return this;
        }
        public Boolean getEnableMTLS() {
            return this.enableMTLS;
        }

        public UpdateGatewayApiGroupResponseBodyApiGroup setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public UpdateGatewayApiGroupResponseBodyApiGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateGatewayApiGroupResponseBodyApiGroup setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateGatewayApiGroupResponseBodyApiGroup setHttpsModel(Boolean httpsModel) {
            this.httpsModel = httpsModel;
            return this;
        }
        public Boolean getHttpsModel() {
            return this.httpsModel;
        }

        public UpdateGatewayApiGroupResponseBodyApiGroup setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateGatewayApiGroupResponseBodyApiGroup setInstancePort(Integer instancePort) {
            this.instancePort = instancePort;
            return this;
        }
        public Integer getInstancePort() {
            return this.instancePort;
        }

        public UpdateGatewayApiGroupResponseBodyApiGroup setRegionMode(Boolean regionMode) {
            this.regionMode = regionMode;
            return this;
        }
        public Boolean getRegionMode() {
            return this.regionMode;
        }

        public UpdateGatewayApiGroupResponseBodyApiGroup setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public UpdateGatewayApiGroupResponseBodyApiGroup setUpstreamType(String upstreamType) {
            this.upstreamType = upstreamType;
            return this;
        }
        public String getUpstreamType() {
            return this.upstreamType;
        }

        public UpdateGatewayApiGroupResponseBodyApiGroup setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public UpdateGatewayApiGroupResponseBodyApiGroup setVpcModel(Boolean vpcModel) {
            this.vpcModel = vpcModel;
            return this;
        }
        public Boolean getVpcModel() {
            return this.vpcModel;
        }

    }

}
