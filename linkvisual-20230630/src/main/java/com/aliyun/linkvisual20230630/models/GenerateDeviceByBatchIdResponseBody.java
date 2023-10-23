// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class GenerateDeviceByBatchIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GenerateDeviceByBatchIdResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GenerateDeviceByBatchIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateDeviceByBatchIdResponseBody self = new GenerateDeviceByBatchIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateDeviceByBatchIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateDeviceByBatchIdResponseBody setData(GenerateDeviceByBatchIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateDeviceByBatchIdResponseBodyData getData() {
        return this.data;
    }

    public GenerateDeviceByBatchIdResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GenerateDeviceByBatchIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateDeviceByBatchIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenerateDeviceByBatchIdResponseBodyData extends TeaModel {
        @NameInMap("BatchId")
        public String batchId;

        public static GenerateDeviceByBatchIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateDeviceByBatchIdResponseBodyData self = new GenerateDeviceByBatchIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateDeviceByBatchIdResponseBodyData setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public String getBatchId() {
            return this.batchId;
        }

    }

}
