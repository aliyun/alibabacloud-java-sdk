// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetPermissionShrinkRequest extends TeaModel {
    /**
     * <p>The accessibility. Valid values:</p>
     * <ul>
     * <li>PUBLIC: All members in the workspace can access the workspace.</li>
     * <li>PRIVATE: Only the creator can access the workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("CallerType")
    public String callerType;

    @NameInMap("CallerUid")
    public String callerUid;

    /**
     * <p>The UID of the Alibaba Cloud account that is used to create the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>17915******4216</p>
     */
    @NameInMap("Creator")
    public String creator;

    @NameInMap("Labels")
    public String labelsShrink;

    /**
     * <p>The configuration. Separate multiple configurations with commas (,). Valid values:</p>
     * <ul>
     * <li>ResourceEmpty: The Resource parameter is not configured.</li>
     * <li>DisableRam: The RAM check is not performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ResourceEmpty,DisableRam</p>
     */
    @NameInMap("Option")
    public String option;

    /**
     * <p>The resource.</p>
     * 
     * <strong>example:</strong>
     * <p>job/dlc-ksd******s12</p>
     */
    @NameInMap("Resource")
    public String resource;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static GetPermissionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPermissionShrinkRequest self = new GetPermissionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetPermissionShrinkRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public GetPermissionShrinkRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public GetPermissionShrinkRequest setCallerUid(String callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public String getCallerUid() {
        return this.callerUid;
    }

    public GetPermissionShrinkRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetPermissionShrinkRequest setLabelsShrink(String labelsShrink) {
        this.labelsShrink = labelsShrink;
        return this;
    }
    public String getLabelsShrink() {
        return this.labelsShrink;
    }

    public GetPermissionShrinkRequest setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

    public GetPermissionShrinkRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public GetPermissionShrinkRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
