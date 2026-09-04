// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class CreateProjectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("configRevision")
    public Long configRevision;

    /**
     * <strong>example:</strong>
     * <p>2026-08-27T00:53:46.774Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <strong>example:</strong>
     * <p>3221</p>
     */
    @NameInMap("createdBy")
    public String createdBy;

    /**
     * <strong>example:</strong>
     * <p>This is default function description by fc-deploy component</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("engines")
    public CreateProjectResponseBodyEngines engines;

    /**
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>such as ignoring low-severity vulnerabilities, etc.</p>
     */
    @NameInMap("instructionPrompt")
    public String instructionPrompt;

    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>9A1F403F-0A85-5578-8B7C-55E3E9408659</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("source")
    public CreateProjectResponseBodySource source;

    /**
     * <strong>example:</strong>
     * <p>2026-08-27T00:53:46.774Z</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    public static CreateProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectResponseBody self = new CreateProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProjectResponseBody setConfigRevision(Long configRevision) {
        this.configRevision = configRevision;
        return this;
    }
    public Long getConfigRevision() {
        return this.configRevision;
    }

    public CreateProjectResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateProjectResponseBody setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public CreateProjectResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProjectResponseBody setEngines(CreateProjectResponseBodyEngines engines) {
        this.engines = engines;
        return this;
    }
    public CreateProjectResponseBodyEngines getEngines() {
        return this.engines;
    }

    public CreateProjectResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateProjectResponseBody setInstructionPrompt(String instructionPrompt) {
        this.instructionPrompt = instructionPrompt;
        return this;
    }
    public String getInstructionPrompt() {
        return this.instructionPrompt;
    }

    public CreateProjectResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateProjectResponseBody setSource(CreateProjectResponseBodySource source) {
        this.source = source;
        return this;
    }
    public CreateProjectResponseBodySource getSource() {
        return this.source;
    }

    public CreateProjectResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static class CreateProjectResponseBodyEngines extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("sast")
        public Boolean sast;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("sca")
        public Boolean sca;

        public static CreateProjectResponseBodyEngines build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectResponseBodyEngines self = new CreateProjectResponseBodyEngines();
            return TeaModel.build(map, self);
        }

        public CreateProjectResponseBodyEngines setSast(Boolean sast) {
            this.sast = sast;
            return this;
        }
        public Boolean getSast() {
            return this.sast;
        }

        public CreateProjectResponseBodyEngines setSca(Boolean sca) {
            this.sca = sca;
            return this;
        }
        public Boolean getSca() {
            return this.sca;
        }

    }

    public static class CreateProjectResponseBodySource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>api</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateProjectResponseBodySource build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectResponseBodySource self = new CreateProjectResponseBodySource();
            return TeaModel.build(map, self);
        }

        public CreateProjectResponseBodySource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
