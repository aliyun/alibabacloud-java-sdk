// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreatePolicySetResponseBody extends TeaModel {
    @NameInMap("PolicySet")
    public CreatePolicySetResponseBodyPolicySet policySet;

    @NameInMap("RequestId")
    public String requestId;

    public static CreatePolicySetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicySetResponseBody self = new CreatePolicySetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePolicySetResponseBody setPolicySet(CreatePolicySetResponseBodyPolicySet policySet) {
        this.policySet = policySet;
        return this;
    }
    public CreatePolicySetResponseBodyPolicySet getPolicySet() {
        return this.policySet;
    }

    public CreatePolicySetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePolicySetResponseBodyPolicySet extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("PolicySetArn")
        public String policySetArn;

        @NameInMap("PolicySetName")
        public String policySetName;

        public static CreatePolicySetResponseBodyPolicySet build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicySetResponseBodyPolicySet self = new CreatePolicySetResponseBodyPolicySet();
            return TeaModel.build(map, self);
        }

        public CreatePolicySetResponseBodyPolicySet setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreatePolicySetResponseBodyPolicySet setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreatePolicySetResponseBodyPolicySet setPolicySetArn(String policySetArn) {
            this.policySetArn = policySetArn;
            return this;
        }
        public String getPolicySetArn() {
            return this.policySetArn;
        }

        public CreatePolicySetResponseBodyPolicySet setPolicySetName(String policySetName) {
            this.policySetName = policySetName;
            return this;
        }
        public String getPolicySetName() {
            return this.policySetName;
        }

    }

}
