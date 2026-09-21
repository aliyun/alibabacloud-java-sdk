// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListBrowserInstanceGroupResponseBody extends TeaModel {
    /**
     * <p>The list of browser groups on the current page.</p>
     */
    @NameInMap("BrowserInstanceGroupModels")
    public java.util.List<ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels> browserInstanceGroupModels;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID, which is used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>01A0C2ED-95F2-1A37-9FC6-4A395179****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of browser groups that match the filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListBrowserInstanceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBrowserInstanceGroupResponseBody self = new ListBrowserInstanceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBrowserInstanceGroupResponseBody setBrowserInstanceGroupModels(java.util.List<ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels> browserInstanceGroupModels) {
        this.browserInstanceGroupModels = browserInstanceGroupModels;
        return this;
    }
    public java.util.List<ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels> getBrowserInstanceGroupModels() {
        return this.browserInstanceGroupModels;
    }

    public ListBrowserInstanceGroupResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBrowserInstanceGroupResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBrowserInstanceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBrowserInstanceGroupResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsAuthorizedUserInfo extends TeaModel {
        /**
         * <p>The total number of authorized users.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The total number of authorized user groups.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalUserGroupCount")
        public Integer totalUserGroupCount;

        public static ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsAuthorizedUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsAuthorizedUserInfo self = new ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsAuthorizedUserInfo();
            return TeaModel.build(map, self);
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsAuthorizedUserInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsAuthorizedUserInfo setTotalUserGroupCount(Integer totalUserGroupCount) {
            this.totalUserGroupCount = totalUserGroupCount;
            return this;
        }
        public Integer getTotalUserGroupCount() {
            return this.totalUserGroupCount;
        }

    }

    public static class ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsBrowserConfig extends TeaModel {
        /**
         * <p>The browser startup parameters. For example, <code>--incognito</code> indicates an incognito window.</p>
         * 
         * <strong>example:</strong>
         * <p>--incognito</p>
         */
        @NameInMap("BrowserParam")
        public String browserParam;

        /**
         * <p>The cookie synchronization configuration. The string <code>true</code> indicates enabled. <code>false</code> indicates disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CookiesSync")
        public String cookiesSync;

        /**
         * <p>The homepage URL that opens when the browser starts.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
         */
        @NameInMap("Homepage")
        public String homepage;

        public static ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsBrowserConfig build(java.util.Map<String, ?> map) throws Exception {
            ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsBrowserConfig self = new ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsBrowserConfig();
            return TeaModel.build(map, self);
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsBrowserConfig setBrowserParam(String browserParam) {
            this.browserParam = browserParam;
            return this;
        }
        public String getBrowserParam() {
            return this.browserParam;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsBrowserConfig setCookiesSync(String cookiesSync) {
            this.cookiesSync = cookiesSync;
            return this;
        }
        public String getCookiesSync() {
            return this.cookiesSync;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsBrowserConfig setHomepage(String homepage) {
            this.homepage = homepage;
            return this;
        }
        public String getHomepage() {
            return this.homepage;
        }

    }

    public static class ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsDuration extends TeaModel {
        /**
         * <p>The current payment stage of the plan. Not applicable in MAU scenarios.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("CurrentPayStage")
        public String currentPayStage;

        /**
         * <p>The end time of the plan period. Not applicable in MAU scenarios. This field is not returned.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("PeriodEndTime")
        public String periodEndTime;

        /**
         * <p>The start time of the plan period. Not applicable in MAU scenarios. This field is not returned.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("PeriodStartTime")
        public String periodStartTime;

        /**
         * <p>The total duration of the plan, in seconds. Not applicable in MAU scenarios.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("TotalDuration")
        public Integer totalDuration;

        /**
         * <p>The used duration of the plan, in seconds. Not applicable in MAU scenarios.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("UsedDuration")
        public Integer usedDuration;

        public static ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsDuration build(java.util.Map<String, ?> map) throws Exception {
            ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsDuration self = new ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsDuration();
            return TeaModel.build(map, self);
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsDuration setCurrentPayStage(String currentPayStage) {
            this.currentPayStage = currentPayStage;
            return this;
        }
        public String getCurrentPayStage() {
            return this.currentPayStage;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsDuration setPeriodEndTime(String periodEndTime) {
            this.periodEndTime = periodEndTime;
            return this;
        }
        public String getPeriodEndTime() {
            return this.periodEndTime;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsDuration setPeriodStartTime(String periodStartTime) {
            this.periodStartTime = periodStartTime;
            return this;
        }
        public String getPeriodStartTime() {
            return this.periodStartTime;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsDuration setTotalDuration(Integer totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Integer getTotalDuration() {
            return this.totalDuration;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsDuration setUsedDuration(Integer usedDuration) {
            this.usedDuration = usedDuration;
            return this;
        }
        public Integer getUsedDuration() {
            return this.usedDuration;
        }

    }

    public static class ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsNetwork extends TeaModel {
        /**
         * <p>The website access restriction mode.</p>
         * <ul>
         * <li><code>ALLOW_ALL</code>: All domain names are allowed.</li>
         * <li><code>ALLOW_LIST</code>: Only websites in the allowlist are allowed.</li>
         * </ul>
         * <p>The returned value reflects the current configuration of the browser group.</p>
         * 
         * <strong>example:</strong>
         * <p>ALLOW_ALL</p>
         */
        @NameInMap("AccessRestriction")
        public String accessRestriction;

        /**
         * <p>The ID of the workspace to which the browser group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-843734****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The list of vSwitch IDs used by the browser group, available for scenarios with custom network configurations.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        public static ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsNetwork build(java.util.Map<String, ?> map) throws Exception {
            ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsNetwork self = new ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsNetwork();
            return TeaModel.build(map, self);
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsNetwork setAccessRestriction(String accessRestriction) {
            this.accessRestriction = accessRestriction;
            return this;
        }
        public String getAccessRestriction() {
            return this.accessRestriction;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsNetwork setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsNetwork setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

    }

    public static class ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyAuthorizeAccessPolicyRules extends TeaModel {
        /**
         * <p>The source CIDR block of the client that is allowed to access.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The description of the client access rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Office network access</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The action of the client access rule.</p>
         * <ul>
         * <li><code>allow</code>: Access is allowed.</li>
         * <li><code>deny</code>: Access is denied.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>allow</p>
         */
        @NameInMap("Policy")
        public String policy;

        public static ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyAuthorizeAccessPolicyRules build(java.util.Map<String, ?> map) throws Exception {
            ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyAuthorizeAccessPolicyRules self = new ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyAuthorizeAccessPolicyRules();
            return TeaModel.build(map, self);
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyAuthorizeAccessPolicyRules setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyAuthorizeAccessPolicyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyAuthorizeAccessPolicyRules setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

    }

    public static class ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyClientTypes extends TeaModel {
        /**
         * <p>The client type.</p>
         * <ul>
         * <li><code>windows</code>: Windows client.</li>
         * <li><code>macos</code>: macOS client.</li>
         * <li><code>html5</code>: Web client.</li>
         * <li><code>linux</code>: Linux client.</li>
         * <li><code>android</code>: Android client.</li>
         * <li><code>ios</code>: iOS client.</li>
         * </ul>
         * <p>This field reflects the existing access configuration and does not indicate that all client types are available for the current product.</p>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>The access policy switch for this client type.</p>
         * <ul>
         * <li><code>on</code>: Access from this client type is allowed.</li>
         * <li><code>off</code>: Access from this client type is denied.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyClientTypes build(java.util.Map<String, ?> map) throws Exception {
            ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyClientTypes self = new ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyClientTypes();
            return TeaModel.build(map, self);
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyClientTypes setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyClientTypes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyClipboardPolicy extends TeaModel {
        /**
         * <p>The clipboard transfer direction. The value is case-insensitive.</p>
         * <ul>
         * <li><code>off</code>: Bidirectional transfer is disabled.</li>
         * <li><code>read</code>: Copy and paste from the local PC to the cloud browser is allowed.</li>
         * <li><code>write</code>: Copy and paste from the cloud browser to the local PC is allowed.</li>
         * <li><code>readwrite</code>: Bidirectional transfer is allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>readwrite</p>
         */
        @NameInMap("Clipboard")
        public String clipboard;

        public static ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyClipboardPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyClipboardPolicy self = new ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyClipboardPolicy();
            return TeaModel.build(map, self);
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyClipboardPolicy setClipboard(String clipboard) {
            this.clipboard = clipboard;
            return this;
        }
        public String getClipboard() {
            return this.clipboard;
        }

    }

    public static class ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyVideoPolicy extends TeaModel {
        /**
         * <p>The frame rate of browser sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("FrameRate")
        public Integer frameRate;

        public static ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyVideoPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyVideoPolicy self = new ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyVideoPolicy();
            return TeaModel.build(map, self);
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyVideoPolicy setFrameRate(Integer frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public Integer getFrameRate() {
            return this.frameRate;
        }

    }

    public static class ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyWatermarkPolicy extends TeaModel {
        /**
         * <p>The watermark switch. The value is case-insensitive. Valid values:</p>
         * <ul>
         * <li><code>ON</code>: Watermark is enabled.</li>
         * <li><code>OFF</code>: Watermark is disabled.</li>
         * </ul>
         * <p>When disabled, the watermark content type list is not used.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("WatermarkSwitch")
        public String watermarkSwitch;

        /**
         * <p>The list of watermark content types. Valid values:</p>
         * <ul>
         * <li><code>EndUserId</code>: The user identifier.</li>
         * <li><code>InstanceGroupId</code>: The delivery group identifier.</li>
         * <li><code>ClientTime</code>: The current time on the client.</li>
         * </ul>
         * <p>Use watermark types that are supported by the browser and client.</p>
         */
        @NameInMap("WatermarkTypes")
        public java.util.List<String> watermarkTypes;

        public static ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyWatermarkPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyWatermarkPolicy self = new ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyWatermarkPolicy();
            return TeaModel.build(map, self);
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyWatermarkPolicy setWatermarkSwitch(String watermarkSwitch) {
            this.watermarkSwitch = watermarkSwitch;
            return this;
        }
        public String getWatermarkSwitch() {
            return this.watermarkSwitch;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyWatermarkPolicy setWatermarkTypes(java.util.List<String> watermarkTypes) {
            this.watermarkTypes = watermarkTypes;
            return this;
        }
        public java.util.List<String> getWatermarkTypes() {
            return this.watermarkTypes;
        }

    }

    public static class ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicy extends TeaModel {
        /**
         * <p>The screenshot protection switch.</p>
         * <ul>
         * <li><code>on</code>: Screenshot protection is enabled.</li>
         * <li><code>off</code>: Screenshot protection is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AppContentProtection")
        public String appContentProtection;

        /**
         * <p>The client access IP address whitelist rules.</p>
         */
        @NameInMap("AuthorizeAccessPolicyRules")
        public java.util.List<ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyAuthorizeAccessPolicyRules> authorizeAccessPolicyRules;

        /**
         * <p>The client access control configuration list.</p>
         */
        @NameInMap("ClientTypes")
        public java.util.List<ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyClientTypes> clientTypes;

        /**
         * <p>The clipboard transfer direction, content type, and size limit settings. read indicates transfer from the local PC to the cloud browser. write indicates transfer from the cloud browser to the local PC.</p>
         */
        @NameInMap("ClipboardPolicy")
        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyClipboardPolicy clipboardPolicy;

        /**
         * <p>The video display policy for browser sessions.</p>
         */
        @NameInMap("VideoPolicy")
        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyVideoPolicy videoPolicy;

        /**
         * <p>The watermark display configuration for browser sessions.</p>
         */
        @NameInMap("WatermarkPolicy")
        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyWatermarkPolicy watermarkPolicy;

        public static ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicy self = new ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicy();
            return TeaModel.build(map, self);
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicy setAppContentProtection(String appContentProtection) {
            this.appContentProtection = appContentProtection;
            return this;
        }
        public String getAppContentProtection() {
            return this.appContentProtection;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicy setAuthorizeAccessPolicyRules(java.util.List<ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyAuthorizeAccessPolicyRules> authorizeAccessPolicyRules) {
            this.authorizeAccessPolicyRules = authorizeAccessPolicyRules;
            return this;
        }
        public java.util.List<ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyAuthorizeAccessPolicyRules> getAuthorizeAccessPolicyRules() {
            return this.authorizeAccessPolicyRules;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicy setClientTypes(java.util.List<ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyClientTypes> clientTypes) {
            this.clientTypes = clientTypes;
            return this;
        }
        public java.util.List<ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyClientTypes> getClientTypes() {
            return this.clientTypes;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicy setClipboardPolicy(ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyClipboardPolicy clipboardPolicy) {
            this.clipboardPolicy = clipboardPolicy;
            return this;
        }
        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyClipboardPolicy getClipboardPolicy() {
            return this.clipboardPolicy;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicy setVideoPolicy(ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyVideoPolicy videoPolicy) {
            this.videoPolicy = videoPolicy;
            return this;
        }
        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyVideoPolicy getVideoPolicy() {
            return this.videoPolicy;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicy setWatermarkPolicy(ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyWatermarkPolicy watermarkPolicy) {
            this.watermarkPolicy = watermarkPolicy;
            return this;
        }
        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicyWatermarkPolicy getWatermarkPolicy() {
            return this.watermarkPolicy;
        }

    }

    public static class ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>usage</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>office</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsTags build(java.util.Map<String, ?> map) throws Exception {
            ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsTags self = new ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsTags();
            return TeaModel.build(map, self);
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsTimers extends TeaModel {
        /**
         * <p>The session retention duration after disconnection, in minutes. <code>-1</code> indicates that the session is not unbound due to this timeout. The session is still subject to authorization and other session release policies.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The timer configuration type. <code>SESSION_TIMEOUT</code> indicates the session retention duration after disconnection.</p>
         * 
         * <strong>example:</strong>
         * <p>SESSION_TIMEOUT</p>
         */
        @NameInMap("TimerType")
        public String timerType;

        public static ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsTimers build(java.util.Map<String, ?> map) throws Exception {
            ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsTimers self = new ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsTimers();
            return TeaModel.build(map, self);
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsTimers setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsTimers setTimerType(String timerType) {
            this.timerType = timerType;
            return this;
        }
        public String getTimerType() {
            return this.timerType;
        }

    }

    public static class ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsUserLimit extends TeaModel {
        /**
         * <p>The user quota.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("UserQuota")
        public Integer userQuota;

        public static ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsUserLimit build(java.util.Map<String, ?> map) throws Exception {
            ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsUserLimit self = new ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsUserLimit();
            return TeaModel.build(map, self);
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsUserLimit setUserQuota(Integer userQuota) {
            this.userQuota = userQuota;
            return this;
        }
        public Integer getUserQuota() {
            return this.userQuota;
        }

    }

    public static class ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels extends TeaModel {
        /**
         * <p>Indicates whether authorization and deauthorization notification emails are enabled. <code>true</code> indicates enabled. <code>false</code> indicates disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AuthNotificationEnabled")
        public Boolean authNotificationEnabled;

        /**
         * <p>The authorized user statistics of the browser group.</p>
         */
        @NameInMap("AuthorizedUserInfo")
        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsAuthorizedUserInfo authorizedUserInfo;

        /**
         * <p>The business region where the browser group is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("BizRegionId")
        public String bizRegionId;

        /**
         * <p>The current browser configuration.</p>
         */
        @NameInMap("BrowserConfig")
        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsBrowserConfig browserConfig;

        /**
         * <p>The ID of the cloud browser group.</p>
         * 
         * <strong>example:</strong>
         * <p>big-0c7loey7fzjq****</p>
         */
        @NameInMap("BrowserInstanceGroupId")
        public String browserInstanceGroupId;

        /**
         * <p>The name of the cloud browser group.</p>
         * 
         * <strong>example:</strong>
         * <p>OfficeBrowser</p>
         */
        @NameInMap("BrowserInstanceGroupName")
        public String browserInstanceGroupName;

        /**
         * <p>The ID of the browser group set to which the browser group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>set-3jm9d0abc00example</p>
         */
        @NameInMap("BrowserInstanceGroupSetId")
        public String browserInstanceGroupSetId;

        /**
         * <p>The billing type. In MAU scenarios, <code>PostPaid</code> is returned, which indicates pay-as-you-go.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The default access URL of the browser group. Use the URL returned by the API for access. The resource identifiers in the example must be replaced.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://wuying.aliyun.com/integration?appId=browser&appInstanceGroupId=big-0c7loey7fzjq">https://wuying.aliyun.com/integration?appId=browser&amp;appInstanceGroupId=big-0c7loey7fzjq</a>****</p>
         */
        @NameInMap("DefaultAccessUrl")
        public String defaultAccessUrl;

        /**
         * <p>The plan duration information. In MAU scenarios, plan duration does not apply, and an empty object may be returned.</p>
         */
        @NameInMap("Duration")
        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsDuration duration;

        /**
         * <p>The expiration time of the browser group. Not applicable in MAU scenarios. This field is not returned.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The creation time of the browser group.</p>
         * <p>The time is in RFC 3339 format: <code>yyyy-MM-dd\\&quot;T\\&quot;HH:mm:ss.SSSXXX</code>, which includes milliseconds and a time zone offset. The actual POP response uses the UTC offset <code>+00:00</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-21T07:00:39.000+00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The homepage URL of the browser group.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
         */
        @NameInMap("Homepage")
        public String homepage;

        /**
         * <p>The image ID used by the browser group.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-070qhs8oeju4****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The instance type used by the browser group.</p>
         * 
         * <strong>example:</strong>
         * <p>appstreaming.general.basic</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The workspace network and website access restriction configuration.</p>
         */
        @NameInMap("Network")
        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsNetwork network;

        /**
         * <p>The operating system type of the browser group. The current MAU product scenario uses Windows.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The policy configuration returned for the browser group. Policy fields are used to view existing settings and do not indicate that all corresponding creation parameters are configurable.</p>
         */
        @NameInMap("Policy")
        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicy policy;

        /**
         * <p>The browser group status.</p>
         * <ul>
         * <li><code>DEPLOYING</code>: Being deployed.</li>
         * <li><code>PUBLISHED</code>: Deployed.</li>
         * <li><code>FAILED</code>: Deployment failed.</li>
         * <li><code>EXPIRED</code>: Expired.</li>
         * <li><code>CEASED</code>: Suspended due to overdue payment.</li>
         * <li><code>MAINTAINING</code>: Being updated.</li>
         * <li><code>MAINTAIN_FAILED</code>: Update failed.</li>
         * <li><code>DELETING</code>: Being deleted.</li>
         * <li><code>UNAVAILABLE</code>: Unavailable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLISHED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The sub-payment type. In MAU scenarios, the actual returned value is <code>mau</code>, which indicates billing by monthly active users.</p>
         * 
         * <strong>example:</strong>
         * <p>mau</p>
         */
        @NameInMap("SubPayType")
        public String subPayType;

        /**
         * <p>Indicates whether mixed authorization of users and user groups is supported. <code>true</code> indicates supported, and <code>false</code> indicates not supported. Evaluate this value based on the current authorization mode.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SupportUserGroupMixedAuth")
        public Boolean supportUserGroupMixedAuth;

        /**
         * <p>The list of resource tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsTags> tags;

        /**
         * <p>The version of the browser. Valid values:</p>
         * <ul>
         * <li><code>Basic</code>: Basic Edition.</li>
         * <li><code>Pro</code>: Premium Edition.</li>
         * </ul>
         * <p>In MAU scenarios, the value is <code>Pro</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Pro</p>
         */
        @NameInMap("Tier")
        public String tier;

        /**
         * <p>The session timer configurations currently returned. This is used to view the effective settings and does not indicate that the create operation supports setting this parameter.</p>
         */
        @NameInMap("Timers")
        public java.util.List<ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsTimers> timers;

        /**
         * <p>The current authorization mode. Valid values:</p>
         * <ul>
         * <li><code>Mixed</code>: Mixed authorization of users and user groups.</li>
         * <li><code>User</code>: User authorization.</li>
         * <li><code>UserGroup</code>: User group authorization.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Mixed</p>
         */
        @NameInMap("UserGroupAuthMode")
        public String userGroupAuthMode;

        /**
         * <p>The user quota information.</p>
         */
        @NameInMap("UserLimit")
        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsUserLimit userLimit;

        public static ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels build(java.util.Map<String, ?> map) throws Exception {
            ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels self = new ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels();
            return TeaModel.build(map, self);
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setAuthNotificationEnabled(Boolean authNotificationEnabled) {
            this.authNotificationEnabled = authNotificationEnabled;
            return this;
        }
        public Boolean getAuthNotificationEnabled() {
            return this.authNotificationEnabled;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setAuthorizedUserInfo(ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsAuthorizedUserInfo authorizedUserInfo) {
            this.authorizedUserInfo = authorizedUserInfo;
            return this;
        }
        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsAuthorizedUserInfo getAuthorizedUserInfo() {
            return this.authorizedUserInfo;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setBizRegionId(String bizRegionId) {
            this.bizRegionId = bizRegionId;
            return this;
        }
        public String getBizRegionId() {
            return this.bizRegionId;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setBrowserConfig(ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsBrowserConfig browserConfig) {
            this.browserConfig = browserConfig;
            return this;
        }
        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsBrowserConfig getBrowserConfig() {
            return this.browserConfig;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setBrowserInstanceGroupId(String browserInstanceGroupId) {
            this.browserInstanceGroupId = browserInstanceGroupId;
            return this;
        }
        public String getBrowserInstanceGroupId() {
            return this.browserInstanceGroupId;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setBrowserInstanceGroupName(String browserInstanceGroupName) {
            this.browserInstanceGroupName = browserInstanceGroupName;
            return this;
        }
        public String getBrowserInstanceGroupName() {
            return this.browserInstanceGroupName;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setBrowserInstanceGroupSetId(String browserInstanceGroupSetId) {
            this.browserInstanceGroupSetId = browserInstanceGroupSetId;
            return this;
        }
        public String getBrowserInstanceGroupSetId() {
            return this.browserInstanceGroupSetId;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setDefaultAccessUrl(String defaultAccessUrl) {
            this.defaultAccessUrl = defaultAccessUrl;
            return this;
        }
        public String getDefaultAccessUrl() {
            return this.defaultAccessUrl;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setDuration(ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsDuration duration) {
            this.duration = duration;
            return this;
        }
        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsDuration getDuration() {
            return this.duration;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setHomepage(String homepage) {
            this.homepage = homepage;
            return this;
        }
        public String getHomepage() {
            return this.homepage;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setNetwork(ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsNetwork network) {
            this.network = network;
            return this;
        }
        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsNetwork getNetwork() {
            return this.network;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setPolicy(ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicy policy) {
            this.policy = policy;
            return this;
        }
        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsPolicy getPolicy() {
            return this.policy;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setSubPayType(String subPayType) {
            this.subPayType = subPayType;
            return this;
        }
        public String getSubPayType() {
            return this.subPayType;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setSupportUserGroupMixedAuth(Boolean supportUserGroupMixedAuth) {
            this.supportUserGroupMixedAuth = supportUserGroupMixedAuth;
            return this;
        }
        public Boolean getSupportUserGroupMixedAuth() {
            return this.supportUserGroupMixedAuth;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setTags(java.util.List<ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsTags> getTags() {
            return this.tags;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setTier(String tier) {
            this.tier = tier;
            return this;
        }
        public String getTier() {
            return this.tier;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setTimers(java.util.List<ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsTimers> timers) {
            this.timers = timers;
            return this;
        }
        public java.util.List<ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsTimers> getTimers() {
            return this.timers;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setUserGroupAuthMode(String userGroupAuthMode) {
            this.userGroupAuthMode = userGroupAuthMode;
            return this;
        }
        public String getUserGroupAuthMode() {
            return this.userGroupAuthMode;
        }

        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModels setUserLimit(ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsUserLimit userLimit) {
            this.userLimit = userLimit;
            return this;
        }
        public ListBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelsUserLimit getUserLimit() {
            return this.userLimit;
        }

    }

}
