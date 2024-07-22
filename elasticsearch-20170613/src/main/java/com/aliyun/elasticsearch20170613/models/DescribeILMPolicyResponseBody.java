// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeILMPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FF44681E-FD41-4FDE-B8DF-295DCDD6****</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>ilm-history-ilm-policy</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>{&quot;cold&quot;:{&quot;minAge&quot;:&quot;30d&quot;,&quot;actions&quot;:{&quot;allocate&quot;:{&quot;numberOfReplicas&quot;:1,&quot;require&quot;:{&quot;boxType&quot;:&quot;warm&quot;}},&quot;setPriority&quot;:{&quot;priority&quot;:100}}},&quot;hot&quot;:{&quot;minAge&quot;:&quot;0s&quot;,&quot;actions&quot;:{&quot;rollover&quot;:{&quot;maxAge&quot;:&quot;30d&quot;,&quot;maxDocs&quot;:10000,&quot;maxSize&quot;:&quot;50gb&quot;},&quot;setPriority&quot;:{&quot;priority&quot;:1000}}},&quot;delete&quot;:{&quot;minAge&quot;:&quot;30d&quot;,&quot;actions&quot;:{&quot;delete&quot;:{}}}}</p>
         */
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
