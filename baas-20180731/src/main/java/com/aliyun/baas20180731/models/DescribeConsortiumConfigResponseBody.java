// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeConsortiumConfigResponseBody extends TeaModel {
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
    public DescribeConsortiumConfigResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeConsortiumConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsortiumConfigResponseBody self = new DescribeConsortiumConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConsortiumConfigResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeConsortiumConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConsortiumConfigResponseBody setResult(DescribeConsortiumConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeConsortiumConfigResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeConsortiumConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeConsortiumConfigResponseBodyResult extends TeaModel {
        @NameInMap("ChannelPolicy")
        public java.util.List<String> channelPolicy;

        @NameInMap("OrdererType")
        public java.util.List<String> ordererType;

        public static DescribeConsortiumConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsortiumConfigResponseBodyResult self = new DescribeConsortiumConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeConsortiumConfigResponseBodyResult setChannelPolicy(java.util.List<String> channelPolicy) {
            this.channelPolicy = channelPolicy;
            return this;
        }
        public java.util.List<String> getChannelPolicy() {
            return this.channelPolicy;
        }

        public DescribeConsortiumConfigResponseBodyResult setOrdererType(java.util.List<String> ordererType) {
            this.ordererType = ordererType;
            return this;
        }
        public java.util.List<String> getOrdererType() {
            return this.ordererType;
        }

    }

}
