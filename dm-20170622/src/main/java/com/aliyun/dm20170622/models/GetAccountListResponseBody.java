// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class GetAccountListResponseBody extends TeaModel {
    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("data")
    public GetAccountListResponseBodyData data;

    public static GetAccountListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountListResponseBody self = new GetAccountListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountListResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetAccountListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAccountListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccountListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public GetAccountListResponseBody setData(GetAccountListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAccountListResponseBodyData getData() {
        return this.data;
    }

    public static class GetAccountListResponseBodyDataAccountNotificationInfo extends TeaModel {
        @NameInMap("Region")
        public String region;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetAccountListResponseBodyDataAccountNotificationInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAccountListResponseBodyDataAccountNotificationInfo self = new GetAccountListResponseBodyDataAccountNotificationInfo();
            return TeaModel.build(map, self);
        }

        public GetAccountListResponseBodyDataAccountNotificationInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetAccountListResponseBodyDataAccountNotificationInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAccountListResponseBodyDataAccountNotificationInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class GetAccountListResponseBodyData extends TeaModel {
        @NameInMap("accountNotificationInfo")
        public java.util.List<GetAccountListResponseBodyDataAccountNotificationInfo> accountNotificationInfo;

        public static GetAccountListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAccountListResponseBodyData self = new GetAccountListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAccountListResponseBodyData setAccountNotificationInfo(java.util.List<GetAccountListResponseBodyDataAccountNotificationInfo> accountNotificationInfo) {
            this.accountNotificationInfo = accountNotificationInfo;
            return this;
        }
        public java.util.List<GetAccountListResponseBodyDataAccountNotificationInfo> getAccountNotificationInfo() {
            return this.accountNotificationInfo;
        }

    }

}
