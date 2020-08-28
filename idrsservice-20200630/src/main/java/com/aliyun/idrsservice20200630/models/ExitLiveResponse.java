// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ExitLiveResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ExitLiveResponseData data;

    public static ExitLiveResponse build(java.util.Map<String, ?> map) throws Exception {
        ExitLiveResponse self = new ExitLiveResponse();
        return TeaModel.build(map, self);
    }

    public ExitLiveResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExitLiveResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExitLiveResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExitLiveResponse setData(ExitLiveResponseData data) {
        this.data = data;
        return this;
    }
    public ExitLiveResponseData getData() {
        return this.data;
    }

    public static class ExitLiveResponseData extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public Integer code;

        public static ExitLiveResponseData build(java.util.Map<String, ?> map) throws Exception {
            ExitLiveResponseData self = new ExitLiveResponseData();
            return TeaModel.build(map, self);
        }

        public ExitLiveResponseData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

    }

}
