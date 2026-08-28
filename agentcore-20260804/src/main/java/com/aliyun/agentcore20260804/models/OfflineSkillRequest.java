// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class OfflineSkillRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public OfflineSkillRequestBody body;

    public static OfflineSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineSkillRequest self = new OfflineSkillRequest();
        return TeaModel.build(map, self);
    }

    public OfflineSkillRequest setBody(OfflineSkillRequestBody body) {
        this.body = body;
        return this;
    }
    public OfflineSkillRequestBody getBody() {
        return this.body;
    }

    public static class OfflineSkillRequestBody extends TeaModel {
        /**
         * <p>The operation scope. Valid values:</p>
         * <ul>
         * <li>skill: the entire Skill.</li>
         * <li>version: a specified version.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>version</p>
         */
        @NameInMap("scope")
        public String scope;

        /**
         * <p>The Skill version number.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1</p>
         */
        @NameInMap("skillVersion")
        public String skillVersion;

        public static OfflineSkillRequestBody build(java.util.Map<String, ?> map) throws Exception {
            OfflineSkillRequestBody self = new OfflineSkillRequestBody();
            return TeaModel.build(map, self);
        }

        public OfflineSkillRequestBody setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public OfflineSkillRequestBody setSkillVersion(String skillVersion) {
            this.skillVersion = skillVersion;
            return this;
        }
        public String getSkillVersion() {
            return this.skillVersion;
        }

    }

}
