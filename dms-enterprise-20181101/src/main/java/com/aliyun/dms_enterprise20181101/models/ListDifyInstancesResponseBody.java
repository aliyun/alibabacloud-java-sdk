// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDifyInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Root")
    public ListDifyInstancesResponseBodyRoot root;

    @NameInMap("Success")
    public Boolean success;

    public static ListDifyInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDifyInstancesResponseBody self = new ListDifyInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDifyInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDifyInstancesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDifyInstancesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDifyInstancesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDifyInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDifyInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDifyInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDifyInstancesResponseBody setRoot(ListDifyInstancesResponseBodyRoot root) {
        this.root = root;
        return this;
    }
    public ListDifyInstancesResponseBodyRoot getRoot() {
        return this.root;
    }

    public ListDifyInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDifyInstancesResponseBodyRootData extends TeaModel {
        @NameInMap("AppUuid")
        public String appUuid;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ListDifyInstancesResponseBodyRootData build(java.util.Map<String, ?> map) throws Exception {
            ListDifyInstancesResponseBodyRootData self = new ListDifyInstancesResponseBodyRootData();
            return TeaModel.build(map, self);
        }

        public ListDifyInstancesResponseBodyRootData setAppUuid(String appUuid) {
            this.appUuid = appUuid;
            return this;
        }
        public String getAppUuid() {
            return this.appUuid;
        }

        public ListDifyInstancesResponseBodyRootData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDifyInstancesResponseBodyRootData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListDifyInstancesResponseBodyRootData setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListDifyInstancesResponseBodyRootData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListDifyInstancesResponseBodyRootData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListDifyInstancesResponseBodyRootData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListDifyInstancesResponseBodyRoot extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListDifyInstancesResponseBodyRootData> data;

        public static ListDifyInstancesResponseBodyRoot build(java.util.Map<String, ?> map) throws Exception {
            ListDifyInstancesResponseBodyRoot self = new ListDifyInstancesResponseBodyRoot();
            return TeaModel.build(map, self);
        }

        public ListDifyInstancesResponseBodyRoot setData(java.util.List<ListDifyInstancesResponseBodyRootData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListDifyInstancesResponseBodyRootData> getData() {
            return this.data;
        }

    }

}
