// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetPolicySetResponseBody extends TeaModel {
    /**
     * <p>The details of the policy set.</p>
     */
    @NameInMap("PolicySet")
    public GetPolicySetResponseBodyPolicySet policySet;

    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2A48EB1D-D645-5758-91AF-EDF8E36E257B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPolicySetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPolicySetResponseBody self = new GetPolicySetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPolicySetResponseBody setPolicySet(GetPolicySetResponseBodyPolicySet policySet) {
        this.policySet = policySet;
        return this;
    }
    public GetPolicySetResponseBodyPolicySet getPolicySet() {
        return this.policySet;
    }

    public GetPolicySetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPolicySetResponseBodyPolicySet extends TeaModel {
        /**
         * <p>The creation time in UTC ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-08T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>example description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ARN of the policy set.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:agentidentity:cn-beijing:123456:policyset/default-policy-set</p>
         */
        @NameInMap("PolicySetArn")
        public String policySetArn;

        /**
         * <p>The name of the policy set. The name must be unique within the current Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>default-policy-set</p>
         */
        @NameInMap("PolicySetName")
        public String policySetName;

        /**
         * <p>The source platform.</p>
         * 
         * <strong>example:</strong>
         * <p>Manuel</p>
         */
        @NameInMap("SourcePlatform")
        public String sourcePlatform;

        /**
         * <p>The update time in UTC ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-08T06:19:17Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetPolicySetResponseBodyPolicySet build(java.util.Map<String, ?> map) throws Exception {
            GetPolicySetResponseBodyPolicySet self = new GetPolicySetResponseBodyPolicySet();
            return TeaModel.build(map, self);
        }

        public GetPolicySetResponseBodyPolicySet setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetPolicySetResponseBodyPolicySet setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPolicySetResponseBodyPolicySet setPolicySetArn(String policySetArn) {
            this.policySetArn = policySetArn;
            return this;
        }
        public String getPolicySetArn() {
            return this.policySetArn;
        }

        public GetPolicySetResponseBodyPolicySet setPolicySetName(String policySetName) {
            this.policySetName = policySetName;
            return this;
        }
        public String getPolicySetName() {
            return this.policySetName;
        }

        public GetPolicySetResponseBodyPolicySet setSourcePlatform(String sourcePlatform) {
            this.sourcePlatform = sourcePlatform;
            return this;
        }
        public String getSourcePlatform() {
            return this.sourcePlatform;
        }

        public GetPolicySetResponseBodyPolicySet setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
