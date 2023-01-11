// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetRealNameStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetRealNameStatusResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("LocalizedMessage")
    public String localizedMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetRealNameStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRealNameStatusResponseBody self = new GetRealNameStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRealNameStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRealNameStatusResponseBody setData(GetRealNameStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRealNameStatusResponseBodyData getData() {
        return this.data;
    }

    public GetRealNameStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetRealNameStatusResponseBody setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }
    public String getLocalizedMessage() {
        return this.localizedMessage;
    }

    public GetRealNameStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRealNameStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRealNameStatusResponseBodyData extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("RealNameStatus")
        public String realNameStatus;

        public static GetRealNameStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRealNameStatusResponseBodyData self = new GetRealNameStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRealNameStatusResponseBodyData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetRealNameStatusResponseBodyData setRealNameStatus(String realNameStatus) {
            this.realNameStatus = realNameStatus;
            return this;
        }
        public String getRealNameStatus() {
            return this.realNameStatus;
        }

    }

}
