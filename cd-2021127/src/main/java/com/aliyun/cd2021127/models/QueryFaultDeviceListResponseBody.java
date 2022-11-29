// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryFaultDeviceListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryFaultDeviceListResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryFaultDeviceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaultDeviceListResponseBody self = new QueryFaultDeviceListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaultDeviceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaultDeviceListResponseBody setData(java.util.List<QueryFaultDeviceListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryFaultDeviceListResponseBodyData> getData() {
        return this.data;
    }

    public QueryFaultDeviceListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryFaultDeviceListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryFaultDeviceListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryFaultDeviceListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryFaultDeviceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaultDeviceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryFaultDeviceListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryFaultDeviceListResponseBodyData extends TeaModel {
        @NameInMap("BelongShop")
        public String belongShop;

        @NameInMap("DailyOnlineTime")
        public String dailyOnlineTime;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("FaultNum")
        public Integer faultNum;

        @NameInMap("LastOnlineTime")
        public String lastOnlineTime;

        @NameInMap("Mac")
        public String mac;

        @NameInMap("Status")
        public String status;

        @NameInMap("TicketNum")
        public String ticketNum;

        @NameInMap("Version")
        public String version;

        public static QueryFaultDeviceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaultDeviceListResponseBodyData self = new QueryFaultDeviceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFaultDeviceListResponseBodyData setBelongShop(String belongShop) {
            this.belongShop = belongShop;
            return this;
        }
        public String getBelongShop() {
            return this.belongShop;
        }

        public QueryFaultDeviceListResponseBodyData setDailyOnlineTime(String dailyOnlineTime) {
            this.dailyOnlineTime = dailyOnlineTime;
            return this;
        }
        public String getDailyOnlineTime() {
            return this.dailyOnlineTime;
        }

        public QueryFaultDeviceListResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryFaultDeviceListResponseBodyData setFaultNum(Integer faultNum) {
            this.faultNum = faultNum;
            return this;
        }
        public Integer getFaultNum() {
            return this.faultNum;
        }

        public QueryFaultDeviceListResponseBodyData setLastOnlineTime(String lastOnlineTime) {
            this.lastOnlineTime = lastOnlineTime;
            return this;
        }
        public String getLastOnlineTime() {
            return this.lastOnlineTime;
        }

        public QueryFaultDeviceListResponseBodyData setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public QueryFaultDeviceListResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryFaultDeviceListResponseBodyData setTicketNum(String ticketNum) {
            this.ticketNum = ticketNum;
            return this;
        }
        public String getTicketNum() {
            return this.ticketNum;
        }

        public QueryFaultDeviceListResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
