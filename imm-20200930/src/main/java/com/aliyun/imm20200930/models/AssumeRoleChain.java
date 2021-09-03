// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AssumeRoleChain extends TeaModel {
    // 当前用户 policy
    @NameInMap("Policy")
    public String policy;

    // 链式授权节点
    @NameInMap("Chain")
    public java.util.List<AssumeRoleChainNode> chain;

    public static AssumeRoleChain build(java.util.Map<String, ?> map) throws Exception {
        AssumeRoleChain self = new AssumeRoleChain();
        return TeaModel.build(map, self);
    }

    public AssumeRoleChain setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public AssumeRoleChain setChain(java.util.List<AssumeRoleChainNode> chain) {
        this.chain = chain;
        return this;
    }
    public java.util.List<AssumeRoleChainNode> getChain() {
        return this.chain;
    }

}
