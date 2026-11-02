// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateGatewayApiGroupResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("ApiGroup")
    public CreateGatewayApiGroupResponseBodyApiGroup apiGroup;

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

    public static CreateGatewayApiGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayApiGroupResponseBody self = new CreateGatewayApiGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGatewayApiGroupResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateGatewayApiGroupResponseBody setApiGroup(CreateGatewayApiGroupResponseBodyApiGroup apiGroup) {
        this.apiGroup = apiGroup;
        return this;
    }
    public CreateGatewayApiGroupResponseBodyApiGroup getApiGroup() {
        return this.apiGroup;
    }

    public CreateGatewayApiGroupResponseBody setErrorField(String errorField) {
        this.errorField = errorField;
        return this;
    }
    public String getErrorField() {
        return this.errorField;
    }

    public CreateGatewayApiGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateGatewayApiGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGatewayApiGroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateGatewayApiGroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateGatewayApiGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateGatewayApiGroupResponseBodyApiGroup extends TeaModel {
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

        public static CreateGatewayApiGroupResponseBodyApiGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayApiGroupResponseBodyApiGroup self = new CreateGatewayApiGroupResponseBodyApiGroup();
            return TeaModel.build(map, self);
        }

        public CreateGatewayApiGroupResponseBodyApiGroup setCenters(java.util.Map<String, ?> centers) {
            this.centers = centers;
            return this;
        }
        public java.util.Map<String, ?> getCenters() {
            return this.centers;
        }

        public CreateGatewayApiGroupResponseBodyApiGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateGatewayApiGroupResponseBodyApiGroup setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public CreateGatewayApiGroupResponseBodyApiGroup setEnableMTLS(Boolean enableMTLS) {
            this.enableMTLS = enableMTLS;
            return this;
        }
        public Boolean getEnableMTLS() {
            return this.enableMTLS;
        }

        public CreateGatewayApiGroupResponseBodyApiGroup setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public CreateGatewayApiGroupResponseBodyApiGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateGatewayApiGroupResponseBodyApiGroup setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public CreateGatewayApiGroupResponseBodyApiGroup setHttpsModel(Boolean httpsModel) {
            this.httpsModel = httpsModel;
            return this;
        }
        public Boolean getHttpsModel() {
            return this.httpsModel;
        }

        public CreateGatewayApiGroupResponseBodyApiGroup setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateGatewayApiGroupResponseBodyApiGroup setInstancePort(Integer instancePort) {
            this.instancePort = instancePort;
            return this;
        }
        public Integer getInstancePort() {
            return this.instancePort;
        }

        public CreateGatewayApiGroupResponseBodyApiGroup setRegionMode(Boolean regionMode) {
            this.regionMode = regionMode;
            return this;
        }
        public Boolean getRegionMode() {
            return this.regionMode;
        }

        public CreateGatewayApiGroupResponseBodyApiGroup setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public CreateGatewayApiGroupResponseBodyApiGroup setUpstreamType(String upstreamType) {
            this.upstreamType = upstreamType;
            return this;
        }
        public String getUpstreamType() {
            return this.upstreamType;
        }

        public CreateGatewayApiGroupResponseBodyApiGroup setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public CreateGatewayApiGroupResponseBodyApiGroup setVpcModel(Boolean vpcModel) {
            this.vpcModel = vpcModel;
            return this;
        }
        public Boolean getVpcModel() {
            return this.vpcModel;
        }

    }

}
