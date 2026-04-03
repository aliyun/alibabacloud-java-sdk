// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class AccessDeniedDetail extends TeaModel {
    /**
     * <p>被拒绝的 RAM action，如 agentrun:ListTemplates</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("authAction")
    public String authAction;

    /**
     * <p>鉴权主体展示名</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("authPrincipalDisplayName")
    public String authPrincipalDisplayName;

    /**
     * <p>鉴权主体所属账号 ID</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("authPrincipalOwnerId")
    public String authPrincipalOwnerId;

    /**
     * <p>鉴权主体类型，如 SubUser、AssumedRoleUser</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("authPrincipalType")
    public String authPrincipalType;

    /**
     * <p>Base64 编码的诊断信息，可用于 RAM 控制台自诊断</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("encodedDiagnosticInfo")
    public String encodedDiagnosticInfo;

    /**
     * <p>无权限类型：ImplicitDeny 或 ExplicitDeny</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("noPermissionType")
    public String noPermissionType;

    /**
     * <p>策略类型，如 ResourceBasedPolicy、IdentityBasedPolicy</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("policyType")
    public String policyType;

    public static AccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
        AccessDeniedDetail self = new AccessDeniedDetail();
        return TeaModel.build(map, self);
    }

    public AccessDeniedDetail setAuthAction(String authAction) {
        this.authAction = authAction;
        return this;
    }
    public String getAuthAction() {
        return this.authAction;
    }

    public AccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
        this.authPrincipalDisplayName = authPrincipalDisplayName;
        return this;
    }
    public String getAuthPrincipalDisplayName() {
        return this.authPrincipalDisplayName;
    }

    public AccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
        this.authPrincipalOwnerId = authPrincipalOwnerId;
        return this;
    }
    public String getAuthPrincipalOwnerId() {
        return this.authPrincipalOwnerId;
    }

    public AccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
        this.authPrincipalType = authPrincipalType;
        return this;
    }
    public String getAuthPrincipalType() {
        return this.authPrincipalType;
    }

    public AccessDeniedDetail setEncodedDiagnosticInfo(String encodedDiagnosticInfo) {
        this.encodedDiagnosticInfo = encodedDiagnosticInfo;
        return this;
    }
    public String getEncodedDiagnosticInfo() {
        return this.encodedDiagnosticInfo;
    }

    public AccessDeniedDetail setNoPermissionType(String noPermissionType) {
        this.noPermissionType = noPermissionType;
        return this;
    }
    public String getNoPermissionType() {
        return this.noPermissionType;
    }

    public AccessDeniedDetail setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

}
