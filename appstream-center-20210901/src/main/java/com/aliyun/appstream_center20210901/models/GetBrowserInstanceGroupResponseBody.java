// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetBrowserInstanceGroupResponseBody extends TeaModel {
    /**
     * <p>The browser instance group details.</p>
     */
    @NameInMap("BrowserInstanceGroupModel")
    public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel browserInstanceGroupModel;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>01A0C2ED-95F2-1A37-9FC6-4A395179****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetBrowserInstanceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBrowserInstanceGroupResponseBody self = new GetBrowserInstanceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBrowserInstanceGroupResponseBody setBrowserInstanceGroupModel(GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel browserInstanceGroupModel) {
        this.browserInstanceGroupModel = browserInstanceGroupModel;
        return this;
    }
    public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel getBrowserInstanceGroupModel() {
        return this.browserInstanceGroupModel;
    }

    public GetBrowserInstanceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelAuthorizedUserInfo extends TeaModel {
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

        public static GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelAuthorizedUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelAuthorizedUserInfo self = new GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelAuthorizedUserInfo();
            return TeaModel.build(map, self);
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelAuthorizedUserInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelAuthorizedUserInfo setTotalUserGroupCount(Integer totalUserGroupCount) {
            this.totalUserGroupCount = totalUserGroupCount;
            return this;
        }
        public Integer getTotalUserGroupCount() {
            return this.totalUserGroupCount;
        }

    }

    public static class GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfigBookmarks extends TeaModel {
        /**
         * <p>The folder where the bookmark is located.</p>
         * 
         * <strong>example:</strong>
         * <p>Work portal</p>
         */
        @NameInMap("BookmarkFolder")
        public String bookmarkFolder;

        /**
         * <p>The bookmark ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bm-12345</p>
         */
        @NameInMap("BookmarkId")
        public String bookmarkId;

        /**
         * <p>The bookmark name.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud website</p>
         */
        @NameInMap("BookmarkName")
        public String bookmarkName;

        /**
         * <p>The URL of the bookmark.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
         */
        @NameInMap("BookmarkURL")
        public String bookmarkURL;

        public static GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfigBookmarks build(java.util.Map<String, ?> map) throws Exception {
            GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfigBookmarks self = new GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfigBookmarks();
            return TeaModel.build(map, self);
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfigBookmarks setBookmarkFolder(String bookmarkFolder) {
            this.bookmarkFolder = bookmarkFolder;
            return this;
        }
        public String getBookmarkFolder() {
            return this.bookmarkFolder;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfigBookmarks setBookmarkId(String bookmarkId) {
            this.bookmarkId = bookmarkId;
            return this;
        }
        public String getBookmarkId() {
            return this.bookmarkId;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfigBookmarks setBookmarkName(String bookmarkName) {
            this.bookmarkName = bookmarkName;
            return this;
        }
        public String getBookmarkName() {
            return this.bookmarkName;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfigBookmarks setBookmarkURL(String bookmarkURL) {
            this.bookmarkURL = bookmarkURL;
            return this;
        }
        public String getBookmarkURL() {
            return this.bookmarkURL;
        }

    }

    public static class GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfig extends TeaModel {
        /**
         * <p>The list of browser bookmarks. A maximum of 20 bookmarks are returned. To query the complete list of bookmarks, call the <code>ListBrowserBookmarks</code> operation.</p>
         */
        @NameInMap("Bookmarks")
        public java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfigBookmarks> bookmarks;

        /**
         * <p>The browser startup parameters. For example, <code>--incognito</code> specifies an incognito window.</p>
         * 
         * <strong>example:</strong>
         * <p>--incognito</p>
         */
        @NameInMap("BrowserParam")
        public String browserParam;

        /**
         * <p>The cookie synchronization configuration. A value of <code>true</code> indicates that synchronization is enabled, and a value of <code>false</code> indicates that synchronization is disabled.</p>
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

        public static GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfig build(java.util.Map<String, ?> map) throws Exception {
            GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfig self = new GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfig();
            return TeaModel.build(map, self);
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfig setBookmarks(java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfigBookmarks> bookmarks) {
            this.bookmarks = bookmarks;
            return this;
        }
        public java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfigBookmarks> getBookmarks() {
            return this.bookmarks;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfig setBrowserParam(String browserParam) {
            this.browserParam = browserParam;
            return this;
        }
        public String getBrowserParam() {
            return this.browserParam;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfig setCookiesSync(String cookiesSync) {
            this.cookiesSync = cookiesSync;
            return this;
        }
        public String getCookiesSync() {
            return this.cookiesSync;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfig setHomepage(String homepage) {
            this.homepage = homepage;
            return this;
        }
        public String getHomepage() {
            return this.homepage;
        }

    }

    public static class GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelDuration extends TeaModel {
        /**
         * <p>The current payment stage of the package. This parameter is not applicable to the MAU scenario.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("CurrentPayStage")
        public String currentPayStage;

        /**
         * <p>The end time of the package cycle. This parameter is not applicable to the MAU scenario and is not returned.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("PeriodEndTime")
        public String periodEndTime;

        /**
         * <p>The start time of the package cycle. This parameter is not applicable to the MAU scenario and is not returned.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("PeriodStartTime")
        public String periodStartTime;

        /**
         * <p>The total duration of the package, in seconds. This parameter is not applicable to the MAU scenario.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("TotalDuration")
        public Integer totalDuration;

        /**
         * <p>The used duration of the package, in seconds. This parameter is not applicable to the MAU scenario.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("UsedDuration")
        public Integer usedDuration;

        public static GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelDuration build(java.util.Map<String, ?> map) throws Exception {
            GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelDuration self = new GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelDuration();
            return TeaModel.build(map, self);
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelDuration setCurrentPayStage(String currentPayStage) {
            this.currentPayStage = currentPayStage;
            return this;
        }
        public String getCurrentPayStage() {
            return this.currentPayStage;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelDuration setPeriodEndTime(String periodEndTime) {
            this.periodEndTime = periodEndTime;
            return this;
        }
        public String getPeriodEndTime() {
            return this.periodEndTime;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelDuration setPeriodStartTime(String periodStartTime) {
            this.periodStartTime = periodStartTime;
            return this;
        }
        public String getPeriodStartTime() {
            return this.periodStartTime;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelDuration setTotalDuration(Integer totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Integer getTotalDuration() {
            return this.totalDuration;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelDuration setUsedDuration(Integer usedDuration) {
            this.usedDuration = usedDuration;
            return this;
        }
        public Integer getUsedDuration() {
            return this.usedDuration;
        }

    }

    public static class GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNetworkRestrictedURLs extends TeaModel {
        /**
         * <p>The ID of the website access restriction entry.</p>
         * 
         * <strong>example:</strong>
         * <p>ru-12345</p>
         */
        @NameInMap("RestrictedURLId")
        public String restrictedURLId;

        /**
         * <p>The website URL in the access restriction entry.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun.com</p>
         */
        @NameInMap("URL")
        public String URL;

        public static GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNetworkRestrictedURLs build(java.util.Map<String, ?> map) throws Exception {
            GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNetworkRestrictedURLs self = new GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNetworkRestrictedURLs();
            return TeaModel.build(map, self);
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNetworkRestrictedURLs setRestrictedURLId(String restrictedURLId) {
            this.restrictedURLId = restrictedURLId;
            return this;
        }
        public String getRestrictedURLId() {
            return this.restrictedURLId;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNetworkRestrictedURLs setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNetwork extends TeaModel {
        /**
         * <p>The website access restriction mode.</p>
         * <ul>
         * <li><code>ALLOW_ALL</code>: allows all domain names.</li>
         * <li><code>ALLOW_LIST</code>: allows only websites in the list.</li>
         * </ul>
         * <p>The returned value reflects the current configuration of the browser instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>ALLOW_ALL</p>
         */
        @NameInMap("AccessRestriction")
        public String accessRestriction;

        /**
         * <p>The ID of the office network to which the browser instance group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-843734****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The list of website access restrictions. A maximum of 20 restrictions are returned. To query the complete list, call the <code>ListBrowserRestrictedURLs</code> operation.</p>
         */
        @NameInMap("RestrictedURLs")
        public java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNetworkRestrictedURLs> restrictedURLs;

        /**
         * <p>The list of vSwitch IDs used by the browser instance group. This parameter is available for scenarios where custom networks are configured.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        public static GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNetwork build(java.util.Map<String, ?> map) throws Exception {
            GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNetwork self = new GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNetwork();
            return TeaModel.build(map, self);
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNetwork setAccessRestriction(String accessRestriction) {
            this.accessRestriction = accessRestriction;
            return this;
        }
        public String getAccessRestriction() {
            return this.accessRestriction;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNetwork setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNetwork setRestrictedURLs(java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNetworkRestrictedURLs> restrictedURLs) {
            this.restrictedURLs = restrictedURLs;
            return this;
        }
        public java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNetworkRestrictedURLs> getRestrictedURLs() {
            return this.restrictedURLs;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNetwork setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

    }

    public static class GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNodeInstanceType extends TeaModel {
        /**
         * <p>The CPU configuration of the node. This parameter is not applicable to the MAU scenario.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <p>The memory configuration of the node. This parameter is not applicable to the MAU scenario.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Memory")
        public Integer memory;

        public static GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNodeInstanceType build(java.util.Map<String, ?> map) throws Exception {
            GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNodeInstanceType self = new GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNodeInstanceType();
            return TeaModel.build(map, self);
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNodeInstanceType setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNodeInstanceType setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

    }

    public static class GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNodePool extends TeaModel {
        /**
         * <p>The total number of nodes. This parameter is not applicable to the MAU scenario.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("NodeAmount")
        public String nodeAmount;

        /**
         * <p>The number of used nodes. This parameter is not applicable to the MAU scenario.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("NodeUsed")
        public String nodeUsed;

        public static GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNodePool build(java.util.Map<String, ?> map) throws Exception {
            GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNodePool self = new GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNodePool();
            return TeaModel.build(map, self);
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNodePool setNodeAmount(String nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }
        public String getNodeAmount() {
            return this.nodeAmount;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNodePool setNodeUsed(String nodeUsed) {
            this.nodeUsed = nodeUsed;
            return this;
        }
        public String getNodeUsed() {
            return this.nodeUsed;
        }

    }

    public static class GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyAuthorizeAccessPolicyRules extends TeaModel {
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
         * <li><code>allow</code>: allows access.</li>
         * <li><code>deny</code>: denies access.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>allow</p>
         */
        @NameInMap("Policy")
        public String policy;

        public static GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyAuthorizeAccessPolicyRules build(java.util.Map<String, ?> map) throws Exception {
            GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyAuthorizeAccessPolicyRules self = new GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyAuthorizeAccessPolicyRules();
            return TeaModel.build(map, self);
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyAuthorizeAccessPolicyRules setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyAuthorizeAccessPolicyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyAuthorizeAccessPolicyRules setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

    }

    public static class GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClientTypes extends TeaModel {
        /**
         * <p>The client type. Valid values:</p>
         * <ul>
         * <li><code>windows</code>: Windows client.</li>
         * <li><code>macos</code>: macOS client.</li>
         * <li><code>html5</code>: Web client.</li>
         * <li><code>linux</code>: Linux client.</li>
         * <li><code>android</code>: Android client.</li>
         * <li><code>ios</code>: iOS client.</li>
         * </ul>
         * <p>This field reflects the existing access configurations and does not indicate that all clients are currently available for the product.</p>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>The access policy switch for the client type. Valid values:</p>
         * <ul>
         * <li><code>on</code>: Allows access from this type of client.</li>
         * <li><code>off</code>: Denies access from this type of client.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClientTypes build(java.util.Map<String, ?> map) throws Exception {
            GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClientTypes self = new GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClientTypes();
            return TeaModel.build(map, self);
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClientTypes setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClientTypes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy extends TeaModel {
        /**
         * <p>The clipboard transfer direction. The value is case-insensitive. Valid values:</p>
         * <ul>
         * <li><code>off</code>: Disabled in both directions.</li>
         * <li><code>read</code>: Allows copy and paste from the local PC to the cloud browser.</li>
         * <li><code>write</code>: Allows copy and paste from the cloud browser to the local PC.</li>
         * <li><code>readwrite</code>: Enabled in both directions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>readwrite</p>
         */
        @NameInMap("Clipboard")
        public String clipboard;

        /**
         * <p>The clipboard size limit for inbound transfer from the local PC to the cloud browser.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("ClipboardReadLimit")
        public Integer clipboardReadLimit;

        /**
         * <p>The clipboard control granularity. Valid values:</p>
         * <ul>
         * <li><code>global</code>: Unified control.</li>
         * <li><code>grained</code>: Separate control for text, rich text, and files.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>grained</p>
         */
        @NameInMap("ClipboardScope")
        public String clipboardScope;

        /**
         * <p>The clipboard size unit. Valid values:</p>
         * <ul>
         * <li><code>B</code>: Bytes.</li>
         * <li><code>KB</code>: 1024 bytes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KB</p>
         */
        @NameInMap("ClipboardSizeUnit")
        public String clipboardSizeUnit;

        /**
         * <p>The clipboard size limit for outbound transfer from the cloud browser to the local PC.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("ClipboardWriteLimit")
        public Integer clipboardWriteLimit;

        /**
         * <p>The clipboard transfer direction. The value is case-insensitive. Valid values:</p>
         * <ul>
         * <li><code>off</code>: Disabled in both directions.</li>
         * <li><code>read</code>: Allows copy and paste from the local PC to the cloud browser.</li>
         * <li><code>write</code>: Allows copy and paste from the cloud browser to the local PC.</li>
         * <li><code>readwrite</code>: Enabled in both directions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("FileClipboard")
        public String fileClipboard;

        /**
         * <p>The clipboard transfer direction. The value is case-insensitive. Valid values:</p>
         * <ul>
         * <li><code>off</code>: Disabled in both directions.</li>
         * <li><code>read</code>: Allows copy and paste from the local PC to the cloud browser.</li>
         * <li><code>write</code>: Allows copy and paste from the cloud browser to the local PC.</li>
         * <li><code>readwrite</code>: Enabled in both directions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("RichTextClipboard")
        public String richTextClipboard;

        /**
         * <p>The clipboard size limit for rich text.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("RichTextClipboardLimit")
        public Integer richTextClipboardLimit;

        /**
         * <p>The clipboard size limit for inbound transfer from the local PC to the cloud browser.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RichTextClipboardReadLimit")
        public Integer richTextClipboardReadLimit;

        /**
         * <p>The clipboard size unit. Valid values:</p>
         * <ul>
         * <li><code>B</code>: Bytes.</li>
         * <li><code>KB</code>: 1024 bytes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KB</p>
         */
        @NameInMap("RichTextClipboardReadSizeUnit")
        public String richTextClipboardReadSizeUnit;

        /**
         * <p>The clipboard size unit. Valid values:</p>
         * <ul>
         * <li><code>B</code>: Bytes.</li>
         * <li><code>KB</code>: 1024 bytes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KB</p>
         */
        @NameInMap("RichTextClipboardSizeUnit")
        public String richTextClipboardSizeUnit;

        /**
         * <p>The clipboard size limit for outbound transfer from the cloud browser to the local PC.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RichTextClipboardWriteLimit")
        public Integer richTextClipboardWriteLimit;

        /**
         * <p>The clipboard size unit. Valid values:</p>
         * <ul>
         * <li><code>B</code>: Bytes.</li>
         * <li><code>KB</code>: 1024 bytes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KB</p>
         */
        @NameInMap("RichTextClipboardWriteSizeUnit")
        public String richTextClipboardWriteSizeUnit;

        /**
         * <p>The clipboard transfer direction. The value is case-insensitive. Valid values:</p>
         * <ul>
         * <li><code>off</code>: Disabled in both directions.</li>
         * <li><code>read</code>: Allows copy and paste from the local PC to the cloud browser.</li>
         * <li><code>write</code>: Allows copy and paste from the cloud browser to the local PC.</li>
         * <li><code>readwrite</code>: Enabled in both directions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>readwrite</p>
         */
        @NameInMap("TextClipboard")
        public String textClipboard;

        /**
         * <p>The clipboard size limit for inbound transfer from the local PC to the cloud browser.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TextClipboardReadLimit")
        public Integer textClipboardReadLimit;

        /**
         * <p>The clipboard size unit. Valid values:</p>
         * <ul>
         * <li><code>B</code>: Bytes.</li>
         * <li><code>KB</code>: 1024 bytes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KB</p>
         */
        @NameInMap("TextClipboardReadSizeUnit")
        public String textClipboardReadSizeUnit;

        /**
         * <p>The clipboard size limit for outbound transfer from the cloud browser to the local PC.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TextClipboardWriteLimit")
        public Integer textClipboardWriteLimit;

        /**
         * <p>The clipboard size unit. Valid values:</p>
         * <ul>
         * <li><code>B</code>: Bytes.</li>
         * <li><code>KB</code>: 1024 bytes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KB</p>
         */
        @NameInMap("TextClipboardWriteSizeUnit")
        public String textClipboardWriteSizeUnit;

        public static GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy self = new GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy();
            return TeaModel.build(map, self);
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy setClipboard(String clipboard) {
            this.clipboard = clipboard;
            return this;
        }
        public String getClipboard() {
            return this.clipboard;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy setClipboardReadLimit(Integer clipboardReadLimit) {
            this.clipboardReadLimit = clipboardReadLimit;
            return this;
        }
        public Integer getClipboardReadLimit() {
            return this.clipboardReadLimit;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy setClipboardScope(String clipboardScope) {
            this.clipboardScope = clipboardScope;
            return this;
        }
        public String getClipboardScope() {
            return this.clipboardScope;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy setClipboardSizeUnit(String clipboardSizeUnit) {
            this.clipboardSizeUnit = clipboardSizeUnit;
            return this;
        }
        public String getClipboardSizeUnit() {
            return this.clipboardSizeUnit;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy setClipboardWriteLimit(Integer clipboardWriteLimit) {
            this.clipboardWriteLimit = clipboardWriteLimit;
            return this;
        }
        public Integer getClipboardWriteLimit() {
            return this.clipboardWriteLimit;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy setFileClipboard(String fileClipboard) {
            this.fileClipboard = fileClipboard;
            return this;
        }
        public String getFileClipboard() {
            return this.fileClipboard;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy setRichTextClipboard(String richTextClipboard) {
            this.richTextClipboard = richTextClipboard;
            return this;
        }
        public String getRichTextClipboard() {
            return this.richTextClipboard;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy setRichTextClipboardLimit(Integer richTextClipboardLimit) {
            this.richTextClipboardLimit = richTextClipboardLimit;
            return this;
        }
        public Integer getRichTextClipboardLimit() {
            return this.richTextClipboardLimit;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy setRichTextClipboardReadLimit(Integer richTextClipboardReadLimit) {
            this.richTextClipboardReadLimit = richTextClipboardReadLimit;
            return this;
        }
        public Integer getRichTextClipboardReadLimit() {
            return this.richTextClipboardReadLimit;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy setRichTextClipboardReadSizeUnit(String richTextClipboardReadSizeUnit) {
            this.richTextClipboardReadSizeUnit = richTextClipboardReadSizeUnit;
            return this;
        }
        public String getRichTextClipboardReadSizeUnit() {
            return this.richTextClipboardReadSizeUnit;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy setRichTextClipboardSizeUnit(String richTextClipboardSizeUnit) {
            this.richTextClipboardSizeUnit = richTextClipboardSizeUnit;
            return this;
        }
        public String getRichTextClipboardSizeUnit() {
            return this.richTextClipboardSizeUnit;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy setRichTextClipboardWriteLimit(Integer richTextClipboardWriteLimit) {
            this.richTextClipboardWriteLimit = richTextClipboardWriteLimit;
            return this;
        }
        public Integer getRichTextClipboardWriteLimit() {
            return this.richTextClipboardWriteLimit;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy setRichTextClipboardWriteSizeUnit(String richTextClipboardWriteSizeUnit) {
            this.richTextClipboardWriteSizeUnit = richTextClipboardWriteSizeUnit;
            return this;
        }
        public String getRichTextClipboardWriteSizeUnit() {
            return this.richTextClipboardWriteSizeUnit;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy setTextClipboard(String textClipboard) {
            this.textClipboard = textClipboard;
            return this;
        }
        public String getTextClipboard() {
            return this.textClipboard;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy setTextClipboardReadLimit(Integer textClipboardReadLimit) {
            this.textClipboardReadLimit = textClipboardReadLimit;
            return this;
        }
        public Integer getTextClipboardReadLimit() {
            return this.textClipboardReadLimit;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy setTextClipboardReadSizeUnit(String textClipboardReadSizeUnit) {
            this.textClipboardReadSizeUnit = textClipboardReadSizeUnit;
            return this;
        }
        public String getTextClipboardReadSizeUnit() {
            return this.textClipboardReadSizeUnit;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy setTextClipboardWriteLimit(Integer textClipboardWriteLimit) {
            this.textClipboardWriteLimit = textClipboardWriteLimit;
            return this;
        }
        public Integer getTextClipboardWriteLimit() {
            return this.textClipboardWriteLimit;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy setTextClipboardWriteSizeUnit(String textClipboardWriteSizeUnit) {
            this.textClipboardWriteSizeUnit = textClipboardWriteSizeUnit;
            return this;
        }
        public String getTextClipboardWriteSizeUnit() {
            return this.textClipboardWriteSizeUnit;
        }

    }

    public static class GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyVideoPolicy extends TeaModel {
        /**
         * <p>The frame rate for browser sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("FrameRate")
        public Integer frameRate;

        public static GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyVideoPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyVideoPolicy self = new GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyVideoPolicy();
            return TeaModel.build(map, self);
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyVideoPolicy setFrameRate(Integer frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public Integer getFrameRate() {
            return this.frameRate;
        }

    }

    public static class GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyWatermarkPolicy extends TeaModel {
        /**
         * <p>Specifies whether to enable watermarks. The value is case-insensitive. Valid values:</p>
         * <ul>
         * <li>ON: Enabled.</li>
         * <li>OFF: Disabled.</li>
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
         * <li>EndUserId: User ID.</li>
         * <li>InstanceGroupId: Delivery group ID.</li>
         * <li>ClientTime: Current client time.</li>
         * </ul>
         * <p>Use watermark types that are supported by the browser and client.</p>
         */
        @NameInMap("WatermarkTypes")
        public java.util.List<String> watermarkTypes;

        public static GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyWatermarkPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyWatermarkPolicy self = new GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyWatermarkPolicy();
            return TeaModel.build(map, self);
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyWatermarkPolicy setWatermarkSwitch(String watermarkSwitch) {
            this.watermarkSwitch = watermarkSwitch;
            return this;
        }
        public String getWatermarkSwitch() {
            return this.watermarkSwitch;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyWatermarkPolicy setWatermarkTypes(java.util.List<String> watermarkTypes) {
            this.watermarkTypes = watermarkTypes;
            return this;
        }
        public java.util.List<String> getWatermarkTypes() {
            return this.watermarkTypes;
        }

    }

    public static class GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicy extends TeaModel {
        /**
         * <p>The screen capture prevention switch.</p>
         * <ul>
         * <li><code>on</code>: enables screen capture prevention.</li>
         * <li><code>off</code>: disables screen capture prevention.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AppContentProtection")
        public String appContentProtection;

        /**
         * <p>The IP address whitelist rules for client access.</p>
         */
        @NameInMap("AuthorizeAccessPolicyRules")
        public java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyAuthorizeAccessPolicyRules> authorizeAccessPolicyRules;

        /**
         * <p>The list of client access control configurations.</p>
         */
        @NameInMap("ClientTypes")
        public java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClientTypes> clientTypes;

        /**
         * <p>Sets the clipboard transfer direction, content type, and size limits. <code>read</code> indicates transfer from the local PC to the cloud browser, and <code>write</code> indicates transfer from the cloud browser to the local PC.</p>
         */
        @NameInMap("ClipboardPolicy")
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy clipboardPolicy;

        /**
         * <p>The data retention policy after disconnection. Valid values:</p>
         * <ul>
         * <li><code>customTime</code>: Retains the session for the duration specified by <code>DisconnectKeepSessionTime</code>.</li>
         * <li><code>persistent</code>: No automatic release based on disconnection duration.</li>
         * </ul>
         * <p><strong>Note:</strong> <code>persistent</code> is still subject to authorization and other release policies.</p>
         * 
         * <strong>example:</strong>
         * <p>customTime</p>
         */
        @NameInMap("DisconnectKeepSession")
        public String disconnectKeepSession;

        /**
         * <p>The returned retention duration for disconnected sessions, in seconds. This parameter is for viewing configurations only and does not indicate that the create operation supports setting this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        @NameInMap("DisconnectKeepSessionTime")
        public Integer disconnectKeepSessionTime;

        /**
         * <p>The floating ball file manager switch. Valid values:</p>
         * <ul>
         * <li><code>on</code>: Enabled.</li>
         * <li><code>off</code>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("FileManager")
        public String fileManager;

        /**
         * <p>The file transfer policy for the web client. Valid values:</p>
         * <ul>
         * <li><code>off</code>: Transfer disabled.</li>
         * <li><code>upload</code>: Upload only.</li>
         * <li><code>download</code>: Download only.</li>
         * <li><code>full</code>: Upload and download allowed.</li>
         * </ul>
         * <p>Configure this parameter in conjunction with the clipboard policy.</p>
         * 
         * <strong>example:</strong>
         * <p>full</p>
         */
        @NameInMap("Html5FileTransfer")
        public String html5FileTransfer;

        /**
         * <p>The dual-screen switch for cloud browsers.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("MultiScreen")
        public String multiScreen;

        /**
         * <p>Specifies whether to automatically disconnect sessions after a period of inactivity. The value is case-insensitive. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * <p>When enabled, use NoOperationDisconnectTime to set the idle timeout period.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("NoOperationDisconnect")
        public String noOperationDisconnect;

        /**
         * <p>The idle timeout period in seconds before a session is automatically disconnected. This feature is enabled or disabled by the NoOperationDisconnect parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("NoOperationDisconnectTime")
        public Integer noOperationDisconnectTime;

        /**
         * <p>The ID of the policy associated with the browser instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-0bf5d87epuq5****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The policy version. Valid values:</p>
         * <ul>
         * <li>DEFAULT: Legacy policy.</li>
         * <li>CENTER: Centralized policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CENTER</p>
         */
        @NameInMap("PolicyVersion")
        public String policyVersion;

        /**
         * <p>The video display policy for browser sessions.</p>
         */
        @NameInMap("VideoPolicy")
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyVideoPolicy videoPolicy;

        /**
         * <p>The watermark display configuration for browser sessions.</p>
         */
        @NameInMap("WatermarkPolicy")
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyWatermarkPolicy watermarkPolicy;

        public static GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicy self = new GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicy();
            return TeaModel.build(map, self);
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicy setAppContentProtection(String appContentProtection) {
            this.appContentProtection = appContentProtection;
            return this;
        }
        public String getAppContentProtection() {
            return this.appContentProtection;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicy setAuthorizeAccessPolicyRules(java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyAuthorizeAccessPolicyRules> authorizeAccessPolicyRules) {
            this.authorizeAccessPolicyRules = authorizeAccessPolicyRules;
            return this;
        }
        public java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyAuthorizeAccessPolicyRules> getAuthorizeAccessPolicyRules() {
            return this.authorizeAccessPolicyRules;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicy setClientTypes(java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClientTypes> clientTypes) {
            this.clientTypes = clientTypes;
            return this;
        }
        public java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClientTypes> getClientTypes() {
            return this.clientTypes;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicy setClipboardPolicy(GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy clipboardPolicy) {
            this.clipboardPolicy = clipboardPolicy;
            return this;
        }
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy getClipboardPolicy() {
            return this.clipboardPolicy;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicy setDisconnectKeepSession(String disconnectKeepSession) {
            this.disconnectKeepSession = disconnectKeepSession;
            return this;
        }
        public String getDisconnectKeepSession() {
            return this.disconnectKeepSession;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicy setDisconnectKeepSessionTime(Integer disconnectKeepSessionTime) {
            this.disconnectKeepSessionTime = disconnectKeepSessionTime;
            return this;
        }
        public Integer getDisconnectKeepSessionTime() {
            return this.disconnectKeepSessionTime;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicy setFileManager(String fileManager) {
            this.fileManager = fileManager;
            return this;
        }
        public String getFileManager() {
            return this.fileManager;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicy setHtml5FileTransfer(String html5FileTransfer) {
            this.html5FileTransfer = html5FileTransfer;
            return this;
        }
        public String getHtml5FileTransfer() {
            return this.html5FileTransfer;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicy setMultiScreen(String multiScreen) {
            this.multiScreen = multiScreen;
            return this;
        }
        public String getMultiScreen() {
            return this.multiScreen;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicy setNoOperationDisconnect(String noOperationDisconnect) {
            this.noOperationDisconnect = noOperationDisconnect;
            return this;
        }
        public String getNoOperationDisconnect() {
            return this.noOperationDisconnect;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicy setNoOperationDisconnectTime(Integer noOperationDisconnectTime) {
            this.noOperationDisconnectTime = noOperationDisconnectTime;
            return this;
        }
        public Integer getNoOperationDisconnectTime() {
            return this.noOperationDisconnectTime;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicy setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicy setPolicyVersion(String policyVersion) {
            this.policyVersion = policyVersion;
            return this;
        }
        public String getPolicyVersion() {
            return this.policyVersion;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicy setVideoPolicy(GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyVideoPolicy videoPolicy) {
            this.videoPolicy = videoPolicy;
            return this;
        }
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyVideoPolicy getVideoPolicy() {
            return this.videoPolicy;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicy setWatermarkPolicy(GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyWatermarkPolicy watermarkPolicy) {
            this.watermarkPolicy = watermarkPolicy;
            return this;
        }
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyWatermarkPolicy getWatermarkPolicy() {
            return this.watermarkPolicy;
        }

    }

    public static class GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelTimers extends TeaModel {
        /**
         * <p>The session retention period in minutes after disconnection. A value of -1 indicates that the session is not unbound due to this timeout, but is still subject to authorization and other session release policies.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The timer configuration type. A value of SESSION_TIMEOUT indicates the session retention period after disconnection.</p>
         * 
         * <strong>example:</strong>
         * <p>SESSION_TIMEOUT</p>
         */
        @NameInMap("TimerType")
        public String timerType;

        public static GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelTimers build(java.util.Map<String, ?> map) throws Exception {
            GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelTimers self = new GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelTimers();
            return TeaModel.build(map, self);
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelTimers setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelTimers setTimerType(String timerType) {
            this.timerType = timerType;
            return this;
        }
        public String getTimerType() {
            return this.timerType;
        }

    }

    public static class GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelUserLimit extends TeaModel {
        /**
         * <p>The number of user quotas.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("UserQuota")
        public Integer userQuota;

        public static GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelUserLimit build(java.util.Map<String, ?> map) throws Exception {
            GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelUserLimit self = new GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelUserLimit();
            return TeaModel.build(map, self);
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelUserLimit setUserQuota(Integer userQuota) {
            this.userQuota = userQuota;
            return this;
        }
        public Integer getUserQuota() {
            return this.userQuota;
        }

    }

    public static class GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel extends TeaModel {
        /**
         * <p>Specifies whether authorization and revocation notification emails are enabled. A value of <code>true</code> indicates that the feature is enabled, and a value of <code>false</code> indicates that the feature is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AuthNotificationEnabled")
        public Boolean authNotificationEnabled;

        /**
         * <p>The statistics of authorized users for the browser instance group.</p>
         */
        @NameInMap("AuthorizedUserInfo")
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelAuthorizedUserInfo authorizedUserInfo;

        /**
         * <p>The business region where the browser instance group is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("BizRegionId")
        public String bizRegionId;

        /**
         * <p>The current configuration of the browser.</p>
         */
        @NameInMap("BrowserConfig")
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfig browserConfig;

        /**
         * <p>The ID of the cloud browser instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>big-0c7loey7fzjq****</p>
         */
        @NameInMap("BrowserInstanceGroupId")
        public String browserInstanceGroupId;

        /**
         * <p>The name of the cloud browser instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>Office browser</p>
         */
        @NameInMap("BrowserInstanceGroupName")
        public String browserInstanceGroupName;

        /**
         * <p>The ID of the browser instance group set to which the browser instance group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>set-3jm9d0abc00example</p>
         */
        @NameInMap("BrowserInstanceGroupSetId")
        public String browserInstanceGroupSetId;

        /**
         * <p>The billing method. In the monthly active user (MAU) scenario, <code>PostPaid</code> is returned, which indicates pay-as-you-go.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The default access URL of the browser instance group. Use the actual URL returned by the API operation. Replace the resource ID in the example.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://wuying.aliyun.com/integration?appId=browser&appInstanceGroupId=big-0c7loey7fzjq">https://wuying.aliyun.com/integration?appId=browser&amp;appInstanceGroupId=big-0c7loey7fzjq</a>****</p>
         */
        @NameInMap("DefaultAccessUrl")
        public String defaultAccessUrl;

        /**
         * <p>The package duration information. This parameter is not applicable to the MAU scenario and may return an empty object.</p>
         */
        @NameInMap("Duration")
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelDuration duration;

        /**
         * <p>The expiration time of the browser instance group. This parameter is not applicable to the MAU scenario and is not returned.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The creation time of the browser instance group. The time is displayed in the RFC 3339 format <code>yyyy-MM-ddTHH:mm:ss.SSSXXX</code>, which includes milliseconds and time zone offset. In the example, <code>+00:00</code> indicates the UTC time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-21T07:00:39.000+00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The homepage URL of the browser instance group.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
         */
        @NameInMap("Homepage")
        public String homepage;

        /**
         * <p>The ID of the image used by the browser instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-070qhs8oeju4****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The instance type used by the browser instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>appstreaming.general.basic</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The maximum number of instances configured in the MAU scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxAmount")
        public Integer maxAmount;

        /**
         * <p>The office network and website access restriction configurations.</p>
         */
        @NameInMap("Network")
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNetwork network;

        /**
         * <p>The node specifications. This parameter is not applicable to the MAU scenario.</p>
         */
        @NameInMap("NodeInstanceType")
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNodeInstanceType nodeInstanceType;

        /**
         * <p>The list of node pool information. This parameter is not applicable to the MAU scenario and may return an empty list.</p>
         */
        @NameInMap("NodePool")
        public java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNodePool> nodePool;

        /**
         * <p>The operating system type of the browser instance group. Currently, Windows is used in the MAU scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The policy configuration returned for the browser instance group. The policy fields are used to view existing settings and do not indicate that all corresponding creation parameters are configurable.</p>
         */
        @NameInMap("Policy")
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicy policy;

        /**
         * <p>The status of the browser instance group. Valid values:</p>
         * <ul>
         * <li>DEPLOYING: Publishing.</li>
         * <li>PUBLISHED: Published.</li>
         * <li>FAILED: Publish failed.</li>
         * <li>EXPIRED: Expired.</li>
         * <li>CEASED: Suspended due to overdue payment.</li>
         * <li>MAINTAINING: Updating.</li>
         * <li>MAINTAIN_FAILED: Update failed.</li>
         * <li>DELETING: Deleting.</li>
         * <li>UNAVAILABLE: Unavailable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLISHED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The sub-billing type. In the MAU scenario, mau is returned, which indicates billing by monthly active users.</p>
         * 
         * <strong>example:</strong>
         * <p>mau</p>
         */
        @NameInMap("SubPayType")
        public String subPayType;

        /**
         * <p>Specifies whether mixed authorization of users and user groups is supported. A value of true indicates that it is supported, and false indicates that it is not supported. Evaluate this parameter based on the current authorization mode.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SupportUserGroupMixedAuth")
        public Boolean supportUserGroupMixedAuth;

        /**
         * <p>The version of the browser. Valid values:</p>
         * <ul>
         * <li>Basic: Basic Edition.</li>
         * <li>Pro: Premium Edition.</li>
         * </ul>
         * <p>In the MAU scenario, the value is Pro.</p>
         * 
         * <strong>example:</strong>
         * <p>Pro</p>
         */
        @NameInMap("Tier")
        public String tier;

        /**
         * <p>The session timer configurations returned in the current response. This parameter is used to view the effective settings and does not indicate that the create operation supports configuring this parameter.</p>
         */
        @NameInMap("Timers")
        public java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelTimers> timers;

        /**
         * <p>The current authorization mode. Valid values:</p>
         * <ul>
         * <li>Mixed: Mixed authorization of users and user groups.</li>
         * <li>User: User authorization.</li>
         * <li>UserGroup: User group authorization.</li>
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
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelUserLimit userLimit;

        public static GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel build(java.util.Map<String, ?> map) throws Exception {
            GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel self = new GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel();
            return TeaModel.build(map, self);
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setAuthNotificationEnabled(Boolean authNotificationEnabled) {
            this.authNotificationEnabled = authNotificationEnabled;
            return this;
        }
        public Boolean getAuthNotificationEnabled() {
            return this.authNotificationEnabled;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setAuthorizedUserInfo(GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelAuthorizedUserInfo authorizedUserInfo) {
            this.authorizedUserInfo = authorizedUserInfo;
            return this;
        }
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelAuthorizedUserInfo getAuthorizedUserInfo() {
            return this.authorizedUserInfo;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setBizRegionId(String bizRegionId) {
            this.bizRegionId = bizRegionId;
            return this;
        }
        public String getBizRegionId() {
            return this.bizRegionId;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setBrowserConfig(GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfig browserConfig) {
            this.browserConfig = browserConfig;
            return this;
        }
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfig getBrowserConfig() {
            return this.browserConfig;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setBrowserInstanceGroupId(String browserInstanceGroupId) {
            this.browserInstanceGroupId = browserInstanceGroupId;
            return this;
        }
        public String getBrowserInstanceGroupId() {
            return this.browserInstanceGroupId;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setBrowserInstanceGroupName(String browserInstanceGroupName) {
            this.browserInstanceGroupName = browserInstanceGroupName;
            return this;
        }
        public String getBrowserInstanceGroupName() {
            return this.browserInstanceGroupName;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setBrowserInstanceGroupSetId(String browserInstanceGroupSetId) {
            this.browserInstanceGroupSetId = browserInstanceGroupSetId;
            return this;
        }
        public String getBrowserInstanceGroupSetId() {
            return this.browserInstanceGroupSetId;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setDefaultAccessUrl(String defaultAccessUrl) {
            this.defaultAccessUrl = defaultAccessUrl;
            return this;
        }
        public String getDefaultAccessUrl() {
            return this.defaultAccessUrl;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setDuration(GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelDuration duration) {
            this.duration = duration;
            return this;
        }
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelDuration getDuration() {
            return this.duration;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setHomepage(String homepage) {
            this.homepage = homepage;
            return this;
        }
        public String getHomepage() {
            return this.homepage;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setMaxAmount(Integer maxAmount) {
            this.maxAmount = maxAmount;
            return this;
        }
        public Integer getMaxAmount() {
            return this.maxAmount;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setNetwork(GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNetwork network) {
            this.network = network;
            return this;
        }
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNetwork getNetwork() {
            return this.network;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setNodeInstanceType(GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNodeInstanceType nodeInstanceType) {
            this.nodeInstanceType = nodeInstanceType;
            return this;
        }
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNodeInstanceType getNodeInstanceType() {
            return this.nodeInstanceType;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setNodePool(java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNodePool> nodePool) {
            this.nodePool = nodePool;
            return this;
        }
        public java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNodePool> getNodePool() {
            return this.nodePool;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setPolicy(GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicy policy) {
            this.policy = policy;
            return this;
        }
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicy getPolicy() {
            return this.policy;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setSubPayType(String subPayType) {
            this.subPayType = subPayType;
            return this;
        }
        public String getSubPayType() {
            return this.subPayType;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setSupportUserGroupMixedAuth(Boolean supportUserGroupMixedAuth) {
            this.supportUserGroupMixedAuth = supportUserGroupMixedAuth;
            return this;
        }
        public Boolean getSupportUserGroupMixedAuth() {
            return this.supportUserGroupMixedAuth;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setTier(String tier) {
            this.tier = tier;
            return this;
        }
        public String getTier() {
            return this.tier;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setTimers(java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelTimers> timers) {
            this.timers = timers;
            return this;
        }
        public java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelTimers> getTimers() {
            return this.timers;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setUserGroupAuthMode(String userGroupAuthMode) {
            this.userGroupAuthMode = userGroupAuthMode;
            return this;
        }
        public String getUserGroupAuthMode() {
            return this.userGroupAuthMode;
        }

        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel setUserLimit(GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelUserLimit userLimit) {
            this.userLimit = userLimit;
            return this;
        }
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelUserLimit getUserLimit() {
            return this.userLimit;
        }

    }

}
