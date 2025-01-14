// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetBootAndAntiUninstallPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CB67D866-1E54-5106-89DF-6D70C73E5989</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Strategy")
    public GetBootAndAntiUninstallPolicyResponseBodyStrategy strategy;

    public static GetBootAndAntiUninstallPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBootAndAntiUninstallPolicyResponseBody self = new GetBootAndAntiUninstallPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBootAndAntiUninstallPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBootAndAntiUninstallPolicyResponseBody setStrategy(GetBootAndAntiUninstallPolicyResponseBodyStrategy strategy) {
        this.strategy = strategy;
        return this;
    }
    public GetBootAndAntiUninstallPolicyResponseBodyStrategy getStrategy() {
        return this.strategy;
    }

    public static class GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextEn extends TeaModel {
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

        public static GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextEn build(java.util.Map<String, ?> map) throws Exception {
            GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextEn self = new GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextEn();
            return TeaModel.build(map, self);
        }

        public GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextEn setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextEn setMainButtonText(String mainButtonText) {
            this.mainButtonText = mainButtonText;
            return this;
        }
        public String getMainButtonText() {
            return this.mainButtonText;
        }

        public GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextEn setMinorButtonText(String minorButtonText) {
            this.minorButtonText = minorButtonText;
            return this;
        }
        public String getMinorButtonText() {
            return this.minorButtonText;
        }

        public GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextEn setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextZh extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("MainButtonText")
        public String mainButtonText;

        @NameInMap("MinorButtonText")
        public String minorButtonText;

        @NameInMap("Title")
        public String title;

        public static GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextZh build(java.util.Map<String, ?> map) throws Exception {
            GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextZh self = new GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextZh();
            return TeaModel.build(map, self);
        }

        public GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextZh setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextZh setMainButtonText(String mainButtonText) {
            this.mainButtonText = mainButtonText;
            return this;
        }
        public String getMainButtonText() {
            return this.mainButtonText;
        }

        public GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextZh setMinorButtonText(String minorButtonText) {
            this.minorButtonText = minorButtonText;
            return this;
        }
        public String getMinorButtonText() {
            return this.minorButtonText;
        }

        public GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextZh setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContent extends TeaModel {
        @NameInMap("BlockTextEn")
        public GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextEn blockTextEn;

        @NameInMap("BlockTextZh")
        public GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextZh blockTextZh;

        public static GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContent build(java.util.Map<String, ?> map) throws Exception {
            GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContent self = new GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContent();
            return TeaModel.build(map, self);
        }

        public GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContent setBlockTextEn(GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextEn blockTextEn) {
            this.blockTextEn = blockTextEn;
            return this;
        }
        public GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextEn getBlockTextEn() {
            return this.blockTextEn;
        }

        public GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContent setBlockTextZh(GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextZh blockTextZh) {
            this.blockTextZh = blockTextZh;
            return this;
        }
        public GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContentBlockTextZh getBlockTextZh() {
            return this.blockTextZh;
        }

    }

    public static class GetBootAndAntiUninstallPolicyResponseBodyStrategy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowReport")
        public Boolean allowReport;

        @NameInMap("BlockContent")
        public GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContent blockContent;

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
         * <p>approval-process-300abfb970cc****</p>
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

        public static GetBootAndAntiUninstallPolicyResponseBodyStrategy build(java.util.Map<String, ?> map) throws Exception {
            GetBootAndAntiUninstallPolicyResponseBodyStrategy self = new GetBootAndAntiUninstallPolicyResponseBodyStrategy();
            return TeaModel.build(map, self);
        }

        public GetBootAndAntiUninstallPolicyResponseBodyStrategy setAllowReport(Boolean allowReport) {
            this.allowReport = allowReport;
            return this;
        }
        public Boolean getAllowReport() {
            return this.allowReport;
        }

        public GetBootAndAntiUninstallPolicyResponseBodyStrategy setBlockContent(GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContent blockContent) {
            this.blockContent = blockContent;
            return this;
        }
        public GetBootAndAntiUninstallPolicyResponseBodyStrategyBlockContent getBlockContent() {
            return this.blockContent;
        }

        public GetBootAndAntiUninstallPolicyResponseBodyStrategy setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetBootAndAntiUninstallPolicyResponseBodyStrategy setIsAntiUninstall(Boolean isAntiUninstall) {
            this.isAntiUninstall = isAntiUninstall;
            return this;
        }
        public Boolean getIsAntiUninstall() {
            return this.isAntiUninstall;
        }

        public GetBootAndAntiUninstallPolicyResponseBodyStrategy setIsBoot(Boolean isBoot) {
            this.isBoot = isBoot;
            return this;
        }
        public Boolean getIsBoot() {
            return this.isBoot;
        }

        public GetBootAndAntiUninstallPolicyResponseBodyStrategy setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public GetBootAndAntiUninstallPolicyResponseBodyStrategy setReportProcessId(String reportProcessId) {
            this.reportProcessId = reportProcessId;
            return this;
        }
        public String getReportProcessId() {
            return this.reportProcessId;
        }

        public GetBootAndAntiUninstallPolicyResponseBodyStrategy setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetBootAndAntiUninstallPolicyResponseBodyStrategy setUserGroupIds(java.util.List<String> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }
        public java.util.List<String> getUserGroupIds() {
            return this.userGroupIds;
        }

        public GetBootAndAntiUninstallPolicyResponseBodyStrategy setWhitelistUsers(java.util.List<String> whitelistUsers) {
            this.whitelistUsers = whitelistUsers;
            return this;
        }
        public java.util.List<String> getWhitelistUsers() {
            return this.whitelistUsers;
        }

    }

}
