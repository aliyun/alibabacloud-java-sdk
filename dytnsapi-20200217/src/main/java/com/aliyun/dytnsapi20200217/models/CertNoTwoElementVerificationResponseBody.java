// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class CertNoTwoElementVerificationResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CertNoTwoElementVerificationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CertNoTwoElementVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CertNoTwoElementVerificationResponseBody self = new CertNoTwoElementVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public CertNoTwoElementVerificationResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CertNoTwoElementVerificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CertNoTwoElementVerificationResponseBody setData(CertNoTwoElementVerificationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CertNoTwoElementVerificationResponseBodyData getData() {
        return this.data;
    }

    public CertNoTwoElementVerificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CertNoTwoElementVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CertNoTwoElementVerificationResponseBodyData extends TeaModel {
        @NameInMap("IsConsistent")
        public String isConsistent;

        public static CertNoTwoElementVerificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CertNoTwoElementVerificationResponseBodyData self = new CertNoTwoElementVerificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CertNoTwoElementVerificationResponseBodyData setIsConsistent(String isConsistent) {
            this.isConsistent = isConsistent;
            return this;
        }
        public String getIsConsistent() {
            return this.isConsistent;
        }

    }

}
