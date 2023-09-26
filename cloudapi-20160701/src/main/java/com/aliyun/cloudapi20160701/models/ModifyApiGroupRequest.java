// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class ModifyApiGroupRequest extends TeaModel {
    @NameInMap("CompatibleFlags")
    public String compatibleFlags;

    @NameInMap("CustomTraceConfig")
    public String customTraceConfig;

    @NameInMap("DefaultDomain")
    public String defaultDomain;

    @NameInMap("Description")
    public String description;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("PassthroughHeaders")
    public String passthroughHeaders;

    @NameInMap("RpcPattern")
    public String rpcPattern;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("UserLogConfig")
    public String userLogConfig;

    public static ModifyApiGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiGroupRequest self = new ModifyApiGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApiGroupRequest setCompatibleFlags(String compatibleFlags) {
        this.compatibleFlags = compatibleFlags;
        return this;
    }
    public String getCompatibleFlags() {
        return this.compatibleFlags;
    }

    public ModifyApiGroupRequest setCustomTraceConfig(String customTraceConfig) {
        this.customTraceConfig = customTraceConfig;
        return this;
    }
    public String getCustomTraceConfig() {
        return this.customTraceConfig;
    }

    public ModifyApiGroupRequest setDefaultDomain(String defaultDomain) {
        this.defaultDomain = defaultDomain;
        return this;
    }
    public String getDefaultDomain() {
        return this.defaultDomain;
    }

    public ModifyApiGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyApiGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyApiGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyApiGroupRequest setPassthroughHeaders(String passthroughHeaders) {
        this.passthroughHeaders = passthroughHeaders;
        return this;
    }
    public String getPassthroughHeaders() {
        return this.passthroughHeaders;
    }

    public ModifyApiGroupRequest setRpcPattern(String rpcPattern) {
        this.rpcPattern = rpcPattern;
        return this;
    }
    public String getRpcPattern() {
        return this.rpcPattern;
    }

    public ModifyApiGroupRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyApiGroupRequest setUserLogConfig(String userLogConfig) {
        this.userLogConfig = userLogConfig;
        return this;
    }
    public String getUserLogConfig() {
        return this.userLogConfig;
    }

}
