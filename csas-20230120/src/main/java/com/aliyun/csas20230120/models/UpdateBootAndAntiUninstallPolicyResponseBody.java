// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateBootAndAntiUninstallPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CB67D866-1E54-5106-89DF-6D70C73E5989</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Strategy")
    public UpdateBootAndAntiUninstallPolicyResponseBodyStrategy strategy;

    public static UpdateBootAndAntiUninstallPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBootAndAntiUninstallPolicyResponseBody self = new UpdateBootAndAntiUninstallPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBootAndAntiUninstallPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateBootAndAntiUninstallPolicyResponseBody setStrategy(UpdateBootAndAntiUninstallPolicyResponseBodyStrategy strategy) {
        this.strategy = strategy;
        return this;
    }
    public UpdateBootAndAntiUninstallPolicyResponseBodyStrategy getStrategy() {
        return this.strategy;
    }

    public static class UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextEn extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>After uninstalling, the device can no longer be used for company work, and it will lose access to the company\&quot;s intranet!</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>Report</p>
         */
        @NameInMap("MainButtonText")
        public String mainButtonText;

        /**
         * <strong>example:</strong>
         * <p>Ignore</p>
         */
        @NameInMap("MinorButtonText")
        public String minorButtonText;

        /**
         * <strong>example:</strong>
         * <p>Anti-Uninstall Warning</p>
         */
        @NameInMap("Title")
        public String title;

        public static UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextEn build(java.util.Map<String, ?> map) throws Exception {
            UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextEn self = new UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextEn();
            return TeaModel.build(map, self);
        }

        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextEn setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextEn setMainButtonText(String mainButtonText) {
            this.mainButtonText = mainButtonText;
            return this;
        }
        public String getMainButtonText() {
            return this.mainButtonText;
        }

        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextEn setMinorButtonText(String minorButtonText) {
            this.minorButtonText = minorButtonText;
            return this;
        }
        public String getMinorButtonText() {
            return this.minorButtonText;
        }

        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextEn setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextZh extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("MainButtonText")
        public String mainButtonText;

        @NameInMap("MinorButtonText")
        public String minorButtonText;

        @NameInMap("Title")
        public String title;

        public static UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextZh build(java.util.Map<String, ?> map) throws Exception {
            UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextZh self = new UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextZh();
            return TeaModel.build(map, self);
        }

        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextZh setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextZh setMainButtonText(String mainButtonText) {
            this.mainButtonText = mainButtonText;
            return this;
        }
        public String getMainButtonText() {
            return this.mainButtonText;
        }

        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextZh setMinorButtonText(String minorButtonText) {
            this.minorButtonText = minorButtonText;
            return this;
        }
        public String getMinorButtonText() {
            return this.minorButtonText;
        }

        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextZh setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContent extends TeaModel {
        @NameInMap("BlockTextEn")
        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextEn blockTextEn;

        @NameInMap("BlockTextZh")
        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextZh blockTextZh;

        public static UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContent self = new UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContent();
            return TeaModel.build(map, self);
        }

        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContent setBlockTextEn(UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextEn blockTextEn) {
            this.blockTextEn = blockTextEn;
            return this;
        }
        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextEn getBlockTextEn() {
            return this.blockTextEn;
        }

        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContent setBlockTextZh(UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextZh blockTextZh) {
            this.blockTextZh = blockTextZh;
            return this;
        }
        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextZh getBlockTextZh() {
            return this.blockTextZh;
        }

    }

    public static class UpdateBootAndAntiUninstallPolicyResponseBodyStrategy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowReport")
        public Boolean allowReport;

        @NameInMap("BlockContent")
        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContent blockContent;

        /**
         * <strong>example:</strong>
         * <p>2023-04-16 10:50:05</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

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

        /**
         * <strong>example:</strong>
         * <p>auto-boot-anti-uninstall-6f6cbf5f6605****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <strong>example:</strong>
         * <p>approval-process-65c255598826****</p>
         */
        @NameInMap("ReportProcessId")
        public String reportProcessId;

        /**
         * <strong>example:</strong>
         * <p>2024-06-14 10:17:14</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UserGroupIds")
        public java.util.List<String> userGroupIds;

        @NameInMap("WhitelistUsers")
        public java.util.List<String> whitelistUsers;

        public static UpdateBootAndAntiUninstallPolicyResponseBodyStrategy build(java.util.Map<String, ?> map) throws Exception {
            UpdateBootAndAntiUninstallPolicyResponseBodyStrategy self = new UpdateBootAndAntiUninstallPolicyResponseBodyStrategy();
            return TeaModel.build(map, self);
        }

        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategy setAllowReport(Boolean allowReport) {
            this.allowReport = allowReport;
            return this;
        }
        public Boolean getAllowReport() {
            return this.allowReport;
        }

        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategy setBlockContent(UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContent blockContent) {
            this.blockContent = blockContent;
            return this;
        }
        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategyBlockContent getBlockContent() {
            return this.blockContent;
        }

        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategy setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategy setIsAntiUninstall(Boolean isAntiUninstall) {
            this.isAntiUninstall = isAntiUninstall;
            return this;
        }
        public Boolean getIsAntiUninstall() {
            return this.isAntiUninstall;
        }

        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategy setIsBoot(Boolean isBoot) {
            this.isBoot = isBoot;
            return this;
        }
        public Boolean getIsBoot() {
            return this.isBoot;
        }

        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategy setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategy setReportProcessId(String reportProcessId) {
            this.reportProcessId = reportProcessId;
            return this;
        }
        public String getReportProcessId() {
            return this.reportProcessId;
        }

        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategy setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategy setUserGroupIds(java.util.List<String> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }
        public java.util.List<String> getUserGroupIds() {
            return this.userGroupIds;
        }

        public UpdateBootAndAntiUninstallPolicyResponseBodyStrategy setWhitelistUsers(java.util.List<String> whitelistUsers) {
            this.whitelistUsers = whitelistUsers;
            return this;
        }
        public java.util.List<String> getWhitelistUsers() {
            return this.whitelistUsers;
        }

    }

}
