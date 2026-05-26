// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetPolicySetResponseBody extends TeaModel {
    @NameInMap("PolicySet")
    public GetPolicySetResponseBodyPolicySet policySet;

    /**
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
         * <strong>example:</strong>
         * <p>2026-05-08T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>example description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>acs:agentidentity:cn-beijing:123456:policyset/default-policy-set</p>
         */
        @NameInMap("PolicySetArn")
        public String policySetArn;

        /**
         * <strong>example:</strong>
         * <p>default-policy-set</p>
         */
        @NameInMap("PolicySetName")
        public String policySetName;

        /**
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

        public GetPolicySetResponseBodyPolicySet setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
