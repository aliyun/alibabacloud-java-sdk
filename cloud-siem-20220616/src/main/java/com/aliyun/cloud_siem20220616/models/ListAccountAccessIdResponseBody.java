// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListAccountAccessIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListAccountAccessIdResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAccountAccessIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccountAccessIdResponseBody self = new ListAccountAccessIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccountAccessIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAccountAccessIdResponseBody setData(java.util.List<ListAccountAccessIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAccountAccessIdResponseBodyData> getData() {
        return this.data;
    }

    public ListAccountAccessIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAccountAccessIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAccountAccessIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAccountAccessIdResponseBodyData extends TeaModel {
        @NameInMap("AccessId")
        public String accessId;

        @NameInMap("AccessIdMd5")
        public String accessIdMd5;

        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("AccountStr")
        public String accountStr;

        @NameInMap("Bound")
        public Integer bound;

        @NameInMap("CloudCode")
        public String cloudCode;

        @NameInMap("SubUserId")
        public Long subUserId;

        public static ListAccountAccessIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAccountAccessIdResponseBodyData self = new ListAccountAccessIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAccountAccessIdResponseBodyData setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public ListAccountAccessIdResponseBodyData setAccessIdMd5(String accessIdMd5) {
            this.accessIdMd5 = accessIdMd5;
            return this;
        }
        public String getAccessIdMd5() {
            return this.accessIdMd5;
        }

        public ListAccountAccessIdResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListAccountAccessIdResponseBodyData setAccountStr(String accountStr) {
            this.accountStr = accountStr;
            return this;
        }
        public String getAccountStr() {
            return this.accountStr;
        }

        public ListAccountAccessIdResponseBodyData setBound(Integer bound) {
            this.bound = bound;
            return this;
        }
        public Integer getBound() {
            return this.bound;
        }

        public ListAccountAccessIdResponseBodyData setCloudCode(String cloudCode) {
            this.cloudCode = cloudCode;
            return this;
        }
        public String getCloudCode() {
            return this.cloudCode;
        }

        public ListAccountAccessIdResponseBodyData setSubUserId(Long subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public Long getSubUserId() {
            return this.subUserId;
        }

    }

}
