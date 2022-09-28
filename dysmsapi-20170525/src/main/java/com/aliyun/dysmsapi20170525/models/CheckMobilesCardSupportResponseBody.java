// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CheckMobilesCardSupportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CheckMobilesCardSupportResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CheckMobilesCardSupportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckMobilesCardSupportResponseBody self = new CheckMobilesCardSupportResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckMobilesCardSupportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckMobilesCardSupportResponseBody setData(CheckMobilesCardSupportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckMobilesCardSupportResponseBodyData getData() {
        return this.data;
    }

    public CheckMobilesCardSupportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckMobilesCardSupportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckMobilesCardSupportResponseBodyDataQueryResult extends TeaModel {
        @NameInMap("mobile")
        public String mobile;

        @NameInMap("support")
        public Boolean support;

        public static CheckMobilesCardSupportResponseBodyDataQueryResult build(java.util.Map<String, ?> map) throws Exception {
            CheckMobilesCardSupportResponseBodyDataQueryResult self = new CheckMobilesCardSupportResponseBodyDataQueryResult();
            return TeaModel.build(map, self);
        }

        public CheckMobilesCardSupportResponseBodyDataQueryResult setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public CheckMobilesCardSupportResponseBodyDataQueryResult setSupport(Boolean support) {
            this.support = support;
            return this;
        }
        public Boolean getSupport() {
            return this.support;
        }

    }

    public static class CheckMobilesCardSupportResponseBodyData extends TeaModel {
        @NameInMap("queryResult")
        public java.util.List<CheckMobilesCardSupportResponseBodyDataQueryResult> queryResult;

        public static CheckMobilesCardSupportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckMobilesCardSupportResponseBodyData self = new CheckMobilesCardSupportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckMobilesCardSupportResponseBodyData setQueryResult(java.util.List<CheckMobilesCardSupportResponseBodyDataQueryResult> queryResult) {
            this.queryResult = queryResult;
            return this;
        }
        public java.util.List<CheckMobilesCardSupportResponseBodyDataQueryResult> getQueryResult() {
            return this.queryResult;
        }

    }

}
