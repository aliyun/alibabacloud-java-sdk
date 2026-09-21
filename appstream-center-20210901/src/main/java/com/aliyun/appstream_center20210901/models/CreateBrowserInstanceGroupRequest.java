// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateBrowserInstanceGroupRequest extends TeaModel {
    /**
     * <p>The plan identifier.</p>
     * <p>Do not specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AppPackageType")
    public String appPackageType;

    /**
     * <p>Specifies whether to send authorization and deauthorization notification emails.</p>
     * <ul>
     * <li><code>true</code>: Sends the notification.</li>
     * <li><code>false</code>: Does not send the notification.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AuthNotificationEnabled")
    public Boolean authNotificationEnabled;

    /**
     * <p>The automatic payment parameter.</p>
     * <p>Do not specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The auto-renewal parameter.</p>
     * <p>Do not specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The business region ID. This parameter is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The browser configuration.</p>
     */
    @NameInMap("BrowserConfig")
    public CreateBrowserInstanceGroupRequestBrowserConfig browserConfig;

    /**
     * <p>The resource billing mode.</p>
     * <p><strong>For MAU scenarios:</strong> Set this parameter to <code>AppInstance</code> to bill by instance resource.</p>
     * 
     * <strong>example:</strong>
     * <p>AppInstance</p>
     */
    @NameInMap("ChargeResourceMode")
    public String chargeResourceMode;

    /**
     * <p>The billing type.</p>
     * <p><strong>For MAU scenarios:</strong> Set this parameter to <code>PostPaid</code>, which indicates pay-as-you-go billing.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The name of the cloud browser group. This parameter cannot be empty. The name is used to distinguish different browser groups in business management scenarios.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BusinessOfficeBrowser</p>
     */
    @NameInMap("CloudBrowserName")
    public String cloudBrowserName;

    /**
     * <p>The image identifier used by the cloud browser. The image must be compatible with the operating system.</p>
     * <p>If this parameter is omitted, the default image available for the account is used. If no default image is available, the creation may fail.</p>
     * <p><strong>Usage condition:</strong> When <code>CookiesSync</code> is enabled, explicitly specify an image that supports cookie synchronization.</p>
     * 
     * <strong>example:</strong>
     * <p>img-bp13mu****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The instance type identifier. Select an instance type that matches the target region, operating system, and inventory conditions.</p>
     * <p>If this parameter is omitted, the default instance type is used.</p>
     * 
     * <strong>example:</strong>
     * <p>appstreaming.general.basic</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The capacity configuration for the MAU billing scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxAmount")
    public Integer maxAmount;

    /**
     * <p>The office network and website access restriction configurations. The selected office network must belong to the current account and be located in the region specified by <code>BizRegionId</code>.</p>
     */
    @NameInMap("Network")
    public CreateBrowserInstanceGroupRequestNetwork network;

    /**
     * <p>The node pool configuration.</p>
     * <p>You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("NodePool")
    public CreateBrowserInstanceGroupRequestNodePool nodePool;

    /**
     * <p>The operating system type. This parameter is required.</p>
     * <p>Only <code>Windows</code> is supported. Other operating systems are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("OsType")
    public String osType;

    /**
     * <p>The number of subscription periods.</p>
     * <p>Do not specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription period.</p>
     * <p>Do not specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The clipboard, video, watermark, session, and client access policy configurations.</p>
     */
    @NameInMap("Policy")
    public CreateBrowserInstanceGroupRequestPolicy policy;

    /**
     * <p>The promotion ID. Specifies the promotional campaign to apply to the order.</p>
     * <p>Whether the promotion is applicable depends on the campaign rules. Do not specify this parameter if no promotional campaign is used.</p>
     * 
     * <strong>example:</strong>
     * <p>17440009****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The connection security policy for the browser group.</p>
     */
    @NameInMap("SecurityPolicy")
    public CreateBrowserInstanceGroupRequestSecurityPolicy securityPolicy;

    /**
     * <p>The user data storage configuration for the browser group.</p>
     */
    @NameInMap("StoragePolicy")
    public CreateBrowserInstanceGroupRequestStoragePolicy storagePolicy;

    /**
     * <p>The billing subtype.</p>
     * <p><strong>Set this parameter to <code>mau</code> explicitly, which indicates billing by monthly active users.</strong> Omitting this field does not enable MAU billing.</p>
     * 
     * <strong>example:</strong>
     * <p>mau</p>
     */
    @NameInMap("SubPayType")
    public String subPayType;

    /**
     * <p>Not supported. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Tag")
    public java.util.List<CreateBrowserInstanceGroupRequestTag> tag;

    /**
     * <p>Not supported. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Timers")
    public java.util.List<CreateBrowserInstanceGroupRequestTimers> timers;

    /**
     * <p>The list of authorized user group identifiers. A maximum of 10 items are supported. The user groups must belong to the current account and match the workspace network account type.</p>
     * <p><strong>Limit:</strong> Cannot be specified together with a non-empty <code>Users</code>.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The authorized user account information. The value must match the user and workspace network type.</p>
     */
    @NameInMap("UserInfo")
    public CreateBrowserInstanceGroupRequestUserInfo userInfo;

    /**
     * <p>The list of authorized users. A maximum of 200 users can be specified. Users must be created in advance and must match the account type.</p>
     * <p><strong>Restriction:</strong> This parameter cannot be specified together with a non-empty <code>UserGroupIds</code>.</p>
     */
    @NameInMap("Users")
    public java.util.List<CreateBrowserInstanceGroupRequestUsers> users;

    public static CreateBrowserInstanceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBrowserInstanceGroupRequest self = new CreateBrowserInstanceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateBrowserInstanceGroupRequest setAppPackageType(String appPackageType) {
        this.appPackageType = appPackageType;
        return this;
    }
    public String getAppPackageType() {
        return this.appPackageType;
    }

    public CreateBrowserInstanceGroupRequest setAuthNotificationEnabled(Boolean authNotificationEnabled) {
        this.authNotificationEnabled = authNotificationEnabled;
        return this;
    }
    public Boolean getAuthNotificationEnabled() {
        return this.authNotificationEnabled;
    }

    public CreateBrowserInstanceGroupRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateBrowserInstanceGroupRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateBrowserInstanceGroupRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public CreateBrowserInstanceGroupRequest setBrowserConfig(CreateBrowserInstanceGroupRequestBrowserConfig browserConfig) {
        this.browserConfig = browserConfig;
        return this;
    }
    public CreateBrowserInstanceGroupRequestBrowserConfig getBrowserConfig() {
        return this.browserConfig;
    }

    public CreateBrowserInstanceGroupRequest setChargeResourceMode(String chargeResourceMode) {
        this.chargeResourceMode = chargeResourceMode;
        return this;
    }
    public String getChargeResourceMode() {
        return this.chargeResourceMode;
    }

    public CreateBrowserInstanceGroupRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateBrowserInstanceGroupRequest setCloudBrowserName(String cloudBrowserName) {
        this.cloudBrowserName = cloudBrowserName;
        return this;
    }
    public String getCloudBrowserName() {
        return this.cloudBrowserName;
    }

    public CreateBrowserInstanceGroupRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateBrowserInstanceGroupRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateBrowserInstanceGroupRequest setMaxAmount(Integer maxAmount) {
        this.maxAmount = maxAmount;
        return this;
    }
    public Integer getMaxAmount() {
        return this.maxAmount;
    }

    public CreateBrowserInstanceGroupRequest setNetwork(CreateBrowserInstanceGroupRequestNetwork network) {
        this.network = network;
        return this;
    }
    public CreateBrowserInstanceGroupRequestNetwork getNetwork() {
        return this.network;
    }

    public CreateBrowserInstanceGroupRequest setNodePool(CreateBrowserInstanceGroupRequestNodePool nodePool) {
        this.nodePool = nodePool;
        return this;
    }
    public CreateBrowserInstanceGroupRequestNodePool getNodePool() {
        return this.nodePool;
    }

    public CreateBrowserInstanceGroupRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public CreateBrowserInstanceGroupRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateBrowserInstanceGroupRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateBrowserInstanceGroupRequest setPolicy(CreateBrowserInstanceGroupRequestPolicy policy) {
        this.policy = policy;
        return this;
    }
    public CreateBrowserInstanceGroupRequestPolicy getPolicy() {
        return this.policy;
    }

    public CreateBrowserInstanceGroupRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public CreateBrowserInstanceGroupRequest setSecurityPolicy(CreateBrowserInstanceGroupRequestSecurityPolicy securityPolicy) {
        this.securityPolicy = securityPolicy;
        return this;
    }
    public CreateBrowserInstanceGroupRequestSecurityPolicy getSecurityPolicy() {
        return this.securityPolicy;
    }

    public CreateBrowserInstanceGroupRequest setStoragePolicy(CreateBrowserInstanceGroupRequestStoragePolicy storagePolicy) {
        this.storagePolicy = storagePolicy;
        return this;
    }
    public CreateBrowserInstanceGroupRequestStoragePolicy getStoragePolicy() {
        return this.storagePolicy;
    }

    public CreateBrowserInstanceGroupRequest setSubPayType(String subPayType) {
        this.subPayType = subPayType;
        return this;
    }
    public String getSubPayType() {
        return this.subPayType;
    }

    public CreateBrowserInstanceGroupRequest setTag(java.util.List<CreateBrowserInstanceGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateBrowserInstanceGroupRequestTag> getTag() {
        return this.tag;
    }

    public CreateBrowserInstanceGroupRequest setTimers(java.util.List<CreateBrowserInstanceGroupRequestTimers> timers) {
        this.timers = timers;
        return this;
    }
    public java.util.List<CreateBrowserInstanceGroupRequestTimers> getTimers() {
        return this.timers;
    }

    public CreateBrowserInstanceGroupRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public CreateBrowserInstanceGroupRequest setUserInfo(CreateBrowserInstanceGroupRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public CreateBrowserInstanceGroupRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public CreateBrowserInstanceGroupRequest setUsers(java.util.List<CreateBrowserInstanceGroupRequestUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<CreateBrowserInstanceGroupRequestUsers> getUsers() {
        return this.users;
    }

    public static class CreateBrowserInstanceGroupRequestBrowserConfigBookmarks extends TeaModel {
        /**
         * <p>The folder in which the bookmark is located. The length after trimming leading and trailing whitespace cannot exceed 64 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Work Portal</p>
         */
        @NameInMap("BookmarkFolder")
        public String bookmarkFolder;

        /**
         * <p>The bookmark name. This parameter is required and cannot be empty when you create a bookmark. The length after trimming leading and trailing whitespace cannot exceed 64 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud Official Website</p>
         */
        @NameInMap("BookmarkName")
        public String bookmarkName;

        /**
         * <p>The URL of the bookmark. This parameter is required when you create a bookmark. The length after trimming leading and trailing whitespace cannot exceed 1024 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
         */
        @NameInMap("BookmarkURL")
        public String bookmarkURL;

        public static CreateBrowserInstanceGroupRequestBrowserConfigBookmarks build(java.util.Map<String, ?> map) throws Exception {
            CreateBrowserInstanceGroupRequestBrowserConfigBookmarks self = new CreateBrowserInstanceGroupRequestBrowserConfigBookmarks();
            return TeaModel.build(map, self);
        }

        public CreateBrowserInstanceGroupRequestBrowserConfigBookmarks setBookmarkFolder(String bookmarkFolder) {
            this.bookmarkFolder = bookmarkFolder;
            return this;
        }
        public String getBookmarkFolder() {
            return this.bookmarkFolder;
        }

        public CreateBrowserInstanceGroupRequestBrowserConfigBookmarks setBookmarkName(String bookmarkName) {
            this.bookmarkName = bookmarkName;
            return this;
        }
        public String getBookmarkName() {
            return this.bookmarkName;
        }

        public CreateBrowserInstanceGroupRequestBrowserConfigBookmarks setBookmarkURL(String bookmarkURL) {
            this.bookmarkURL = bookmarkURL;
            return this;
        }
        public String getBookmarkURL() {
            return this.bookmarkURL;
        }

    }

    public static class CreateBrowserInstanceGroupRequestBrowserConfig extends TeaModel {
        /**
         * <p>The list of browser bookmarks.</p>
         * <p><strong>Limit:</strong> Cannot be specified together with a non-empty <code>BookmarksFilePath</code>. Bookmark URLs must be unique.</p>
         */
        @NameInMap("Bookmarks")
        public java.util.List<CreateBrowserInstanceGroupRequestBrowserConfigBookmarks> bookmarks;

        /**
         * <p>The path of the uploaded bookmark file. Cannot be specified together with a non-empty <code>Bookmarks</code>.</p>
         * <p><strong>File format:</strong> A headerless CSV file with four columns in the following order:</p>
         * <ol>
         * <li>Bookmark name.</li>
         * <li>URL.</li>
         * <li>Folder.</li>
         * <li>Root directory type: <code>bookmark_bar</code> indicates the bookmarks bar, and <code>other</code> indicates other bookmarks.</li>
         * </ol>
         * <p><strong>Limits:</strong></p>
         * <ul>
         * <li>Fields are separated by commas. Field values cannot contain commas or line breaks. Quote escaping is not supported.</li>
         * <li>The file path must belong to the upload directory specified for the current account and cannot contain <code>..</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou/aig_upm/xxx/temp/BrowserBookmarks/浏览器书签模版.csv</p>
         */
        @NameInMap("BookmarksFilePath")
        public String bookmarksFilePath;

        /**
         * <p>The browser startup parameters. For example, --incognito opens the browser in incognito mode.</p>
         * 
         * <strong>example:</strong>
         * <p>--incognito</p>
         */
        @NameInMap("BrowserParam")
        public String browserParam;

        /**
         * <p>Specifies whether to synchronize cookies.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CookiesSync")
        public Boolean cookiesSync;

        /**
         * <p>The homepage URL that opens when the browser starts. The value must conform to URI syntax.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
         */
        @NameInMap("Homepage")
        public String homepage;

        public static CreateBrowserInstanceGroupRequestBrowserConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateBrowserInstanceGroupRequestBrowserConfig self = new CreateBrowserInstanceGroupRequestBrowserConfig();
            return TeaModel.build(map, self);
        }

        public CreateBrowserInstanceGroupRequestBrowserConfig setBookmarks(java.util.List<CreateBrowserInstanceGroupRequestBrowserConfigBookmarks> bookmarks) {
            this.bookmarks = bookmarks;
            return this;
        }
        public java.util.List<CreateBrowserInstanceGroupRequestBrowserConfigBookmarks> getBookmarks() {
            return this.bookmarks;
        }

        public CreateBrowserInstanceGroupRequestBrowserConfig setBookmarksFilePath(String bookmarksFilePath) {
            this.bookmarksFilePath = bookmarksFilePath;
            return this;
        }
        public String getBookmarksFilePath() {
            return this.bookmarksFilePath;
        }

        public CreateBrowserInstanceGroupRequestBrowserConfig setBrowserParam(String browserParam) {
            this.browserParam = browserParam;
            return this;
        }
        public String getBrowserParam() {
            return this.browserParam;
        }

        public CreateBrowserInstanceGroupRequestBrowserConfig setCookiesSync(Boolean cookiesSync) {
            this.cookiesSync = cookiesSync;
            return this;
        }
        public Boolean getCookiesSync() {
            return this.cookiesSync;
        }

        public CreateBrowserInstanceGroupRequestBrowserConfig setHomepage(String homepage) {
            this.homepage = homepage;
            return this;
        }
        public String getHomepage() {
            return this.homepage;
        }

    }

    public static class CreateBrowserInstanceGroupRequestNetworkRestrictedURLs extends TeaModel {
        /**
         * <p>The URL of the allowed website.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun.com</p>
         */
        @NameInMap("URL")
        public String URL;

        public static CreateBrowserInstanceGroupRequestNetworkRestrictedURLs build(java.util.Map<String, ?> map) throws Exception {
            CreateBrowserInstanceGroupRequestNetworkRestrictedURLs self = new CreateBrowserInstanceGroupRequestNetworkRestrictedURLs();
            return TeaModel.build(map, self);
        }

        public CreateBrowserInstanceGroupRequestNetworkRestrictedURLs setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class CreateBrowserInstanceGroupRequestNetwork extends TeaModel {
        /**
         * <p>The website access restriction mode.</p>
         * <ul>
         * <li><code>ALLOW_ALL</code>: Allows access to all domain names.</li>
         * <li><code>ALLOW_LIST</code>: Allows access only to websites in the allowlist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALLOW_ALL</p>
         */
        @NameInMap("AccessRestriction")
        public String accessRestriction;

        /**
         * <p>The ID of the office network that has been created. The office network must belong to the current account and be located in the target region specified by BizRegionId.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-643067****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The list of allowed websites. This parameter is used in <code>ALLOW_LIST</code> mode.</p>
         * <p><strong>Restrictions:</strong></p>
         * <ul>
         * <li>A maximum of 20 URLs can be specified directly. If more than 20 URLs are required, use <code>RestrictedURLsFilePath</code> to import them from a file.</li>
         * <li>This parameter cannot be specified together with <code>RestrictedURLsFilePath</code>.</li>
         * <li>URLs in the list cannot be duplicated.</li>
         * </ul>
         */
        @NameInMap("RestrictedURLs")
        public java.util.List<CreateBrowserInstanceGroupRequestNetworkRestrictedURLs> restrictedURLs;

        /**
         * <p>The path of the uploaded website allowlist file. This parameter is used in <code>ALLOW_LIST</code> mode.</p>
         * <p>If more than 20 URLs are required, use file import. A maximum of 1,000 URLs can be configured by default.</p>
         * <p>This parameter cannot be specified together with <code>RestrictedURLs</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou/aig_upm/xxx/temp/BrowserRestrictionUrls/URL白名单模版.csv</p>
         */
        @NameInMap("RestrictedURLsFilePath")
        public String restrictedURLsFilePath;

        /**
         * <p>The list of vSwitch IDs.</p>
         * <p><strong>Usage condition:</strong> Specify this parameter only when you use a custom office network. Do not specify this parameter for other types of office networks.</p>
         * <p>Select vSwitches that match the target business region and the custom office network.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        public static CreateBrowserInstanceGroupRequestNetwork build(java.util.Map<String, ?> map) throws Exception {
            CreateBrowserInstanceGroupRequestNetwork self = new CreateBrowserInstanceGroupRequestNetwork();
            return TeaModel.build(map, self);
        }

        public CreateBrowserInstanceGroupRequestNetwork setAccessRestriction(String accessRestriction) {
            this.accessRestriction = accessRestriction;
            return this;
        }
        public String getAccessRestriction() {
            return this.accessRestriction;
        }

        public CreateBrowserInstanceGroupRequestNetwork setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public CreateBrowserInstanceGroupRequestNetwork setRestrictedURLs(java.util.List<CreateBrowserInstanceGroupRequestNetworkRestrictedURLs> restrictedURLs) {
            this.restrictedURLs = restrictedURLs;
            return this;
        }
        public java.util.List<CreateBrowserInstanceGroupRequestNetworkRestrictedURLs> getRestrictedURLs() {
            return this.restrictedURLs;
        }

        public CreateBrowserInstanceGroupRequestNetwork setRestrictedURLsFilePath(String restrictedURLsFilePath) {
            this.restrictedURLsFilePath = restrictedURLsFilePath;
            return this;
        }
        public String getRestrictedURLsFilePath() {
            return this.restrictedURLsFilePath;
        }

        public CreateBrowserInstanceGroupRequestNetwork setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

    }

    public static class CreateBrowserInstanceGroupRequestNodePool extends TeaModel {
        /**
         * <p>The number of nodes.</p>
         * <p>You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("NodeAmount")
        public Integer nodeAmount;

        /**
         * <p>The node specifications identity.</p>
         * <p>You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("NodeInstanceType")
        public String nodeInstanceType;

        /**
         * <p>The node scaling policy.</p>
         * <p>You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("StrategyType")
        public String strategyType;

        public static CreateBrowserInstanceGroupRequestNodePool build(java.util.Map<String, ?> map) throws Exception {
            CreateBrowserInstanceGroupRequestNodePool self = new CreateBrowserInstanceGroupRequestNodePool();
            return TeaModel.build(map, self);
        }

        public CreateBrowserInstanceGroupRequestNodePool setNodeAmount(Integer nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        public CreateBrowserInstanceGroupRequestNodePool setNodeInstanceType(String nodeInstanceType) {
            this.nodeInstanceType = nodeInstanceType;
            return this;
        }
        public String getNodeInstanceType() {
            return this.nodeInstanceType;
        }

        public CreateBrowserInstanceGroupRequestNodePool setStrategyType(String strategyType) {
            this.strategyType = strategyType;
            return this;
        }
        public String getStrategyType() {
            return this.strategyType;
        }

    }

    public static class CreateBrowserInstanceGroupRequestPolicyAuthorizeAccessPolicyRules extends TeaModel {
        /**
         * <p>The source CIDR block of clients that are allowed to access the cloud browser.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        @NameInMap("CidrIp")
        public String cidrIp;

        /**
         * <p>The description of the client access IP address whitelist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>OfficeNetworkAccess</p>
         */
        @NameInMap("Description")
        public String description;

        public static CreateBrowserInstanceGroupRequestPolicyAuthorizeAccessPolicyRules build(java.util.Map<String, ?> map) throws Exception {
            CreateBrowserInstanceGroupRequestPolicyAuthorizeAccessPolicyRules self = new CreateBrowserInstanceGroupRequestPolicyAuthorizeAccessPolicyRules();
            return TeaModel.build(map, self);
        }

        public CreateBrowserInstanceGroupRequestPolicyAuthorizeAccessPolicyRules setCidrIp(String cidrIp) {
            this.cidrIp = cidrIp;
            return this;
        }
        public String getCidrIp() {
            return this.cidrIp;
        }

        public CreateBrowserInstanceGroupRequestPolicyAuthorizeAccessPolicyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class CreateBrowserInstanceGroupRequestPolicyClientTypes extends TeaModel {
        /**
         * <p>The client type for which you want to configure an access policy.</p>
         * <ul>
         * <li><code>windows</code>: Windows client.</li>
         * <li><code>macos</code>: macOS client.</li>
         * <li><code>html5</code>: Web client.</li>
         * <li><code>android</code>: Android client.</li>
         * <li><code>ios</code>: iOS client.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>The access policy switch for the client type.</p>
         * <ul>
         * <li><code>on</code>: Allows access from this client type.</li>
         * <li><code>off</code>: Denies access from this client type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateBrowserInstanceGroupRequestPolicyClientTypes build(java.util.Map<String, ?> map) throws Exception {
            CreateBrowserInstanceGroupRequestPolicyClientTypes self = new CreateBrowserInstanceGroupRequestPolicyClientTypes();
            return TeaModel.build(map, self);
        }

        public CreateBrowserInstanceGroupRequestPolicyClientTypes setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public CreateBrowserInstanceGroupRequestPolicyClientTypes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CreateBrowserInstanceGroupRequestPolicyClipboardPolicy extends TeaModel {
        /**
         * <p>The clipboard transfer direction. The value is case-insensitive.</p>
         * <ul>
         * <li><code>off</code>: Bidirectional transfer is disabled.</li>
         * <li><code>read</code>: Allows copy and paste from the local PC to the cloud browser.</li>
         * <li><code>write</code>: Allows copy and paste from the cloud browser to the local PC.</li>
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
         * <p><strong>Value range:</strong> 1 to 102400. The unit is specified by ClipboardSizeUnit.</p>
         * <p>The value range does not change with unit conversion.</p>
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
         * <p>The clipboard size unit.</p>
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
         * <p>The clipboard size limit for outbound transfer (from the cloud browser to the local PC).</p>
         * <p><strong>Value range:</strong> 1 to 102400. The unit is specified by ClipboardSizeUnit.</p>
         * <p>The value range does not change with unit conversion.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("ClipboardWriteLimit")
        public Integer clipboardWriteLimit;

        /**
         * <p>The clipboard transfer direction. The value is case-insensitive.</p>
         * <ul>
         * <li><code>off</code>: Bidirectional transfer is disabled.</li>
         * <li><code>read</code>: Allows copy and paste from the local PC to the cloud browser.</li>
         * <li><code>write</code>: Allows copy and paste from the cloud browser to the local PC.</li>
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
         * <li><code>off</code>: Bidirectional transfer is disabled.</li>
         * <li><code>read</code>: Allows copy and paste from the local PC to the cloud browser.</li>
         * <li><code>write</code>: Allows copy and paste from the cloud browser to the local PC.</li>
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
         * <p><strong>Value range:</strong> 1 to 204800. The unit is specified by RichTextClipboardSizeUnit.</p>
         * <p>The value range does not change with unit conversion.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("RichTextClipboardLimit")
        public Integer richTextClipboardLimit;

        /**
         * <p>The clipboard size limit for inbound transfer (from the local PC to the cloud browser).</p>
         * <p><strong>Value range:</strong> 1 to 204800. The unit is specified by RichTextClipboardReadSizeUnit.</p>
         * <p>The value range does not change with unit conversion.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RichTextClipboardReadLimit")
        public Integer richTextClipboardReadLimit;

        /**
         * <p>The clipboard size unit.</p>
         * <ul>
         * <li><code>B</code>: Bytes.</li>
         * <li><code>KB</code>: 1024 bytes.</li>
         * </ul>
         * <p><strong>Default value:</strong> <code>KB</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>KB</p>
         */
        @NameInMap("RichTextClipboardReadSizeUnit")
        public String richTextClipboardReadSizeUnit;

        /**
         * <p>The clipboard size unit.</p>
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
         * <p>The clipboard size limit for outbound transfer (from the cloud browser to the local PC).</p>
         * <p><strong>Value range:</strong> 1 to 204800. The unit is specified by RichTextClipboardWriteSizeUnit.</p>
         * <p>The value range does not change with unit conversion.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RichTextClipboardWriteLimit")
        public Integer richTextClipboardWriteLimit;

        /**
         * <p>The clipboard size unit.</p>
         * <ul>
         * <li><code>B</code>: Bytes.</li>
         * <li><code>KB</code>: 1024 bytes.</li>
         * </ul>
         * <p><strong>Default value:</strong> <code>KB</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>KB</p>
         */
        @NameInMap("RichTextClipboardWriteSizeUnit")
        public String richTextClipboardWriteSizeUnit;

        /**
         * <p>The clipboard transfer direction. The value is case-insensitive.</p>
         * <ul>
         * <li><code>off</code>: Bidirectional transfer is disabled.</li>
         * <li><code>read</code>: Allows copy and paste from the local PC to the cloud browser.</li>
         * <li><code>write</code>: Allows copy and paste from the cloud browser to the local PC.</li>
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
         * <p><strong>Value range:</strong> 1 to 102400. The unit is specified by TextClipboardReadSizeUnit.</p>
         * <p>The value range does not change with unit conversion.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TextClipboardReadLimit")
        public Integer textClipboardReadLimit;

        /**
         * <p>The clipboard size unit.</p>
         * <ul>
         * <li><code>B</code>: Bytes.</li>
         * <li><code>KB</code>: 1024 bytes.</li>
         * </ul>
         * <p><strong>Default value:</strong> <code>KB</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>KB</p>
         */
        @NameInMap("TextClipboardReadSizeUnit")
        public String textClipboardReadSizeUnit;

        /**
         * <p>The clipboard size limit for outbound transfer (from the cloud browser to the local PC).</p>
         * <p><strong>Value range:</strong> 1 to 102400. The unit is specified by TextClipboardWriteSizeUnit.</p>
         * <p>The value range does not change with unit conversion.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TextClipboardWriteLimit")
        public Integer textClipboardWriteLimit;

        /**
         * <p>The clipboard size unit.</p>
         * <ul>
         * <li><code>B</code>: Bytes.</li>
         * <li><code>KB</code>: 1024 bytes.</li>
         * </ul>
         * <p><strong>Default value:</strong> <code>KB</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>KB</p>
         */
        @NameInMap("TextClipboardWriteSizeUnit")
        public String textClipboardWriteSizeUnit;

        public static CreateBrowserInstanceGroupRequestPolicyClipboardPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateBrowserInstanceGroupRequestPolicyClipboardPolicy self = new CreateBrowserInstanceGroupRequestPolicyClipboardPolicy();
            return TeaModel.build(map, self);
        }

        public CreateBrowserInstanceGroupRequestPolicyClipboardPolicy setClipboard(String clipboard) {
            this.clipboard = clipboard;
            return this;
        }
        public String getClipboard() {
            return this.clipboard;
        }

        public CreateBrowserInstanceGroupRequestPolicyClipboardPolicy setClipboardReadLimit(Integer clipboardReadLimit) {
            this.clipboardReadLimit = clipboardReadLimit;
            return this;
        }
        public Integer getClipboardReadLimit() {
            return this.clipboardReadLimit;
        }

        public CreateBrowserInstanceGroupRequestPolicyClipboardPolicy setClipboardScope(String clipboardScope) {
            this.clipboardScope = clipboardScope;
            return this;
        }
        public String getClipboardScope() {
            return this.clipboardScope;
        }

        public CreateBrowserInstanceGroupRequestPolicyClipboardPolicy setClipboardSizeUnit(String clipboardSizeUnit) {
            this.clipboardSizeUnit = clipboardSizeUnit;
            return this;
        }
        public String getClipboardSizeUnit() {
            return this.clipboardSizeUnit;
        }

        public CreateBrowserInstanceGroupRequestPolicyClipboardPolicy setClipboardWriteLimit(Integer clipboardWriteLimit) {
            this.clipboardWriteLimit = clipboardWriteLimit;
            return this;
        }
        public Integer getClipboardWriteLimit() {
            return this.clipboardWriteLimit;
        }

        public CreateBrowserInstanceGroupRequestPolicyClipboardPolicy setFileClipboard(String fileClipboard) {
            this.fileClipboard = fileClipboard;
            return this;
        }
        public String getFileClipboard() {
            return this.fileClipboard;
        }

        public CreateBrowserInstanceGroupRequestPolicyClipboardPolicy setRichTextClipboard(String richTextClipboard) {
            this.richTextClipboard = richTextClipboard;
            return this;
        }
        public String getRichTextClipboard() {
            return this.richTextClipboard;
        }

        public CreateBrowserInstanceGroupRequestPolicyClipboardPolicy setRichTextClipboardLimit(Integer richTextClipboardLimit) {
            this.richTextClipboardLimit = richTextClipboardLimit;
            return this;
        }
        public Integer getRichTextClipboardLimit() {
            return this.richTextClipboardLimit;
        }

        public CreateBrowserInstanceGroupRequestPolicyClipboardPolicy setRichTextClipboardReadLimit(Integer richTextClipboardReadLimit) {
            this.richTextClipboardReadLimit = richTextClipboardReadLimit;
            return this;
        }
        public Integer getRichTextClipboardReadLimit() {
            return this.richTextClipboardReadLimit;
        }

        public CreateBrowserInstanceGroupRequestPolicyClipboardPolicy setRichTextClipboardReadSizeUnit(String richTextClipboardReadSizeUnit) {
            this.richTextClipboardReadSizeUnit = richTextClipboardReadSizeUnit;
            return this;
        }
        public String getRichTextClipboardReadSizeUnit() {
            return this.richTextClipboardReadSizeUnit;
        }

        public CreateBrowserInstanceGroupRequestPolicyClipboardPolicy setRichTextClipboardSizeUnit(String richTextClipboardSizeUnit) {
            this.richTextClipboardSizeUnit = richTextClipboardSizeUnit;
            return this;
        }
        public String getRichTextClipboardSizeUnit() {
            return this.richTextClipboardSizeUnit;
        }

        public CreateBrowserInstanceGroupRequestPolicyClipboardPolicy setRichTextClipboardWriteLimit(Integer richTextClipboardWriteLimit) {
            this.richTextClipboardWriteLimit = richTextClipboardWriteLimit;
            return this;
        }
        public Integer getRichTextClipboardWriteLimit() {
            return this.richTextClipboardWriteLimit;
        }

        public CreateBrowserInstanceGroupRequestPolicyClipboardPolicy setRichTextClipboardWriteSizeUnit(String richTextClipboardWriteSizeUnit) {
            this.richTextClipboardWriteSizeUnit = richTextClipboardWriteSizeUnit;
            return this;
        }
        public String getRichTextClipboardWriteSizeUnit() {
            return this.richTextClipboardWriteSizeUnit;
        }

        public CreateBrowserInstanceGroupRequestPolicyClipboardPolicy setTextClipboard(String textClipboard) {
            this.textClipboard = textClipboard;
            return this;
        }
        public String getTextClipboard() {
            return this.textClipboard;
        }

        public CreateBrowserInstanceGroupRequestPolicyClipboardPolicy setTextClipboardReadLimit(Integer textClipboardReadLimit) {
            this.textClipboardReadLimit = textClipboardReadLimit;
            return this;
        }
        public Integer getTextClipboardReadLimit() {
            return this.textClipboardReadLimit;
        }

        public CreateBrowserInstanceGroupRequestPolicyClipboardPolicy setTextClipboardReadSizeUnit(String textClipboardReadSizeUnit) {
            this.textClipboardReadSizeUnit = textClipboardReadSizeUnit;
            return this;
        }
        public String getTextClipboardReadSizeUnit() {
            return this.textClipboardReadSizeUnit;
        }

        public CreateBrowserInstanceGroupRequestPolicyClipboardPolicy setTextClipboardWriteLimit(Integer textClipboardWriteLimit) {
            this.textClipboardWriteLimit = textClipboardWriteLimit;
            return this;
        }
        public Integer getTextClipboardWriteLimit() {
            return this.textClipboardWriteLimit;
        }

        public CreateBrowserInstanceGroupRequestPolicyClipboardPolicy setTextClipboardWriteSizeUnit(String textClipboardWriteSizeUnit) {
            this.textClipboardWriteSizeUnit = textClipboardWriteSizeUnit;
            return this;
        }
        public String getTextClipboardWriteSizeUnit() {
            return this.textClipboardWriteSizeUnit;
        }

    }

    public static class CreateBrowserInstanceGroupRequestPolicyVideoPolicy extends TeaModel {
        /**
         * <p>The frame rate of the browser session.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("FrameRate")
        public Integer frameRate;

        public static CreateBrowserInstanceGroupRequestPolicyVideoPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateBrowserInstanceGroupRequestPolicyVideoPolicy self = new CreateBrowserInstanceGroupRequestPolicyVideoPolicy();
            return TeaModel.build(map, self);
        }

        public CreateBrowserInstanceGroupRequestPolicyVideoPolicy setFrameRate(Integer frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public Integer getFrameRate() {
            return this.frameRate;
        }

    }

    public static class CreateBrowserInstanceGroupRequestPolicyWatermarkPolicy extends TeaModel {
        /**
         * <p>The watermark switch. The value is case-insensitive.</p>
         * <ul>
         * <li><code>ON</code>: Enables the watermark.</li>
         * <li><code>OFF</code>: Disables the watermark.</li>
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
         * <li><code>EndUserId</code>: The user identifier.</li>
         * <li><code>InstanceGroupId</code>: The delivery group identifier.</li>
         * <li><code>ClientTime</code>: The current time on the client.</li>
         * </ul>
         * <p>Use watermark types supported by the browser and client.</p>
         */
        @NameInMap("WatermarkTypes")
        public java.util.List<String> watermarkTypes;

        public static CreateBrowserInstanceGroupRequestPolicyWatermarkPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateBrowserInstanceGroupRequestPolicyWatermarkPolicy self = new CreateBrowserInstanceGroupRequestPolicyWatermarkPolicy();
            return TeaModel.build(map, self);
        }

        public CreateBrowserInstanceGroupRequestPolicyWatermarkPolicy setWatermarkSwitch(String watermarkSwitch) {
            this.watermarkSwitch = watermarkSwitch;
            return this;
        }
        public String getWatermarkSwitch() {
            return this.watermarkSwitch;
        }

        public CreateBrowserInstanceGroupRequestPolicyWatermarkPolicy setWatermarkTypes(java.util.List<String> watermarkTypes) {
            this.watermarkTypes = watermarkTypes;
            return this;
        }
        public java.util.List<String> getWatermarkTypes() {
            return this.watermarkTypes;
        }

    }

    public static class CreateBrowserInstanceGroupRequestPolicy extends TeaModel {
        /**
         * <p>Specifies whether to enable screen capture prevention.</p>
         * <ul>
         * <li><code>on</code>: Enables screen capture prevention.</li>
         * <li><code>off</code>: Disables screen capture prevention.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AppContentProtection")
        public String appContentProtection;

        /**
         * <p>The client access IP address whitelist. This parameter is used to restrict the source IP addresses of clients that can access the cloud browser.</p>
         */
        @NameInMap("AuthorizeAccessPolicyRules")
        public java.util.List<CreateBrowserInstanceGroupRequestPolicyAuthorizeAccessPolicyRules> authorizeAccessPolicyRules;

        /**
         * <p>The client access control list.</p>
         */
        @NameInMap("ClientTypes")
        public java.util.List<CreateBrowserInstanceGroupRequestPolicyClientTypes> clientTypes;

        /**
         * <p>Specifies the clipboard transfer direction, content type, and size limit. read indicates transfer from the local PC to the cloud browser. write indicates transfer from the cloud browser to the local PC.</p>
         */
        @NameInMap("ClipboardPolicy")
        public CreateBrowserInstanceGroupRequestPolicyClipboardPolicy clipboardPolicy;

        /**
         * <p>The session data retention policy after disconnection.</p>
         * <ul>
         * <li><code>customTime</code>: Retains the session based on the session data retention policy. Customizing the duration through <code>DisconnectKeepSessionTime</code> is not supported.</li>
         * <li><code>persistent</code>: The session is not subject to automatic release based on disconnection duration.</li>
         * </ul>
         * <p><strong>Note:</strong> <code>persistent</code> is still subject to authorization and other release policies.</p>
         * 
         * <strong>example:</strong>
         * <p>customTime</p>
         */
        @NameInMap("DisconnectKeepSession")
        public String disconnectKeepSession;

        /**
         * <p>Not supported. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("DisconnectKeepSessionTime")
        public Integer disconnectKeepSessionTime;

        /**
         * <p>Specifies whether to enable the floating ball file manager.</p>
         * <ul>
         * <li><code>on</code>: Enabled.</li>
         * <li><code>off</code>: Disabled.</li>
         * </ul>
         * <p><strong>Default value:</strong> <code>off</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("FileManager")
        public String fileManager;

        /**
         * <p>The file transfer policy for the web client.</p>
         * <ul>
         * <li><code>off</code>: File transfer is disabled.</li>
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
         * <p>Specifies whether to enable automatic disconnection on inactivity. The value is case-insensitive.</p>
         * <ul>
         * <li><code>on</code>: Enabled.</li>
         * <li><code>off</code>: Disabled.</li>
         * </ul>
         * <p>When enabled, set the wait duration through <code>NoOperationDisconnectTime</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("NoOperationDisconnect")
        public String noOperationDisconnect;

        /**
         * <p>The wait duration before disconnection is triggered after user inactivity. Unit: seconds.</p>
         * <p><strong>Prerequisite:</strong> When <code>NoOperationDisconnect</code> is enabled, specify a value greater than 0.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("NoOperationDisconnectTime")
        public Integer noOperationDisconnectTime;

        /**
         * <p>The policy version. The value is case-insensitive.</p>
         * <ul>
         * <li><code>DEFAULT</code>: Legacy policy.</li>
         * <li><code>CENTER</code>: Centralized policy.</li>
         * </ul>
         * <p><strong>Default value:</strong> <code>DEFAULT</code>. The actual effective policy version depends on the policy configuration available for the account.</p>
         * 
         * <strong>example:</strong>
         * <p>CENTER</p>
         */
        @NameInMap("PolicyVersion")
        public String policyVersion;

        /**
         * <p>The video display policy for the browser session.</p>
         */
        @NameInMap("VideoPolicy")
        public CreateBrowserInstanceGroupRequestPolicyVideoPolicy videoPolicy;

        /**
         * <p>The watermark display configuration for browser sessions.</p>
         */
        @NameInMap("WatermarkPolicy")
        public CreateBrowserInstanceGroupRequestPolicyWatermarkPolicy watermarkPolicy;

        public static CreateBrowserInstanceGroupRequestPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateBrowserInstanceGroupRequestPolicy self = new CreateBrowserInstanceGroupRequestPolicy();
            return TeaModel.build(map, self);
        }

        public CreateBrowserInstanceGroupRequestPolicy setAppContentProtection(String appContentProtection) {
            this.appContentProtection = appContentProtection;
            return this;
        }
        public String getAppContentProtection() {
            return this.appContentProtection;
        }

        public CreateBrowserInstanceGroupRequestPolicy setAuthorizeAccessPolicyRules(java.util.List<CreateBrowserInstanceGroupRequestPolicyAuthorizeAccessPolicyRules> authorizeAccessPolicyRules) {
            this.authorizeAccessPolicyRules = authorizeAccessPolicyRules;
            return this;
        }
        public java.util.List<CreateBrowserInstanceGroupRequestPolicyAuthorizeAccessPolicyRules> getAuthorizeAccessPolicyRules() {
            return this.authorizeAccessPolicyRules;
        }

        public CreateBrowserInstanceGroupRequestPolicy setClientTypes(java.util.List<CreateBrowserInstanceGroupRequestPolicyClientTypes> clientTypes) {
            this.clientTypes = clientTypes;
            return this;
        }
        public java.util.List<CreateBrowserInstanceGroupRequestPolicyClientTypes> getClientTypes() {
            return this.clientTypes;
        }

        public CreateBrowserInstanceGroupRequestPolicy setClipboardPolicy(CreateBrowserInstanceGroupRequestPolicyClipboardPolicy clipboardPolicy) {
            this.clipboardPolicy = clipboardPolicy;
            return this;
        }
        public CreateBrowserInstanceGroupRequestPolicyClipboardPolicy getClipboardPolicy() {
            return this.clipboardPolicy;
        }

        public CreateBrowserInstanceGroupRequestPolicy setDisconnectKeepSession(String disconnectKeepSession) {
            this.disconnectKeepSession = disconnectKeepSession;
            return this;
        }
        public String getDisconnectKeepSession() {
            return this.disconnectKeepSession;
        }

        public CreateBrowserInstanceGroupRequestPolicy setDisconnectKeepSessionTime(Integer disconnectKeepSessionTime) {
            this.disconnectKeepSessionTime = disconnectKeepSessionTime;
            return this;
        }
        public Integer getDisconnectKeepSessionTime() {
            return this.disconnectKeepSessionTime;
        }

        public CreateBrowserInstanceGroupRequestPolicy setFileManager(String fileManager) {
            this.fileManager = fileManager;
            return this;
        }
        public String getFileManager() {
            return this.fileManager;
        }

        public CreateBrowserInstanceGroupRequestPolicy setHtml5FileTransfer(String html5FileTransfer) {
            this.html5FileTransfer = html5FileTransfer;
            return this;
        }
        public String getHtml5FileTransfer() {
            return this.html5FileTransfer;
        }

        public CreateBrowserInstanceGroupRequestPolicy setNoOperationDisconnect(String noOperationDisconnect) {
            this.noOperationDisconnect = noOperationDisconnect;
            return this;
        }
        public String getNoOperationDisconnect() {
            return this.noOperationDisconnect;
        }

        public CreateBrowserInstanceGroupRequestPolicy setNoOperationDisconnectTime(Integer noOperationDisconnectTime) {
            this.noOperationDisconnectTime = noOperationDisconnectTime;
            return this;
        }
        public Integer getNoOperationDisconnectTime() {
            return this.noOperationDisconnectTime;
        }

        public CreateBrowserInstanceGroupRequestPolicy setPolicyVersion(String policyVersion) {
            this.policyVersion = policyVersion;
            return this;
        }
        public String getPolicyVersion() {
            return this.policyVersion;
        }

        public CreateBrowserInstanceGroupRequestPolicy setVideoPolicy(CreateBrowserInstanceGroupRequestPolicyVideoPolicy videoPolicy) {
            this.videoPolicy = videoPolicy;
            return this;
        }
        public CreateBrowserInstanceGroupRequestPolicyVideoPolicy getVideoPolicy() {
            return this.videoPolicy;
        }

        public CreateBrowserInstanceGroupRequestPolicy setWatermarkPolicy(CreateBrowserInstanceGroupRequestPolicyWatermarkPolicy watermarkPolicy) {
            this.watermarkPolicy = watermarkPolicy;
            return this;
        }
        public CreateBrowserInstanceGroupRequestPolicyWatermarkPolicy getWatermarkPolicy() {
            return this.watermarkPolicy;
        }

    }

    public static class CreateBrowserInstanceGroupRequestSecurityPolicy extends TeaModel {
        /**
         * <p>Specifies whether to skip the user authorization check when connecting to the application.</p>
         * <ul>
         * <li><code>true</code>: Skips the check.</li>
         * <li><code>false</code>: Performs the check.</li>
         * </ul>
         * <p>If this field is omitted when <code>SecurityPolicy</code> is configured, the user authorization check is performed.</p>
         * <p><strong>Note:</strong> This field cannot be used to skip OpenAPI identity authentication or RAM permission verification.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SkipUserAuthCheck")
        public Boolean skipUserAuthCheck;

        public static CreateBrowserInstanceGroupRequestSecurityPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateBrowserInstanceGroupRequestSecurityPolicy self = new CreateBrowserInstanceGroupRequestSecurityPolicy();
            return TeaModel.build(map, self);
        }

        public CreateBrowserInstanceGroupRequestSecurityPolicy setSkipUserAuthCheck(Boolean skipUserAuthCheck) {
            this.skipUserAuthCheck = skipUserAuthCheck;
            return this;
        }
        public Boolean getSkipUserAuthCheck() {
            return this.skipUserAuthCheck;
        }

    }

    public static class CreateBrowserInstanceGroupRequestStoragePolicyUserProfile extends TeaModel {
        /**
         * <p>The size of the user data roaming cloud disk. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("UserProfileSize")
        public Long userProfileSize;

        /**
         * <p>Specifies whether to enable user data roaming.</p>
         * <ul>
         * <li><code>true</code>: Enabled.</li>
         * <li><code>false</code>: Disabled.</li>
         * </ul>
         * <p>In Windows scenarios, if this field is explicitly specified, the specified value is used. If this field is omitted, the user roaming configuration of the current account is used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UserProfileSwitch")
        public Boolean userProfileSwitch;

        public static CreateBrowserInstanceGroupRequestStoragePolicyUserProfile build(java.util.Map<String, ?> map) throws Exception {
            CreateBrowserInstanceGroupRequestStoragePolicyUserProfile self = new CreateBrowserInstanceGroupRequestStoragePolicyUserProfile();
            return TeaModel.build(map, self);
        }

        public CreateBrowserInstanceGroupRequestStoragePolicyUserProfile setUserProfileSize(Long userProfileSize) {
            this.userProfileSize = userProfileSize;
            return this;
        }
        public Long getUserProfileSize() {
            return this.userProfileSize;
        }

        public CreateBrowserInstanceGroupRequestStoragePolicyUserProfile setUserProfileSwitch(Boolean userProfileSwitch) {
            this.userProfileSwitch = userProfileSwitch;
            return this;
        }
        public Boolean getUserProfileSwitch() {
            return this.userProfileSwitch;
        }

    }

    public static class CreateBrowserInstanceGroupRequestStoragePolicy extends TeaModel {
        /**
         * <p>The user data roaming configuration, which is used to retain user configuration data.</p>
         */
        @NameInMap("UserProfile")
        public CreateBrowserInstanceGroupRequestStoragePolicyUserProfile userProfile;

        public static CreateBrowserInstanceGroupRequestStoragePolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateBrowserInstanceGroupRequestStoragePolicy self = new CreateBrowserInstanceGroupRequestStoragePolicy();
            return TeaModel.build(map, self);
        }

        public CreateBrowserInstanceGroupRequestStoragePolicy setUserProfile(CreateBrowserInstanceGroupRequestStoragePolicyUserProfile userProfile) {
            this.userProfile = userProfile;
            return this;
        }
        public CreateBrowserInstanceGroupRequestStoragePolicyUserProfile getUserProfile() {
            return this.userProfile;
        }

    }

    public static class CreateBrowserInstanceGroupRequestTag extends TeaModel {
        /**
         * <p>Not supported. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Not supported. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Value")
        public String value;

        public static CreateBrowserInstanceGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateBrowserInstanceGroupRequestTag self = new CreateBrowserInstanceGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateBrowserInstanceGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateBrowserInstanceGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateBrowserInstanceGroupRequestTimers extends TeaModel {
        /**
         * <p>Not supported. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>Not supported. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("TimerType")
        public String timerType;

        public static CreateBrowserInstanceGroupRequestTimers build(java.util.Map<String, ?> map) throws Exception {
            CreateBrowserInstanceGroupRequestTimers self = new CreateBrowserInstanceGroupRequestTimers();
            return TeaModel.build(map, self);
        }

        public CreateBrowserInstanceGroupRequestTimers setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public CreateBrowserInstanceGroupRequestTimers setTimerType(String timerType) {
            this.timerType = timerType;
            return this;
        }
        public String getTimerType() {
            return this.timerType;
        }

    }

    public static class CreateBrowserInstanceGroupRequestUserInfo extends TeaModel {
        /**
         * <p>The account type of the authorized user.</p>
         * <ul>
         * <li><code>simple</code>: Convenience account.</li>
         * <li><code>ad</code>: AD domain account.</li>
         * </ul>
         * <p>The value must match the account type of the user and workspace network.</p>
         * 
         * <strong>example:</strong>
         * <p>simple</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateBrowserInstanceGroupRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateBrowserInstanceGroupRequestUserInfo self = new CreateBrowserInstanceGroupRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public CreateBrowserInstanceGroupRequestUserInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateBrowserInstanceGroupRequestUsers extends TeaModel {
        /**
         * <p>The identity of the authorized user to be granted authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        public static CreateBrowserInstanceGroupRequestUsers build(java.util.Map<String, ?> map) throws Exception {
            CreateBrowserInstanceGroupRequestUsers self = new CreateBrowserInstanceGroupRequestUsers();
            return TeaModel.build(map, self);
        }

        public CreateBrowserInstanceGroupRequestUsers setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

    }

}
