// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListSecurityGroupRuleResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListSecurityGroupRuleResponseBodyData> data;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9EC7BDBF-3C38-5C9C-95DD-61E298CD43E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        @NameInMap("AuthCidrs")
        public java.util.List<String> authCidrs;

        /**
         * <p>The rule description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-12a432a1f5da423997d8880bd32c304d</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-07T10:07:57.000+0000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-07T10:07:57.000+0000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the security group authorization record.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The port range.</p>
         * 
         * <strong>example:</strong>
         * <p>8000/8000</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1cg6qlyjepj0y6cf2c</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        public static ListSecurityGroupRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityGroupRuleResponseBodyData self = new ListSecurityGroupRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSecurityGroupRuleResponseBodyData setAuthCidrs(java.util.List<String> authCidrs) {
            this.authCidrs = authCidrs;
            return this;
        }
        public java.util.List<String> getAuthCidrs() {
            return this.authCidrs;
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
