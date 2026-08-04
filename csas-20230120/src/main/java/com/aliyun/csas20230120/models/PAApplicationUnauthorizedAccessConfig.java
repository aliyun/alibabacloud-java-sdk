// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class PAApplicationUnauthorizedAccessConfig extends TeaModel {
    /**
     * <p>Specifies whether end users are allowed to submit approval requests.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowReport")
    public Boolean allowReport;

    /**
     * <p>The content displayed in the client interception pop-up window.</p>
     */
    @NameInMap("BlockContent")
    public PAApplicationUnauthorizedAccessConfigBlockContent blockContent;

    /**
     * <p>Specifies whether the feature is enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled. Users are redirected to an interception page when they access an unauthorized application.</li>
     * <li><strong>false</strong>: Disabled. An error message is returned by default when users access an unauthorized application.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The ID of the approval flow associated with the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>approval-process-0ee84ac4f9c31bc5</p>
     */
    @NameInMap("ReportProcessId")
    public String reportProcessId;

    public static PAApplicationUnauthorizedAccessConfig build(java.util.Map<String, ?> map) throws Exception {
        PAApplicationUnauthorizedAccessConfig self = new PAApplicationUnauthorizedAccessConfig();
        return TeaModel.build(map, self);
    }

    public PAApplicationUnauthorizedAccessConfig setAllowReport(Boolean allowReport) {
        this.allowReport = allowReport;
        return this;
    }
    public Boolean getAllowReport() {
        return this.allowReport;
    }

    public PAApplicationUnauthorizedAccessConfig setBlockContent(PAApplicationUnauthorizedAccessConfigBlockContent blockContent) {
        this.blockContent = blockContent;
        return this;
    }
    public PAApplicationUnauthorizedAccessConfigBlockContent getBlockContent() {
        return this.blockContent;
    }

    public PAApplicationUnauthorizedAccessConfig setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public PAApplicationUnauthorizedAccessConfig setReportProcessId(String reportProcessId) {
        this.reportProcessId = reportProcessId;
        return this;
    }
    public String getReportProcessId() {
        return this.reportProcessId;
    }

    public static class PAApplicationUnauthorizedAccessConfigBlockContentBlockTextEn extends TeaModel {
        /**
         * <p>The prompt content of the English block page.</p>
         * 
         * <strong>example:</strong>
         * <p>You do not have permission to access this system. If you need to do so, please submit a permission request.</p>
         */
        @NameInMap("BrowserAlertContent")
        public String browserAlertContent;

        /**
         * <p>The background pattern of the English block page.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/xxx.png">https://img.alicdn.com/xxx.png</a></p>
         */
        @NameInMap("BrowserAlertStyle")
        public String browserAlertStyle;

        /**
         * <p>The title of the English block page.</p>
         * 
         * <strong>example:</strong>
         * <p>No Permission Access</p>
         */
        @NameInMap("BrowserAlertTitle")
        public String browserAlertTitle;

        /**
         * <p>The text of the English report approval button.</p>
         * 
         * <strong>example:</strong>
         * <p>Report</p>
         */
        @NameInMap("ReportButtonText")
        public String reportButtonText;

        public static PAApplicationUnauthorizedAccessConfigBlockContentBlockTextEn build(java.util.Map<String, ?> map) throws Exception {
            PAApplicationUnauthorizedAccessConfigBlockContentBlockTextEn self = new PAApplicationUnauthorizedAccessConfigBlockContentBlockTextEn();
            return TeaModel.build(map, self);
        }

        public PAApplicationUnauthorizedAccessConfigBlockContentBlockTextEn setBrowserAlertContent(String browserAlertContent) {
            this.browserAlertContent = browserAlertContent;
            return this;
        }
        public String getBrowserAlertContent() {
            return this.browserAlertContent;
        }

        public PAApplicationUnauthorizedAccessConfigBlockContentBlockTextEn setBrowserAlertStyle(String browserAlertStyle) {
            this.browserAlertStyle = browserAlertStyle;
            return this;
        }
        public String getBrowserAlertStyle() {
            return this.browserAlertStyle;
        }

        public PAApplicationUnauthorizedAccessConfigBlockContentBlockTextEn setBrowserAlertTitle(String browserAlertTitle) {
            this.browserAlertTitle = browserAlertTitle;
            return this;
        }
        public String getBrowserAlertTitle() {
            return this.browserAlertTitle;
        }

        public PAApplicationUnauthorizedAccessConfigBlockContentBlockTextEn setReportButtonText(String reportButtonText) {
            this.reportButtonText = reportButtonText;
            return this;
        }
        public String getReportButtonText() {
            return this.reportButtonText;
        }

    }

    public static class PAApplicationUnauthorizedAccessConfigBlockContentBlockTextZh extends TeaModel {
        /**
         * <p>The prompt content of the block page.</p>
         * 
         * <strong>example:</strong>
         * <p>您暂无权限访问该系统。如有工作需要，请提交权限申请。</p>
         */
        @NameInMap("BrowserAlertContent")
        public String browserAlertContent;

        /**
         * <p>The background pattern of the block page.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/xxx.png">https://img.alicdn.com/xxx.png</a></p>
         */
        @NameInMap("BrowserAlertStyle")
        public String browserAlertStyle;

        /**
         * <p>The title of the block page.</p>
         * 
         * <strong>example:</strong>
         * <p>无权限访问</p>
         */
        @NameInMap("BrowserAlertTitle")
        public String browserAlertTitle;

        /**
         * <p>The text of the report approval button.</p>
         * 
         * <strong>example:</strong>
         * <p>前往报备</p>
         */
        @NameInMap("ReportButtonText")
        public String reportButtonText;

        public static PAApplicationUnauthorizedAccessConfigBlockContentBlockTextZh build(java.util.Map<String, ?> map) throws Exception {
            PAApplicationUnauthorizedAccessConfigBlockContentBlockTextZh self = new PAApplicationUnauthorizedAccessConfigBlockContentBlockTextZh();
            return TeaModel.build(map, self);
        }

        public PAApplicationUnauthorizedAccessConfigBlockContentBlockTextZh setBrowserAlertContent(String browserAlertContent) {
            this.browserAlertContent = browserAlertContent;
            return this;
        }
        public String getBrowserAlertContent() {
            return this.browserAlertContent;
        }

        public PAApplicationUnauthorizedAccessConfigBlockContentBlockTextZh setBrowserAlertStyle(String browserAlertStyle) {
            this.browserAlertStyle = browserAlertStyle;
            return this;
        }
        public String getBrowserAlertStyle() {
            return this.browserAlertStyle;
        }

        public PAApplicationUnauthorizedAccessConfigBlockContentBlockTextZh setBrowserAlertTitle(String browserAlertTitle) {
            this.browserAlertTitle = browserAlertTitle;
            return this;
        }
        public String getBrowserAlertTitle() {
            return this.browserAlertTitle;
        }

        public PAApplicationUnauthorizedAccessConfigBlockContentBlockTextZh setReportButtonText(String reportButtonText) {
            this.reportButtonText = reportButtonText;
            return this;
        }
        public String getReportButtonText() {
            return this.reportButtonText;
        }

    }

    public static class PAApplicationUnauthorizedAccessConfigBlockContent extends TeaModel {
        /**
         * <p>The English content.</p>
         */
        @NameInMap("BlockTextEn")
        public PAApplicationUnauthorizedAccessConfigBlockContentBlockTextEn blockTextEn;

        /**
         * <p>The Chinese content.</p>
         */
        @NameInMap("BlockTextZh")
        public PAApplicationUnauthorizedAccessConfigBlockContentBlockTextZh blockTextZh;

        public static PAApplicationUnauthorizedAccessConfigBlockContent build(java.util.Map<String, ?> map) throws Exception {
            PAApplicationUnauthorizedAccessConfigBlockContent self = new PAApplicationUnauthorizedAccessConfigBlockContent();
            return TeaModel.build(map, self);
        }

        public PAApplicationUnauthorizedAccessConfigBlockContent setBlockTextEn(PAApplicationUnauthorizedAccessConfigBlockContentBlockTextEn blockTextEn) {
            this.blockTextEn = blockTextEn;
            return this;
        }
        public PAApplicationUnauthorizedAccessConfigBlockContentBlockTextEn getBlockTextEn() {
            return this.blockTextEn;
        }

        public PAApplicationUnauthorizedAccessConfigBlockContent setBlockTextZh(PAApplicationUnauthorizedAccessConfigBlockContentBlockTextZh blockTextZh) {
            this.blockTextZh = blockTextZh;
            return this;
        }
        public PAApplicationUnauthorizedAccessConfigBlockContentBlockTextZh getBlockTextZh() {
            return this.blockTextZh;
        }

    }

}
