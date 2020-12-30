// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetSenderAddressListResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public GetSenderAddressListResponseBodyData data;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("PageNo")
    public Integer pageNo;

    public static GetSenderAddressListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSenderAddressListResponseBody self = new GetSenderAddressListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSenderAddressListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSenderAddressListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSenderAddressListResponseBody setData(GetSenderAddressListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSenderAddressListResponseBodyData getData() {
        return this.data;
    }

    public GetSenderAddressListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public GetSenderAddressListResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public static class GetSenderAddressListResponseBodyDataSenderAddressNotificationInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("SenderAddress")
        public String senderAddress;

        @NameInMap("Region")
        public String region;

        @NameInMap("SenderAddressId")
        public String senderAddressId;

        public static GetSenderAddressListResponseBodyDataSenderAddressNotificationInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSenderAddressListResponseBodyDataSenderAddressNotificationInfo self = new GetSenderAddressListResponseBodyDataSenderAddressNotificationInfo();
            return TeaModel.build(map, self);
        }

        public GetSenderAddressListResponseBodyDataSenderAddressNotificationInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSenderAddressListResponseBodyDataSenderAddressNotificationInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetSenderAddressListResponseBodyDataSenderAddressNotificationInfo setSenderAddress(String senderAddress) {
            this.senderAddress = senderAddress;
            return this;
        }
        public String getSenderAddress() {
            return this.senderAddress;
        }

        public GetSenderAddressListResponseBodyDataSenderAddressNotificationInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetSenderAddressListResponseBodyDataSenderAddressNotificationInfo setSenderAddressId(String senderAddressId) {
            this.senderAddressId = senderAddressId;
            return this;
        }
        public String getSenderAddressId() {
            return this.senderAddressId;
        }

    }

    public static class GetSenderAddressListResponseBodyData extends TeaModel {
        @NameInMap("senderAddressNotificationInfo")
        public java.util.List<GetSenderAddressListResponseBodyDataSenderAddressNotificationInfo> senderAddressNotificationInfo;

        public static GetSenderAddressListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSenderAddressListResponseBodyData self = new GetSenderAddressListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSenderAddressListResponseBodyData setSenderAddressNotificationInfo(java.util.List<GetSenderAddressListResponseBodyDataSenderAddressNotificationInfo> senderAddressNotificationInfo) {
            this.senderAddressNotificationInfo = senderAddressNotificationInfo;
            return this;
        }
        public java.util.List<GetSenderAddressListResponseBodyDataSenderAddressNotificationInfo> getSenderAddressNotificationInfo() {
            return this.senderAddressNotificationInfo;
        }

    }

}
