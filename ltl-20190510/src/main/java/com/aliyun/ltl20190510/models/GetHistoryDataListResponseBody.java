// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class GetHistoryDataListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetHistoryDataListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetHistoryDataListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHistoryDataListResponseBody self = new GetHistoryDataListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHistoryDataListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetHistoryDataListResponseBody setData(GetHistoryDataListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHistoryDataListResponseBodyData getData() {
        return this.data;
    }

    public GetHistoryDataListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHistoryDataListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHistoryDataListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHistoryDataListResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<java.util.Map<String, ?>> data;

        public static GetHistoryDataListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHistoryDataListResponseBodyData self = new GetHistoryDataListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHistoryDataListResponseBodyData setData(java.util.List<java.util.Map<String, ?>> data) {
            this.data = data;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getData() {
            return this.data;
        }

    }

}
