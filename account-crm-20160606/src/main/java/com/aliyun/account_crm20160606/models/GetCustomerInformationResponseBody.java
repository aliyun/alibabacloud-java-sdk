// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetCustomerInformationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCustomerInformationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCustomerInformationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerInformationResponseBody self = new GetCustomerInformationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomerInformationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomerInformationResponseBody setData(GetCustomerInformationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCustomerInformationResponseBodyData getData() {
        return this.data;
    }

    public GetCustomerInformationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCustomerInformationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomerInformationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCustomerInformationResponseBodyData extends TeaModel {
        @NameInMap("Biz")
        public String biz;

        @NameInMap("Website")
        public String website;

        public static GetCustomerInformationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerInformationResponseBodyData self = new GetCustomerInformationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCustomerInformationResponseBodyData setBiz(String biz) {
            this.biz = biz;
            return this;
        }
        public String getBiz() {
            return this.biz;
        }

        public GetCustomerInformationResponseBodyData setWebsite(String website) {
            this.website = website;
            return this;
        }
        public String getWebsite() {
            return this.website;
        }

    }

}
