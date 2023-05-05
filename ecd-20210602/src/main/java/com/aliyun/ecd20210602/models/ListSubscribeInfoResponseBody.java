// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListSubscribeInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListSubscribeInfoResponseBodyData> data;

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

    public static ListSubscribeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubscribeInfoResponseBody self = new ListSubscribeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubscribeInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSubscribeInfoResponseBody setData(java.util.List<ListSubscribeInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSubscribeInfoResponseBodyData> getData() {
        return this.data;
    }

    public ListSubscribeInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSubscribeInfoResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListSubscribeInfoResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSubscribeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubscribeInfoResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListSubscribeInfoResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public Integer appId;

        @NameInMap("DistributeCount")
        public Integer distributeCount;

        @NameInMap("DistributeLimit")
        public Integer distributeLimit;

        @NameInMap("DistributeType")
        public String distributeType;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("InstallMode")
        public String installMode;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("StartTime")
        public String startTime;

        public static ListSubscribeInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSubscribeInfoResponseBodyData self = new ListSubscribeInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSubscribeInfoResponseBodyData setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

        public ListSubscribeInfoResponseBodyData setDistributeCount(Integer distributeCount) {
            this.distributeCount = distributeCount;
            return this;
        }
        public Integer getDistributeCount() {
            return this.distributeCount;
        }

        public ListSubscribeInfoResponseBodyData setDistributeLimit(Integer distributeLimit) {
            this.distributeLimit = distributeLimit;
            return this;
        }
        public Integer getDistributeLimit() {
            return this.distributeLimit;
        }

        public ListSubscribeInfoResponseBodyData setDistributeType(String distributeType) {
            this.distributeType = distributeType;
            return this;
        }
        public String getDistributeType() {
            return this.distributeType;
        }

        public ListSubscribeInfoResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListSubscribeInfoResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListSubscribeInfoResponseBodyData setInstallMode(String installMode) {
            this.installMode = installMode;
            return this;
        }
        public String getInstallMode() {
            return this.installMode;
        }

        public ListSubscribeInfoResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public ListSubscribeInfoResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
