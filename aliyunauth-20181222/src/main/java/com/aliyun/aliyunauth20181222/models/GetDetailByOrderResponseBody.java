// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunauth20181222.models;

import com.aliyun.tea.*;

public class GetDetailByOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetDetailByOrderResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetDetailByOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDetailByOrderResponseBody self = new GetDetailByOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDetailByOrderResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetDetailByOrderResponseBody setData(GetDetailByOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDetailByOrderResponseBodyData getData() {
        return this.data;
    }

    public GetDetailByOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDetailByOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDetailByOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDetailByOrderResponseBodyData extends TeaModel {
        @NameInMap("Url")
        public String url;

        public static GetDetailByOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDetailByOrderResponseBodyData self = new GetDetailByOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDetailByOrderResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
