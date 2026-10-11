// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class CreateEgressProxyRulesResponseBody extends TeaModel {
    /**
     * <p>The list of egress rules grouped by effective phase (PreDns, PreRequest, or PostResponse).</p>
     */
    @NameInMap("EgressProxyRules")
    public CreateEgressProxyRulesResponseBodyEgressProxyRules egressProxyRules;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01A05AB5-5BED-56ED-8EE9-304FBC2F8537</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEgressProxyRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEgressProxyRulesResponseBody self = new CreateEgressProxyRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEgressProxyRulesResponseBody setEgressProxyRules(CreateEgressProxyRulesResponseBodyEgressProxyRules egressProxyRules) {
        this.egressProxyRules = egressProxyRules;
        return this;
    }
    public CreateEgressProxyRulesResponseBodyEgressProxyRules getEgressProxyRules() {
        return this.egressProxyRules;
    }

    public CreateEgressProxyRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateEgressProxyRulesResponseBodyEgressProxyRulesPostResponse extends TeaModel {
        /**
         * <p>The ID of the egress rule.</p>
         * 
         * <strong>example:</strong>
         * <p>epr-gw80bb6a91dbb775****</p>
         */
        @NameInMap("EgressProxyRuleId")
        public String egressProxyRuleId;

        /**
         * <p>The priority of the egress rule within its stage. Valid values: 1 to 1000. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static CreateEgressProxyRulesResponseBodyEgressProxyRulesPostResponse build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyRulesResponseBodyEgressProxyRulesPostResponse self = new CreateEgressProxyRulesResponseBodyEgressProxyRulesPostResponse();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyRulesResponseBodyEgressProxyRulesPostResponse setEgressProxyRuleId(String egressProxyRuleId) {
            this.egressProxyRuleId = egressProxyRuleId;
            return this;
        }
        public String getEgressProxyRuleId() {
            return this.egressProxyRuleId;
        }

        public CreateEgressProxyRulesResponseBodyEgressProxyRulesPostResponse setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class CreateEgressProxyRulesResponseBodyEgressProxyRulesPreDns extends TeaModel {
        /**
         * <p>The ID of the egress rule.</p>
         * 
         * <strong>example:</strong>
         * <p>epr-gw80bb6a91dbb775****</p>
         */
        @NameInMap("EgressProxyRuleId")
        public String egressProxyRuleId;

        /**
         * <p>The priority of the egress rule within its stage. Valid values: 1 to 1000. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static CreateEgressProxyRulesResponseBodyEgressProxyRulesPreDns build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyRulesResponseBodyEgressProxyRulesPreDns self = new CreateEgressProxyRulesResponseBodyEgressProxyRulesPreDns();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyRulesResponseBodyEgressProxyRulesPreDns setEgressProxyRuleId(String egressProxyRuleId) {
            this.egressProxyRuleId = egressProxyRuleId;
            return this;
        }
        public String getEgressProxyRuleId() {
            return this.egressProxyRuleId;
        }

        public CreateEgressProxyRulesResponseBodyEgressProxyRulesPreDns setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class CreateEgressProxyRulesResponseBodyEgressProxyRulesPreRequest extends TeaModel {
        /**
         * <p>The ID of the egress rule.</p>
         * 
         * <strong>example:</strong>
         * <p>epr-gw80bb6a91dbb775****</p>
         */
        @NameInMap("EgressProxyRuleId")
        public String egressProxyRuleId;

        /**
         * <p>The priority of the egress rule within its stage. Valid values: 1 to 1000. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static CreateEgressProxyRulesResponseBodyEgressProxyRulesPreRequest build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyRulesResponseBodyEgressProxyRulesPreRequest self = new CreateEgressProxyRulesResponseBodyEgressProxyRulesPreRequest();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyRulesResponseBodyEgressProxyRulesPreRequest setEgressProxyRuleId(String egressProxyRuleId) {
            this.egressProxyRuleId = egressProxyRuleId;
            return this;
        }
        public String getEgressProxyRuleId() {
            return this.egressProxyRuleId;
        }

        public CreateEgressProxyRulesResponseBodyEgressProxyRulesPreRequest setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class CreateEgressProxyRulesResponseBodyEgressProxyRules extends TeaModel {
        /**
         * <p>The list of rules in the PostResponse phase (after the response is returned).</p>
         */
        @NameInMap("PostResponse")
        public java.util.List<CreateEgressProxyRulesResponseBodyEgressProxyRulesPostResponse> postResponse;

        /**
         * <p>The list of rules for the pre-DNS stage (before DNS resolution).</p>
         */
        @NameInMap("PreDns")
        public java.util.List<CreateEgressProxyRulesResponseBodyEgressProxyRulesPreDns> preDns;

        /**
         * <p>The list of rules in the PreRequest stage (before request forwarding).</p>
         */
        @NameInMap("PreRequest")
        public java.util.List<CreateEgressProxyRulesResponseBodyEgressProxyRulesPreRequest> preRequest;

        public static CreateEgressProxyRulesResponseBodyEgressProxyRules build(java.util.Map<String, ?> map) throws Exception {
            CreateEgressProxyRulesResponseBodyEgressProxyRules self = new CreateEgressProxyRulesResponseBodyEgressProxyRules();
            return TeaModel.build(map, self);
        }

        public CreateEgressProxyRulesResponseBodyEgressProxyRules setPostResponse(java.util.List<CreateEgressProxyRulesResponseBodyEgressProxyRulesPostResponse> postResponse) {
            this.postResponse = postResponse;
            return this;
        }
        public java.util.List<CreateEgressProxyRulesResponseBodyEgressProxyRulesPostResponse> getPostResponse() {
            return this.postResponse;
        }

        public CreateEgressProxyRulesResponseBodyEgressProxyRules setPreDns(java.util.List<CreateEgressProxyRulesResponseBodyEgressProxyRulesPreDns> preDns) {
            this.preDns = preDns;
            return this;
        }
        public java.util.List<CreateEgressProxyRulesResponseBodyEgressProxyRulesPreDns> getPreDns() {
            return this.preDns;
        }

        public CreateEgressProxyRulesResponseBodyEgressProxyRules setPreRequest(java.util.List<CreateEgressProxyRulesResponseBodyEgressProxyRulesPreRequest> preRequest) {
            this.preRequest = preRequest;
            return this;
        }
        public java.util.List<CreateEgressProxyRulesResponseBodyEgressProxyRulesPreRequest> getPreRequest() {
            return this.preRequest;
        }

    }

}
