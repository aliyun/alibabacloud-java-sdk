// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeFabricChannelConfigResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeFabricChannelConfigResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeFabricChannelConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricChannelConfigResponseBody self = new DescribeFabricChannelConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricChannelConfigResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricChannelConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricChannelConfigResponseBody setResult(DescribeFabricChannelConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeFabricChannelConfigResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeFabricChannelConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFabricChannelConfigResponseBodyResult extends TeaModel {
        @NameInMap("AbsoluteMaxBytes")
        public Long absoluteMaxBytes;

        @NameInMap("BatchTimeout")
        public String batchTimeout;

        @NameInMap("MaxMessageCount")
        public Long maxMessageCount;

        @NameInMap("PreferredMaxBytes")
        public Long preferredMaxBytes;

        public static DescribeFabricChannelConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricChannelConfigResponseBodyResult self = new DescribeFabricChannelConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricChannelConfigResponseBodyResult setAbsoluteMaxBytes(Long absoluteMaxBytes) {
            this.absoluteMaxBytes = absoluteMaxBytes;
            return this;
        }
        public Long getAbsoluteMaxBytes() {
            return this.absoluteMaxBytes;
        }

        public DescribeFabricChannelConfigResponseBodyResult setBatchTimeout(String batchTimeout) {
            this.batchTimeout = batchTimeout;
            return this;
        }
        public String getBatchTimeout() {
            return this.batchTimeout;
        }

        public DescribeFabricChannelConfigResponseBodyResult setMaxMessageCount(Long maxMessageCount) {
            this.maxMessageCount = maxMessageCount;
            return this;
        }
        public Long getMaxMessageCount() {
            return this.maxMessageCount;
        }

        public DescribeFabricChannelConfigResponseBodyResult setPreferredMaxBytes(Long preferredMaxBytes) {
            this.preferredMaxBytes = preferredMaxBytes;
            return this;
        }
        public Long getPreferredMaxBytes() {
            return this.preferredMaxBytes;
        }

    }

}
