// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetPolicySetResponseBody extends TeaModel {
    @NameInMap("PolicySet")
    public GetPolicySetResponseBodyPolicySet policySet;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("PolicySetArn")
        public String policySetArn;

        @NameInMap("PolicySetName")
        public String policySetName;

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
