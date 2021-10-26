// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetGroupConfigSynchronizePolicyRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("ConflictSyncPolicy")
    public String conflictSyncPolicy;

    @NameInMap("NewSyncPolicy")
    public String newSyncPolicy;

    @NameInMap("BackendSyncPolicy")
    public String backendSyncPolicy;

    @NameInMap("ConflictInclude")
    public java.util.List<String> conflictInclude;

    @NameInMap("ConflictExclude")
    public java.util.List<String> conflictExclude;

    @NameInMap("NewInclude")
    public java.util.List<String> newInclude;

    @NameInMap("NewExclude")
    public java.util.List<String> newExclude;

    @NameInMap("BackendInclude")
    public java.util.List<String> backendInclude;

    @NameInMap("BackendExclude")
    public java.util.List<String> backendExclude;

    public static SetGroupConfigSynchronizePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGroupConfigSynchronizePolicyRequest self = new SetGroupConfigSynchronizePolicyRequest();
        return TeaModel.build(map, self);
    }

    public SetGroupConfigSynchronizePolicyRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SetGroupConfigSynchronizePolicyRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public SetGroupConfigSynchronizePolicyRequest setConflictSyncPolicy(String conflictSyncPolicy) {
        this.conflictSyncPolicy = conflictSyncPolicy;
        return this;
    }
    public String getConflictSyncPolicy() {
        return this.conflictSyncPolicy;
    }

    public SetGroupConfigSynchronizePolicyRequest setNewSyncPolicy(String newSyncPolicy) {
        this.newSyncPolicy = newSyncPolicy;
        return this;
    }
    public String getNewSyncPolicy() {
        return this.newSyncPolicy;
    }

    public SetGroupConfigSynchronizePolicyRequest setBackendSyncPolicy(String backendSyncPolicy) {
        this.backendSyncPolicy = backendSyncPolicy;
        return this;
    }
    public String getBackendSyncPolicy() {
        return this.backendSyncPolicy;
    }

    public SetGroupConfigSynchronizePolicyRequest setConflictInclude(java.util.List<String> conflictInclude) {
        this.conflictInclude = conflictInclude;
        return this;
    }
    public java.util.List<String> getConflictInclude() {
        return this.conflictInclude;
    }

    public SetGroupConfigSynchronizePolicyRequest setConflictExclude(java.util.List<String> conflictExclude) {
        this.conflictExclude = conflictExclude;
        return this;
    }
    public java.util.List<String> getConflictExclude() {
        return this.conflictExclude;
    }

    public SetGroupConfigSynchronizePolicyRequest setNewInclude(java.util.List<String> newInclude) {
        this.newInclude = newInclude;
        return this;
    }
    public java.util.List<String> getNewInclude() {
        return this.newInclude;
    }

    public SetGroupConfigSynchronizePolicyRequest setNewExclude(java.util.List<String> newExclude) {
        this.newExclude = newExclude;
        return this;
    }
    public java.util.List<String> getNewExclude() {
        return this.newExclude;
    }

    public SetGroupConfigSynchronizePolicyRequest setBackendInclude(java.util.List<String> backendInclude) {
        this.backendInclude = backendInclude;
        return this;
    }
    public java.util.List<String> getBackendInclude() {
        return this.backendInclude;
    }

    public SetGroupConfigSynchronizePolicyRequest setBackendExclude(java.util.List<String> backendExclude) {
        this.backendExclude = backendExclude;
        return this;
    }
    public java.util.List<String> getBackendExclude() {
        return this.backendExclude;
    }

}
