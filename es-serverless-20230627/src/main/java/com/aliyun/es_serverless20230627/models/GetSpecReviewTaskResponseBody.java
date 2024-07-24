// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class GetSpecReviewTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E310AC54-957A-5FD5-B85B-E972B2BDA8DE</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetSpecReviewTaskResponseBodyResult result;

    public static GetSpecReviewTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSpecReviewTaskResponseBody self = new GetSpecReviewTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSpecReviewTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSpecReviewTaskResponseBody setResult(GetSpecReviewTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetSpecReviewTaskResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetSpecReviewTaskResponseBodyResult extends TeaModel {
        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>339</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("appName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>{
         *                &quot;limiters&quot;: [
         *                     {
         *                          &quot;type&quot;: &quot;INDEX_QUOTA&quot;,
         *                          &quot;maxValue&quot;: 500,
         *                          &quot;immutable&quot;: false
         *                     }
         *                ]
         *           }</p>
         */
        @NameInMap("applyLimiter")
        public java.util.Map<String, ?> applyLimiter;

        /**
         * <strong>example:</strong>
         * <p>{
         *                &quot;appType&quot;: &quot;TRIAL&quot;,
         *                &quot;cu&quot;: 4,
         *                &quot;storage&quot;: 100
         *           }</p>
         */
        @NameInMap("applyQuota")
        public java.util.Map<String, ?> applyQuota;

        @NameInMap("applyReason")
        public String applyReason;

        /**
         * <strong>example:</strong>
         * <p>{
         *                &quot;limiters&quot;: [
         *                     {
         *                          &quot;type&quot;: &quot;INDEX_QUOTA&quot;,
         *                          &quot;maxValue&quot;: 500,
         *                          &quot;immutable&quot;: false
         *                     }
         *                ]
         *           }</p>
         */
        @NameInMap("effectiveLimiter")
        public java.util.Map<String, ?> effectiveLimiter;

        /**
         * <strong>example:</strong>
         * <p>{
         *                &quot;appType&quot;: &quot;TRIAL&quot;,
         *                &quot;cu&quot;: 4,
         *                &quot;storage&quot;: 100
         *           }</p>
         */
        @NameInMap("effectiveQuota")
        public java.util.Map<String, ?> effectiveQuota;

        /**
         * <strong>example:</strong>
         * <p>2024-05-30T06:28:07.000Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2024-05-30T06:28:07.000Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>{
         *                &quot;limiters&quot;: [
         *                     {
         *                          &quot;type&quot;: &quot;INDEX_QUOTA&quot;,
         *                          &quot;maxValue&quot;: 500,
         *                          &quot;immutable&quot;: false
         *                     }
         *                ]
         *           }</p>
         */
        @NameInMap("oldLimiter")
        public java.util.Map<String, ?> oldLimiter;

        /**
         * <strong>example:</strong>
         * <p>{
         *                &quot;appType&quot;: &quot;TRIAL&quot;,
         *                &quot;cu&quot;: 2,
         *                &quot;storage&quot;: 1
         *           }</p>
         */
        @NameInMap("oldQuota")
        public java.util.Map<String, ?> oldQuota;

        /**
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>QUOTA</p>
         */
        @NameInMap("type")
        public String type;

        public static GetSpecReviewTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetSpecReviewTaskResponseBodyResult self = new GetSpecReviewTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetSpecReviewTaskResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSpecReviewTaskResponseBodyResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetSpecReviewTaskResponseBodyResult setApplyLimiter(java.util.Map<String, ?> applyLimiter) {
            this.applyLimiter = applyLimiter;
            return this;
        }
        public java.util.Map<String, ?> getApplyLimiter() {
            return this.applyLimiter;
        }

        public GetSpecReviewTaskResponseBodyResult setApplyQuota(java.util.Map<String, ?> applyQuota) {
            this.applyQuota = applyQuota;
            return this;
        }
        public java.util.Map<String, ?> getApplyQuota() {
            return this.applyQuota;
        }

        public GetSpecReviewTaskResponseBodyResult setApplyReason(String applyReason) {
            this.applyReason = applyReason;
            return this;
        }
        public String getApplyReason() {
            return this.applyReason;
        }

        public GetSpecReviewTaskResponseBodyResult setEffectiveLimiter(java.util.Map<String, ?> effectiveLimiter) {
            this.effectiveLimiter = effectiveLimiter;
            return this;
        }
        public java.util.Map<String, ?> getEffectiveLimiter() {
            return this.effectiveLimiter;
        }

        public GetSpecReviewTaskResponseBodyResult setEffectiveQuota(java.util.Map<String, ?> effectiveQuota) {
            this.effectiveQuota = effectiveQuota;
            return this;
        }
        public java.util.Map<String, ?> getEffectiveQuota() {
            return this.effectiveQuota;
        }

        public GetSpecReviewTaskResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetSpecReviewTaskResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetSpecReviewTaskResponseBodyResult setOldLimiter(java.util.Map<String, ?> oldLimiter) {
            this.oldLimiter = oldLimiter;
            return this;
        }
        public java.util.Map<String, ?> getOldLimiter() {
            return this.oldLimiter;
        }

        public GetSpecReviewTaskResponseBodyResult setOldQuota(java.util.Map<String, ?> oldQuota) {
            this.oldQuota = oldQuota;
            return this;
        }
        public java.util.Map<String, ?> getOldQuota() {
            return this.oldQuota;
        }

        public GetSpecReviewTaskResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetSpecReviewTaskResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSpecReviewTaskResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
