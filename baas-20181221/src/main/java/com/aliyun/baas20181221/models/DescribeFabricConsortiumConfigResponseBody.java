// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>1890FA4F-067A-4CE9-AC9B-2BD2E58FB5D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeFabricConsortiumConfigResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeFabricConsortiumConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumConfigResponseBody self = new DescribeFabricConsortiumConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumConfigResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricConsortiumConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricConsortiumConfigResponseBody setResult(DescribeFabricConsortiumConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeFabricConsortiumConfigResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeFabricConsortiumConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
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
