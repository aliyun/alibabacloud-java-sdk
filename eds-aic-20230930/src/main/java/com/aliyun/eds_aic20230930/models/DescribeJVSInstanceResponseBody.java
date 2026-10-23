// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeJVSInstanceResponseBody extends TeaModel {
    /**
     * <p>The returned result object.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeJVSInstanceResponseBodyData> data;

    /**
     * <p>The maximum number of results returned in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that indicates the starting position of the current query. If this parameter is empty, the query starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU+SQXzm0H9mu/FiSc****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of pending upgrades.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PendingUpgradeCount")
    public Integer pendingUpgradeCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeJVSInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJVSInstanceResponseBody self = new DescribeJVSInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJVSInstanceResponseBody setData(java.util.List<DescribeJVSInstanceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeJVSInstanceResponseBodyData> getData() {
        return this.data;
    }

    public DescribeJVSInstanceResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeJVSInstanceResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeJVSInstanceResponseBody setPendingUpgradeCount(Integer pendingUpgradeCount) {
        this.pendingUpgradeCount = pendingUpgradeCount;
        return this;
    }
    public Integer getPendingUpgradeCount() {
        return this.pendingUpgradeCount;
    }

    public DescribeJVSInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeJVSInstanceResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeJVSInstanceResponseBodyDataAgentVersion extends TeaModel {
        /**
         * <p>The AI Engine version upgrade status.</p>
         */
        @NameInMap("UpgradeStatus")
        public String upgradeStatus;

        /**
         * <p>The AI Engine version number.</p>
         * 
         * <strong>example:</strong>
         * <p>2607W1</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeJVSInstanceResponseBodyDataAgentVersion build(java.util.Map<String, ?> map) throws Exception {
            DescribeJVSInstanceResponseBodyDataAgentVersion self = new DescribeJVSInstanceResponseBodyDataAgentVersion();
            return TeaModel.build(map, self);
        }

        public DescribeJVSInstanceResponseBodyDataAgentVersion setUpgradeStatus(String upgradeStatus) {
            this.upgradeStatus = upgradeStatus;
            return this;
        }
        public String getUpgradeStatus() {
            return this.upgradeStatus;
        }

        public DescribeJVSInstanceResponseBodyDataAgentVersion setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeJVSInstanceResponseBodyDataCreditConfig extends TeaModel {
        /**
         * <p>The credit limit.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("CreditLimit")
        public Long creditLimit;

        /**
         * <p>The limit period.</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("LimitPeriod")
        public String limitPeriod;

        public static DescribeJVSInstanceResponseBodyDataCreditConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeJVSInstanceResponseBodyDataCreditConfig self = new DescribeJVSInstanceResponseBodyDataCreditConfig();
            return TeaModel.build(map, self);
        }

        public DescribeJVSInstanceResponseBodyDataCreditConfig setCreditLimit(Long creditLimit) {
            this.creditLimit = creditLimit;
            return this;
        }
        public Long getCreditLimit() {
            return this.creditLimit;
        }

        public DescribeJVSInstanceResponseBodyDataCreditConfig setLimitPeriod(String limitPeriod) {
            this.limitPeriod = limitPeriod;
            return this;
        }
        public String getLimitPeriod() {
            return this.limitPeriod;
        }

    }

    public static class DescribeJVSInstanceResponseBodyDataInstalledSkills extends TeaModel {
        /**
         * <p>The skill description.</p>
         * 
         * <strong>example:</strong>
         * <p>Current weather and forecasts with wttr.in via curl for locations, rain, temperature, travel planning.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The skill icon URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/icon.png">https://www.example.com/icon.png</a></p>
         */
        @NameInMap("IconUrl")
        public String iconUrl;

        /**
         * <p>The skill installation time.</p>
         */
        @NameInMap("InstalledAt")
        public String installedAt;

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
         * <p>The skill type.</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("SkillType")
        public String skillType;

        public static DescribeJVSInstanceResponseBodyDataInstalledSkills build(java.util.Map<String, ?> map) throws Exception {
            DescribeJVSInstanceResponseBodyDataInstalledSkills self = new DescribeJVSInstanceResponseBodyDataInstalledSkills();
            return TeaModel.build(map, self);
        }

        public DescribeJVSInstanceResponseBodyDataInstalledSkills setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeJVSInstanceResponseBodyDataInstalledSkills setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public DescribeJVSInstanceResponseBodyDataInstalledSkills setInstalledAt(String installedAt) {
            this.installedAt = installedAt;
            return this;
        }
        public String getInstalledAt() {
            return this.installedAt;
        }

        public DescribeJVSInstanceResponseBodyDataInstalledSkills setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

        public DescribeJVSInstanceResponseBodyDataInstalledSkills setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

        public DescribeJVSInstanceResponseBodyDataInstalledSkills setSkillType(String skillType) {
            this.skillType = skillType;
            return this;
        }
        public String getSkillType() {
            return this.skillType;
        }

    }

    public static class DescribeJVSInstanceResponseBodyDataUsedCredit extends TeaModel {
        /**
         * <p>The number of credits.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Credit")
        public Long credit;

        /**
         * <p>The dimension of the current credit.</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("LimitPeriod")
        public String limitPeriod;

        public static DescribeJVSInstanceResponseBodyDataUsedCredit build(java.util.Map<String, ?> map) throws Exception {
            DescribeJVSInstanceResponseBodyDataUsedCredit self = new DescribeJVSInstanceResponseBodyDataUsedCredit();
            return TeaModel.build(map, self);
        }

        public DescribeJVSInstanceResponseBodyDataUsedCredit setCredit(Long credit) {
            this.credit = credit;
            return this;
        }
        public Long getCredit() {
            return this.credit;
        }

        public DescribeJVSInstanceResponseBodyDataUsedCredit setLimitPeriod(String limitPeriod) {
            this.limitPeriod = limitPeriod;
            return this;
        }
        public String getLimitPeriod() {
            return this.limitPeriod;
        }

    }

    public static class DescribeJVSInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The AI Engine version and upgrade status.</p>
         */
        @NameInMap("AgentVersion")
        public DescribeJVSInstanceResponseBodyDataAgentVersion agentVersion;

        /**
         * <p>The creation time. The time is in UTC and follows the ISO 8601 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-10T01:31:32Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The credit limit configuration. If multiple configurations are delivered, the subsequent configurations overwrite the previous ones.</p>
         */
        @NameInMap("CreditConfig")
        public java.util.List<DescribeJVSInstanceResponseBodyDataCreditConfig> creditConfig;

        /**
         * <p>The expiration time. The time is in UTC and follows the ISO 8601 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-10T01:31:32Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The list of skills installed on the instance.</p>
         */
        @NameInMap("InstalledSkills")
        public java.util.List<DescribeJVSInstanceResponseBodyDataInstalledSkills> installedSkills;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-uto81vfd8t8z****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("JvsPackageId")
        public String jvsPackageId;

        /**
         * <p>The modification time. The time is in UTC and follows the ISO 8601 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-10T01:31:32Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The used credits.</p>
         */
        @NameInMap("UsedCredit")
        public java.util.List<DescribeJVSInstanceResponseBodyDataUsedCredit> usedCredit;

        public static DescribeJVSInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeJVSInstanceResponseBodyData self = new DescribeJVSInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeJVSInstanceResponseBodyData setAgentVersion(DescribeJVSInstanceResponseBodyDataAgentVersion agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public DescribeJVSInstanceResponseBodyDataAgentVersion getAgentVersion() {
            return this.agentVersion;
        }

        public DescribeJVSInstanceResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeJVSInstanceResponseBodyData setCreditConfig(java.util.List<DescribeJVSInstanceResponseBodyDataCreditConfig> creditConfig) {
            this.creditConfig = creditConfig;
            return this;
        }
        public java.util.List<DescribeJVSInstanceResponseBodyDataCreditConfig> getCreditConfig() {
            return this.creditConfig;
        }

        public DescribeJVSInstanceResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeJVSInstanceResponseBodyData setInstalledSkills(java.util.List<DescribeJVSInstanceResponseBodyDataInstalledSkills> installedSkills) {
            this.installedSkills = installedSkills;
            return this;
        }
        public java.util.List<DescribeJVSInstanceResponseBodyDataInstalledSkills> getInstalledSkills() {
            return this.installedSkills;
        }

        public DescribeJVSInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeJVSInstanceResponseBodyData setJvsPackageId(String jvsPackageId) {
            this.jvsPackageId = jvsPackageId;
            return this;
        }
        public String getJvsPackageId() {
            return this.jvsPackageId;
        }

        public DescribeJVSInstanceResponseBodyData setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeJVSInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeJVSInstanceResponseBodyData setUsedCredit(java.util.List<DescribeJVSInstanceResponseBodyDataUsedCredit> usedCredit) {
            this.usedCredit = usedCredit;
            return this;
        }
        public java.util.List<DescribeJVSInstanceResponseBodyDataUsedCredit> getUsedCredit() {
            return this.usedCredit;
        }

    }

}
