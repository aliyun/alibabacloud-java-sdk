// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeSkillsResponseBody extends TeaModel {
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
     * <p>1A923337-44D9-5CAD-9A53-95084BD4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The skill information.</p>
     */
    @NameInMap("SkillInfo")
    public java.util.List<DescribeSkillsResponseBodySkillInfo> skillInfo;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeSkillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSkillsResponseBody self = new DescribeSkillsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSkillsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSkillsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSkillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSkillsResponseBody setSkillInfo(java.util.List<DescribeSkillsResponseBodySkillInfo> skillInfo) {
        this.skillInfo = skillInfo;
        return this;
    }
    public java.util.List<DescribeSkillsResponseBodySkillInfo> getSkillInfo() {
        return this.skillInfo;
    }

    public DescribeSkillsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSkillsResponseBodySkillInfoInstalledInstances extends TeaModel {
        /**
         * <p>The installation status.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTALLED</p>
         */
        @NameInMap("InstallStatus")
        public String installStatus;

        /**
         * <p>The cloud phone instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-6g3nocu5y9vaf****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeSkillsResponseBodySkillInfoInstalledInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeSkillsResponseBodySkillInfoInstalledInstances self = new DescribeSkillsResponseBodySkillInfoInstalledInstances();
            return TeaModel.build(map, self);
        }

        public DescribeSkillsResponseBodySkillInfoInstalledInstances setInstallStatus(String installStatus) {
            this.installStatus = installStatus;
            return this;
        }
        public String getInstallStatus() {
            return this.installStatus;
        }

        public DescribeSkillsResponseBodySkillInfoInstalledInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeSkillsResponseBodySkillInfo extends TeaModel {
        /**
         * <p>The skill category.</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-13 15:40:51</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The skill description.</p>
         * 
         * <strong>example:</strong>
         * <p>Current weather and forecasts with wttr.in via curl for locations, rain, temperature, travel planning.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The OSS download URL of the skill icon.</p>
         * 
         * <strong>example:</strong>
         * <p>aHR0cDovL2Nsb3VkLXBob25lLWFpLXRlc3QwLm9zcy1jbi1oYW5nemhv****</p>
         */
        @NameInMap("IconOssUrl")
        public String iconOssUrl;

        /**
         * <p>The number of instances that have the skill installed.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InstalledCount")
        public Integer installedCount;

        /**
         * <p>The information about the installed instances.</p>
         */
        @NameInMap("InstalledInstances")
        public java.util.List<DescribeSkillsResponseBodySkillInfoInstalledInstances> installedInstances;

        /**
         * <p>The skill summary.</p>
         * 
         * <strong>example:</strong>
         * <p>Current weather and forecasts.</p>
         */
        @NameInMap("Instruction")
        public String instruction;

        /**
         * <p>The skill ID.</p>
         * 
         * <strong>example:</strong>
         * <p>s-04zzrgosj6xd1****</p>
         */
        @NameInMap("SkillId")
        public String skillId;

        /**
         * <p>The skill name.</p>
         * 
         * <strong>example:</strong>
         * <p>weather</p>
         */
        @NameInMap("SkillName")
        public String skillName;

        /**
         * <p>The skill source.</p>
         * 
         * <strong>example:</strong>
         * <p>USER_UPLOAD</p>
         */
        @NameInMap("SkillSource")
        public String skillSource;

        /**
         * <p>The skill lifecycle status.</p>
         * 
         * <strong>example:</strong>
         * <p>UPLOADED</p>
         */
        @NameInMap("SkillStatus")
        public String skillStatus;

        /**
         * <p>The source node ID of the skill created from a conversation. This value is empty for user-uploaded skills.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-bp4du4v74mc7qw8****</p>
         */
        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        /**
         * <p>The skill status.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The skill type.</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The skill version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeSkillsResponseBodySkillInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSkillsResponseBodySkillInfo self = new DescribeSkillsResponseBodySkillInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSkillsResponseBodySkillInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeSkillsResponseBodySkillInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSkillsResponseBodySkillInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSkillsResponseBodySkillInfo setIconOssUrl(String iconOssUrl) {
            this.iconOssUrl = iconOssUrl;
            return this;
        }
        public String getIconOssUrl() {
            return this.iconOssUrl;
        }

        public DescribeSkillsResponseBodySkillInfo setInstalledCount(Integer installedCount) {
            this.installedCount = installedCount;
            return this;
        }
        public Integer getInstalledCount() {
            return this.installedCount;
        }

        public DescribeSkillsResponseBodySkillInfo setInstalledInstances(java.util.List<DescribeSkillsResponseBodySkillInfoInstalledInstances> installedInstances) {
            this.installedInstances = installedInstances;
            return this;
        }
        public java.util.List<DescribeSkillsResponseBodySkillInfoInstalledInstances> getInstalledInstances() {
            return this.installedInstances;
        }

        public DescribeSkillsResponseBodySkillInfo setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public DescribeSkillsResponseBodySkillInfo setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

        public DescribeSkillsResponseBodySkillInfo setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

        public DescribeSkillsResponseBodySkillInfo setSkillSource(String skillSource) {
            this.skillSource = skillSource;
            return this;
        }
        public String getSkillSource() {
            return this.skillSource;
        }

        public DescribeSkillsResponseBodySkillInfo setSkillStatus(String skillStatus) {
            this.skillStatus = skillStatus;
            return this;
        }
        public String getSkillStatus() {
            return this.skillStatus;
        }

        public DescribeSkillsResponseBodySkillInfo setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public DescribeSkillsResponseBodySkillInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSkillsResponseBodySkillInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSkillsResponseBodySkillInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
