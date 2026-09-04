// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>This is default function description by fc-deploy component</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("engines")
    public CreateProjectRequestEngines engines;

    /**
     * <strong>example:</strong>
     * <p>such as ignoring low-severity vulnerabilities, etc.</p>
     */
    @NameInMap("instructionPrompt")
    public String instructionPrompt;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_paswd_103</p>
     */
    @NameInMap("name")
    public String name;

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

    public static class CreateProjectRequestEngines extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("sast")
        public Boolean sast;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("sca")
        public Boolean sca;

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

        public CreateProjectRequestEngines setSca(Boolean sca) {
            this.sca = sca;
            return this;
        }
        public Boolean getSca() {
            return this.sca;
        }

    }

    public static class CreateProjectRequestSource extends TeaModel {
        /**
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
