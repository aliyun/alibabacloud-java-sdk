// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class QueryGenerateDevicesInfoListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryGenerateDevicesInfoListResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryGenerateDevicesInfoListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGenerateDevicesInfoListResponseBody self = new QueryGenerateDevicesInfoListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGenerateDevicesInfoListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryGenerateDevicesInfoListResponseBody setData(QueryGenerateDevicesInfoListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryGenerateDevicesInfoListResponseBodyData getData() {
        return this.data;
    }

    public QueryGenerateDevicesInfoListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryGenerateDevicesInfoListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGenerateDevicesInfoListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryGenerateDevicesInfoListResponseBodyDataListData extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceSecret")
        public String deviceSecret;

        @NameInMap("IotId")
        public String iotId;

        public static QueryGenerateDevicesInfoListResponseBodyDataListData build(java.util.Map<String, ?> map) throws Exception {
            QueryGenerateDevicesInfoListResponseBodyDataListData self = new QueryGenerateDevicesInfoListResponseBodyDataListData();
            return TeaModel.build(map, self);
        }

        public QueryGenerateDevicesInfoListResponseBodyDataListData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryGenerateDevicesInfoListResponseBodyDataListData setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public QueryGenerateDevicesInfoListResponseBodyDataListData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

    public static class QueryGenerateDevicesInfoListResponseBodyData extends TeaModel {
        @NameInMap("ListData")
        public java.util.List<QueryGenerateDevicesInfoListResponseBodyDataListData> listData;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QueryGenerateDevicesInfoListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryGenerateDevicesInfoListResponseBodyData self = new QueryGenerateDevicesInfoListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryGenerateDevicesInfoListResponseBodyData setListData(java.util.List<QueryGenerateDevicesInfoListResponseBodyDataListData> listData) {
            this.listData = listData;
            return this;
        }
        public java.util.List<QueryGenerateDevicesInfoListResponseBodyDataListData> getListData() {
            return this.listData;
        }

        public QueryGenerateDevicesInfoListResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public QueryGenerateDevicesInfoListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryGenerateDevicesInfoListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
