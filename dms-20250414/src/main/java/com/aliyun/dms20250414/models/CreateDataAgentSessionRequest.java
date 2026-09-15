// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentSessionRequest extends TeaModel {
    /**
     * <p>The current DMS unit.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>The file ID.</p>
     * 
     * <strong>example:</strong>
     * <p>f-8*******01m</p>
     */
    @NameInMap("File")
    public String file;

    /**
     * <p>The session configuration.</p>
     */
    @NameInMap("SessionConfig")
    public CreateDataAgentSessionRequestSessionConfig sessionConfig;

    /**
     * <p>The title. Chinese and English characters are supported. Maximum length: 128 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Help me analyze this data and generate a report</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateDataAgentSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAgentSessionRequest self = new CreateDataAgentSessionRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataAgentSessionRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public CreateDataAgentSessionRequest setFile(String file) {
        this.file = file;
        return this;
    }
    public String getFile() {
        return this.file;
    }

    public CreateDataAgentSessionRequest setSessionConfig(CreateDataAgentSessionRequestSessionConfig sessionConfig) {
        this.sessionConfig = sessionConfig;
        return this;
    }
    public CreateDataAgentSessionRequestSessionConfig getSessionConfig() {
        return this.sessionConfig;
    }

    public CreateDataAgentSessionRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateDataAgentSessionRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateDataAgentSessionRequestSessionConfig extends TeaModel {
        /**
         * <p>The custom agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-e*******ckd</p>
         */
        @NameInMap("CustomAgentId")
        public String customAgentId;

        /**
         * <p>The stage of the custom agent. Valid values:</p>
         * <ul>
         * <li><strong>debug</strong>: Debug stage.</li>
         * <li><strong>prod</strong>: Production stage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>debug</p>
         */
        @NameInMap("CustomAgentStage")
        public String customAgentStage;

        /**
         * <p>Specifies whether to enable web search.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableSearch")
        public Boolean enableSearch;

        /**
         * <p>The encryption key.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("EncryptKey")
        public String encryptKey;

        /**
         * <p>The encryption type.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("EncryptType")
        public String encryptType;

        /**
         * <p>The list of knowledge base IDs.</p>
         */
        @NameInMap("KbUuidList")
        public java.util.List<String> kbUuidList;

        /**
         * <p>The language. Valid values:</p>
         * <ul>
         * <li><strong>CHINESE</strong>: Chinese.</li>
         * <li><strong>ENGLISH</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CHINESE</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The list of MCP server IDs in the session configuration.</p>
         */
        @NameInMap("McpServerIds")
        public java.util.List<String> mcpServerIds;

        /**
         * <p>The mode. Valid values:</p>
         * <ul>
         * <li><strong>ASK_DATA</strong>: Ask data mode.</li>
         * <li><strong>ANALYSIS</strong>: Analysis mode.</li>
         * <li><strong>INSIGHT</strong>: Insight mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ANALYSIS</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The report page width.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReportPageWidth")
        public Long reportPageWidth;

        /**
         * <p>The report watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ReportWaterMark")
        public String reportWaterMark;

        /**
         * <p>The name of the user OSS bucket.</p>
         * <ul>
         * <li>Analysis process files and report artifacts can be uploaded to the specified OSS bucket.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user-oss-bucket</p>
         */
        @NameInMap("UserOssBucket")
        public String userOssBucket;

        public static CreateDataAgentSessionRequestSessionConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDataAgentSessionRequestSessionConfig self = new CreateDataAgentSessionRequestSessionConfig();
            return TeaModel.build(map, self);
        }

        public CreateDataAgentSessionRequestSessionConfig setCustomAgentId(String customAgentId) {
            this.customAgentId = customAgentId;
            return this;
        }
        public String getCustomAgentId() {
            return this.customAgentId;
        }

        public CreateDataAgentSessionRequestSessionConfig setCustomAgentStage(String customAgentStage) {
            this.customAgentStage = customAgentStage;
            return this;
        }
        public String getCustomAgentStage() {
            return this.customAgentStage;
        }

        public CreateDataAgentSessionRequestSessionConfig setEnableSearch(Boolean enableSearch) {
            this.enableSearch = enableSearch;
            return this;
        }
        public Boolean getEnableSearch() {
            return this.enableSearch;
        }

        public CreateDataAgentSessionRequestSessionConfig setEncryptKey(String encryptKey) {
            this.encryptKey = encryptKey;
            return this;
        }
        public String getEncryptKey() {
            return this.encryptKey;
        }

        public CreateDataAgentSessionRequestSessionConfig setEncryptType(String encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public String getEncryptType() {
            return this.encryptType;
        }

        public CreateDataAgentSessionRequestSessionConfig setKbUuidList(java.util.List<String> kbUuidList) {
            this.kbUuidList = kbUuidList;
            return this;
        }
        public java.util.List<String> getKbUuidList() {
            return this.kbUuidList;
        }

        public CreateDataAgentSessionRequestSessionConfig setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public CreateDataAgentSessionRequestSessionConfig setMcpServerIds(java.util.List<String> mcpServerIds) {
            this.mcpServerIds = mcpServerIds;
            return this;
        }
        public java.util.List<String> getMcpServerIds() {
            return this.mcpServerIds;
        }

        public CreateDataAgentSessionRequestSessionConfig setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateDataAgentSessionRequestSessionConfig setReportPageWidth(Long reportPageWidth) {
            this.reportPageWidth = reportPageWidth;
            return this;
        }
        public Long getReportPageWidth() {
            return this.reportPageWidth;
        }

        public CreateDataAgentSessionRequestSessionConfig setReportWaterMark(String reportWaterMark) {
            this.reportWaterMark = reportWaterMark;
            return this;
        }
        public String getReportWaterMark() {
            return this.reportWaterMark;
        }

        public CreateDataAgentSessionRequestSessionConfig setUserOssBucket(String userOssBucket) {
            this.userOssBucket = userOssBucket;
            return this;
        }
        public String getUserOssBucket() {
            return this.userOssBucket;
        }

    }

}
