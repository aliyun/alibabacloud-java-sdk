// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewaySlbResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListGatewaySlbResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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

    public static class ListGatewaySlbResponseBodyData extends TeaModel {
        @NameInMap("EditEnable")
        public Boolean editEnable;

        @NameInMap("GatewayId")
        public String gatewayId;

        @NameInMap("GatewaySlbMode")
        public String gatewaySlbMode;

        @NameInMap("GatewaySlbStatus")
        public String gatewaySlbStatus;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("HttpPort")
        public Integer httpPort;

        @NameInMap("HttpsPort")
        public Integer httpsPort;

        @NameInMap("HttpsVServerGroupId")
        public String httpsVServerGroupId;

        @NameInMap("Id")
        public String id;

        @NameInMap("ServiceWeight")
        public Integer serviceWeight;

        @NameInMap("SlbId")
        public String slbId;

        @NameInMap("SlbIp")
        public String slbIp;

        @NameInMap("SlbPort")
        public String slbPort;

        @NameInMap("StatusDesc")
        public String statusDesc;

        @NameInMap("Type")
        public String type;

        @NameInMap("VServerGroupId")
        public String VServerGroupId;

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

    }

}
