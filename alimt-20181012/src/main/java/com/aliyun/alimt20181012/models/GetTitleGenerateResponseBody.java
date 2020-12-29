// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetTitleGenerateResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetTitleGenerateResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    public static GetTitleGenerateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTitleGenerateResponseBody self = new GetTitleGenerateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTitleGenerateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTitleGenerateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTitleGenerateResponseBody setData(GetTitleGenerateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTitleGenerateResponseBodyData getData() {
        return this.data;
    }

    public GetTitleGenerateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetTitleGenerateResponseBodyData extends TeaModel {
        @NameInMap("Titles")
        public String titles;

        public static GetTitleGenerateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTitleGenerateResponseBodyData self = new GetTitleGenerateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTitleGenerateResponseBodyData setTitles(String titles) {
            this.titles = titles;
            return this;
        }
        public String getTitles() {
            return this.titles;
        }

    }

}
