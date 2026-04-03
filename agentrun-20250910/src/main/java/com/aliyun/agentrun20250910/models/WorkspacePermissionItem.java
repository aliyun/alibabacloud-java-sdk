// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class WorkspacePermissionItem extends TeaModel {
    /**
     * <p>RAM 明确拒绝且可构造 detail 时返回；通过或非 RAM 拒绝场景省略</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("accessDeniedDetail")
    public AccessDeniedDetail accessDeniedDetail;

    /**
     * <p>归一化后的 RAM action，始终含 agentrun: 前缀，如 agentrun:ListTemplates</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>RAM 判定通过为 true；workspace 不存在、非法/不支持 action、RAM SDK 报错等均为 false</p>
     */
    @NameInMap("allowed")
    public Boolean allowed;

    /**
     * <p>人类可读原因；通过时通常为空字符串</p>
     */
    @NameInMap("message")
    public String message;

    public static WorkspacePermissionItem build(java.util.Map<String, ?> map) throws Exception {
        WorkspacePermissionItem self = new WorkspacePermissionItem();
        return TeaModel.build(map, self);
    }

    public WorkspacePermissionItem setAccessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public AccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public WorkspacePermissionItem setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public WorkspacePermissionItem setAllowed(Boolean allowed) {
        this.allowed = allowed;
        return this;
    }
    public Boolean getAllowed() {
        return this.allowed;
    }

    public WorkspacePermissionItem setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
