// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateAgentSkillResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The skill information.</p>
     */
    @NameInMap("SkillInfo")
    public java.util.List<CreateAgentSkillResponseBodySkillInfo> skillInfo;

    public static CreateAgentSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentSkillResponseBody self = new CreateAgentSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgentSkillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAgentSkillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAgentSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAgentSkillResponseBody setSkillInfo(java.util.List<CreateAgentSkillResponseBodySkillInfo> skillInfo) {
        this.skillInfo = skillInfo;
        return this;
    }
    public java.util.List<CreateAgentSkillResponseBodySkillInfo> getSkillInfo() {
        return this.skillInfo;
    }

    public static class CreateAgentSkillResponseBodySkillInfo extends TeaModel {
        /**
         * <p>The skill description.</p>
         * 
         * <strong>example:</strong>
         * <p>Current weather and forecasts with wttr.in via curl for locations, rain, temperature, travel planning.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The skill summary.</p>
         * 
         * <strong>example:</strong>
         * <p>Current weather and forecasts.</p>
         */
        @NameInMap("Instruction")
        public String instruction;

        /**
         * <p>The unique ID of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-051j4pbwxzgol****</p>
         */
        @NameInMap("SkillId")
        public String skillId;

        /**
         * <p>The skill name.</p>
         * 
         * <strong>example:</strong>
         * <p>dev-spec</p>
         */
        @NameInMap("SkillName")
        public String skillName;

        /**
         * <p>The skill status.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The skill type.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateAgentSkillResponseBodySkillInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentSkillResponseBodySkillInfo self = new CreateAgentSkillResponseBodySkillInfo();
            return TeaModel.build(map, self);
        }

        public CreateAgentSkillResponseBodySkillInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAgentSkillResponseBodySkillInfo setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public CreateAgentSkillResponseBodySkillInfo setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

        public CreateAgentSkillResponseBodySkillInfo setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

        public CreateAgentSkillResponseBodySkillInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateAgentSkillResponseBodySkillInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
