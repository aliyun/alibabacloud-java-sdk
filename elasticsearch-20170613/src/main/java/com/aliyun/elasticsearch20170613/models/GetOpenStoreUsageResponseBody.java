// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetOpenStoreUsageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("currentUsage")
        public Long currentUsage;

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
