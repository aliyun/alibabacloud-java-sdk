// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindPkByHidForLoginWithLegacyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public FindPkByHidForLoginWithLegacyResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static FindPkByHidForLoginWithLegacyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindPkByHidForLoginWithLegacyResponseBody self = new FindPkByHidForLoginWithLegacyResponseBody();
        return TeaModel.build(map, self);
    }

    public FindPkByHidForLoginWithLegacyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FindPkByHidForLoginWithLegacyResponseBody setData(FindPkByHidForLoginWithLegacyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FindPkByHidForLoginWithLegacyResponseBodyData getData() {
        return this.data;
    }

    public FindPkByHidForLoginWithLegacyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FindPkByHidForLoginWithLegacyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindPkByHidForLoginWithLegacyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FindPkByHidForLoginWithLegacyResponseBodyData extends TeaModel {
        @NameInMap("Hid")
        public String hid;

        @NameInMap("Pk")
        public String pk;

        public static FindPkByHidForLoginWithLegacyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FindPkByHidForLoginWithLegacyResponseBodyData self = new FindPkByHidForLoginWithLegacyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FindPkByHidForLoginWithLegacyResponseBodyData setHid(String hid) {
            this.hid = hid;
            return this;
        }
        public String getHid() {
            return this.hid;
        }

        public FindPkByHidForLoginWithLegacyResponseBodyData setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

    }

}
