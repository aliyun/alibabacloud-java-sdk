// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class HistoryThreeElementsVerificationResponseBody extends TeaModel {
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
    public HistoryThreeElementsVerificationResponseBodyData data;

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
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("IsConsistent")
        public Long isConsistent;

        /**
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
