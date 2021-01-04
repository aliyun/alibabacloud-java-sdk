// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeFlexSechedPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("FlexSechedPolicy")
    public DescribeFlexSechedPolicyResponseBodyFlexSechedPolicy flexSechedPolicy;

    public static DescribeFlexSechedPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlexSechedPolicyResponseBody self = new DescribeFlexSechedPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlexSechedPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlexSechedPolicyResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public DescribeFlexSechedPolicyResponseBody setFlexSechedPolicy(DescribeFlexSechedPolicyResponseBodyFlexSechedPolicy flexSechedPolicy) {
        this.flexSechedPolicy = flexSechedPolicy;
        return this;
    }
    public DescribeFlexSechedPolicyResponseBodyFlexSechedPolicy getFlexSechedPolicy() {
        return this.flexSechedPolicy;
    }

    public static class DescribeFlexSechedPolicyResponseBodyFlexSechedPolicy extends TeaModel {
        @NameInMap("GreyGroupPolicy")
        public Integer greyGroupPolicy;

        @NameInMap("GroupInnerPolicy")
        public Integer groupInnerPolicy;

        @NameInMap("BackupGroupPolicy")
        public Integer backupGroupPolicy;

        public static DescribeFlexSechedPolicyResponseBodyFlexSechedPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlexSechedPolicyResponseBodyFlexSechedPolicy self = new DescribeFlexSechedPolicyResponseBodyFlexSechedPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeFlexSechedPolicyResponseBodyFlexSechedPolicy setGreyGroupPolicy(Integer greyGroupPolicy) {
            this.greyGroupPolicy = greyGroupPolicy;
            return this;
        }
        public Integer getGreyGroupPolicy() {
            return this.greyGroupPolicy;
        }

        public DescribeFlexSechedPolicyResponseBodyFlexSechedPolicy setGroupInnerPolicy(Integer groupInnerPolicy) {
            this.groupInnerPolicy = groupInnerPolicy;
            return this;
        }
        public Integer getGroupInnerPolicy() {
            return this.groupInnerPolicy;
        }

        public DescribeFlexSechedPolicyResponseBodyFlexSechedPolicy setBackupGroupPolicy(Integer backupGroupPolicy) {
            this.backupGroupPolicy = backupGroupPolicy;
            return this;
        }
        public Integer getBackupGroupPolicy() {
            return this.backupGroupPolicy;
        }

    }

}
