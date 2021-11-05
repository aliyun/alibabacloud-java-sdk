// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetTitleIntelligenceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetTitleIntelligenceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetTitleIntelligenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTitleIntelligenceResponseBody self = new GetTitleIntelligenceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTitleIntelligenceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTitleIntelligenceResponseBody setData(GetTitleIntelligenceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTitleIntelligenceResponseBodyData getData() {
        return this.data;
    }

    public GetTitleIntelligenceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTitleIntelligenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTitleIntelligenceResponseBodyData extends TeaModel {
        @NameInMap("Titles")
        public String titles;

        public static GetTitleIntelligenceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTitleIntelligenceResponseBodyData self = new GetTitleIntelligenceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTitleIntelligenceResponseBodyData setTitles(String titles) {
            this.titles = titles;
            return this;
        }
        public String getTitles() {
            return this.titles;
        }

    }

}
