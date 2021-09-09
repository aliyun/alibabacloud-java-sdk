// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListILMPoliciesResponseBody extends TeaModel {
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
        @NameInMap("name")
        public String name;

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
