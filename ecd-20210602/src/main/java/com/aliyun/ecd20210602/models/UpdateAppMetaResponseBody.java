// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class UpdateAppMetaResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateAppMetaResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAppMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppMetaResponseBody self = new UpdateAppMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppMetaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateAppMetaResponseBody setData(UpdateAppMetaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateAppMetaResponseBodyData getData() {
        return this.data;
    }

    public UpdateAppMetaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAppMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateAppMetaResponseBodyData extends TeaModel {
        @NameInMap("IsSuccess")
        public Boolean isSuccess;

        public static UpdateAppMetaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppMetaResponseBodyData self = new UpdateAppMetaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateAppMetaResponseBodyData setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

    }

}
