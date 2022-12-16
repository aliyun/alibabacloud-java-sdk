// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListSecurityGroupRuleResponseBody extends TeaModel {
    // The status code returned.
    @NameInMap("Code")
    public Integer code;

    // The returned results.
    @NameInMap("Data")
    public java.util.List<ListSecurityGroupRuleResponseBodyData> data;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // - `true`: The request is successful. 
    // - `false`: The request fails.
    @NameInMap("Success")
    public Boolean success;

    public static ListSecurityGroupRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityGroupRuleResponseBody self = new ListSecurityGroupRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecurityGroupRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListSecurityGroupRuleResponseBody setData(java.util.List<ListSecurityGroupRuleResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSecurityGroupRuleResponseBodyData> getData() {
        return this.data;
    }

    public ListSecurityGroupRuleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSecurityGroupRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSecurityGroupRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSecurityGroupRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSecurityGroupRuleResponseBodyData extends TeaModel {
        // The description of the rule.
        @NameInMap("Description")
        public String description;

        // The ID of the gateway.
        @NameInMap("GatewayId")
        public Long gatewayId;

        // The unique ID of the gateway.
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        // The time when the security group rule was created.
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // The time when the security group rule was last modified.
        @NameInMap("GmtModified")
        public String gmtModified;

        // ID.
        @NameInMap("Id")
        public String id;

        // The type of the protocol.
        @NameInMap("IpProtocol")
        public String ipProtocol;

        // The range of ports.
        @NameInMap("PortRange")
        public String portRange;

        // The ID of the security group.
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        public static ListSecurityGroupRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityGroupRuleResponseBodyData self = new ListSecurityGroupRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSecurityGroupRuleResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSecurityGroupRuleResponseBodyData setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public ListSecurityGroupRuleResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public ListSecurityGroupRuleResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListSecurityGroupRuleResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListSecurityGroupRuleResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListSecurityGroupRuleResponseBodyData setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public ListSecurityGroupRuleResponseBodyData setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public ListSecurityGroupRuleResponseBodyData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

}
