// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeUserFlowInfoResponseBody extends TeaModel {
    @NameInMap("FlowInfo")
    public DescribeUserFlowInfoResponseBodyFlowInfo flowInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeUserFlowInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserFlowInfoResponseBody self = new DescribeUserFlowInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserFlowInfoResponseBody setFlowInfo(DescribeUserFlowInfoResponseBodyFlowInfo flowInfo) {
        this.flowInfo = flowInfo;
        return this;
    }
    public DescribeUserFlowInfoResponseBodyFlowInfo getFlowInfo() {
        return this.flowInfo;
    }

    public DescribeUserFlowInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserFlowInfoResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeUserFlowInfoResponseBodyFlowInfo extends TeaModel {
        @NameInMap("BizBandWidth")
        public Long bizBandWidth;

        public static DescribeUserFlowInfoResponseBodyFlowInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserFlowInfoResponseBodyFlowInfo self = new DescribeUserFlowInfoResponseBodyFlowInfo();
            return TeaModel.build(map, self);
        }

        public DescribeUserFlowInfoResponseBodyFlowInfo setBizBandWidth(Long bizBandWidth) {
            this.bizBandWidth = bizBandWidth;
            return this;
        }
        public Long getBizBandWidth() {
            return this.bizBandWidth;
        }

    }

}
