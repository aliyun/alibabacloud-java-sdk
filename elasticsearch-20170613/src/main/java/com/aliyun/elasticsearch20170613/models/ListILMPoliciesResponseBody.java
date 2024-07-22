// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListILMPoliciesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DCC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListILMPoliciesResponseBodyResult> result;

    public static ListILMPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListILMPoliciesResponseBody self = new ListILMPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListILMPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListILMPoliciesResponseBody setResult(java.util.List<ListILMPoliciesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListILMPoliciesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListILMPoliciesResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>policy-1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>{&quot;hot&quot;:{&quot;minAge&quot;:&quot;0ms&quot;,&quot;actions&quot;:{&quot;rollover&quot;:{&quot;maxSize&quot;:&quot;50gb&quot;,&quot;maxAge&quot;:&quot;30d&quot;},&quot;setPriority&quot;:{&quot;priority&quot;:100}}},&quot;delete&quot;:{&quot;minAge&quot;:&quot;3d&quot;,&quot;actions&quot;:{&quot;delete&quot;:{}}}}</p>
         */
        @NameInMap("phases")
        public java.util.Map<String, ?> phases;

        public static ListILMPoliciesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListILMPoliciesResponseBodyResult self = new ListILMPoliciesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListILMPoliciesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListILMPoliciesResponseBodyResult setPhases(java.util.Map<String, ?> phases) {
            this.phases = phases;
            return this;
        }
        public java.util.Map<String, ?> getPhases() {
            return this.phases;
        }

    }

}
