// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class CertNoTwoElementVerificationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CertNoTwoElementVerificationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>CC3BB6D2-2FDF-4321-9DCE-B38165CE4C47</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
