// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetSkillResponseBody extends TeaModel {
    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-20T00:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Locales")
    public java.util.List<GetSkillResponseBodyLocales> locales;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>13FE89A5-C036-56BF-A0FF-A31C59819FD7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The set of connection types that the Skill depends on.</p>
     */
    @NameInMap("RequiredConnections")
    public java.util.List<String> requiredConnections;

    /**
     * <p>The security scan status of the source file.</p>
     */
    @NameInMap("SecurityScanStatus")
    public String securityScanStatus;

    /**
     * <p>The security scan remediation suggestions (a Markdown-formatted string containing a set of remediation suggestions). This value is meaningful only when the source file security scan status is BLOCK.</p>
     * 
     * <strong>example:</strong>
     * <h4>&lt;span style=\&quot;color:#2563eb\&quot;&gt; System Shutdown Command</span>\n- &lt;span style=\&quot;color:#16a34a\&quot;&gt;✅</span> Add an explicit user confirmation requirement before executing the <code>reboot-instance</code> command, and document that the restart will cause service interruption.\n\n#### &lt;span style=\&quot;color:#2563eb\&quot;&gt; Privilege Escalation Operation</span>\n- &lt;span style=\&quot;color:#16a34a\&quot;&gt;✅</span> Document that <code>sudo</code> is required, and provide installation alternatives that do not rely on root privileges (such as user local directories or package managers).\n\n#### &lt;span style=\&quot;color:#2563eb\&quot;&gt; Hardcoded Access Keys</span>\n- &lt;span style=\&quot;color:#16a34a\&quot;&gt;✅</span> Replace realistic example credentials with obvious placeholders (such as <code>&lt;your-access-key-id&gt;</code>) to avoid confusion with real credentials.\n\n#### &lt;span style=\&quot;color:#2563eb\&quot;&gt; User Deception (Direct Execution of Remote Scripts)</span>\n- &lt;span style=\&quot;color:#16a34a\&quot;&gt;✅</span> Immediately remove the <code>curl | bash</code> pattern. Instead, download the script first, verify its integrity (checksum/signature), and then execute it: <code>curl -fsSL url -o script.sh &amp;&amp; bash script.sh</code></h4>
     */
    @NameInMap("SecurityScanSuggestions")
    public String securityScanSuggestions;

    /**
     * <p>The description of the Skill.</p>
     * 
     * <strong>example:</strong>
     * <p>Create new skills, modify and improve existing skills, and measure skill performance.</p>
     */
    @NameInMap("SkillDescription")
    public String skillDescription;

    /**
     * <p>The display name of the Skill.</p>
     * 
     * <strong>example:</strong>
     * <p>AI 技能创建与优化</p>
     */
    @NameInMap("SkillDisplayName")
    public String skillDisplayName;

    /**
     * <p>Skill ID</p>
     * 
     * <strong>example:</strong>
     * <p>s-xxxxx</p>
     */
    @NameInMap("SkillId")
    public String skillId;

    /**
     * <p>The set of labels for the Skill.</p>
     */
    @NameInMap("SkillLabels")
    public java.util.List<String> skillLabels;

    /**
     * <p>The name of the Skill.</p>
     * 
     * <strong>example:</strong>
     * <p>skill-creator</p>
     */
    @NameInMap("SkillName")
    public String skillName;

    /**
     * <p>The ID of the SkillSpace to which the Skill belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>ss-xxxxx</p>
     */
    @NameInMap("SkillSpaceId")
    public String skillSpaceId;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-20T00:00:00Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillResponseBody self = new GetSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetSkillResponseBody setLocales(java.util.List<GetSkillResponseBodyLocales> locales) {
        this.locales = locales;
        return this;
    }
    public java.util.List<GetSkillResponseBodyLocales> getLocales() {
        return this.locales;
    }

    public GetSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillResponseBody setRequiredConnections(java.util.List<String> requiredConnections) {
        this.requiredConnections = requiredConnections;
        return this;
    }
    public java.util.List<String> getRequiredConnections() {
        return this.requiredConnections;
    }

    public GetSkillResponseBody setSecurityScanStatus(String securityScanStatus) {
        this.securityScanStatus = securityScanStatus;
        return this;
    }
    public String getSecurityScanStatus() {
        return this.securityScanStatus;
    }

    public GetSkillResponseBody setSecurityScanSuggestions(String securityScanSuggestions) {
        this.securityScanSuggestions = securityScanSuggestions;
        return this;
    }
    public String getSecurityScanSuggestions() {
        return this.securityScanSuggestions;
    }

    public GetSkillResponseBody setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
        return this;
    }
    public String getSkillDescription() {
        return this.skillDescription;
    }

    public GetSkillResponseBody setSkillDisplayName(String skillDisplayName) {
        this.skillDisplayName = skillDisplayName;
        return this;
    }
    public String getSkillDisplayName() {
        return this.skillDisplayName;
    }

    public GetSkillResponseBody setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

    public GetSkillResponseBody setSkillLabels(java.util.List<String> skillLabels) {
        this.skillLabels = skillLabels;
        return this;
    }
    public java.util.List<String> getSkillLabels() {
        return this.skillLabels;
    }

    public GetSkillResponseBody setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

    public GetSkillResponseBody setSkillSpaceId(String skillSpaceId) {
        this.skillSpaceId = skillSpaceId;
        return this;
    }
    public String getSkillSpaceId() {
        return this.skillSpaceId;
    }

    public GetSkillResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class GetSkillResponseBodyLocales extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AI Skill Creation and Optimization</p>
         */
        @NameInMap("EnValue")
        public String enValue;

        /**
         * <strong>example:</strong>
         * <p>AI 技能创建与优化</p>
         */
        @NameInMap("OriginalValue")
        public String originalValue;

        /**
         * <strong>example:</strong>
         * <p>AI 技能创建与优化</p>
         */
        @NameInMap("ZhValue")
        public String zhValue;

        public static GetSkillResponseBodyLocales build(java.util.Map<String, ?> map) throws Exception {
            GetSkillResponseBodyLocales self = new GetSkillResponseBodyLocales();
            return TeaModel.build(map, self);
        }

        public GetSkillResponseBodyLocales setEnValue(String enValue) {
            this.enValue = enValue;
            return this;
        }
        public String getEnValue() {
            return this.enValue;
        }

        public GetSkillResponseBodyLocales setOriginalValue(String originalValue) {
            this.originalValue = originalValue;
            return this;
        }
        public String getOriginalValue() {
            return this.originalValue;
        }

        public GetSkillResponseBodyLocales setZhValue(String zhValue) {
            this.zhValue = zhValue;
            return this;
        }
        public String getZhValue() {
            return this.zhValue;
        }

    }

}
