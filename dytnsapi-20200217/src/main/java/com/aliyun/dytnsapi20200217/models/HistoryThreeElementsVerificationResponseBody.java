// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class HistoryThreeElementsVerificationResponseBody extends TeaModel {
    /**
     * <p>Details about why access is denied.</p>
     * <blockquote>
     * <p>This parameter is returned only when RAM authentication fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code of the request.</p>
     * <ul>
     * <li><p>A value of <code>OK</code> indicates the request was successful.</p>
     * </li>
     * <li><p>For other values, see the Error Codes section.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The query results.</p>
     */
    @NameInMap("Data")
    public HistoryThreeElementsVerificationResponseBodyData data;

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
     * <p>CC3BB6D2-2FDF-4321-9DCE-B38165CE4C47</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static HistoryThreeElementsVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HistoryThreeElementsVerificationResponseBody self = new HistoryThreeElementsVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public HistoryThreeElementsVerificationResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public HistoryThreeElementsVerificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HistoryThreeElementsVerificationResponseBody setData(HistoryThreeElementsVerificationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public HistoryThreeElementsVerificationResponseBodyData getData() {
        return this.data;
    }

    public HistoryThreeElementsVerificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HistoryThreeElementsVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class HistoryThreeElementsVerificationResponseBodyData extends TeaModel {
        /**
         * <p>The consistency of the verification result. Valid values:</p>
         * <ul>
         * <li><p><code>0</code>: No record found.</p>
         * </li>
         * <li><p><code>1</code>: The phone number, ID number, and name match the carrier\&quot;s records.</p>
         * </li>
         * <li><p><code>2</code>: The phone number and ID number match the carrier\&quot;s records, but the name does not.</p>
         * </li>
         * <li><p><code>3</code>: The phone number and name match the carrier\&quot;s records, but the ID number does not.</p>
         * </li>
         * <li><p><code>4</code>: The phone number matches the carrier\&quot;s records, but the name and ID number do not.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("IsConsistent")
        public Long isConsistent;

        /**
         * <p>The carrier to which the request was routed.</p>
         * 
         * <strong>example:</strong>
         * <p>CMCC</p>
         */
        @NameInMap("RequestCarrier")
        public String requestCarrier;

        public static HistoryThreeElementsVerificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            HistoryThreeElementsVerificationResponseBodyData self = new HistoryThreeElementsVerificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public HistoryThreeElementsVerificationResponseBodyData setIsConsistent(Long isConsistent) {
            this.isConsistent = isConsistent;
            return this;
        }
        public Long getIsConsistent() {
            return this.isConsistent;
        }

        public HistoryThreeElementsVerificationResponseBodyData setRequestCarrier(String requestCarrier) {
            this.requestCarrier = requestCarrier;
            return this;
        }
        public String getRequestCarrier() {
            return this.requestCarrier;
        }

    }

}
