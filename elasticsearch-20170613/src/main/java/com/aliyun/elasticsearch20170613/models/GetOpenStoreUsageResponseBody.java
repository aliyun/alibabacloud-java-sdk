// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetOpenStoreUsageResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E1DE2491-804F-4C86-BAB4-548DD70B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The current request result.</p>
     */
    @NameInMap("Result")
    public GetOpenStoreUsageResponseBodyResult result;

    public static GetOpenStoreUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOpenStoreUsageResponseBody self = new GetOpenStoreUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOpenStoreUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOpenStoreUsageResponseBody setResult(GetOpenStoreUsageResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetOpenStoreUsageResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetOpenStoreUsageResponseBodyResult extends TeaModel {
        /**
         * <p>The current OpenStore storage capacity (estimated value based on actual indexes). Unit: Byte.</p>
         * 
         * <strong>example:</strong>
         * <p>204800</p>
         */
        @NameInMap("currentUsage")
        public Long currentUsage;

        /**
         * <p>The storage capacity of OpenStore yesterday. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>184320</p>
         */
        @NameInMap("lastDayUsage")
        public Long lastDayUsage;

        public static GetOpenStoreUsageResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetOpenStoreUsageResponseBodyResult self = new GetOpenStoreUsageResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetOpenStoreUsageResponseBodyResult setCurrentUsage(Long currentUsage) {
            this.currentUsage = currentUsage;
            return this;
        }
        public Long getCurrentUsage() {
            return this.currentUsage;
        }

        public GetOpenStoreUsageResponseBodyResult setLastDayUsage(Long lastDayUsage) {
            this.lastDayUsage = lastDayUsage;
            return this;
        }
        public Long getLastDayUsage() {
            return this.lastDayUsage;
        }

    }

}
