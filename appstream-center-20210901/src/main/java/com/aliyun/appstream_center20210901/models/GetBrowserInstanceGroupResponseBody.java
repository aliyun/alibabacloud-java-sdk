// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetBrowserInstanceGroupResponseBody extends TeaModel {
    /**
     * <p>The details of the browser group.</p>
     */
    @NameInMap("BrowserInstanceGroupModel")
    public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModel browserInstanceGroupModel;

    /**
     * <p>The request ID, which is used for troubleshooting.</p>
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
         * <p>The folder in which the bookmark resides.</p>
         * 
         * <strong>example:</strong>
         * <p>Work Portal</p>
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
         * <p>Alibaba Cloud Official Website</p>
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
         * <p>The list of browser bookmarks. A maximum of 20 entries are returned. To query the complete bookmark list, call <code>ListBrowserBookmarks</code>.</p>
         */
        @NameInMap("Bookmarks")
        public java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfigBookmarks> bookmarks;

        /**
         * <p>The browser startup parameters. For example, <code>--incognito</code> specifies the incognito window mode.</p>
         * 
         * <strong>example:</strong>
         * <p>--incognito</p>
         */
        @NameInMap("BrowserParam")
        public String browserParam;

        /**
         * <p>The cookie synchronization configuration. The string <code>true</code> indicates that synchronization is enabled. The string <code>false</code> indicates that synchronization is disabled.</p>
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
         * <p>The current payment stage of the plan. This field does not apply to MAU scenarios.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("CurrentPayStage")
        public String currentPayStage;

        /**
         * <p>The end time of the plan period. This field does not apply to MAU scenarios and is not returned.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("PeriodEndTime")
        public String periodEndTime;

        /**
         * <p>The start time of the plan period. This field does not apply to MAU scenarios and is not returned.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("PeriodStartTime")
        public String periodStartTime;

        /**
         * <p>The total duration of the plan, in seconds. This field does not apply to MAU scenarios.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("TotalDuration")
        public Integer totalDuration;

        /**
         * <p>The used duration of the plan, in seconds. This field does not apply to MAU scenarios.</p>
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
         * <p>The office network ID to which the browser group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-843734****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The website access restriction list. A maximum of 20 entries are returned. To query the complete list, call <code>ListBrowserRestrictedURLs</code>.</p>
         */
        @NameInMap("RestrictedURLs")
        public java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNetworkRestrictedURLs> restrictedURLs;

        /**
         * <p>The list of vSwitch IDs used by the browser group. This is available for scenarios with custom network configurations.</p>
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
         * <p>The CPU configuration of the node. This field does not apply to MAU scenarios.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <p>The memory configuration of the node. This field does not apply to MAU scenarios.</p>
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
         * <p>The total number of nodes. This field does not apply to MAU scenarios.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("NodeAmount")
        public String nodeAmount;

        /**
         * <p>The number of used nodes. This field does not apply to MAU scenarios.</p>
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
         * <p>The client source CIDR block that is allowed to access the browser group.</p>
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
         * <p>The access policy switch for the client type.</p>
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
         * <p>The clipboard transfer direction. The value is case-insensitive.</p>
         * <ul>
         * <li><code>off</code>: Bidirectional transfer is denied.</li>
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

        /**
         * <p>The clipboard size limit for inbound transfer (from the local PC to the cloud browser).</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("ClipboardReadLimit")
        public Integer clipboardReadLimit;

        /**
         * <p>The clipboard control granularity.</p>
         * <ul>
         * <li><code>global</code>: Unified control.</li>
         * <li><code>grained</code>: Separate control by text, rich text, and file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>grained</p>
         */
        @NameInMap("ClipboardScope")
        public String clipboardScope;

        /**
         * <p>The unit of the clipboard size.</p>
         * <ul>
         * <li><code>B</code>: bytes.</li>
         * <li><code>KB</code>: 1024 bytes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KB</p>
         */
        @NameInMap("ClipboardSizeUnit")
        public String clipboardSizeUnit;

        /**
         * <p>The clipboard size limit for outbound transfer (from the cloud browser to the local PC).</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("ClipboardWriteLimit")
        public Integer clipboardWriteLimit;

        /**
         * <p>The clipboard transfer direction. The value is case-insensitive.</p>
         * <ul>
         * <li><code>off</code>: Bidirectional transfer is denied.</li>
         * <li><code>read</code>: Copy and paste from the local PC to the cloud browser is allowed.</li>
         * <li><code>write</code>: Copy and paste from the cloud browser to the local PC is allowed.</li>
         * <li><code>readwrite</code>: Bidirectional transfer is allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("FileClipboard")
        public String fileClipboard;

        /**
         * <p>The clipboard transfer direction. The value is case-insensitive.</p>
         * <ul>
         * <li><code>off</code>: Bidirectional transfer is denied.</li>
         * <li><code>read</code>: Copy and paste from the local PC to the cloud browser is allowed.</li>
         * <li><code>write</code>: Copy and paste from the cloud browser to the local PC is allowed.</li>
         * <li><code>readwrite</code>: Bidirectional transfer is allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("RichTextClipboard")
        public String richTextClipboard;

        /**
         * <p>The rich text clipboard size limit.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("RichTextClipboardLimit")
        public Integer richTextClipboardLimit;

        /**
         * <p>The clipboard size limit for inbound transfer (from the local PC to the cloud browser).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RichTextClipboardReadLimit")
        public Integer richTextClipboardReadLimit;

        /**
         * <p>The unit of the clipboard size.</p>
         * <ul>
         * <li><code>B</code>: bytes.</li>
         * <li><code>KB</code>: 1024 bytes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KB</p>
         */
        @NameInMap("RichTextClipboardReadSizeUnit")
        public String richTextClipboardReadSizeUnit;

        /**
         * <p>The unit of the clipboard size.</p>
         * <ul>
         * <li><code>B</code>: bytes.</li>
         * <li><code>KB</code>: 1024 bytes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KB</p>
         */
        @NameInMap("RichTextClipboardSizeUnit")
        public String richTextClipboardSizeUnit;

        /**
         * <p>The clipboard size limit for outbound transfer (from the cloud browser to the local PC).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RichTextClipboardWriteLimit")
        public Integer richTextClipboardWriteLimit;

        /**
         * <p>The unit of the clipboard size.</p>
         * <ul>
         * <li><code>B</code>: bytes.</li>
         * <li><code>KB</code>: 1024 bytes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KB</p>
         */
        @NameInMap("RichTextClipboardWriteSizeUnit")
        public String richTextClipboardWriteSizeUnit;

        /**
         * <p>The clipboard transfer direction. The value is case-insensitive.</p>
         * <ul>
         * <li><code>off</code>: Bidirectional transfer is denied.</li>
         * <li><code>read</code>: Copy and paste from the local PC to the cloud browser is allowed.</li>
         * <li><code>write</code>: Copy and paste from the cloud browser to the local PC is allowed.</li>
         * <li><code>readwrite</code>: Bidirectional transfer is allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>readwrite</p>
         */
        @NameInMap("TextClipboard")
        public String textClipboard;

        /**
         * <p>The clipboard size limit for inbound transfer (from the local PC to the cloud browser).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TextClipboardReadLimit")
        public Integer textClipboardReadLimit;

        /**
         * <p>The unit of the clipboard size.</p>
         * <ul>
         * <li><code>B</code>: bytes.</li>
         * <li><code>KB</code>: 1024 bytes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KB</p>
         */
        @NameInMap("TextClipboardReadSizeUnit")
        public String textClipboardReadSizeUnit;

        /**
         * <p>The clipboard size limit for outbound transfer (from the cloud browser to the local PC).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TextClipboardWriteLimit")
        public Integer textClipboardWriteLimit;

        /**
         * <p>The unit of the clipboard size.</p>
         * <ul>
         * <li><code>B</code>: bytes.</li>
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
         * <p>The frame rate of browser sessions.</p>
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
         * <p>The watermark switch. The value is case-insensitive.</p>
         * <ul>
         * <li><code>ON</code>: Watermark enabled.</li>
         * <li><code>OFF</code>: Watermark disabled.</li>
         * </ul>
         * <p>When disabled, the watermark content type list is not used.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("WatermarkSwitch")
        public String watermarkSwitch;

        /**
         * <p>The list of watermark content types.</p>
         * <ul>
         * <li><code>EndUserId</code>: User ID.</li>
         * <li><code>InstanceGroupId</code>: Delivery group ID.</li>
         * <li><code>ClientTime</code>: Current time on the client.</li>
         * </ul>
         * <p>Use watermark types supported by the browser and client.</p>
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
        public java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyAuthorizeAccessPolicyRules> authorizeAccessPolicyRules;

        /**
         * <p>The list of client access control configurations.</p>
         */
        @NameInMap("ClientTypes")
        public java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClientTypes> clientTypes;

        /**
         * <p>The clipboard transfer direction, content type, and size limit settings. read indicates transfer from the local PC to the cloud browser. write indicates transfer from the cloud browser to the local PC.</p>
         */
        @NameInMap("ClipboardPolicy")
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicyClipboardPolicy clipboardPolicy;

        /**
         * <p>The data retention policy for sessions after disconnection.</p>
         * <ul>
         * <li><code>customTime</code>: The session is retained for the duration specified by <code>DisconnectKeepSessionTime</code>.</li>
         * <li><code>persistent</code>: The session is not subject to automatic release based on disconnection duration.</li>
         * </ul>
         * <p><strong>Note:</strong> The <code>persistent</code> option is still subject to authorization and other release policies.</p>
         * 
         * <strong>example:</strong>
         * <p>customTime</p>
         */
        @NameInMap("DisconnectKeepSession")
        public String disconnectKeepSession;

        /**
         * <p>The session retention duration after disconnection. Unit: seconds. This value is for viewing the configuration only and does not indicate that this parameter can be set through the create operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        @NameInMap("DisconnectKeepSessionTime")
        public Integer disconnectKeepSessionTime;

        /**
         * <p>The floating ball file manager switch.</p>
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
         * <p>The file transfer policy for the web client.</p>
         * <ul>
         * <li><code>off</code>: Transfer is denied.</li>
         * <li><code>upload</code>: Only upload is allowed.</li>
         * <li><code>download</code>: Only download is allowed.</li>
         * <li><code>full</code>: Both upload and download are allowed.</li>
         * </ul>
         * <p>Configure this parameter together with the clipboard policy.</p>
         * 
         * <strong>example:</strong>
         * <p>full</p>
         */
        @NameInMap("Html5FileTransfer")
        public String html5FileTransfer;

        /**
         * <p>The switch for automatic disconnection upon no operation. The value is case-insensitive.</p>
         * <ul>
         * <li><code>on</code>: Enabled.</li>
         * <li><code>off</code>: Disabled.</li>
         * </ul>
         * <p>When enabled, use <code>NoOperationDisconnectTime</code> to set the wait duration.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("NoOperationDisconnect")
        public String noOperationDisconnect;

        /**
         * <p>The wait duration before disconnection is triggered after no operation, in seconds. Whether this feature is enabled is indicated by <code>NoOperationDisconnect</code>.</p>
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
         * <p>The policy version.</p>
         * <ul>
         * <li><code>DEFAULT</code>: Legacy policy.</li>
         * <li><code>CENTER</code>: Centralized policy.</li>
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
         * <p>The session retention duration after disconnection, in minutes. A value of <code>-1</code> indicates that the session is not unbound due to this timeout, but is still subject to authorization and other session release policies.</p>
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
         * <p>The user quota.</p>
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
         * <p>Indicates whether authorization and deauthorization notification emails are enabled. <code>true</code> indicates that the feature is enabled. <code>false</code> indicates that the feature is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AuthNotificationEnabled")
        public Boolean authNotificationEnabled;

        /**
         * <p>The statistics of authorized users for the browser group.</p>
         */
        @NameInMap("AuthorizedUserInfo")
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelAuthorizedUserInfo authorizedUserInfo;

        /**
         * <p>The business region where the browser group resides.</p>
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
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelBrowserConfig browserConfig;

        /**
         * <p>The cloud browser group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>big-0c7loey7fzjq****</p>
         */
        @NameInMap("BrowserInstanceGroupId")
        public String browserInstanceGroupId;

        /**
         * <p>The cloud browser group name.</p>
         * 
         * <strong>example:</strong>
         * <p>Office Browser</p>
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
         * <p>The billing type. In MAU scenarios, <code>PostPaid</code> is returned, which indicates the pay-as-you-go billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The default access URL of the browser group. Use the URL returned by the API to access the browser group. Replace the resource ID in the example with your actual value.</p>
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
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelDuration duration;

        /**
         * <p>The expiration time of the browser group. This field does not apply to MAU scenarios and is not returned.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The creation time of the browser group. The value is an RFC 3339 time string in the <code>yyyy-MM-ddTHH:mm:ss.SSSXXX</code> format, which includes milliseconds and a time zone offset. The <code>+00:00</code> in the example indicates the UTC time zone.</p>
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
         * <p>The maximum number of instances configured for the MAU scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxAmount")
        public Integer maxAmount;

        /**
         * <p>The office network and website access restriction configuration.</p>
         */
        @NameInMap("Network")
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNetwork network;

        /**
         * <p>The node specifications information. This field does not apply to MAU scenarios.</p>
         */
        @NameInMap("NodeInstanceType")
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNodeInstanceType nodeInstanceType;

        /**
         * <p>The list of node pool information. In MAU scenarios, this field does not apply and an empty list may be returned.</p>
         */
        @NameInMap("NodePool")
        public java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelNodePool> nodePool;

        /**
         * <p>The operating system type of the browser group. The current MAU product scenario uses Windows.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The policy configuration returned for the browser group. The policy fields are used to view existing settings and do not indicate that all corresponding creation parameters are configurable.</p>
         */
        @NameInMap("Policy")
        public GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelPolicy policy;

        /**
         * <p>The status of the browser instance group.</p>
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
         * <p>The sub-billing type. In MAU scenarios, the actual returned value is <code>mau</code>, which indicates billing by monthly active users.</p>
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
         * <p>The version of the browser.</p>
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
         * <p>The session timer configurations currently returned. These are for viewing the effective settings and do not indicate that the creation API supports setting this parameter.</p>
         */
        @NameInMap("Timers")
        public java.util.List<GetBrowserInstanceGroupResponseBodyBrowserInstanceGroupModelTimers> timers;

        /**
         * <p>The current authorization mode.</p>
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
