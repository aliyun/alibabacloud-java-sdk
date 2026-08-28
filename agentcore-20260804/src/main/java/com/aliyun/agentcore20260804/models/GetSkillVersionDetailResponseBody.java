// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetSkillVersionDetailResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetSkillVersionDetailResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetSkillVersionDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillVersionDetailResponseBody self = new GetSkillVersionDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillVersionDetailResponseBody setData(GetSkillVersionDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSkillVersionDetailResponseBodyData getData() {
        return this.data;
    }

    public GetSkillVersionDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSkillVersionDetailResponseBodyData extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>A sample description that explains the purpose of the resource</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>skill-example</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The resource mapping (key is the resource name).</p>
         */
        @NameInMap("resource")
        public java.util.Map<String, DataResourceValue> resource;

        /**
         * <p>The Skill card content (SKILL.md).</p>
         * 
         * <strong>example:</strong>
         * <h1>Sample Skill</h1>
         * <p>Used to demonstrate Skill document content</p>
         */
        @NameInMap("skillMd")
        public String skillMd;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1234567890abcdef</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static GetSkillVersionDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSkillVersionDetailResponseBodyData self = new GetSkillVersionDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSkillVersionDetailResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSkillVersionDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSkillVersionDetailResponseBodyData setResource(java.util.Map<String, DataResourceValue> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.Map<String, DataResourceValue> getResource() {
            return this.resource;
        }

        public GetSkillVersionDetailResponseBodyData setSkillMd(String skillMd) {
            this.skillMd = skillMd;
            return this;
        }
        public String getSkillMd() {
            return this.skillMd;
        }

        public GetSkillVersionDetailResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
