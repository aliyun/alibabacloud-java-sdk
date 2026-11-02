// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListGatewayApiGroupsResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("ApiGroups")
    public java.util.List<ListGatewayApiGroupsResponseBodyApiGroups> apiGroups;

    @NameInMap("ErrorField")
    public String errorField;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    public static ListGatewayApiGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayApiGroupsResponseBody self = new ListGatewayApiGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayApiGroupsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListGatewayApiGroupsResponseBody setApiGroups(java.util.List<ListGatewayApiGroupsResponseBodyApiGroups> apiGroups) {
        this.apiGroups = apiGroups;
        return this;
    }
    public java.util.List<ListGatewayApiGroupsResponseBodyApiGroups> getApiGroups() {
        return this.apiGroups;
    }

    public ListGatewayApiGroupsResponseBody setErrorField(String errorField) {
        this.errorField = errorField;
        return this;
    }
    public String getErrorField() {
        return this.errorField;
    }

    public ListGatewayApiGroupsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGatewayApiGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGatewayApiGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListGatewayApiGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGatewayApiGroupsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListGatewayApiGroupsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListGatewayApiGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListGatewayApiGroupsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListGatewayApiGroupsResponseBodyApiGroups extends TeaModel {
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

        public static ListGatewayApiGroupsResponseBodyApiGroups build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayApiGroupsResponseBodyApiGroups self = new ListGatewayApiGroupsResponseBodyApiGroups();
            return TeaModel.build(map, self);
        }

        public ListGatewayApiGroupsResponseBodyApiGroups setCenters(java.util.Map<String, ?> centers) {
            this.centers = centers;
            return this;
        }
        public java.util.Map<String, ?> getCenters() {
            return this.centers;
        }

        public ListGatewayApiGroupsResponseBodyApiGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGatewayApiGroupsResponseBodyApiGroups setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListGatewayApiGroupsResponseBodyApiGroups setEnableMTLS(Boolean enableMTLS) {
            this.enableMTLS = enableMTLS;
            return this;
        }
        public Boolean getEnableMTLS() {
            return this.enableMTLS;
        }

        public ListGatewayApiGroupsResponseBodyApiGroups setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public ListGatewayApiGroupsResponseBodyApiGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListGatewayApiGroupsResponseBodyApiGroups setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListGatewayApiGroupsResponseBodyApiGroups setHttpsModel(Boolean httpsModel) {
            this.httpsModel = httpsModel;
            return this;
        }
        public Boolean getHttpsModel() {
            return this.httpsModel;
        }

        public ListGatewayApiGroupsResponseBodyApiGroups setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListGatewayApiGroupsResponseBodyApiGroups setInstancePort(Integer instancePort) {
            this.instancePort = instancePort;
            return this;
        }
        public Integer getInstancePort() {
            return this.instancePort;
        }

        public ListGatewayApiGroupsResponseBodyApiGroups setRegionMode(Boolean regionMode) {
            this.regionMode = regionMode;
            return this;
        }
        public Boolean getRegionMode() {
            return this.regionMode;
        }

        public ListGatewayApiGroupsResponseBodyApiGroups setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListGatewayApiGroupsResponseBodyApiGroups setUpstreamType(String upstreamType) {
            this.upstreamType = upstreamType;
            return this;
        }
        public String getUpstreamType() {
            return this.upstreamType;
        }

        public ListGatewayApiGroupsResponseBodyApiGroups setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListGatewayApiGroupsResponseBodyApiGroups setVpcModel(Boolean vpcModel) {
            this.vpcModel = vpcModel;
            return this;
        }
        public Boolean getVpcModel() {
            return this.vpcModel;
        }

    }

}
