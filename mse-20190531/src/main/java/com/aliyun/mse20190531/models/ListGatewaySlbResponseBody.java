// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewaySlbResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
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
    public java.util.List<ListGatewaySlbResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Succ</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EAB345F4-3AC3-560C-B653-65717703****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request is successful.</li>
     * <li>false: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListGatewaySlbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewaySlbResponseBody self = new ListGatewaySlbResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewaySlbResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListGatewaySlbResponseBody setData(java.util.List<ListGatewaySlbResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListGatewaySlbResponseBodyData> getData() {
        return this.data;
    }

    public ListGatewaySlbResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGatewaySlbResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGatewaySlbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGatewaySlbResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListGatewaySlbResponseBodyDataVServiceList extends TeaModel {
        /**
         * <p>The port.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li>HTTPS</li>
         * <li>HTTP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTPS</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The ID of the virtual server group.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-bp183l2x70***</p>
         */
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        /**
         * <p>The name of the virtual server group.</p>
         */
        @NameInMap("VServerGroupName")
        public String VServerGroupName;

        public static ListGatewaySlbResponseBodyDataVServiceList build(java.util.Map<String, ?> map) throws Exception {
            ListGatewaySlbResponseBodyDataVServiceList self = new ListGatewaySlbResponseBodyDataVServiceList();
            return TeaModel.build(map, self);
        }

        public ListGatewaySlbResponseBodyDataVServiceList setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ListGatewaySlbResponseBodyDataVServiceList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListGatewaySlbResponseBodyDataVServiceList setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

        public ListGatewaySlbResponseBodyDataVServiceList setVServerGroupName(String VServerGroupName) {
            this.VServerGroupName = VServerGroupName;
            return this;
        }
        public String getVServerGroupName() {
            return this.VServerGroupName;
        }

    }

    public static class ListGatewaySlbResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the resource is editable.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EditEnable")
        public Boolean editEnable;

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GatewayId")
        public String gatewayId;

        /**
         * <p>The source.</p>
         * 
         * <strong>example:</strong>
         * <p>UserSelect</p>
         */
        @NameInMap("GatewaySlbMode")
        public String gatewaySlbMode;

        /**
         * <p>The association status.</p>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("GatewaySlbStatus")
        public String gatewaySlbStatus;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-14 14:39:16</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The HTTP port (virtual server group).</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("HttpPort")
        public Integer httpPort;

        /**
         * <p>The HTTPS port (virtual server group).</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("HttpsPort")
        public Integer httpsPort;

        /**
         * <p>The ID of the HTTPS virtual server group.</p>
         * 
         * <strong>example:</strong>
         * <p>353</p>
         */
        @NameInMap("HttpsVServerGroupId")
        public String httpsVServerGroupId;

        /**
         * <p>ID</p>
         * 
         * <strong>example:</strong>
         * <p>ID</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The service weight.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ServiceWeight")
        public Integer serviceWeight;

        /**
         * <p>SLB ID</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1kmnli3hdpreptw2ah3</p>
         */
        @NameInMap("SlbId")
        public String slbId;

        /**
         * <p>SLB IP</p>
         * 
         * <strong>example:</strong>
         * <p>121.199.XX.XX</p>
         */
        @NameInMap("SlbIp")
        public String slbIp;

        /**
         * <p>The SLB port.</p>
         * 
         * <strong>example:</strong>
         * <p>80,443</p>
         */
        @NameInMap("SlbPort")
        public String slbPort;

        /**
         * <p>The SLB type.</p>
         * 
         * <strong>example:</strong>
         * <p>CLB</p>
         */
        @NameInMap("SlbType")
        public String slbType;

        /**
         * <p>The status description.</p>
         * 
         * <strong>example:</strong>
         * <p>Associating</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li>PUB_NET: Internet.</li>
         * <li>PRIVATE_NET: Private network.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUB_NET</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The ID of the HTTP virtual server group.</p>
         * 
         * <strong>example:</strong>
         * <p>353</p>
         */
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        /**
         * <p>The SLB listener information.</p>
         */
        @NameInMap("VServiceList")
        public java.util.List<ListGatewaySlbResponseBodyDataVServiceList> VServiceList;

        /**
         * <p>The metadata of the virtual server group.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;protocol&quot;:&quot;HTTP&quot;,&quot;vServerGroupName&quot;:&quot;k8s/80/<em><em><strong>&quot;,&quot;port&quot;:80,&quot;vServerGroupId&quot;:&quot;rsp-bp</strong></em>&quot;},{&quot;protocol&quot;:&quot;HTTPS&quot;,&quot;vServerGroupName&quot;:&quot;k8s/443/</em><strong>&quot;,&quot;port&quot;:443,&quot;vServerGroupId&quot;:&quot;rsp-bp</strong>***&quot;}]</p>
         */
        @NameInMap("VsMetaInfo")
        public String vsMetaInfo;

        public static ListGatewaySlbResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewaySlbResponseBodyData self = new ListGatewaySlbResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewaySlbResponseBodyData setEditEnable(Boolean editEnable) {
            this.editEnable = editEnable;
            return this;
        }
        public Boolean getEditEnable() {
            return this.editEnable;
        }

        public ListGatewaySlbResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public ListGatewaySlbResponseBodyData setGatewaySlbMode(String gatewaySlbMode) {
            this.gatewaySlbMode = gatewaySlbMode;
            return this;
        }
        public String getGatewaySlbMode() {
            return this.gatewaySlbMode;
        }

        public ListGatewaySlbResponseBodyData setGatewaySlbStatus(String gatewaySlbStatus) {
            this.gatewaySlbStatus = gatewaySlbStatus;
            return this;
        }
        public String getGatewaySlbStatus() {
            return this.gatewaySlbStatus;
        }

        public ListGatewaySlbResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGatewaySlbResponseBodyData setHttpPort(Integer httpPort) {
            this.httpPort = httpPort;
            return this;
        }
        public Integer getHttpPort() {
            return this.httpPort;
        }

        public ListGatewaySlbResponseBodyData setHttpsPort(Integer httpsPort) {
            this.httpsPort = httpsPort;
            return this;
        }
        public Integer getHttpsPort() {
            return this.httpsPort;
        }

        public ListGatewaySlbResponseBodyData setHttpsVServerGroupId(String httpsVServerGroupId) {
            this.httpsVServerGroupId = httpsVServerGroupId;
            return this;
        }
        public String getHttpsVServerGroupId() {
            return this.httpsVServerGroupId;
        }

        public ListGatewaySlbResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListGatewaySlbResponseBodyData setServiceWeight(Integer serviceWeight) {
            this.serviceWeight = serviceWeight;
            return this;
        }
        public Integer getServiceWeight() {
            return this.serviceWeight;
        }

        public ListGatewaySlbResponseBodyData setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public ListGatewaySlbResponseBodyData setSlbIp(String slbIp) {
            this.slbIp = slbIp;
            return this;
        }
        public String getSlbIp() {
            return this.slbIp;
        }

        public ListGatewaySlbResponseBodyData setSlbPort(String slbPort) {
            this.slbPort = slbPort;
            return this;
        }
        public String getSlbPort() {
            return this.slbPort;
        }

        public ListGatewaySlbResponseBodyData setSlbType(String slbType) {
            this.slbType = slbType;
            return this;
        }
        public String getSlbType() {
            return this.slbType;
        }

        public ListGatewaySlbResponseBodyData setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public ListGatewaySlbResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGatewaySlbResponseBodyData setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

        public ListGatewaySlbResponseBodyData setVServiceList(java.util.List<ListGatewaySlbResponseBodyDataVServiceList> VServiceList) {
            this.VServiceList = VServiceList;
            return this;
        }
        public java.util.List<ListGatewaySlbResponseBodyDataVServiceList> getVServiceList() {
            return this.VServiceList;
        }

        public ListGatewaySlbResponseBodyData setVsMetaInfo(String vsMetaInfo) {
            this.vsMetaInfo = vsMetaInfo;
            return this;
        }
        public String getVsMetaInfo() {
            return this.vsMetaInfo;
        }

    }

}
