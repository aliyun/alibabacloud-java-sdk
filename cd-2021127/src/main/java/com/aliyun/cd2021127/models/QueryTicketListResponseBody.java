// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryTicketListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryTicketListResponseBodyData> data;

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
        @NameInMap("DeviceAlias")
        public String deviceAlias;

        @NameInMap("DeviceSn")
        public String deviceSn;

        @NameInMap("ShopId")
        public String shopId;

        @NameInMap("ShopName")
        public String shopName;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SubmitDate")
        public Long submitDate;

        @NameInMap("TicketId")
        public String ticketId;

        @NameInMap("TicketType")
        public String ticketType;

        @NameInMap("UpdateDate")
        public Long updateDate;

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

        public QueryTicketListResponseBodyData setUpdateDate(Long updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public Long getUpdateDate() {
            return this.updateDate;
        }

    }

}
