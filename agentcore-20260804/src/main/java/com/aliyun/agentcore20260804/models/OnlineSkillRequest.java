// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class OnlineSkillRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public OnlineSkillRequestBody body;

    public static OnlineSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        OnlineSkillRequest self = new OnlineSkillRequest();
        return TeaModel.build(map, self);
    }

    public OnlineSkillRequest setBody(OnlineSkillRequestBody body) {
        this.body = body;
        return this;
    }
    public OnlineSkillRequestBody getBody() {
        return this.body;
    }

    public static class OnlineSkillRequestBody extends TeaModel {
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

        public static OnlineSkillRequestBody build(java.util.Map<String, ?> map) throws Exception {
            OnlineSkillRequestBody self = new OnlineSkillRequestBody();
            return TeaModel.build(map, self);
        }

        public OnlineSkillRequestBody setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public OnlineSkillRequestBody setSkillVersion(String skillVersion) {
            this.skillVersion = skillVersion;
            return this;
        }
        public String getSkillVersion() {
            return this.skillVersion;
        }

    }

}
