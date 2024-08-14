// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class CertNoThreeElementVerificationResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CertNoThreeElementVerificationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CertNoThreeElementVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CertNoThreeElementVerificationResponseBody self = new CertNoThreeElementVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public CertNoThreeElementVerificationResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CertNoThreeElementVerificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CertNoThreeElementVerificationResponseBody setData(CertNoThreeElementVerificationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CertNoThreeElementVerificationResponseBodyData getData() {
        return this.data;
    }

    public CertNoThreeElementVerificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CertNoThreeElementVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CertNoThreeElementVerificationResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("IsConsistent")
        public String isConsistent;

        public static CertNoThreeElementVerificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CertNoThreeElementVerificationResponseBodyData self = new CertNoThreeElementVerificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CertNoThreeElementVerificationResponseBodyData setIsConsistent(String isConsistent) {
            this.isConsistent = isConsistent;
            return this;
        }
        public String getIsConsistent() {
            return this.isConsistent;
        }

    }

}
