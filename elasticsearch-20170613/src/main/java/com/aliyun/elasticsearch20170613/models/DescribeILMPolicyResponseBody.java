// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeILMPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeILMPolicyResponseBodyResult result;

    public static DescribeILMPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeILMPolicyResponseBody self = new DescribeILMPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeILMPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeILMPolicyResponseBody setResult(DescribeILMPolicyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeILMPolicyResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeILMPolicyResponseBodyResult extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("phases")
        public java.util.Map<String, ?> phases;

        public static DescribeILMPolicyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeILMPolicyResponseBodyResult self = new DescribeILMPolicyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeILMPolicyResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeILMPolicyResponseBodyResult setPhases(java.util.Map<String, ?> phases) {
            this.phases = phases;
            return this;
        }
        public java.util.Map<String, ?> getPhases() {
            return this.phases;
        }

    }

}
