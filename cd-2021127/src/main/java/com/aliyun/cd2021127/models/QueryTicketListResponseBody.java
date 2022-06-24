// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryTicketListResponseBody extends TeaModel {
    // 状态码
    @NameInMap("Code")
    public String code;

    // 数据
    @NameInMap("Data")
    public java.util.List<QueryTicketListResponseBodyData> data;

    // http状态码
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // 说明
    @NameInMap("Message")
    public String message;

    // 页码序号
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 页码大小
    @NameInMap("PageSize")
    public Integer pageSize;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 成功标志
    @NameInMap("Success")
    public Boolean success;

    // 数据总数
    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryTicketListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketListResponseBody self = new QueryTicketListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTicketListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTicketListResponseBody setData(java.util.List<QueryTicketListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryTicketListResponseBodyData> getData() {
        return this.data;
    }

    public QueryTicketListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryTicketListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTicketListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryTicketListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTicketListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTicketListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryTicketListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryTicketListResponseBodyData extends TeaModel {
        // 设备标签-选填
        @NameInMap("DeviceAlias")
        public String deviceAlias;

        // 设备SN-必填
        @NameInMap("DeviceSn")
        public String deviceSn;

        // 门店ID-必填
        @NameInMap("ShopId")
        public String shopId;

        // 门店名称-必填
        @NameInMap("ShopName")
        public String shopName;

        // 工单状态-必填
        @NameInMap("Status")
        public Integer status;

        // 工单提交时间-必填
        @NameInMap("SubmitDate")
        public Long submitDate;

        // 工单ID-必填
        @NameInMap("TicketId")
        public String ticketId;

        // 工单类型-必填
        @NameInMap("TicketType")
        public String ticketType;

        public static QueryTicketListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTicketListResponseBodyData self = new QueryTicketListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTicketListResponseBodyData setDeviceAlias(String deviceAlias) {
            this.deviceAlias = deviceAlias;
            return this;
        }
        public String getDeviceAlias() {
            return this.deviceAlias;
        }

        public QueryTicketListResponseBodyData setDeviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }
        public String getDeviceSn() {
            return this.deviceSn;
        }

        public QueryTicketListResponseBodyData setShopId(String shopId) {
            this.shopId = shopId;
            return this;
        }
        public String getShopId() {
            return this.shopId;
        }

        public QueryTicketListResponseBodyData setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }
        public String getShopName() {
            return this.shopName;
        }

        public QueryTicketListResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryTicketListResponseBodyData setSubmitDate(Long submitDate) {
            this.submitDate = submitDate;
            return this;
        }
        public Long getSubmitDate() {
            return this.submitDate;
        }

        public QueryTicketListResponseBodyData setTicketId(String ticketId) {
            this.ticketId = ticketId;
            return this;
        }
        public String getTicketId() {
            return this.ticketId;
        }

        public QueryTicketListResponseBodyData setTicketType(String ticketType) {
            this.ticketType = ticketType;
            return this;
        }
        public String getTicketType() {
            return this.ticketType;
        }

    }

}
