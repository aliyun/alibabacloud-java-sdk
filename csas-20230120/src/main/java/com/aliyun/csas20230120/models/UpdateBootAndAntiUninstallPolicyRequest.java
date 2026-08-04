// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateBootAndAntiUninstallPolicyRequest extends TeaModel {
    /**
     * <p>Let end users submit approval requests.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowReport")
    public Boolean allowReport;

    /**
     * <p>Content shown in the client-side block dialog.</p>
     */
    @NameInMap("BlockContent")
    public UpdateBootAndAntiUninstallPolicyRequestBlockContent blockContent;

    /**
     * <p>Enable anti-uninstall.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAntiUninstall")
    public Boolean isAntiUninstall;

    /**
     * <p>Enable auto-start.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsBoot")
    public Boolean isBoot;

    /**
     * <p>List of user group IDs to which this policy applies.</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>List of whitelisted users.</p>
     */
    @NameInMap("WhitelistUsers")
    public java.util.List<String> whitelistUsers;

    public static UpdateBootAndAntiUninstallPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBootAndAntiUninstallPolicyRequest self = new UpdateBootAndAntiUninstallPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBootAndAntiUninstallPolicyRequest setAllowReport(Boolean allowReport) {
        this.allowReport = allowReport;
        return this;
    }
    public Boolean getAllowReport() {
        return this.allowReport;
    }

    public UpdateBootAndAntiUninstallPolicyRequest setBlockContent(UpdateBootAndAntiUninstallPolicyRequestBlockContent blockContent) {
        this.blockContent = blockContent;
        return this;
    }
    public UpdateBootAndAntiUninstallPolicyRequestBlockContent getBlockContent() {
        return this.blockContent;
    }

    public UpdateBootAndAntiUninstallPolicyRequest setIsAntiUninstall(Boolean isAntiUninstall) {
        this.isAntiUninstall = isAntiUninstall;
        return this;
    }
    public Boolean getIsAntiUninstall() {
        return this.isAntiUninstall;
    }

    public UpdateBootAndAntiUninstallPolicyRequest setIsBoot(Boolean isBoot) {
        this.isBoot = isBoot;
        return this;
    }
    public Boolean getIsBoot() {
        return this.isBoot;
    }

    public UpdateBootAndAntiUninstallPolicyRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public UpdateBootAndAntiUninstallPolicyRequest setWhitelistUsers(java.util.List<String> whitelistUsers) {
        this.whitelistUsers = whitelistUsers;
        return this;
    }
    public java.util.List<String> getWhitelistUsers() {
        return this.whitelistUsers;
    }

    public static class UpdateBootAndAntiUninstallPolicyRequestBlockContentBlockTextEn extends TeaModel {
        /**
         * <p>Dialog content.</p>
         * 
         * <strong>example:</strong>
         * <p>After uninstalling, the device can no longer be used for company work, and it will lose access to the company\&quot;s intranet!</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Main button text.</p>
         * 
         * <strong>example:</strong>
         * <p>Report</p>
         */
        @NameInMap("MainButtonText")
        public String mainButtonText;

        /**
         * <p>Secondary button text.</p>
         * 
         * <strong>example:</strong>
         * <p>Ignore</p>
         */
        @NameInMap("MinorButtonText")
        public String minorButtonText;

        /**
         * <p>Dialog title.</p>
         * 
         * <strong>example:</strong>
         * <p>Anti-Uninstall Warning</p>
         */
        @NameInMap("Title")
        public String title;

        public static UpdateBootAndAntiUninstallPolicyRequestBlockContentBlockTextEn build(java.util.Map<String, ?> map) throws Exception {
            UpdateBootAndAntiUninstallPolicyRequestBlockContentBlockTextEn self = new UpdateBootAndAntiUninstallPolicyRequestBlockContentBlockTextEn();
            return TeaModel.build(map, self);
        }

        public UpdateBootAndAntiUninstallPolicyRequestBlockContentBlockTextEn setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateBootAndAntiUninstallPolicyRequestBlockContentBlockTextEn setMainButtonText(String mainButtonText) {
            this.mainButtonText = mainButtonText;
            return this;
        }
        public String getMainButtonText() {
            return this.mainButtonText;
        }

        public UpdateBootAndAntiUninstallPolicyRequestBlockContentBlockTextEn setMinorButtonText(String minorButtonText) {
            this.minorButtonText = minorButtonText;
            return this;
        }
        public String getMinorButtonText() {
            return this.minorButtonText;
        }

        public UpdateBootAndAntiUninstallPolicyRequestBlockContentBlockTextEn setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class UpdateBootAndAntiUninstallPolicyRequestBlockContentBlockTextZh extends TeaModel {
        /**
         * <p>Dialog content.</p>
         * 
         * <strong>example:</strong>
         * <p>卸载后该设备无法再用于公司办公，同时该设备将失去进入公司内网权限！</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Main button text.</p>
         * 
         * <strong>example:</strong>
         * <p>去报备</p>
         */
        @NameInMap("MainButtonText")
        public String mainButtonText;

        /**
         * <p>Secondary button text.</p>
         * 
         * <strong>example:</strong>
         * <p>我知道了</p>
         */
        @NameInMap("MinorButtonText")
        public String minorButtonText;

        /**
         * <p>Dialog title.</p>
         * 
         * <strong>example:</strong>
         * <p>防卸载警告</p>
         */
        @NameInMap("Title")
        public String title;

        public static UpdateBootAndAntiUninstallPolicyRequestBlockContentBlockTextZh build(java.util.Map<String, ?> map) throws Exception {
            UpdateBootAndAntiUninstallPolicyRequestBlockContentBlockTextZh self = new UpdateBootAndAntiUninstallPolicyRequestBlockContentBlockTextZh();
            return TeaModel.build(map, self);
        }

        public UpdateBootAndAntiUninstallPolicyRequestBlockContentBlockTextZh setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateBootAndAntiUninstallPolicyRequestBlockContentBlockTextZh setMainButtonText(String mainButtonText) {
            this.mainButtonText = mainButtonText;
            return this;
        }
        public String getMainButtonText() {
            return this.mainButtonText;
        }

        public UpdateBootAndAntiUninstallPolicyRequestBlockContentBlockTextZh setMinorButtonText(String minorButtonText) {
            this.minorButtonText = minorButtonText;
            return this;
        }
        public String getMinorButtonText() {
            return this.minorButtonText;
        }

        public UpdateBootAndAntiUninstallPolicyRequestBlockContentBlockTextZh setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class UpdateBootAndAntiUninstallPolicyRequestBlockContent extends TeaModel {
        /**
         * <p>English text.</p>
         */
        @NameInMap("BlockTextEn")
        public UpdateBootAndAntiUninstallPolicyRequestBlockContentBlockTextEn blockTextEn;

        /**
         * <p>Chinese text.</p>
         */
        @NameInMap("BlockTextZh")
        public UpdateBootAndAntiUninstallPolicyRequestBlockContentBlockTextZh blockTextZh;

        public static UpdateBootAndAntiUninstallPolicyRequestBlockContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateBootAndAntiUninstallPolicyRequestBlockContent self = new UpdateBootAndAntiUninstallPolicyRequestBlockContent();
            return TeaModel.build(map, self);
        }

        public UpdateBootAndAntiUninstallPolicyRequestBlockContent setBlockTextEn(UpdateBootAndAntiUninstallPolicyRequestBlockContentBlockTextEn blockTextEn) {
            this.blockTextEn = blockTextEn;
            return this;
        }
        public UpdateBootAndAntiUninstallPolicyRequestBlockContentBlockTextEn getBlockTextEn() {
            return this.blockTextEn;
        }

        public UpdateBootAndAntiUninstallPolicyRequestBlockContent setBlockTextZh(UpdateBootAndAntiUninstallPolicyRequestBlockContentBlockTextZh blockTextZh) {
            this.blockTextZh = blockTextZh;
            return this;
        }
        public UpdateBootAndAntiUninstallPolicyRequestBlockContentBlockTextZh getBlockTextZh() {
            return this.blockTextZh;
        }

    }

}
