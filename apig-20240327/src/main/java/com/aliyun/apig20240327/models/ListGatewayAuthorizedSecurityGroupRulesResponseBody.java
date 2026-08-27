// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayAuthorizedSecurityGroupRulesResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListGatewayAuthorizedSecurityGroupRulesResponseBodyData data;

    /**
     * <p>The response message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListGatewayAuthorizedSecurityGroupRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayAuthorizedSecurityGroupRulesResponseBody self = new ListGatewayAuthorizedSecurityGroupRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayAuthorizedSecurityGroupRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGatewayAuthorizedSecurityGroupRulesResponseBody setData(ListGatewayAuthorizedSecurityGroupRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGatewayAuthorizedSecurityGroupRulesResponseBodyData getData() {
        return this.data;
    }

    public ListGatewayAuthorizedSecurityGroupRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGatewayAuthorizedSecurityGroupRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGatewayAuthorizedSecurityGroupRulesResponseBodyDataItems extends TeaModel {
        /**
         * <p>The list of authorized CIDR blocks.</p>
         */
        @NameInMap("authCidrs")
        public java.util.List<String> authCidrs;

        /**
         * <p>The rule description.</p>
         * 
         * <strong>example:</strong>
         * <p>商品中心预发网关授权安全组</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The protocol. Valid values:</p>
         * <ul>
         * <li>TCP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("ipProtocol")
        public String ipProtocol;

        /**
         * <p>The port range.</p>
         * 
         * <strong>example:</strong>
         * <p>8080/8089</p>
         */
        @NameInMap("portRange")
        public String portRange;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1ftp5sm9os***</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        /**
         * <p>The security group name.</p>
         * 
         * <strong>example:</strong>
         * <p>商品中心集群安全组</p>
         */
        @NameInMap("securityGroupName")
        public String securityGroupName;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gsgr-cqadis5lhtgmv***</p>
         */
        @NameInMap("securityGroupRuleId")
        public String securityGroupRuleId;

        /**
         * <p>The ID of the source security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp19akuepfe***</p>
         */
        @NameInMap("sourceSecurityGroupId")
        public String sourceSecurityGroupId;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1g63b5q2q29***</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static ListGatewayAuthorizedSecurityGroupRulesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayAuthorizedSecurityGroupRulesResponseBodyDataItems self = new ListGatewayAuthorizedSecurityGroupRulesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListGatewayAuthorizedSecurityGroupRulesResponseBodyDataItems setAuthCidrs(java.util.List<String> authCidrs) {
            this.authCidrs = authCidrs;
            return this;
        }
        public java.util.List<String> getAuthCidrs() {
            return this.authCidrs;
        }

        public ListGatewayAuthorizedSecurityGroupRulesResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGatewayAuthorizedSecurityGroupRulesResponseBodyDataItems setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public ListGatewayAuthorizedSecurityGroupRulesResponseBodyDataItems setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public ListGatewayAuthorizedSecurityGroupRulesResponseBodyDataItems setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListGatewayAuthorizedSecurityGroupRulesResponseBodyDataItems setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public ListGatewayAuthorizedSecurityGroupRulesResponseBodyDataItems setSecurityGroupRuleId(String securityGroupRuleId) {
            this.securityGroupRuleId = securityGroupRuleId;
            return this;
        }
        public String getSecurityGroupRuleId() {
            return this.securityGroupRuleId;
        }

        public ListGatewayAuthorizedSecurityGroupRulesResponseBodyDataItems setSourceSecurityGroupId(String sourceSecurityGroupId) {
            this.sourceSecurityGroupId = sourceSecurityGroupId;
            return this;
        }
        public String getSourceSecurityGroupId() {
            return this.sourceSecurityGroupId;
        }

        public ListGatewayAuthorizedSecurityGroupRulesResponseBodyDataItems setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListGatewayAuthorizedSecurityGroupRulesResponseBodyData extends TeaModel {
        /**
         * <p>The security group rules.</p>
         */
        @NameInMap("items")
        public java.util.List<ListGatewayAuthorizedSecurityGroupRulesResponseBodyDataItems> items;

        public static ListGatewayAuthorizedSecurityGroupRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayAuthorizedSecurityGroupRulesResponseBodyData self = new ListGatewayAuthorizedSecurityGroupRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayAuthorizedSecurityGroupRulesResponseBodyData setItems(java.util.List<ListGatewayAuthorizedSecurityGroupRulesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListGatewayAuthorizedSecurityGroupRulesResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
