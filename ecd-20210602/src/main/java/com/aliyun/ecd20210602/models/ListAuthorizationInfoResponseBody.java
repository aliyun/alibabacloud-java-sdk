// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListAuthorizationInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAuthorizationInfoResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAuthorizationInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationInfoResponseBody self = new ListAuthorizationInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAuthorizationInfoResponseBody setData(java.util.List<ListAuthorizationInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAuthorizationInfoResponseBodyData> getData() {
        return this.data;
    }

    public ListAuthorizationInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAuthorizationInfoResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthorizationInfoResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizationInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizationInfoResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAuthorizationInfoResponseBodyData extends TeaModel {
        @NameInMap("DistributeCount")
        public Long distributeCount;

        @NameInMap("DistributeLimit")
        public Long distributeLimit;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("StartTime")
        public String startTime;

        public static ListAuthorizationInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizationInfoResponseBodyData self = new ListAuthorizationInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAuthorizationInfoResponseBodyData setDistributeCount(Long distributeCount) {
            this.distributeCount = distributeCount;
            return this;
        }
        public Long getDistributeCount() {
            return this.distributeCount;
        }

        public ListAuthorizationInfoResponseBodyData setDistributeLimit(Long distributeLimit) {
            this.distributeLimit = distributeLimit;
            return this;
        }
        public Long getDistributeLimit() {
            return this.distributeLimit;
        }

        public ListAuthorizationInfoResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListAuthorizationInfoResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAuthorizationInfoResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public ListAuthorizationInfoResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
