// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryGbSubDeviceListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryGbSubDeviceListResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryGbSubDeviceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGbSubDeviceListResponseBody self = new QueryGbSubDeviceListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGbSubDeviceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryGbSubDeviceListResponseBody setData(QueryGbSubDeviceListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryGbSubDeviceListResponseBodyData getData() {
        return this.data;
    }

    public QueryGbSubDeviceListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryGbSubDeviceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGbSubDeviceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryGbSubDeviceListResponseBodyDataGbSubDeviceList extends TeaModel {
        @NameInMap("DeviceEnable")
        public Integer deviceEnable;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("ProductKey")
        public String productKey;

        public static QueryGbSubDeviceListResponseBodyDataGbSubDeviceList build(java.util.Map<String, ?> map) throws Exception {
            QueryGbSubDeviceListResponseBodyDataGbSubDeviceList self = new QueryGbSubDeviceListResponseBodyDataGbSubDeviceList();
            return TeaModel.build(map, self);
        }

        public QueryGbSubDeviceListResponseBodyDataGbSubDeviceList setDeviceEnable(Integer deviceEnable) {
            this.deviceEnable = deviceEnable;
            return this;
        }
        public Integer getDeviceEnable() {
            return this.deviceEnable;
        }

        public QueryGbSubDeviceListResponseBodyDataGbSubDeviceList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public QueryGbSubDeviceListResponseBodyDataGbSubDeviceList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryGbSubDeviceListResponseBodyDataGbSubDeviceList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryGbSubDeviceListResponseBodyDataGbSubDeviceList setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

    public static class QueryGbSubDeviceListResponseBodyData extends TeaModel {
        @NameInMap("GbSubDeviceList")
        public java.util.List<QueryGbSubDeviceListResponseBodyDataGbSubDeviceList> gbSubDeviceList;

        @NameInMap("Total")
        public Integer total;

        public static QueryGbSubDeviceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryGbSubDeviceListResponseBodyData self = new QueryGbSubDeviceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryGbSubDeviceListResponseBodyData setGbSubDeviceList(java.util.List<QueryGbSubDeviceListResponseBodyDataGbSubDeviceList> gbSubDeviceList) {
            this.gbSubDeviceList = gbSubDeviceList;
            return this;
        }
        public java.util.List<QueryGbSubDeviceListResponseBodyDataGbSubDeviceList> getGbSubDeviceList() {
            return this.gbSubDeviceList;
        }

        public QueryGbSubDeviceListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
