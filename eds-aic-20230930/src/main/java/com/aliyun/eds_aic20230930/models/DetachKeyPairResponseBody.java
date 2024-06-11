// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DetachKeyPairResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetachKeyPairResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DetachKeyPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachKeyPairResponseBody self = new DetachKeyPairResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachKeyPairResponseBody setData(DetachKeyPairResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetachKeyPairResponseBodyData getData() {
        return this.data;
    }

    public DetachKeyPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetachKeyPairResponseBodyData extends TeaModel {
        @NameInMap("DetachedInstanceIds")
        public java.util.List<String> detachedInstanceIds;

        @NameInMap("FailCount")
        public Integer failCount;

        @NameInMap("KeyPairId")
        public String keyPairId;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DetachKeyPairResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetachKeyPairResponseBodyData self = new DetachKeyPairResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetachKeyPairResponseBodyData setDetachedInstanceIds(java.util.List<String> detachedInstanceIds) {
            this.detachedInstanceIds = detachedInstanceIds;
            return this;
        }
        public java.util.List<String> getDetachedInstanceIds() {
            return this.detachedInstanceIds;
        }

        public DetachKeyPairResponseBodyData setFailCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }
        public Integer getFailCount() {
            return this.failCount;
        }

        public DetachKeyPairResponseBodyData setKeyPairId(String keyPairId) {
            this.keyPairId = keyPairId;
            return this;
        }
        public String getKeyPairId() {
            return this.keyPairId;
        }

        public DetachKeyPairResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
