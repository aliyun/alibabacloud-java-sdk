// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewaySlbResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data entries returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListGatewaySlbResponseBodyData> data;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
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
        @NameInMap("Port")
        public String port;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("VServerGroupId")
        public String VServerGroupId;

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
         * <p>Indicates whether the edit operation is supported.</p>
         */
        @NameInMap("EditEnable")
        public Boolean editEnable;

        /**
         * <p>The ID of the gateway.</p>
         */
        @NameInMap("GatewayId")
        public String gatewayId;

        /**
         * <p>The mode of the SLB instance.</p>
         */
        @NameInMap("GatewaySlbMode")
        public String gatewaySlbMode;

        /**
         * <p>The association status.</p>
         */
        @NameInMap("GatewaySlbStatus")
        public String gatewaySlbStatus;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The port number of the HTTP virtual service group.</p>
         */
        @NameInMap("HttpPort")
        public Integer httpPort;

        /**
         * <p>The port number of the HTTPS virtual service group.</p>
         */
        @NameInMap("HttpsPort")
        public Integer httpsPort;

        /**
         * <p>The ID of the HTTPS virtual service group.</p>
         */
        @NameInMap("HttpsVServerGroupId")
        public String httpsVServerGroupId;

        /**
         * <p>The ID.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The service weight.</p>
         */
        @NameInMap("ServiceWeight")
        public Integer serviceWeight;

        /**
         * <p>The ID of the SLB instance.</p>
         */
        @NameInMap("SlbId")
        public String slbId;

        /**
         * <p>The IP address of the SLB instance.</p>
         */
        @NameInMap("SlbIp")
        public String slbIp;

        /**
         * <p>The port number of the SLB instance.</p>
         */
        @NameInMap("SlbPort")
        public String slbPort;

        /**
         * <p>The description of the status.</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <p>The type.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The ID of the HTTP virtual service group.</p>
         */
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        @NameInMap("VServiceList")
        public java.util.List<ListGatewaySlbResponseBodyDataVServiceList> VServiceList;

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
