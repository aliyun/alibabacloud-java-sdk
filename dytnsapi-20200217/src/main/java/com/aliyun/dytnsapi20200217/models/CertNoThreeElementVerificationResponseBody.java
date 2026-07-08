// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class CertNoThreeElementVerificationResponseBody extends TeaModel {
    /**
     * <p>The details about why access was denied.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The request status code. Valid values:</p>
     * <ul>
     * <li>OK: The request is successful.</li>
     * <li>For other error codes, see the error code list below.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public CertNoThreeElementVerificationResponseBodyData data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>68A40250-50CD-034C-B728-0BD******177</p>
     */
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
         * <p>Indicates whether the verification result is consistent. Returned values:</p>
         * <ul>
         * <li><p>0: The name matches the ID card number, but they are recognized as not the same person.</p>
         * </li>
         * <li><p>1: The name matches the ID card number, and they are recognized as the same person.</p>
         * </li>
         * <li><p>2: The name matches the ID card number, and they are suspected to be the same person.</p>
         * </li>
         * <li><p>3: The name matches the ID card number, but no portrait information is found in the database.</p>
         * </li>
         * <li><p>4: Invalid identity information (the name does not match the ID card number).</p>
         * </li>
         * <li><p>5: The photo quality is unqualified.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
