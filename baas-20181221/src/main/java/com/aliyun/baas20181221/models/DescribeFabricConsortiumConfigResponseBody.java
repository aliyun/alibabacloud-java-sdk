// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public DescribeFabricConsortiumConfigResponseBodyResult result;

    public static DescribeFabricConsortiumConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumConfigResponseBody self = new DescribeFabricConsortiumConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricConsortiumConfigResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricConsortiumConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFabricConsortiumConfigResponseBody setResult(DescribeFabricConsortiumConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeFabricConsortiumConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeFabricConsortiumConfigResponseBodyResult extends TeaModel {
        @NameInMap("ChannelPolicy")
        public java.util.List<String> channelPolicy;

        @NameInMap("OrdererType")
        public java.util.List<String> ordererType;

        public static DescribeFabricConsortiumConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricConsortiumConfigResponseBodyResult self = new DescribeFabricConsortiumConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricConsortiumConfigResponseBodyResult setChannelPolicy(java.util.List<String> channelPolicy) {
            this.channelPolicy = channelPolicy;
            return this;
        }
        public java.util.List<String> getChannelPolicy() {
            return this.channelPolicy;
        }

        public DescribeFabricConsortiumConfigResponseBodyResult setOrdererType(java.util.List<String> ordererType) {
            this.ordererType = ordererType;
            return this;
        }
        public java.util.List<String> getOrdererType() {
            return this.ordererType;
        }

    }

}
