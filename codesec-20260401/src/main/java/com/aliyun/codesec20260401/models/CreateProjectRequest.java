// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is default function description by fc-deploy component</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The engine switches for the project or scan snapshot. Only SAST and SCA are supported.</p>
     */
    @NameInMap("engines")
    public CreateProjectRequestEngines engines;

    /**
     * <p>The natural language prompt that describes scanning or result processing preferences, such as ignoring low-risk vulnerabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>such as ignoring low-severity vulnerabilities, etc.</p>
     */
    @NameInMap("instructionPrompt")
    public String instructionPrompt;

    /**
     * <p>The project name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_paswd_103</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The project source.</p>
     */
    @NameInMap("source")
    public CreateProjectRequestSource source;

    public static CreateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRequest self = new CreateProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProjectRequest setEngines(CreateProjectRequestEngines engines) {
        this.engines = engines;
        return this;
    }
    public CreateProjectRequestEngines getEngines() {
        return this.engines;
    }

    public CreateProjectRequest setInstructionPrompt(String instructionPrompt) {
        this.instructionPrompt = instructionPrompt;
        return this;
    }
    public String getInstructionPrompt() {
        return this.instructionPrompt;
    }

    public CreateProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProjectRequest setSource(CreateProjectRequestSource source) {
        this.source = source;
        return this;
    }
    public CreateProjectRequestSource getSource() {
        return this.source;
    }

    public static class CreateProjectRequestEnginesSastConfig extends TeaModel {
        /**
         * <p>Specifies whether to generate remediation suggestions.</p>
         */
        @NameInMap("remediation")
        public Boolean remediation;

        public static CreateProjectRequestEnginesSastConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestEnginesSastConfig self = new CreateProjectRequestEnginesSastConfig();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestEnginesSastConfig setRemediation(Boolean remediation) {
            this.remediation = remediation;
            return this;
        }
        public Boolean getRemediation() {
            return this.remediation;
        }

    }

    public static class CreateProjectRequestEnginesScaConfig extends TeaModel {
        /**
         * <p>Specifies whether to generate remediation suggestions.</p>
         */
        @NameInMap("remediation")
        public Boolean remediation;

        public static CreateProjectRequestEnginesScaConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestEnginesScaConfig self = new CreateProjectRequestEnginesScaConfig();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestEnginesScaConfig setRemediation(Boolean remediation) {
            this.remediation = remediation;
            return this;
        }
        public Boolean getRemediation() {
            return this.remediation;
        }

    }

    public static class CreateProjectRequestEngines extends TeaModel {
        /**
         * <p>Specifies whether SAST is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("sast")
        public Boolean sast;

        /**
         * <p>The engine-level configuration.</p>
         */
        @NameInMap("sastConfig")
        public CreateProjectRequestEnginesSastConfig sastConfig;

        /**
         * <p>Specifies whether SCA is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("sca")
        public Boolean sca;

        /**
         * <p>The engine-level configuration.</p>
         */
        @NameInMap("scaConfig")
        public CreateProjectRequestEnginesScaConfig scaConfig;

        public static CreateProjectRequestEngines build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestEngines self = new CreateProjectRequestEngines();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestEngines setSast(Boolean sast) {
            this.sast = sast;
            return this;
        }
        public Boolean getSast() {
            return this.sast;
        }

        public CreateProjectRequestEngines setSastConfig(CreateProjectRequestEnginesSastConfig sastConfig) {
            this.sastConfig = sastConfig;
            return this;
        }
        public CreateProjectRequestEnginesSastConfig getSastConfig() {
            return this.sastConfig;
        }

        public CreateProjectRequestEngines setSca(Boolean sca) {
            this.sca = sca;
            return this;
        }
        public Boolean getSca() {
            return this.sca;
        }

        public CreateProjectRequestEngines setScaConfig(CreateProjectRequestEnginesScaConfig scaConfig) {
            this.scaConfig = scaConfig;
            return this;
        }
        public CreateProjectRequestEnginesScaConfig getScaConfig() {
            return this.scaConfig;
        }

    }

    public static class CreateProjectRequestSource extends TeaModel {
        /**
         * <p>The project type.</p>
         * 
         * <strong>example:</strong>
         * <p>api</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateProjectRequestSource build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestSource self = new CreateProjectRequestSource();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
