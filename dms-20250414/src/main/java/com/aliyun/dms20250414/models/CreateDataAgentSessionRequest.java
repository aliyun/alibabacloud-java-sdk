// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentSessionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <strong>example:</strong>
     * <p>f-8*******01m</p>
     */
    @NameInMap("File")
    public String file;

    @NameInMap("SessionConfig")
    public CreateDataAgentSessionRequestSessionConfig sessionConfig;

    @NameInMap("Title")
    public String title;

    /**
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
         * <strong>example:</strong>
         * <p>ca-e*******ckd</p>
         */
        @NameInMap("CustomAgentId")
        public String customAgentId;

        /**
         * <strong>example:</strong>
         * <p>debug</p>
         */
        @NameInMap("CustomAgentStage")
        public String customAgentStage;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableSearch")
        public Boolean enableSearch;

        /**
         * <strong>example:</strong>
         * <p>CHINESE</p>
         */
        @NameInMap("Language")
        public String language;

        @NameInMap("McpServerIds")
        public java.util.List<String> mcpServerIds;

        /**
         * <strong>example:</strong>
         * <p>ANALYSIS</p>
         */
        @NameInMap("Mode")
        public String mode;

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

    }

}
