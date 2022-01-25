// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ExitLiveResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ExitLiveResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ExitLiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExitLiveResponseBody self = new ExitLiveResponseBody();
        return TeaModel.build(map, self);
    }

    public ExitLiveResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExitLiveResponseBody setData(ExitLiveResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExitLiveResponseBodyData getData() {
        return this.data;
    }

    public ExitLiveResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExitLiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ExitLiveResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        public static ExitLiveResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExitLiveResponseBodyData self = new ExitLiveResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExitLiveResponseBodyData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

    }

}
