// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindCustomerInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public FindCustomerInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static FindCustomerInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindCustomerInfoResponseBody self = new FindCustomerInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public FindCustomerInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FindCustomerInfoResponseBody setData(FindCustomerInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FindCustomerInfoResponseBodyData getData() {
        return this.data;
    }

    public FindCustomerInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FindCustomerInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindCustomerInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FindCustomerInfoResponseBodyData extends TeaModel {
        @NameInMap("Biz")
        public String biz;

        @NameInMap("Website")
        public String website;

        public static FindCustomerInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FindCustomerInfoResponseBodyData self = new FindCustomerInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FindCustomerInfoResponseBodyData setBiz(String biz) {
            this.biz = biz;
            return this;
        }
        public String getBiz() {
            return this.biz;
        }

        public FindCustomerInfoResponseBodyData setWebsite(String website) {
            this.website = website;
            return this;
        }
        public String getWebsite() {
            return this.website;
        }

    }

}
