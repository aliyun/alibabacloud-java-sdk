// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteSecurityGroupRuleResponseBody extends TeaModel {
    // The status code returned.
    @NameInMap("Code")
    public Integer code;

    // The returned data.
    @NameInMap("Data")
    public DeleteSecurityGroupRuleResponseBodyData data;

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

    public static DeleteSecurityGroupRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityGroupRuleResponseBody self = new DeleteSecurityGroupRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityGroupRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteSecurityGroupRuleResponseBody setData(DeleteSecurityGroupRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteSecurityGroupRuleResponseBodyData getData() {
        return this.data;
    }

    public DeleteSecurityGroupRuleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteSecurityGroupRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteSecurityGroupRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSecurityGroupRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteSecurityGroupRuleResponseBodyData extends TeaModel {
        // The description.
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
        public Long id;

        // The transport layer protocol. The value of this parameter is case-insensitive. Valid values: 
        //          
        // - icmp
        // - gre
        // - tcp
        // - udp
        // - all: All protocols are supported.
        @NameInMap("IpProtocol")
        public String ipProtocol;

        // The range of destination ports that correspond to the transport layer protocol. Valid values: 
        //          
        // - When the value of the IpProtocol parameter is tcp or udp, the port number range is 1 to 65535. The start port number and the end port number are separated by a forward slash (/). Example: 1/200.
        // - When the value of the IpProtocol parameter is icmp, the port number range is -1/-1, which indicates all ports.
        // - When the value of the IpProtocol parameter is gre, the port number range is -1/-1, which indicates all ports.
        // - When the value of the IpProtocol parameter is all, the port number range is -1/-1, which indicates all ports.
        @NameInMap("PortRange")
        public String portRange;

        // The ID of the security group.
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        public static DeleteSecurityGroupRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteSecurityGroupRuleResponseBodyData self = new DeleteSecurityGroupRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteSecurityGroupRuleResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DeleteSecurityGroupRuleResponseBodyData setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public DeleteSecurityGroupRuleResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public DeleteSecurityGroupRuleResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DeleteSecurityGroupRuleResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DeleteSecurityGroupRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteSecurityGroupRuleResponseBodyData setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DeleteSecurityGroupRuleResponseBodyData setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public DeleteSecurityGroupRuleResponseBodyData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

}
