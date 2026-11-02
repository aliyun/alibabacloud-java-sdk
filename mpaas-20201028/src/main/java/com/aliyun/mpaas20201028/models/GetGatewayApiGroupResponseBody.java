// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetGatewayApiGroupResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("ApiGroup")
    public GetGatewayApiGroupResponseBodyApiGroup apiGroup;

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

    public static GetGatewayApiGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayApiGroupResponseBody self = new GetGatewayApiGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayApiGroupResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetGatewayApiGroupResponseBody setApiGroup(GetGatewayApiGroupResponseBodyApiGroup apiGroup) {
        this.apiGroup = apiGroup;
        return this;
    }
    public GetGatewayApiGroupResponseBodyApiGroup getApiGroup() {
        return this.apiGroup;
    }

    public GetGatewayApiGroupResponseBody setErrorField(String errorField) {
        this.errorField = errorField;
        return this;
    }
    public String getErrorField() {
        return this.errorField;
    }

    public GetGatewayApiGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetGatewayApiGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGatewayApiGroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetGatewayApiGroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetGatewayApiGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetGatewayApiGroupResponseBodyApiGroup extends TeaModel {
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

        public static GetGatewayApiGroupResponseBodyApiGroup build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayApiGroupResponseBodyApiGroup self = new GetGatewayApiGroupResponseBodyApiGroup();
            return TeaModel.build(map, self);
        }

        public GetGatewayApiGroupResponseBodyApiGroup setCenters(java.util.Map<String, ?> centers) {
            this.centers = centers;
            return this;
        }
        public java.util.Map<String, ?> getCenters() {
            return this.centers;
        }

        public GetGatewayApiGroupResponseBodyApiGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetGatewayApiGroupResponseBodyApiGroup setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public GetGatewayApiGroupResponseBodyApiGroup setEnableMTLS(Boolean enableMTLS) {
            this.enableMTLS = enableMTLS;
            return this;
        }
        public Boolean getEnableMTLS() {
            return this.enableMTLS;
        }

        public GetGatewayApiGroupResponseBodyApiGroup setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public GetGatewayApiGroupResponseBodyApiGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetGatewayApiGroupResponseBodyApiGroup setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetGatewayApiGroupResponseBodyApiGroup setHttpsModel(Boolean httpsModel) {
            this.httpsModel = httpsModel;
            return this;
        }
        public Boolean getHttpsModel() {
            return this.httpsModel;
        }

        public GetGatewayApiGroupResponseBodyApiGroup setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetGatewayApiGroupResponseBodyApiGroup setInstancePort(Integer instancePort) {
            this.instancePort = instancePort;
            return this;
        }
        public Integer getInstancePort() {
            return this.instancePort;
        }

        public GetGatewayApiGroupResponseBodyApiGroup setRegionMode(Boolean regionMode) {
            this.regionMode = regionMode;
            return this;
        }
        public Boolean getRegionMode() {
            return this.regionMode;
        }

        public GetGatewayApiGroupResponseBodyApiGroup setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public GetGatewayApiGroupResponseBodyApiGroup setUpstreamType(String upstreamType) {
            this.upstreamType = upstreamType;
            return this;
        }
        public String getUpstreamType() {
            return this.upstreamType;
        }

        public GetGatewayApiGroupResponseBodyApiGroup setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetGatewayApiGroupResponseBodyApiGroup setVpcModel(Boolean vpcModel) {
            this.vpcModel = vpcModel;
            return this;
        }
        public Boolean getVpcModel() {
            return this.vpcModel;
        }

    }

}
