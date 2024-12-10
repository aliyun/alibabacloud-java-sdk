// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class QueryDeviceListResponseBody extends TeaModel {
    @NameInMap("DeviceList")
    public java.util.List<QueryDeviceListResponseBodyDeviceList> deviceList;

    /**
     * <strong>example:</strong>
     * <p>125****0946</p>
     */
    @NameInMap("EncodeKey")
    public String encodeKey;

    /**
     * <strong>example:</strong>
     * <p>PROJECT_ID</p>
     */
    @NameInMap("EncodeType")
    public String encodeType;

    /**
     * <strong>example:</strong>
     * <p>0EC7*726E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryDeviceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceListResponseBody self = new QueryDeviceListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceListResponseBody setDeviceList(java.util.List<QueryDeviceListResponseBodyDeviceList> deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public java.util.List<QueryDeviceListResponseBodyDeviceList> getDeviceList() {
        return this.deviceList;
    }

    public QueryDeviceListResponseBody setEncodeKey(String encodeKey) {
        this.encodeKey = encodeKey;
        return this;
    }
    public String getEncodeKey() {
        return this.encodeKey;
    }

    public QueryDeviceListResponseBody setEncodeType(String encodeType) {
        this.encodeType = encodeType;
        return this;
    }
    public String getEncodeType() {
        return this.encodeType;
    }

    public QueryDeviceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryDeviceListResponseBodyDeviceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://XXXXXX">https://XXXXXX</a></p>
         */
        @NameInMap("DeviceIconUrl")
        public String deviceIconUrl;

        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <strong>example:</strong>
         * <p>jMR2********ojVJXk=</p>
         */
        @NameInMap("DeviceOpenId")
        public String deviceOpenId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Online")
        public String online;

        public static QueryDeviceListResponseBodyDeviceList build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceListResponseBodyDeviceList self = new QueryDeviceListResponseBodyDeviceList();
            return TeaModel.build(map, self);
        }

        public QueryDeviceListResponseBodyDeviceList setDeviceIconUrl(String deviceIconUrl) {
            this.deviceIconUrl = deviceIconUrl;
            return this;
        }
        public String getDeviceIconUrl() {
            return this.deviceIconUrl;
        }

        public QueryDeviceListResponseBodyDeviceList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDeviceListResponseBodyDeviceList setDeviceOpenId(String deviceOpenId) {
            this.deviceOpenId = deviceOpenId;
            return this;
        }
        public String getDeviceOpenId() {
            return this.deviceOpenId;
        }

        public QueryDeviceListResponseBodyDeviceList setOnline(String online) {
            this.online = online;
            return this;
        }
        public String getOnline() {
            return this.online;
        }

    }

}
