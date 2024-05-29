// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewaySlbRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The unique ID of the gateway.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The HTTP port number (virtual service group).</p>
     */
    @NameInMap("HttpPort")
    public Integer httpPort;

    /**
     * <p>The HTTPS port number (virtual service group).</p>
     */
    @NameInMap("HttpsPort")
    public Integer httpsPort;

    /**
     * <p>The ID of the HTTPS virtual service group.</p>
     */
    @NameInMap("HttpsVServerGroupId")
    public String httpsVServerGroupId;

    /**
     * <p>The service weight.</p>
     */
    @NameInMap("ServiceWeight")
    public Integer serviceWeight;

    /**
     * <p>The ID of the SLB instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SlbId")
    public String slbId;

    /**
     * <p>The type of the service source. Valid values:</p>
     * <br>
     * <p>*   PUB_NET: Internet</p>
     * <p>*   PRIVATE_NET: VPC</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The ID of the HTTP virtual service group.</p>
     */
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    /**
     * <p>The SLB monitoring information.</p>
     */
    @NameInMap("VServiceList")
    public java.util.List<AddGatewaySlbRequestVServiceList> VServiceList;

    public static AddGatewaySlbRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGatewaySlbRequest self = new AddGatewaySlbRequest();
        return TeaModel.build(map, self);
    }

    public AddGatewaySlbRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddGatewaySlbRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public AddGatewaySlbRequest setHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
        return this;
    }
    public Integer getHttpPort() {
        return this.httpPort;
    }

    public AddGatewaySlbRequest setHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }
    public Integer getHttpsPort() {
        return this.httpsPort;
    }

    public AddGatewaySlbRequest setHttpsVServerGroupId(String httpsVServerGroupId) {
        this.httpsVServerGroupId = httpsVServerGroupId;
        return this;
    }
    public String getHttpsVServerGroupId() {
        return this.httpsVServerGroupId;
    }

    public AddGatewaySlbRequest setServiceWeight(Integer serviceWeight) {
        this.serviceWeight = serviceWeight;
        return this;
    }
    public Integer getServiceWeight() {
        return this.serviceWeight;
    }

    public AddGatewaySlbRequest setSlbId(String slbId) {
        this.slbId = slbId;
        return this;
    }
    public String getSlbId() {
        return this.slbId;
    }

    public AddGatewaySlbRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddGatewaySlbRequest setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public AddGatewaySlbRequest setVServiceList(java.util.List<AddGatewaySlbRequestVServiceList> VServiceList) {
        this.VServiceList = VServiceList;
        return this;
    }
    public java.util.List<AddGatewaySlbRequestVServiceList> getVServiceList() {
        return this.VServiceList;
    }

    public static class AddGatewaySlbRequestVServiceList extends TeaModel {
        /**
         * <p>The port number.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol type. Valid values:</p>
         * <br>
         * <p>*   HTTP</p>
         * <p>*   HTTPS</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The ID of the virtual server group.</p>
         */
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        /**
         * <p>The name of the virtual server group.</p>
         */
        @NameInMap("VServerGroupName")
        public String VServerGroupName;

        public static AddGatewaySlbRequestVServiceList build(java.util.Map<String, ?> map) throws Exception {
            AddGatewaySlbRequestVServiceList self = new AddGatewaySlbRequestVServiceList();
            return TeaModel.build(map, self);
        }

        public AddGatewaySlbRequestVServiceList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public AddGatewaySlbRequestVServiceList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public AddGatewaySlbRequestVServiceList setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

        public AddGatewaySlbRequestVServiceList setVServerGroupName(String VServerGroupName) {
            this.VServerGroupName = VServerGroupName;
            return this;
        }
        public String getVServerGroupName() {
            return this.VServerGroupName;
        }

    }

}
