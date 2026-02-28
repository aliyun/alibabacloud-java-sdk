// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGrayMigrationDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BatchGrayMigrationDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchGrayMigrationDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGrayMigrationDeviceResponseBody self = new BatchGrayMigrationDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGrayMigrationDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGrayMigrationDeviceResponseBody setData(BatchGrayMigrationDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchGrayMigrationDeviceResponseBodyData getData() {
        return this.data;
    }

    public BatchGrayMigrationDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchGrayMigrationDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGrayMigrationDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchGrayMigrationDeviceResponseBodyDataDetailsItem extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("Message")
        public String message;

        @NameInMap("Status")
        public String status;

        public static BatchGrayMigrationDeviceResponseBodyDataDetailsItem build(java.util.Map<String, ?> map) throws Exception {
            BatchGrayMigrationDeviceResponseBodyDataDetailsItem self = new BatchGrayMigrationDeviceResponseBodyDataDetailsItem();
            return TeaModel.build(map, self);
        }

        public BatchGrayMigrationDeviceResponseBodyDataDetailsItem setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public BatchGrayMigrationDeviceResponseBodyDataDetailsItem setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchGrayMigrationDeviceResponseBodyDataDetailsItem setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchGrayMigrationDeviceResponseBodyDataDetailsItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class BatchGrayMigrationDeviceResponseBodyDataDetails extends TeaModel {
        @NameInMap("item")
        public java.util.List<BatchGrayMigrationDeviceResponseBodyDataDetailsItem> item;

        public static BatchGrayMigrationDeviceResponseBodyDataDetails build(java.util.Map<String, ?> map) throws Exception {
            BatchGrayMigrationDeviceResponseBodyDataDetails self = new BatchGrayMigrationDeviceResponseBodyDataDetails();
            return TeaModel.build(map, self);
        }

        public BatchGrayMigrationDeviceResponseBodyDataDetails setItem(java.util.List<BatchGrayMigrationDeviceResponseBodyDataDetailsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<BatchGrayMigrationDeviceResponseBodyDataDetailsItem> getItem() {
            return this.item;
        }

    }

    public static class BatchGrayMigrationDeviceResponseBodyData extends TeaModel {
        @NameInMap("Details")
        public BatchGrayMigrationDeviceResponseBodyDataDetails details;

        public static BatchGrayMigrationDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchGrayMigrationDeviceResponseBodyData self = new BatchGrayMigrationDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchGrayMigrationDeviceResponseBodyData setDetails(BatchGrayMigrationDeviceResponseBodyDataDetails details) {
            this.details = details;
            return this;
        }
        public BatchGrayMigrationDeviceResponseBodyDataDetails getDetails() {
            return this.details;
        }

    }

}
