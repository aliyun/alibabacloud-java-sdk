// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteSecurityGroupRuleResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DeleteSecurityGroupRuleResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>The request is processed successfully.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>43E50CB7-258E-5AFF-9B93-ECC19928C699</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The request was successful.</p>
     * </li>
     * <li><p><code>false</code>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>auto-description1</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>103</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-7ea3da97b96543e19f6c597c****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The time when the rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-07 18:07:57</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the rule was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-11T14:12:55.000+0000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The transport-layer protocol. The value is not case-sensitive. Valid values:</p>
         * <ul>
         * <li><p>icmp</p>
         * </li>
         * <li><p>gre</p>
         * </li>
         * <li><p>tcp</p>
         * </li>
         * <li><p>udp</p>
         * </li>
         * <li><p>all: The rule applies to all protocols.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The transport-layer port range. Valid values:</p>
         * <ul>
         * <li><p>For TCP or UDP, the port range is 1 to 65535. Use a forward slash (/) to separate the start port from the end port. For example: <code>1/200</code>.</p>
         * </li>
         * <li><p>For ICMP, the value is <code>-1/-1</code>.</p>
         * </li>
         * <li><p>For GRE, the value is <code>-1/-1</code>.</p>
         * </li>
         * <li><p>For all protocols, the value is <code>-1/-1</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8443/8443</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-uf6hgwe067prhg68agfa</p>
         */
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
