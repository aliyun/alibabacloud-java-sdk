// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeUserResourcesResponseBody extends TeaModel {
    /**
     * <p>返回最大数量。</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nmB7qrRFJ8vmttjxPL****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The resource types that failed to be queried.</p>
     */
    @NameInMap("QueryFailedResourceTypes")
    public java.util.List<String> queryFailedResourceTypes;

    /**
     * <p>The version number of the ranking data.</p>
     * 
     * <strong>example:</strong>
     * <p>1732869815062</p>
     */
    @NameInMap("RankVersion")
    public Long rankVersion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resources.</p>
     */
    @NameInMap("Resources")
    public java.util.List<DescribeUserResourcesResponseBodyResources> resources;

    /**
     * <p>总数。</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeUserResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserResourcesResponseBody self = new DescribeUserResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserResourcesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeUserResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeUserResourcesResponseBody setQueryFailedResourceTypes(java.util.List<String> queryFailedResourceTypes) {
        this.queryFailedResourceTypes = queryFailedResourceTypes;
        return this;
    }
    public java.util.List<String> getQueryFailedResourceTypes() {
        return this.queryFailedResourceTypes;
    }

    public DescribeUserResourcesResponseBody setRankVersion(Long rankVersion) {
        this.rankVersion = rankVersion;
        return this;
    }
    public Long getRankVersion() {
        return this.rankVersion;
    }

    public DescribeUserResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserResourcesResponseBody setResources(java.util.List<DescribeUserResourcesResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<DescribeUserResourcesResponseBodyResources> getResources() {
        return this.resources;
    }

    public DescribeUserResourcesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeUserResourcesResponseBodyResourcesClients extends TeaModel {
        /**
         * <p>The client type.</p>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>The status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>OFF</li>
         * <li>ON</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeUserResourcesResponseBodyResourcesClients build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserResourcesResponseBodyResourcesClients self = new DescribeUserResourcesResponseBodyResourcesClients();
            return TeaModel.build(map, self);
        }

        public DescribeUserResourcesResponseBodyResourcesClients setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public DescribeUserResourcesResponseBodyResourcesClients setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeUserResourcesResponseBodyResourcesDesktopDurationList extends TeaModel {
        /**
         * <p>The ID of the instance order.</p>
         * 
         * <strong>example:</strong>
         * <p>mdp-0bxls4qpi6bl6****</p>
         */
        @NameInMap("OrderInstanceId")
        public String orderInstanceId;

        /**
         * <p>The time when the package was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-17T07:01Z</p>
         */
        @NameInMap("PackageCreationTime")
        public String packageCreationTime;

        /**
         * <p>The expiration time of the package.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-17T15:59Z</p>
         */
        @NameInMap("PackageExpiredTime")
        public String packageExpiredTime;

        /**
         * <p>The package ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mdp-0bxls4qpi6bl6****</p>
         */
        @NameInMap("PackageId")
        public String packageId;

        /**
         * <p>The package status.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("PackageStatus")
        public String packageStatus;

        /**
         * <p>The package type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>FREE_PACKAGE: a free package.</li>
         * <li>NORMAL_PACKAGE: a paid package (120-hour computing plan).</li>
         * <li>POSTPAID_PACKAGE: a pay-as-you-go package (200-hour computing plan).</li>
         * <li>Duration: an hourly package.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL_PACKAGE</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The policy for the cloud computer status once the monthly package quota is exhausted.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Shutdown: The cloud computer enters the Stopped or Hibernated state.</li>
         * <li>PostPaid: The cloud computer continues providing services that are billed on the pay-as-you-go basis.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        @NameInMap("PackageUsedUpStrategy")
        public String packageUsedUpStrategy;

        /**
         * <p>The package\&quot;s effective end time for the current month.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-17T15:59Z</p>
         */
        @NameInMap("PeriodEndTime")
        public String periodEndTime;

        /**
         * <p>The package\&quot;s effective start time for the current month.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-17T07:01Z</p>
         */
        @NameInMap("PeriodStartTime")
        public String periodStartTime;

        /**
         * <p>The maximum fee for the package in the second phase.</p>
         * <blockquote>
         * <p> This parameter is returned if you set ResourceType to <code>POSTPAID_PACKAG</code> or <code>FREE_PACKAGE</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>199</p>
         */
        @NameInMap("PostPaidLimitFee")
        public Float postPaidLimitFee;

        /**
         * <p>The total duration.</p>
         * 
         * <strong>example:</strong>
         * <p>432000</p>
         */
        @NameInMap("TotalDuration")
        public Long totalDuration;

        /**
         * <p>The subscription duration consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>16850</p>
         */
        @NameInMap("UsedDuration")
        public Long usedDuration;

        public static DescribeUserResourcesResponseBodyResourcesDesktopDurationList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserResourcesResponseBodyResourcesDesktopDurationList self = new DescribeUserResourcesResponseBodyResourcesDesktopDurationList();
            return TeaModel.build(map, self);
        }

        public DescribeUserResourcesResponseBodyResourcesDesktopDurationList setOrderInstanceId(String orderInstanceId) {
            this.orderInstanceId = orderInstanceId;
            return this;
        }
        public String getOrderInstanceId() {
            return this.orderInstanceId;
        }

        public DescribeUserResourcesResponseBodyResourcesDesktopDurationList setPackageCreationTime(String packageCreationTime) {
            this.packageCreationTime = packageCreationTime;
            return this;
        }
        public String getPackageCreationTime() {
            return this.packageCreationTime;
        }

        public DescribeUserResourcesResponseBodyResourcesDesktopDurationList setPackageExpiredTime(String packageExpiredTime) {
            this.packageExpiredTime = packageExpiredTime;
            return this;
        }
        public String getPackageExpiredTime() {
            return this.packageExpiredTime;
        }

        public DescribeUserResourcesResponseBodyResourcesDesktopDurationList setPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }
        public String getPackageId() {
            return this.packageId;
        }

        public DescribeUserResourcesResponseBodyResourcesDesktopDurationList setPackageStatus(String packageStatus) {
            this.packageStatus = packageStatus;
            return this;
        }
        public String getPackageStatus() {
            return this.packageStatus;
        }

        public DescribeUserResourcesResponseBodyResourcesDesktopDurationList setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public DescribeUserResourcesResponseBodyResourcesDesktopDurationList setPackageUsedUpStrategy(String packageUsedUpStrategy) {
            this.packageUsedUpStrategy = packageUsedUpStrategy;
            return this;
        }
        public String getPackageUsedUpStrategy() {
            return this.packageUsedUpStrategy;
        }

        public DescribeUserResourcesResponseBodyResourcesDesktopDurationList setPeriodEndTime(String periodEndTime) {
            this.periodEndTime = periodEndTime;
            return this;
        }
        public String getPeriodEndTime() {
            return this.periodEndTime;
        }

        public DescribeUserResourcesResponseBodyResourcesDesktopDurationList setPeriodStartTime(String periodStartTime) {
            this.periodStartTime = periodStartTime;
            return this;
        }
        public String getPeriodStartTime() {
            return this.periodStartTime;
        }

        public DescribeUserResourcesResponseBodyResourcesDesktopDurationList setPostPaidLimitFee(Float postPaidLimitFee) {
            this.postPaidLimitFee = postPaidLimitFee;
            return this;
        }
        public Float getPostPaidLimitFee() {
            return this.postPaidLimitFee;
        }

        public DescribeUserResourcesResponseBodyResourcesDesktopDurationList setTotalDuration(Long totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        public DescribeUserResourcesResponseBodyResourcesDesktopDurationList setUsedDuration(Long usedDuration) {
            this.usedDuration = usedDuration;
            return this;
        }
        public Long getUsedDuration() {
            return this.usedDuration;
        }

    }

    public static class DescribeUserResourcesResponseBodyResourcesDesktopTimers extends TeaModel {
        /**
         * <p>Indicates whether to allow end users to configure scheduled tasks on clients.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AllowClientSetting")
        public String allowClientSetting;

        /**
         * <p>The cron expression specified in the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>0 30 13 ? * 1-7</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>Indicates whether to forcibly execute the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enforce")
        public Boolean enforce;

        /**
         * <p>The time when the scheduled task is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-21T11:37Z</p>
         */
        @NameInMap("ExecutionTime")
        public String executionTime;

        /**
         * <p>The interval at which the scheduled task is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The type of the scheduled action.</p>
         * 
         * <strong>example:</strong>
         * <p>Hibernate</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>The reset option.</p>
         * 
         * <strong>example:</strong>
         * <p>RESET_TYPE_SYSTEM</p>
         */
        @NameInMap("ResetType")
        public String resetType;

        /**
         * <p>The task type.</p>
         * 
         * <strong>example:</strong>
         * <p>TimerBoot</p>
         */
        @NameInMap("TimerType")
        public String timerType;

        public static DescribeUserResourcesResponseBodyResourcesDesktopTimers build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserResourcesResponseBodyResourcesDesktopTimers self = new DescribeUserResourcesResponseBodyResourcesDesktopTimers();
            return TeaModel.build(map, self);
        }

        public DescribeUserResourcesResponseBodyResourcesDesktopTimers setAllowClientSetting(String allowClientSetting) {
            this.allowClientSetting = allowClientSetting;
            return this;
        }
        public String getAllowClientSetting() {
            return this.allowClientSetting;
        }

        public DescribeUserResourcesResponseBodyResourcesDesktopTimers setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public DescribeUserResourcesResponseBodyResourcesDesktopTimers setEnforce(Boolean enforce) {
            this.enforce = enforce;
            return this;
        }
        public Boolean getEnforce() {
            return this.enforce;
        }

        public DescribeUserResourcesResponseBodyResourcesDesktopTimers setExecutionTime(String executionTime) {
            this.executionTime = executionTime;
            return this;
        }
        public String getExecutionTime() {
            return this.executionTime;
        }

        public DescribeUserResourcesResponseBodyResourcesDesktopTimers setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeUserResourcesResponseBodyResourcesDesktopTimers setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public DescribeUserResourcesResponseBodyResourcesDesktopTimers setResetType(String resetType) {
            this.resetType = resetType;
            return this;
        }
        public String getResetType() {
            return this.resetType;
        }

        public DescribeUserResourcesResponseBodyResourcesDesktopTimers setTimerType(String timerType) {
            this.timerType = timerType;
            return this;
        }
        public String getTimerType() {
            return this.timerType;
        }

    }

    public static class DescribeUserResourcesResponseBodyResourcesFotaUpdate extends TeaModel {
        /**
         * <p>The channel.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>The current version number of the cloud computer\&quot;s image.</p>
         * 
         * <strong>example:</strong>
         * <p>2.7.0-R-20250122.154826</p>
         */
        @NameInMap("CurrentAppVersion")
        public String currentAppVersion;

        /**
         * <p>Specifies whether to implement a forced update.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Force")
        public Boolean force;

        /**
         * <p>The target version number of the cloud computer\&quot;s image.</p>
         * 
         * <strong>example:</strong>
         * <p>2.7.0-R-20250125.154826</p>
         */
        @NameInMap("NewAppVersion")
        public String newAppVersion;

        /**
         * <p>The latest version available for updating the component disk.</p>
         * 
         * <strong>example:</strong>
         * <p>2.6.9-R-20250123.153415</p>
         */
        @NameInMap("NewDcdVersion")
        public String newDcdVersion;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>wuying-asp_single_session_desktop_win_x64</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The version description of the cloud computer\&quot;s image.</p>
         * 
         * <strong>example:</strong>
         * <p>up</p>
         */
        @NameInMap("ReleaseNote")
        public String releaseNote;

        /**
         * <p>The English release note for the new image version.</p>
         * 
         * <strong>example:</strong>
         * <p>up</p>
         */
        @NameInMap("ReleaseNoteEn")
        public String releaseNoteEn;

        /**
         * <p>The Japanese release note for the new image version.</p>
         * 
         * <strong>example:</strong>
         * <p>up</p>
         */
        @NameInMap("ReleaseNoteJp")
        public String releaseNoteJp;

        /**
         * <p>The size of the update package for the cloud computer image. Unit: KB.</p>
         * 
         * <strong>example:</strong>
         * <p>474981930</p>
         */
        @NameInMap("Size")
        public String size;

        public static DescribeUserResourcesResponseBodyResourcesFotaUpdate build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserResourcesResponseBodyResourcesFotaUpdate self = new DescribeUserResourcesResponseBodyResourcesFotaUpdate();
            return TeaModel.build(map, self);
        }

        public DescribeUserResourcesResponseBodyResourcesFotaUpdate setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public DescribeUserResourcesResponseBodyResourcesFotaUpdate setCurrentAppVersion(String currentAppVersion) {
            this.currentAppVersion = currentAppVersion;
            return this;
        }
        public String getCurrentAppVersion() {
            return this.currentAppVersion;
        }

        public DescribeUserResourcesResponseBodyResourcesFotaUpdate setForce(Boolean force) {
            this.force = force;
            return this;
        }
        public Boolean getForce() {
            return this.force;
        }

        public DescribeUserResourcesResponseBodyResourcesFotaUpdate setNewAppVersion(String newAppVersion) {
            this.newAppVersion = newAppVersion;
            return this;
        }
        public String getNewAppVersion() {
            return this.newAppVersion;
        }

        public DescribeUserResourcesResponseBodyResourcesFotaUpdate setNewDcdVersion(String newDcdVersion) {
            this.newDcdVersion = newDcdVersion;
            return this;
        }
        public String getNewDcdVersion() {
            return this.newDcdVersion;
        }

        public DescribeUserResourcesResponseBodyResourcesFotaUpdate setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public DescribeUserResourcesResponseBodyResourcesFotaUpdate setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public DescribeUserResourcesResponseBodyResourcesFotaUpdate setReleaseNoteEn(String releaseNoteEn) {
            this.releaseNoteEn = releaseNoteEn;
            return this;
        }
        public String getReleaseNoteEn() {
            return this.releaseNoteEn;
        }

        public DescribeUserResourcesResponseBodyResourcesFotaUpdate setReleaseNoteJp(String releaseNoteJp) {
            this.releaseNoteJp = releaseNoteJp;
            return this;
        }
        public String getReleaseNoteJp() {
            return this.releaseNoteJp;
        }

        public DescribeUserResourcesResponseBodyResourcesFotaUpdate setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

    public static class DescribeUserResourcesResponseBodyResourcesOsUpdatePackages extends TeaModel {
        /**
         * <p>The patch description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The patch number.</p>
         * 
         * <strong>example:</strong>
         * <p>KB2267***</p>
         */
        @NameInMap("Kb")
        public String kb;

        /**
         * <p>The patch title.</p>
         */
        @NameInMap("Title")
        public String title;

        public static DescribeUserResourcesResponseBodyResourcesOsUpdatePackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserResourcesResponseBodyResourcesOsUpdatePackages self = new DescribeUserResourcesResponseBodyResourcesOsUpdatePackages();
            return TeaModel.build(map, self);
        }

        public DescribeUserResourcesResponseBodyResourcesOsUpdatePackages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeUserResourcesResponseBodyResourcesOsUpdatePackages setKb(String kb) {
            this.kb = kb;
            return this;
        }
        public String getKb() {
            return this.kb;
        }

        public DescribeUserResourcesResponseBodyResourcesOsUpdatePackages setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribeUserResourcesResponseBodyResourcesOsUpdate extends TeaModel {
        /**
         * <p>The ID of the check task.</p>
         * 
         * <strong>example:</strong>
         * <p>wua-1740652957251743***</p>
         */
        @NameInMap("CheckId")
        public String checkId;

        /**
         * <p>The patch numbers.</p>
         * 
         * <strong>example:</strong>
         * <p>KB2267***</p>
         */
        @NameInMap("KbListString")
        public String kbListString;

        /**
         * <p>The number of packets.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PackageCount")
        public Integer packageCount;

        /**
         * <p>The patch packages.</p>
         */
        @NameInMap("Packages")
        public java.util.List<DescribeUserResourcesResponseBodyResourcesOsUpdatePackages> packages;

        /**
         * <p>The update categorization URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://catalog.update.microsoft.com/home.aspx">https://catalog.update.microsoft.com/home.aspx</a></p>
         */
        @NameInMap("UpdateCatalogUrl")
        public String updateCatalogUrl;

        public static DescribeUserResourcesResponseBodyResourcesOsUpdate build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserResourcesResponseBodyResourcesOsUpdate self = new DescribeUserResourcesResponseBodyResourcesOsUpdate();
            return TeaModel.build(map, self);
        }

        public DescribeUserResourcesResponseBodyResourcesOsUpdate setCheckId(String checkId) {
            this.checkId = checkId;
            return this;
        }
        public String getCheckId() {
            return this.checkId;
        }

        public DescribeUserResourcesResponseBodyResourcesOsUpdate setKbListString(String kbListString) {
            this.kbListString = kbListString;
            return this;
        }
        public String getKbListString() {
            return this.kbListString;
        }

        public DescribeUserResourcesResponseBodyResourcesOsUpdate setPackageCount(Integer packageCount) {
            this.packageCount = packageCount;
            return this;
        }
        public Integer getPackageCount() {
            return this.packageCount;
        }

        public DescribeUserResourcesResponseBodyResourcesOsUpdate setPackages(java.util.List<DescribeUserResourcesResponseBodyResourcesOsUpdatePackages> packages) {
            this.packages = packages;
            return this;
        }
        public java.util.List<DescribeUserResourcesResponseBodyResourcesOsUpdatePackages> getPackages() {
            return this.packages;
        }

        public DescribeUserResourcesResponseBodyResourcesOsUpdate setUpdateCatalogUrl(String updateCatalogUrl) {
            this.updateCatalogUrl = updateCatalogUrl;
            return this;
        }
        public String getUpdateCatalogUrl() {
            return this.updateCatalogUrl;
        }

    }

    public static class DescribeUserResourcesResponseBodyResourcesSessions extends TeaModel {
        /**
         * <p>用户的昵称。</p>
         * 
         * <strong>example:</strong>
         * <p>user-001</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>The timestamp when the resource session was established.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-22T11:03:36Z</p>
         */
        @NameInMap("ResourceSessionStartTime")
        public String resourceSessionStartTime;

        /**
         * <p>The username used to log on to the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>user001</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The User Principal Name (UPN) of the resource-bound user (if applicable). This parameter is returned only when you query the current user\&quot;s sessions.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:benchmark_test@test.shenzhen">benchmark_test@test.shenzhen</a></p>
         */
        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        public static DescribeUserResourcesResponseBodyResourcesSessions build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserResourcesResponseBodyResourcesSessions self = new DescribeUserResourcesResponseBodyResourcesSessions();
            return TeaModel.build(map, self);
        }

        public DescribeUserResourcesResponseBodyResourcesSessions setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public DescribeUserResourcesResponseBodyResourcesSessions setResourceSessionStartTime(String resourceSessionStartTime) {
            this.resourceSessionStartTime = resourceSessionStartTime;
            return this;
        }
        public String getResourceSessionStartTime() {
            return this.resourceSessionStartTime;
        }

        public DescribeUserResourcesResponseBodyResourcesSessions setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeUserResourcesResponseBodyResourcesSessions setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

    }

    public static class DescribeUserResourcesResponseBodyResources extends TeaModel {
        /**
         * <p>The access type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>INTERNET: access over the Internet.</li>
         * <li>VPC: access over an enterprise VPC.</li>
         * <li>ANY: access over the Internet or an enterprise VPC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        @NameInMap("AccessType")
        public String accessType;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>194101959****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The app ID. This parameter is for apps only.</p>
         * 
         * <strong>example:</strong>
         * <p>app-0001</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The authorization mode of the cloud app.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>App: authorizes access to apps.</li>
         * <li>AppInstanceGroup: authorizes access to delivery groups.</li>
         * <li>Session: authorizes access to sessions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>App</p>
         */
        @NameInMap("AuthMode")
        public String authMode;

        /**
         * <p>The level-2 resource category. This parameter is for apps only.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CategoryId")
        public Integer categoryId;

        /**
         * <p>The level-1 resource category. This parameter is for apps only.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CategoryType")
        public Integer categoryType;

        /**
         * <p>The drive name. This parameter is for enterprise drives only.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai+cds-695277****</p>
         */
        @NameInMap("CdsName")
        public String cdsName;

        /**
         * <p>The ID of the centralized resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ecds-0****</p>
         */
        @NameInMap("CenterResourceId")
        public String centerResourceId;

        /**
         * <p>The billing method.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Postpaid (default): pay-as-you-go.</li>
         * <li>PrePaid: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The client types supported by resources.</p>
         */
        @NameInMap("Clients")
        public java.util.List<DescribeUserResourcesResponseBodyResourcesClients> clients;

        /**
         * <p>The connection attributes in JSON format. The client does not need to process the attributes; they are directly passed to the resource management center when the app resource is created.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;authMode&quot;:&quot;App&quot;}</p>
         */
        @NameInMap("ConnectionProperties")
        public String connectionProperties;

        /**
         * <p>The time when the resource was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-11T07:12:12Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The cloud computer plans.</p>
         */
        @NameInMap("DesktopDurationList")
        public java.util.List<DescribeUserResourcesResponseBodyResourcesDesktopDurationList> desktopDurationList;

        /**
         * <p>The scheduled tasks for cloud computers.</p>
         */
        @NameInMap("DesktopTimers")
        public java.util.List<DescribeUserResourcesResponseBodyResourcesDesktopTimers> desktopTimers;

        /**
         * <p>The expiration time of the subscription resource.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-22T16:00:00Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The ID of the external domain. This parameter is for enterprise drives only.</p>
         * 
         * <strong>example:</strong>
         * <p>stg114510</p>
         */
        @NameInMap("ExternalDomainId")
        public String externalDomainId;

        /**
         * <p>The ID of the external user. This parameter is for enterprise drives only.</p>
         * 
         * <strong>example:</strong>
         * <p>test001</p>
         */
        @NameInMap("ExternalUserId")
        public String externalUserId;

        /**
         * <p>The update info of the cloud computer.</p>
         */
        @NameInMap("FotaUpdate")
        public DescribeUserResourcesResponseBodyResourcesFotaUpdate fotaUpdate;

        /**
         * <p>Indicates whether cross-region access is supported. This parameter is for enterprise drives only.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("GlobalStatus")
        public Boolean globalStatus;

        /**
         * <p>Indicates whether an update exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasUpgrade")
        public Boolean hasUpgrade;

        /**
         * <p>Indicates whether this is a beta version of the hibernation feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HibernationBeta")
        public Boolean hibernationBeta;

        /**
         * <p>The resource icon. This parameter is for apps only.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/icon.png">http://example.com/icon.png</a></p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>The time when the resource was last started.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-24T03:12:04Z</p>
         */
        @NameInMap("LastStartTime")
        public String lastStartTime;

        /**
         * <p>The region name.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The management status.</p>
         */
        @NameInMap("ManagementStatuses")
        public java.util.List<String> managementStatuses;

        /**
         * <p>The office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai+dir-3367****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The order status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Ceased: Your account has an overdue payment.</li>
         * <li>Released: The order is closed.</li>
         * <li>Expired: The subscription resource has expired.</li>
         * <li>Normal: The order is normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("OrderStatus")
        public String orderStatus;

        /**
         * <p>The OS platform.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows Server 2022</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The description of the OS platform.</p>
         */
        @NameInMap("OsDescription")
        public String osDescription;

        /**
         * <p>The OS type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Linux</li>
         * <li>Windows</li>
         * <li>Android</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The update info of the OS.</p>
         */
        @NameInMap("OsUpdate")
        public DescribeUserResourcesResponseBodyResourcesOsUpdate osUpdate;

        /**
         * <p>The service type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CloudDesktop: regular cloud computers or cloud computer shares.</li>
         * <li>CloudApp: App Streaming</li>
         * <li>CloudBrowser: Cloud Browser.</li>
         * <li>AndroidCloud: Cloud Phone.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AndroidCloud</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The protocol type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>HDX</li>
         * <li>ASP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The real ID of the cloud computer (from a share). This parameter is returned only when the cloud computer share has ongoing sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-0001</p>
         */
        @NameInMap("RealDesktopId")
        public String realDesktopId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The geographical location.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Mainland: regions in the Chinese mainland.</li>
         * <li>Overseas: regions outside the Chinese mainland, including China (Hong Kong).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Mainland</p>
         */
        @NameInMap("RegionLocation")
        public String regionLocation;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-0****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-d19tya8zi4****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource level.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Center: a centralized resource.</li>
         * <li>Region: a unit resource.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Center</p>
         */
        @NameInMap("ResourceLevel")
        public String resourceLevel;

        /**
         * <p>The resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>testName01</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The session status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Unknown</li>
         * <li>Connected</li>
         * <li>Disconnected</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Connected</p>
         */
        @NameInMap("ResourceSessionStatus")
        public String resourceSessionStatus;

        /**
         * <p>The resource status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Unknown: The resource status is unknown.</li>
         * <li>Stopped: The resource is stopped.</li>
         * <li>Failed: The resource failed to be created.</li>
         * <li>Starting: The resource is being started.</li>
         * <li>Rebuilding: The resource is changing.</li>
         * <li>Running: The resource is running.</li>
         * <li>Stopping: The resource is being stopped.</li>
         * <li>FotaUpdating: The image is being updated.</li>
         * <li>Pending: The resource is still being prepared.</li>
         * <li>Deleting: The resource is being deleted.</li>
         * <li>Unavailable: The resource is unavailable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("ResourceStatus")
        public String resourceStatus;

        /**
         * <p>The resource type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>App: cloud apps including App Streaming, Cloud Phone, and Cloud Browser.</li>
         * <li>Desktop: cloud computers.</li>
         * <li>DesktopGroup: cloud computer shares.</li>
         * <li>CloudDrive: enterprise drives.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Desktop</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The session type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>SINGLE_SESSION</li>
         * <li>MULTIPLE_SESSION</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SINGLE_SESSION</p>
         */
        @NameInMap("SessionType")
        public String sessionType;

        /**
         * <p>The sessions established between users and resources.</p>
         */
        @NameInMap("Sessions")
        public java.util.List<DescribeUserResourcesResponseBodyResourcesSessions> sessions;

        /**
         * <p>The sub-billing method.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>monthPackage: monthly subscription.</li>
         * <li>PrePaid: hourly plans.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("SubPayType")
        public String subPayType;

        /**
         * <p>Indicates whether hibernation is supported.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportHibernation")
        public Boolean supportHibernation;

        /**
         * <p>The supported actions. This parameter is returned only for cloud computers or phones.</p>
         */
        @NameInMap("SupportedActions")
        public java.util.List<String> supportedActions;

        /**
         * <p>The theme color of the resource. This parameter is for apps only.</p>
         * 
         * <strong>example:</strong>
         * <p>#FFFFFF</p>
         */
        @NameInMap("ThemeColor")
        public String themeColor;

        /**
         * <p>The custom name of the resource.</p>
         */
        @NameInMap("UserCustomName")
        public String userCustomName;

        /**
         * <p>The resource version. This parameter is for apps only.</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeUserResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserResourcesResponseBodyResources self = new DescribeUserResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public DescribeUserResourcesResponseBodyResources setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public DescribeUserResourcesResponseBodyResources setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeUserResourcesResponseBodyResources setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeUserResourcesResponseBodyResources setAuthMode(String authMode) {
            this.authMode = authMode;
            return this;
        }
        public String getAuthMode() {
            return this.authMode;
        }

        public DescribeUserResourcesResponseBodyResources setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public DescribeUserResourcesResponseBodyResources setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public DescribeUserResourcesResponseBodyResources setCdsName(String cdsName) {
            this.cdsName = cdsName;
            return this;
        }
        public String getCdsName() {
            return this.cdsName;
        }

        public DescribeUserResourcesResponseBodyResources setCenterResourceId(String centerResourceId) {
            this.centerResourceId = centerResourceId;
            return this;
        }
        public String getCenterResourceId() {
            return this.centerResourceId;
        }

        public DescribeUserResourcesResponseBodyResources setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeUserResourcesResponseBodyResources setClients(java.util.List<DescribeUserResourcesResponseBodyResourcesClients> clients) {
            this.clients = clients;
            return this;
        }
        public java.util.List<DescribeUserResourcesResponseBodyResourcesClients> getClients() {
            return this.clients;
        }

        public DescribeUserResourcesResponseBodyResources setConnectionProperties(String connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }
        public String getConnectionProperties() {
            return this.connectionProperties;
        }

        public DescribeUserResourcesResponseBodyResources setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeUserResourcesResponseBodyResources setDesktopDurationList(java.util.List<DescribeUserResourcesResponseBodyResourcesDesktopDurationList> desktopDurationList) {
            this.desktopDurationList = desktopDurationList;
            return this;
        }
        public java.util.List<DescribeUserResourcesResponseBodyResourcesDesktopDurationList> getDesktopDurationList() {
            return this.desktopDurationList;
        }

        public DescribeUserResourcesResponseBodyResources setDesktopTimers(java.util.List<DescribeUserResourcesResponseBodyResourcesDesktopTimers> desktopTimers) {
            this.desktopTimers = desktopTimers;
            return this;
        }
        public java.util.List<DescribeUserResourcesResponseBodyResourcesDesktopTimers> getDesktopTimers() {
            return this.desktopTimers;
        }

        public DescribeUserResourcesResponseBodyResources setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeUserResourcesResponseBodyResources setExternalDomainId(String externalDomainId) {
            this.externalDomainId = externalDomainId;
            return this;
        }
        public String getExternalDomainId() {
            return this.externalDomainId;
        }

        public DescribeUserResourcesResponseBodyResources setExternalUserId(String externalUserId) {
            this.externalUserId = externalUserId;
            return this;
        }
        public String getExternalUserId() {
            return this.externalUserId;
        }

        public DescribeUserResourcesResponseBodyResources setFotaUpdate(DescribeUserResourcesResponseBodyResourcesFotaUpdate fotaUpdate) {
            this.fotaUpdate = fotaUpdate;
            return this;
        }
        public DescribeUserResourcesResponseBodyResourcesFotaUpdate getFotaUpdate() {
            return this.fotaUpdate;
        }

        public DescribeUserResourcesResponseBodyResources setGlobalStatus(Boolean globalStatus) {
            this.globalStatus = globalStatus;
            return this;
        }
        public Boolean getGlobalStatus() {
            return this.globalStatus;
        }

        public DescribeUserResourcesResponseBodyResources setHasUpgrade(Boolean hasUpgrade) {
            this.hasUpgrade = hasUpgrade;
            return this;
        }
        public Boolean getHasUpgrade() {
            return this.hasUpgrade;
        }

        public DescribeUserResourcesResponseBodyResources setHibernationBeta(Boolean hibernationBeta) {
            this.hibernationBeta = hibernationBeta;
            return this;
        }
        public Boolean getHibernationBeta() {
            return this.hibernationBeta;
        }

        public DescribeUserResourcesResponseBodyResources setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public DescribeUserResourcesResponseBodyResources setLastStartTime(String lastStartTime) {
            this.lastStartTime = lastStartTime;
            return this;
        }
        public String getLastStartTime() {
            return this.lastStartTime;
        }

        public DescribeUserResourcesResponseBodyResources setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeUserResourcesResponseBodyResources setManagementStatuses(java.util.List<String> managementStatuses) {
            this.managementStatuses = managementStatuses;
            return this;
        }
        public java.util.List<String> getManagementStatuses() {
            return this.managementStatuses;
        }

        public DescribeUserResourcesResponseBodyResources setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeUserResourcesResponseBodyResources setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public String getOrderStatus() {
            return this.orderStatus;
        }

        public DescribeUserResourcesResponseBodyResources setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeUserResourcesResponseBodyResources setOsDescription(String osDescription) {
            this.osDescription = osDescription;
            return this;
        }
        public String getOsDescription() {
            return this.osDescription;
        }

        public DescribeUserResourcesResponseBodyResources setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeUserResourcesResponseBodyResources setOsUpdate(DescribeUserResourcesResponseBodyResourcesOsUpdate osUpdate) {
            this.osUpdate = osUpdate;
            return this;
        }
        public DescribeUserResourcesResponseBodyResourcesOsUpdate getOsUpdate() {
            return this.osUpdate;
        }

        public DescribeUserResourcesResponseBodyResources setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DescribeUserResourcesResponseBodyResources setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeUserResourcesResponseBodyResources setRealDesktopId(String realDesktopId) {
            this.realDesktopId = realDesktopId;
            return this;
        }
        public String getRealDesktopId() {
            return this.realDesktopId;
        }

        public DescribeUserResourcesResponseBodyResources setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeUserResourcesResponseBodyResources setRegionLocation(String regionLocation) {
            this.regionLocation = regionLocation;
            return this;
        }
        public String getRegionLocation() {
            return this.regionLocation;
        }

        public DescribeUserResourcesResponseBodyResources setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeUserResourcesResponseBodyResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeUserResourcesResponseBodyResources setResourceLevel(String resourceLevel) {
            this.resourceLevel = resourceLevel;
            return this;
        }
        public String getResourceLevel() {
            return this.resourceLevel;
        }

        public DescribeUserResourcesResponseBodyResources setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribeUserResourcesResponseBodyResources setResourceSessionStatus(String resourceSessionStatus) {
            this.resourceSessionStatus = resourceSessionStatus;
            return this;
        }
        public String getResourceSessionStatus() {
            return this.resourceSessionStatus;
        }

        public DescribeUserResourcesResponseBodyResources setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public DescribeUserResourcesResponseBodyResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeUserResourcesResponseBodyResources setSessionType(String sessionType) {
            this.sessionType = sessionType;
            return this;
        }
        public String getSessionType() {
            return this.sessionType;
        }

        public DescribeUserResourcesResponseBodyResources setSessions(java.util.List<DescribeUserResourcesResponseBodyResourcesSessions> sessions) {
            this.sessions = sessions;
            return this;
        }
        public java.util.List<DescribeUserResourcesResponseBodyResourcesSessions> getSessions() {
            return this.sessions;
        }

        public DescribeUserResourcesResponseBodyResources setSubPayType(String subPayType) {
            this.subPayType = subPayType;
            return this;
        }
        public String getSubPayType() {
            return this.subPayType;
        }

        public DescribeUserResourcesResponseBodyResources setSupportHibernation(Boolean supportHibernation) {
            this.supportHibernation = supportHibernation;
            return this;
        }
        public Boolean getSupportHibernation() {
            return this.supportHibernation;
        }

        public DescribeUserResourcesResponseBodyResources setSupportedActions(java.util.List<String> supportedActions) {
            this.supportedActions = supportedActions;
            return this;
        }
        public java.util.List<String> getSupportedActions() {
            return this.supportedActions;
        }

        public DescribeUserResourcesResponseBodyResources setThemeColor(String themeColor) {
            this.themeColor = themeColor;
            return this;
        }
        public String getThemeColor() {
            return this.themeColor;
        }

        public DescribeUserResourcesResponseBodyResources setUserCustomName(String userCustomName) {
            this.userCustomName = userCustomName;
            return this;
        }
        public String getUserCustomName() {
            return this.userCustomName;
        }

        public DescribeUserResourcesResponseBodyResources setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
