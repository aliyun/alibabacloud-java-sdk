// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class GenerateDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GenerateDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GenerateDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateDeviceResponseBody self = new GenerateDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateDeviceResponseBody setData(GenerateDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateDeviceResponseBodyData getData() {
        return this.data;
    }

    public GenerateDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GenerateDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenerateDeviceResponseBodyData extends TeaModel {
        @NameInMap("BatchId")
        public String batchId;

        public static GenerateDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateDeviceResponseBodyData self = new GenerateDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateDeviceResponseBodyData setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public String getBatchId() {
            return this.batchId;
        }

    }

}
