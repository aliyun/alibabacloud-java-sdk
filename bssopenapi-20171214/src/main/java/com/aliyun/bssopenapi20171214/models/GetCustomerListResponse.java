// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetCustomerListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public GetCustomerListResponseData data;

    public static GetCustomerListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerListResponse self = new GetCustomerListResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomerListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomerListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetCustomerListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomerListResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCustomerListResponse setData(GetCustomerListResponseData data) {
        this.data = data;
        return this;
    }
    public GetCustomerListResponseData getData() {
        return this.data;
    }

    public static class GetCustomerListResponseData extends TeaModel {
        @NameInMap("UidList")
        @Validation(required = true)
        public java.util.List<String> uidList;

        public static GetCustomerListResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerListResponseData self = new GetCustomerListResponseData();
            return TeaModel.build(map, self);
        }

        public GetCustomerListResponseData setUidList(java.util.List<String> uidList) {
            this.uidList = uidList;
            return this;
        }
        public java.util.List<String> getUidList() {
            return this.uidList;
        }

    }

}
