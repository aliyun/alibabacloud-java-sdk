// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class UpdateSilenceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateSilenceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSilenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSilenceResponseBody self = new UpdateSilenceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSilenceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateSilenceResponseBody setData(UpdateSilenceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateSilenceResponseBodyData getData() {
        return this.data;
    }

    public UpdateSilenceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateSilenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateSilenceResponseBodyData extends TeaModel {
        @NameInMap("IsSuccess")
        public Boolean isSuccess;

        public static UpdateSilenceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateSilenceResponseBodyData self = new UpdateSilenceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateSilenceResponseBodyData setIsSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

    }

}
