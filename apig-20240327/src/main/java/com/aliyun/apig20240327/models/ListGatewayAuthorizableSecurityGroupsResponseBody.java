// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayAuthorizableSecurityGroupsResponseBody extends TeaModel {
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
    public ListGatewayAuthorizableSecurityGroupsResponseBodyData data;

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
     * <p>585657D2-1C20-5B8A-AF17-D727C6490BE4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListGatewayAuthorizableSecurityGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayAuthorizableSecurityGroupsResponseBody self = new ListGatewayAuthorizableSecurityGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayAuthorizableSecurityGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGatewayAuthorizableSecurityGroupsResponseBody setData(ListGatewayAuthorizableSecurityGroupsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGatewayAuthorizableSecurityGroupsResponseBodyData getData() {
        return this.data;
    }

    public ListGatewayAuthorizableSecurityGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGatewayAuthorizableSecurityGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGatewayAuthorizableSecurityGroupsResponseBodyDataItems extends TeaModel {
        /**
         * <p>The security group name.</p>
         * 
         * <strong>example:</strong>
         * <p>商品中心集群安全组。</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1ftp5sm9os***</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        /**
         * <p>The type of the security group. Valid values:</p>
         * <ul>
         * <li>Normal: general security group</li>
         * <li>Enterprise: enterprise security group</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf61resqa9am***</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static ListGatewayAuthorizableSecurityGroupsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayAuthorizableSecurityGroupsResponseBodyDataItems self = new ListGatewayAuthorizableSecurityGroupsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListGatewayAuthorizableSecurityGroupsResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayAuthorizableSecurityGroupsResponseBodyDataItems setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListGatewayAuthorizableSecurityGroupsResponseBodyDataItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGatewayAuthorizableSecurityGroupsResponseBodyDataItems setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListGatewayAuthorizableSecurityGroupsResponseBodyData extends TeaModel {
        /**
         * <p>The security groups.</p>
         */
        @NameInMap("items")
        public java.util.List<ListGatewayAuthorizableSecurityGroupsResponseBodyDataItems> items;

        public static ListGatewayAuthorizableSecurityGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayAuthorizableSecurityGroupsResponseBodyData self = new ListGatewayAuthorizableSecurityGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayAuthorizableSecurityGroupsResponseBodyData setItems(java.util.List<ListGatewayAuthorizableSecurityGroupsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListGatewayAuthorizableSecurityGroupsResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
