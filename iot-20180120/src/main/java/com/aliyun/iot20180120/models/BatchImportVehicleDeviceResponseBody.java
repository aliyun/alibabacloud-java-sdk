// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchImportVehicleDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BatchImportVehicleDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchImportVehicleDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchImportVehicleDeviceResponseBody self = new BatchImportVehicleDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchImportVehicleDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchImportVehicleDeviceResponseBody setData(BatchImportVehicleDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchImportVehicleDeviceResponseBodyData getData() {
        return this.data;
    }

    public BatchImportVehicleDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchImportVehicleDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchImportVehicleDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchImportVehicleDeviceResponseBodyData extends TeaModel {
        @NameInMap("ApplyId")
        public Long applyId;

        public static BatchImportVehicleDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchImportVehicleDeviceResponseBodyData self = new BatchImportVehicleDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchImportVehicleDeviceResponseBodyData setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

    }

}
