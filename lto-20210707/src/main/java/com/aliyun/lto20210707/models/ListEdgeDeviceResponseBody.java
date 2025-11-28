// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListEdgeDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListEdgeDeviceResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListEdgeDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeDeviceResponseBody self = new ListEdgeDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEdgeDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEdgeDeviceResponseBody setData(ListEdgeDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEdgeDeviceResponseBodyData getData() {
        return this.data;
    }

    public ListEdgeDeviceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListEdgeDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEdgeDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEdgeDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEdgeDeviceResponseBodyDataPageData extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("LastOnchainTime")
        public String lastOnchainTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("UsedOnchainCount")
        public Long usedOnchainCount;

        public static ListEdgeDeviceResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            ListEdgeDeviceResponseBodyDataPageData self = new ListEdgeDeviceResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public ListEdgeDeviceResponseBodyDataPageData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListEdgeDeviceResponseBodyDataPageData setLastOnchainTime(String lastOnchainTime) {
            this.lastOnchainTime = lastOnchainTime;
            return this;
        }
        public String getLastOnchainTime() {
            return this.lastOnchainTime;
        }

        public ListEdgeDeviceResponseBodyDataPageData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEdgeDeviceResponseBodyDataPageData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEdgeDeviceResponseBodyDataPageData setUsedOnchainCount(Long usedOnchainCount) {
            this.usedOnchainCount = usedOnchainCount;
            return this;
        }
        public Long getUsedOnchainCount() {
            return this.usedOnchainCount;
        }

    }

    public static class ListEdgeDeviceResponseBodyData extends TeaModel {
        @NameInMap("Num")
        public Integer num;

        @NameInMap("PageData")
        public java.util.List<ListEdgeDeviceResponseBodyDataPageData> pageData;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Total")
        public Integer total;

        public static ListEdgeDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEdgeDeviceResponseBodyData self = new ListEdgeDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEdgeDeviceResponseBodyData setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public ListEdgeDeviceResponseBodyData setPageData(java.util.List<ListEdgeDeviceResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<ListEdgeDeviceResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public ListEdgeDeviceResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListEdgeDeviceResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
