// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListDeviceResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceResponseBody self = new ListDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDeviceResponseBody setData(ListDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDeviceResponseBodyData getData() {
        return this.data;
    }

    public ListDeviceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDeviceResponseBodyDataPageData extends TeaModel {
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

        public static ListDeviceResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceResponseBodyDataPageData self = new ListDeviceResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public ListDeviceResponseBodyDataPageData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListDeviceResponseBodyDataPageData setLastOnchainTime(String lastOnchainTime) {
            this.lastOnchainTime = lastOnchainTime;
            return this;
        }
        public String getLastOnchainTime() {
            return this.lastOnchainTime;
        }

        public ListDeviceResponseBodyDataPageData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDeviceResponseBodyDataPageData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDeviceResponseBodyDataPageData setUsedOnchainCount(Long usedOnchainCount) {
            this.usedOnchainCount = usedOnchainCount;
            return this;
        }
        public Long getUsedOnchainCount() {
            return this.usedOnchainCount;
        }

    }

    public static class ListDeviceResponseBodyData extends TeaModel {
        @NameInMap("Num")
        public Integer num;

        @NameInMap("PageData")
        public java.util.List<ListDeviceResponseBodyDataPageData> pageData;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Total")
        public Integer total;

        public static ListDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceResponseBodyData self = new ListDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDeviceResponseBodyData setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public ListDeviceResponseBodyData setPageData(java.util.List<ListDeviceResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<ListDeviceResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public ListDeviceResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListDeviceResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
