// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class CreateEgressProxyRuleGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the egress proxy rule group.</p>
     * 
     * <strong>example:</strong>
     * <p>eprg-uf60966a9633667c51d7</p>
     */
    @NameInMap("EgressProxyRuleGroupId")
    public String egressProxyRuleGroupId;

    /**
     * <p>The list of egress rules grouped by phase (PreDns, PreRequest, and PostResponse).</p>
     */
    @NameInMap("EgressProxyRules")
    public CreateEgressProxyRuleGroupResponseBodyEgressProxyRules egressProxyRules;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019F3A67-2D1B-537B-B08D-B2DEB69E8E8B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEgressProxyRuleGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEgressProxyRuleGroupResponseBody self = new CreateEgressProxyRuleGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEgressProxyRuleGroupResponseBody setEgressProxyRuleGroupId(String egressProxyRuleGroupId) {
        this.egressProxyRuleGroupId = egressProxyRuleGroupId;
        return this;
    }
    public String getEgressProxyRuleGroupId() {
        return this.egressProxyRuleGroupId;
    }

    public CreateEgressProxyRuleGroupResponseBody setEgressProxyRules(CreateEgressProxyRuleGroupResponseBodyEgressProxyRules egressProxyRules) {
        this.egressProxyRules = egressProxyRules;
        return this;
    }
    public CreateEgressProxyRuleGroupResponseBodyEgressProxyRules getEgressProxyRules() {
        return this.egressProxyRules;
    }

    public CreateEgressProxyRuleGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPostResponse extends TeaModel {
        /**
         * <p>The ID of the egress proxy rule.</p>
         * 
         * <strong>example:</strong>
         * <p>epr-g2w80bb6a91dbb775****</p>
         */
        @NameInMap("EgressProxyRuleId")
        public String egressProxyRuleId;

        /**
         * <p>The priority of the egress proxy rule in the stage to which it belongs. Valid values: 1 to 1000. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPostResponse build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPostResponse self = new CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPostResponse();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPostResponse setEgressProxyRuleId(String egressProxyRuleId) {
            this.egressProxyRuleId = egressProxyRuleId;
            return this;
        }
        public String getEgressProxyRuleId() {
            return this.egressProxyRuleId;
        }

        public CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPostResponse setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPreDns extends TeaModel {
        /**
         * <p>The ID of the egress proxy rule.</p>
         * 
         * <strong>example:</strong>
         * <p>epr-gw80bb6a91dbb775****</p>
         */
        @NameInMap("EgressProxyRuleId")
        public String egressProxyRuleId;

        /**
         * <p>The priority of the egress proxy rule in the stage to which it belongs. Valid values: 1 to 1000. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPreDns build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPreDns self = new CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPreDns();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPreDns setEgressProxyRuleId(String egressProxyRuleId) {
            this.egressProxyRuleId = egressProxyRuleId;
            return this;
        }
        public String getEgressProxyRuleId() {
            return this.egressProxyRuleId;
        }

        public CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPreDns setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPreRequest extends TeaModel {
        /**
         * <p>The ID of the egress proxy rule.</p>
         * 
         * <strong>example:</strong>
         * <p>epr-g1w80bb6a91dbb775****</p>
         */
        @NameInMap("EgressProxyRuleId")
        public String egressProxyRuleId;

        /**
         * <p>The priority of the egress proxy rule in the stage to which it belongs. Valid values: 1 to 1000. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPreRequest build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPreRequest self = new CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPreRequest();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPreRequest setEgressProxyRuleId(String egressProxyRuleId) {
            this.egressProxyRuleId = egressProxyRuleId;
            return this;
        }
        public String getEgressProxyRuleId() {
            return this.egressProxyRuleId;
        }

        public CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPreRequest setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class CreateEgressProxyRuleGroupResponseBodyEgressProxyRules extends TeaModel {
        /**
         * <p>The list of rules in the PostResponse stage, which is executed after the response is returned.</p>
         */
        @NameInMap("PostResponse")
        public java.util.List<CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPostResponse> postResponse;

        /**
         * <p>The list of rules in the PreDns stage, which is executed before DNS resolution.</p>
         */
        @NameInMap("PreDns")
        public java.util.List<CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPreDns> preDns;

        /**
         * <p>The list of rules in the PreRequest stage, which is executed before the request is forwarded.</p>
         */
        @NameInMap("PreRequest")
        public java.util.List<CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPreRequest> preRequest;

        public static CreateEgressProxyRuleGroupResponseBodyEgressProxyRules build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyRuleGroupResponseBodyEgressProxyRules self = new CreateEgressProxyRuleGroupResponseBodyEgressProxyRules();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyRuleGroupResponseBodyEgressProxyRules setPostResponse(java.util.List<CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPostResponse> postResponse) {
            this.postResponse = postResponse;
            return this;
        }
        public java.util.List<CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPostResponse> getPostResponse() {
            return this.postResponse;
        }

        public CreateEgressProxyRuleGroupResponseBodyEgressProxyRules setPreDns(java.util.List<CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPreDns> preDns) {
            this.preDns = preDns;
            return this;
        }
        public java.util.List<CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPreDns> getPreDns() {
            return this.preDns;
        }

        public CreateEgressProxyRuleGroupResponseBodyEgressProxyRules setPreRequest(java.util.List<CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPreRequest> preRequest) {
            this.preRequest = preRequest;
            return this;
        }
        public java.util.List<CreateEgressProxyRuleGroupResponseBodyEgressProxyRulesPreRequest> getPreRequest() {
            return this.preRequest;
        }

    }

}
