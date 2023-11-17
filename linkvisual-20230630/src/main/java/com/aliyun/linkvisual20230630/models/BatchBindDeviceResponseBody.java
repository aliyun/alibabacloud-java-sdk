// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class BatchBindDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BatchBindDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchBindDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchBindDeviceResponseBody self = new BatchBindDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchBindDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchBindDeviceResponseBody setData(BatchBindDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchBindDeviceResponseBodyData getData() {
        return this.data;
    }

    public BatchBindDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchBindDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchBindDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchBindDeviceResponseBodyDataBindDeviceList extends TeaModel {
        @NameInMap("BindResultCode")
        public Integer bindResultCode;

        @NameInMap("BindResultMessage")
        public String bindResultMessage;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("ProductKey")
        public String productKey;

        public static BatchBindDeviceResponseBodyDataBindDeviceList build(java.util.Map<String, ?> map) throws Exception {
            BatchBindDeviceResponseBodyDataBindDeviceList self = new BatchBindDeviceResponseBodyDataBindDeviceList();
            return TeaModel.build(map, self);
        }

        public BatchBindDeviceResponseBodyDataBindDeviceList setBindResultCode(Integer bindResultCode) {
            this.bindResultCode = bindResultCode;
            return this;
        }
        public Integer getBindResultCode() {
            return this.bindResultCode;
        }

        public BatchBindDeviceResponseBodyDataBindDeviceList setBindResultMessage(String bindResultMessage) {
            this.bindResultMessage = bindResultMessage;
            return this;
        }
        public String getBindResultMessage() {
            return this.bindResultMessage;
        }

        public BatchBindDeviceResponseBodyDataBindDeviceList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchBindDeviceResponseBodyDataBindDeviceList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public BatchBindDeviceResponseBodyDataBindDeviceList setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

    public static class BatchBindDeviceResponseBodyData extends TeaModel {
        @NameInMap("BindDeviceList")
        public java.util.List<BatchBindDeviceResponseBodyDataBindDeviceList> bindDeviceList;

        public static BatchBindDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchBindDeviceResponseBodyData self = new BatchBindDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchBindDeviceResponseBodyData setBindDeviceList(java.util.List<BatchBindDeviceResponseBodyDataBindDeviceList> bindDeviceList) {
            this.bindDeviceList = bindDeviceList;
            return this;
        }
        public java.util.List<BatchBindDeviceResponseBodyDataBindDeviceList> getBindDeviceList() {
            return this.bindDeviceList;
        }

    }

}
