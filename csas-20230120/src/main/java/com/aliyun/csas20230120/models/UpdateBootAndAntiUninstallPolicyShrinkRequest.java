// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateBootAndAntiUninstallPolicyShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowReport")
    public Boolean allowReport;

    @NameInMap("BlockContent")
    public String blockContentShrink;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAntiUninstall")
    public Boolean isAntiUninstall;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsBoot")
    public Boolean isBoot;

    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    @NameInMap("WhitelistUsers")
    public java.util.List<String> whitelistUsers;

    public static UpdateBootAndAntiUninstallPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBootAndAntiUninstallPolicyShrinkRequest self = new UpdateBootAndAntiUninstallPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBootAndAntiUninstallPolicyShrinkRequest setAllowReport(Boolean allowReport) {
        this.allowReport = allowReport;
        return this;
    }
    public Boolean getAllowReport() {
        return this.allowReport;
    }

    public UpdateBootAndAntiUninstallPolicyShrinkRequest setBlockContentShrink(String blockContentShrink) {
        this.blockContentShrink = blockContentShrink;
        return this;
    }
    public String getBlockContentShrink() {
        return this.blockContentShrink;
    }

    public UpdateBootAndAntiUninstallPolicyShrinkRequest setIsAntiUninstall(Boolean isAntiUninstall) {
        this.isAntiUninstall = isAntiUninstall;
        return this;
    }
    public Boolean getIsAntiUninstall() {
        return this.isAntiUninstall;
    }

    public UpdateBootAndAntiUninstallPolicyShrinkRequest setIsBoot(Boolean isBoot) {
        this.isBoot = isBoot;
        return this;
    }
    public Boolean getIsBoot() {
        return this.isBoot;
    }

    public UpdateBootAndAntiUninstallPolicyShrinkRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public UpdateBootAndAntiUninstallPolicyShrinkRequest setWhitelistUsers(java.util.List<String> whitelistUsers) {
        this.whitelistUsers = whitelistUsers;
        return this;
    }
    public java.util.List<String> getWhitelistUsers() {
        return this.whitelistUsers;
    }

}
