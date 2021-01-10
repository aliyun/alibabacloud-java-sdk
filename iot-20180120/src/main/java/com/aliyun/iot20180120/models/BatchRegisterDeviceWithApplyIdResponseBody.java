// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchRegisterDeviceWithApplyIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public BatchRegisterDeviceWithApplyIdResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static BatchRegisterDeviceWithApplyIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchRegisterDeviceWithApplyIdResponseBody self = new BatchRegisterDeviceWithApplyIdResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchRegisterDeviceWithApplyIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchRegisterDeviceWithApplyIdResponseBody setData(BatchRegisterDeviceWithApplyIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchRegisterDeviceWithApplyIdResponseBodyData getData() {
        return this.data;
    }

    public BatchRegisterDeviceWithApplyIdResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchRegisterDeviceWithApplyIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchRegisterDeviceWithApplyIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchRegisterDeviceWithApplyIdResponseBodyData extends TeaModel {
        @NameInMap("ApplyId")
        public Long applyId;

        public static BatchRegisterDeviceWithApplyIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchRegisterDeviceWithApplyIdResponseBodyData self = new BatchRegisterDeviceWithApplyIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchRegisterDeviceWithApplyIdResponseBodyData setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

    }

}
