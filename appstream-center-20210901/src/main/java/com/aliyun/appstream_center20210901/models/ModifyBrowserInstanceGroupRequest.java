// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyBrowserInstanceGroupRequest extends TeaModel {
    /**
     * <p>The browser configuration.</p>
     */
    @NameInMap("BrowserConfig")
    public ModifyBrowserInstanceGroupRequestBrowserConfig browserConfig;

    /**
     * <p>The ID of the cloud browser to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>big-0bz55ixxxxx9xi9w9</p>
     */
    @NameInMap("BrowserInstanceGroupId")
    public String browserInstanceGroupId;

    /**
     * <p>The name of the cloud browser.</p>
     * 
     * <strong>example:</strong>
     * <p>BrowserTest</p>
     */
    @NameInMap("CloudBrowserName")
    public String cloudBrowserName;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxAmount")
    public Integer maxAmount;

    /**
     * <p>The network configuration.</p>
     */
    @NameInMap("Network")
    public ModifyBrowserInstanceGroupRequestNetwork network;

    /**
     * <p>The access policy.</p>
     */
    @NameInMap("Policy")
    public ModifyBrowserInstanceGroupRequestPolicy policy;

    @NameInMap("StoragePolicy")
    public ModifyBrowserInstanceGroupRequestStoragePolicy storagePolicy;

    /**
     * <p>The timers.</p>
     */
    @NameInMap("Timers")
    public java.util.List<ModifyBrowserInstanceGroupRequestTimers> timers;

    public static ModifyBrowserInstanceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBrowserInstanceGroupRequest self = new ModifyBrowserInstanceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBrowserInstanceGroupRequest setBrowserConfig(ModifyBrowserInstanceGroupRequestBrowserConfig browserConfig) {
        this.browserConfig = browserConfig;
        return this;
    }
    public ModifyBrowserInstanceGroupRequestBrowserConfig getBrowserConfig() {
        return this.browserConfig;
    }

    public ModifyBrowserInstanceGroupRequest setBrowserInstanceGroupId(String browserInstanceGroupId) {
        this.browserInstanceGroupId = browserInstanceGroupId;
        return this;
    }
    public String getBrowserInstanceGroupId() {
        return this.browserInstanceGroupId;
    }

    public ModifyBrowserInstanceGroupRequest setCloudBrowserName(String cloudBrowserName) {
        this.cloudBrowserName = cloudBrowserName;
        return this;
    }
    public String getCloudBrowserName() {
        return this.cloudBrowserName;
    }

    public ModifyBrowserInstanceGroupRequest setMaxAmount(Integer maxAmount) {
        this.maxAmount = maxAmount;
        return this;
    }
    public Integer getMaxAmount() {
        return this.maxAmount;
    }

    public ModifyBrowserInstanceGroupRequest setNetwork(ModifyBrowserInstanceGroupRequestNetwork network) {
        this.network = network;
        return this;
    }
    public ModifyBrowserInstanceGroupRequestNetwork getNetwork() {
        return this.network;
    }

    public ModifyBrowserInstanceGroupRequest setPolicy(ModifyBrowserInstanceGroupRequestPolicy policy) {
        this.policy = policy;
        return this;
    }
    public ModifyBrowserInstanceGroupRequestPolicy getPolicy() {
        return this.policy;
    }

    public ModifyBrowserInstanceGroupRequest setStoragePolicy(ModifyBrowserInstanceGroupRequestStoragePolicy storagePolicy) {
        this.storagePolicy = storagePolicy;
        return this;
    }
    public ModifyBrowserInstanceGroupRequestStoragePolicy getStoragePolicy() {
        return this.storagePolicy;
    }

    public ModifyBrowserInstanceGroupRequest setTimers(java.util.List<ModifyBrowserInstanceGroupRequestTimers> timers) {
        this.timers = timers;
        return this;
    }
    public java.util.List<ModifyBrowserInstanceGroupRequestTimers> getTimers() {
        return this.timers;
    }

    public static class ModifyBrowserInstanceGroupRequestBrowserConfigBookmarks extends TeaModel {
        /**
         * <p>The folder to which the bookmark belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("BookmarkFolder")
        public String bookmarkFolder;

        /**
         * <p>The bookmark ID. This parameter is required only for modification.</p>
         * 
         * <strong>example:</strong>
         * <p>bm-12345</p>
         */
        @NameInMap("BookmarkId")
        public String bookmarkId;

        /**
         * <p>The bookmark name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("BookmarkName")
        public String bookmarkName;

        /**
         * <p>The bookmark URL.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
         */
        @NameInMap("BookmarkURL")
        public String bookmarkURL;

        public static ModifyBrowserInstanceGroupRequestBrowserConfigBookmarks build(java.util.Map<String, ?> map) throws Exception {
            ModifyBrowserInstanceGroupRequestBrowserConfigBookmarks self = new ModifyBrowserInstanceGroupRequestBrowserConfigBookmarks();
            return TeaModel.build(map, self);
        }

        public ModifyBrowserInstanceGroupRequestBrowserConfigBookmarks setBookmarkFolder(String bookmarkFolder) {
            this.bookmarkFolder = bookmarkFolder;
            return this;
        }
        public String getBookmarkFolder() {
            return this.bookmarkFolder;
        }

        public ModifyBrowserInstanceGroupRequestBrowserConfigBookmarks setBookmarkId(String bookmarkId) {
            this.bookmarkId = bookmarkId;
            return this;
        }
        public String getBookmarkId() {
            return this.bookmarkId;
        }

        public ModifyBrowserInstanceGroupRequestBrowserConfigBookmarks setBookmarkName(String bookmarkName) {
            this.bookmarkName = bookmarkName;
            return this;
        }
        public String getBookmarkName() {
            return this.bookmarkName;
        }

        public ModifyBrowserInstanceGroupRequestBrowserConfigBookmarks setBookmarkURL(String bookmarkURL) {
            this.bookmarkURL = bookmarkURL;
            return this;
        }
        public String getBookmarkURL() {
            return this.bookmarkURL;
        }

    }

    public static class ModifyBrowserInstanceGroupRequestBrowserConfig extends TeaModel {
        /**
         * <p>The bookmarks.</p>
         */
        @NameInMap("Bookmarks")
        public java.util.List<ModifyBrowserInstanceGroupRequestBrowserConfigBookmarks> bookmarks;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou/aig_upm/xxx/temp/BrowserBookmarks/浏览器书签模版.csv</p>
         */
        @NameInMap("BookmarksFilePath")
        public String bookmarksFilePath;

        /**
         * <p>The startup parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>--incognito</p>
         */
        @NameInMap("BrowserParam")
        public String browserParam;

        @NameInMap("CookiesSync")
        public Boolean cookiesSync;

        /**
         * <p>The homepage.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
         */
        @NameInMap("Homepage")
        public String homepage;

        /**
         * <p>The list of bookmarks to remove.</p>
         */
        @NameInMap("RemoveBookmarks")
        public java.util.List<String> removeBookmarks;

        public static ModifyBrowserInstanceGroupRequestBrowserConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyBrowserInstanceGroupRequestBrowserConfig self = new ModifyBrowserInstanceGroupRequestBrowserConfig();
            return TeaModel.build(map, self);
        }

        public ModifyBrowserInstanceGroupRequestBrowserConfig setBookmarks(java.util.List<ModifyBrowserInstanceGroupRequestBrowserConfigBookmarks> bookmarks) {
            this.bookmarks = bookmarks;
            return this;
        }
        public java.util.List<ModifyBrowserInstanceGroupRequestBrowserConfigBookmarks> getBookmarks() {
            return this.bookmarks;
        }

        public ModifyBrowserInstanceGroupRequestBrowserConfig setBookmarksFilePath(String bookmarksFilePath) {
            this.bookmarksFilePath = bookmarksFilePath;
            return this;
        }
        public String getBookmarksFilePath() {
            return this.bookmarksFilePath;
        }

        public ModifyBrowserInstanceGroupRequestBrowserConfig setBrowserParam(String browserParam) {
            this.browserParam = browserParam;
            return this;
        }
        public String getBrowserParam() {
            return this.browserParam;
        }

        public ModifyBrowserInstanceGroupRequestBrowserConfig setCookiesSync(Boolean cookiesSync) {
            this.cookiesSync = cookiesSync;
            return this;
        }
        public Boolean getCookiesSync() {
            return this.cookiesSync;
        }

        public ModifyBrowserInstanceGroupRequestBrowserConfig setHomepage(String homepage) {
            this.homepage = homepage;
            return this;
        }
        public String getHomepage() {
            return this.homepage;
        }

        public ModifyBrowserInstanceGroupRequestBrowserConfig setRemoveBookmarks(java.util.List<String> removeBookmarks) {
            this.removeBookmarks = removeBookmarks;
            return this;
        }
        public java.util.List<String> getRemoveBookmarks() {
            return this.removeBookmarks;
        }

    }

    public static class ModifyBrowserInstanceGroupRequestNetworkRestrictedURLs extends TeaModel {
        /**
         * <p>The ID of the domain name configuration. This parameter is required only for modification.</p>
         * 
         * <strong>example:</strong>
         * <p>ru-12345</p>
         */
        @NameInMap("RestrictedURLId")
        public String restrictedURLId;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun.com</p>
         */
        @NameInMap("URL")
        public String URL;

        public static ModifyBrowserInstanceGroupRequestNetworkRestrictedURLs build(java.util.Map<String, ?> map) throws Exception {
            ModifyBrowserInstanceGroupRequestNetworkRestrictedURLs self = new ModifyBrowserInstanceGroupRequestNetworkRestrictedURLs();
            return TeaModel.build(map, self);
        }

        public ModifyBrowserInstanceGroupRequestNetworkRestrictedURLs setRestrictedURLId(String restrictedURLId) {
            this.restrictedURLId = restrictedURLId;
            return this;
        }
        public String getRestrictedURLId() {
            return this.restrictedURLId;
        }

        public ModifyBrowserInstanceGroupRequestNetworkRestrictedURLs setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class ModifyBrowserInstanceGroupRequestNetwork extends TeaModel {
        /**
         * <p>The access restriction type.</p>
         * 
         * <strong>example:</strong>
         * <p>ALLOW_LIST</p>
         */
        @NameInMap("AccessRestriction")
        public String accessRestriction;

        /**
         * <p>The list of domain names to remove.</p>
         */
        @NameInMap("RemoveRestrictedURLIds")
        public java.util.List<String> removeRestrictedURLIds;

        /**
         * <p>The restricted domain name configurations.</p>
         */
        @NameInMap("RestrictedURLs")
        public java.util.List<ModifyBrowserInstanceGroupRequestNetworkRestrictedURLs> restrictedURLs;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou/aig_upm/xxx/temp/BrowserRestrictionUrls/URL白名单模版.csv</p>
         */
        @NameInMap("RestrictedURLsFilePath")
        public String restrictedURLsFilePath;

        public static ModifyBrowserInstanceGroupRequestNetwork build(java.util.Map<String, ?> map) throws Exception {
            ModifyBrowserInstanceGroupRequestNetwork self = new ModifyBrowserInstanceGroupRequestNetwork();
            return TeaModel.build(map, self);
        }

        public ModifyBrowserInstanceGroupRequestNetwork setAccessRestriction(String accessRestriction) {
            this.accessRestriction = accessRestriction;
            return this;
        }
        public String getAccessRestriction() {
            return this.accessRestriction;
        }

        public ModifyBrowserInstanceGroupRequestNetwork setRemoveRestrictedURLIds(java.util.List<String> removeRestrictedURLIds) {
            this.removeRestrictedURLIds = removeRestrictedURLIds;
            return this;
        }
        public java.util.List<String> getRemoveRestrictedURLIds() {
            return this.removeRestrictedURLIds;
        }

        public ModifyBrowserInstanceGroupRequestNetwork setRestrictedURLs(java.util.List<ModifyBrowserInstanceGroupRequestNetworkRestrictedURLs> restrictedURLs) {
            this.restrictedURLs = restrictedURLs;
            return this;
        }
        public java.util.List<ModifyBrowserInstanceGroupRequestNetworkRestrictedURLs> getRestrictedURLs() {
            return this.restrictedURLs;
        }

        public ModifyBrowserInstanceGroupRequestNetwork setRestrictedURLsFilePath(String restrictedURLsFilePath) {
            this.restrictedURLsFilePath = restrictedURLsFilePath;
            return this;
        }
        public String getRestrictedURLsFilePath() {
            return this.restrictedURLsFilePath;
        }

    }

    public static class ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy extends TeaModel {
        /**
         * <p>The clipboard policy.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Clipboard")
        public String clipboard;

        /**
         * <p>The maximum length for clipboard read operations.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ClipboardReadLimit")
        public Integer clipboardReadLimit;

        /**
         * <p>The clipboard control scope.</p>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("ClipboardScope")
        public String clipboardScope;

        /**
         * <strong>example:</strong>
         * <p>B</p>
         */
        @NameInMap("ClipboardSizeUnit")
        public String clipboardSizeUnit;

        /**
         * <p>The maximum length for clipboard write operations.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ClipboardWriteLimit")
        public Integer clipboardWriteLimit;

        /**
         * <p>The file clipboard policy.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("FileClipboard")
        public String fileClipboard;

        /**
         * <p>The rich text clipboard policy.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("RichTextClipboard")
        public String richTextClipboard;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RichTextClipboardLimit")
        public Integer richTextClipboardLimit;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RichTextClipboardReadLimit")
        public Integer richTextClipboardReadLimit;

        /**
         * <strong>example:</strong>
         * <p>KB</p>
         */
        @NameInMap("RichTextClipboardReadSizeUnit")
        public String richTextClipboardReadSizeUnit;

        /**
         * <strong>example:</strong>
         * <p>B</p>
         */
        @NameInMap("RichTextClipboardSizeUnit")
        public String richTextClipboardSizeUnit;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RichTextClipboardWriteLimit")
        public Integer richTextClipboardWriteLimit;

        /**
         * <strong>example:</strong>
         * <p>KB</p>
         */
        @NameInMap("RichTextClipboardWriteSizeUnit")
        public String richTextClipboardWriteSizeUnit;

        /**
         * <p>The text clipboard policy.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("TextClipboard")
        public String textClipboard;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TextClipboardReadLimit")
        public Integer textClipboardReadLimit;

        /**
         * <strong>example:</strong>
         * <p>KB</p>
         */
        @NameInMap("TextClipboardReadSizeUnit")
        public String textClipboardReadSizeUnit;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TextClipboardWriteLimit")
        public Integer textClipboardWriteLimit;

        /**
         * <strong>example:</strong>
         * <p>KB</p>
         */
        @NameInMap("TextClipboardWriteSizeUnit")
        public String textClipboardWriteSizeUnit;

        public static ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy build(java.util.Map<String, ?> map) throws Exception {
            ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy self = new ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy();
            return TeaModel.build(map, self);
        }

        public ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy setClipboard(String clipboard) {
            this.clipboard = clipboard;
            return this;
        }
        public String getClipboard() {
            return this.clipboard;
        }

        public ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy setClipboardReadLimit(Integer clipboardReadLimit) {
            this.clipboardReadLimit = clipboardReadLimit;
            return this;
        }
        public Integer getClipboardReadLimit() {
            return this.clipboardReadLimit;
        }

        public ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy setClipboardScope(String clipboardScope) {
            this.clipboardScope = clipboardScope;
            return this;
        }
        public String getClipboardScope() {
            return this.clipboardScope;
        }

        public ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy setClipboardSizeUnit(String clipboardSizeUnit) {
            this.clipboardSizeUnit = clipboardSizeUnit;
            return this;
        }
        public String getClipboardSizeUnit() {
            return this.clipboardSizeUnit;
        }

        public ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy setClipboardWriteLimit(Integer clipboardWriteLimit) {
            this.clipboardWriteLimit = clipboardWriteLimit;
            return this;
        }
        public Integer getClipboardWriteLimit() {
            return this.clipboardWriteLimit;
        }

        public ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy setFileClipboard(String fileClipboard) {
            this.fileClipboard = fileClipboard;
            return this;
        }
        public String getFileClipboard() {
            return this.fileClipboard;
        }

        public ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy setRichTextClipboard(String richTextClipboard) {
            this.richTextClipboard = richTextClipboard;
            return this;
        }
        public String getRichTextClipboard() {
            return this.richTextClipboard;
        }

        public ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy setRichTextClipboardLimit(Integer richTextClipboardLimit) {
            this.richTextClipboardLimit = richTextClipboardLimit;
            return this;
        }
        public Integer getRichTextClipboardLimit() {
            return this.richTextClipboardLimit;
        }

        public ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy setRichTextClipboardReadLimit(Integer richTextClipboardReadLimit) {
            this.richTextClipboardReadLimit = richTextClipboardReadLimit;
            return this;
        }
        public Integer getRichTextClipboardReadLimit() {
            return this.richTextClipboardReadLimit;
        }

        public ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy setRichTextClipboardReadSizeUnit(String richTextClipboardReadSizeUnit) {
            this.richTextClipboardReadSizeUnit = richTextClipboardReadSizeUnit;
            return this;
        }
        public String getRichTextClipboardReadSizeUnit() {
            return this.richTextClipboardReadSizeUnit;
        }

        public ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy setRichTextClipboardSizeUnit(String richTextClipboardSizeUnit) {
            this.richTextClipboardSizeUnit = richTextClipboardSizeUnit;
            return this;
        }
        public String getRichTextClipboardSizeUnit() {
            return this.richTextClipboardSizeUnit;
        }

        public ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy setRichTextClipboardWriteLimit(Integer richTextClipboardWriteLimit) {
            this.richTextClipboardWriteLimit = richTextClipboardWriteLimit;
            return this;
        }
        public Integer getRichTextClipboardWriteLimit() {
            return this.richTextClipboardWriteLimit;
        }

        public ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy setRichTextClipboardWriteSizeUnit(String richTextClipboardWriteSizeUnit) {
            this.richTextClipboardWriteSizeUnit = richTextClipboardWriteSizeUnit;
            return this;
        }
        public String getRichTextClipboardWriteSizeUnit() {
            return this.richTextClipboardWriteSizeUnit;
        }

        public ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy setTextClipboard(String textClipboard) {
            this.textClipboard = textClipboard;
            return this;
        }
        public String getTextClipboard() {
            return this.textClipboard;
        }

        public ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy setTextClipboardReadLimit(Integer textClipboardReadLimit) {
            this.textClipboardReadLimit = textClipboardReadLimit;
            return this;
        }
        public Integer getTextClipboardReadLimit() {
            return this.textClipboardReadLimit;
        }

        public ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy setTextClipboardReadSizeUnit(String textClipboardReadSizeUnit) {
            this.textClipboardReadSizeUnit = textClipboardReadSizeUnit;
            return this;
        }
        public String getTextClipboardReadSizeUnit() {
            return this.textClipboardReadSizeUnit;
        }

        public ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy setTextClipboardWriteLimit(Integer textClipboardWriteLimit) {
            this.textClipboardWriteLimit = textClipboardWriteLimit;
            return this;
        }
        public Integer getTextClipboardWriteLimit() {
            return this.textClipboardWriteLimit;
        }

        public ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy setTextClipboardWriteSizeUnit(String textClipboardWriteSizeUnit) {
            this.textClipboardWriteSizeUnit = textClipboardWriteSizeUnit;
            return this;
        }
        public String getTextClipboardWriteSizeUnit() {
            return this.textClipboardWriteSizeUnit;
        }

    }

    public static class ModifyBrowserInstanceGroupRequestPolicyVideoPolicy extends TeaModel {
        /**
         * <p>The frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("FrameRate")
        public Integer frameRate;

        public static ModifyBrowserInstanceGroupRequestPolicyVideoPolicy build(java.util.Map<String, ?> map) throws Exception {
            ModifyBrowserInstanceGroupRequestPolicyVideoPolicy self = new ModifyBrowserInstanceGroupRequestPolicyVideoPolicy();
            return TeaModel.build(map, self);
        }

        public ModifyBrowserInstanceGroupRequestPolicyVideoPolicy setFrameRate(Integer frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public Integer getFrameRate() {
            return this.frameRate;
        }

    }

    public static class ModifyBrowserInstanceGroupRequestPolicyWatermarkPolicy extends TeaModel {
        /**
         * <p>Specifies whether to enable the watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("WatermarkSwitch")
        public String watermarkSwitch;

        /**
         * <p>The list of watermark types.</p>
         */
        @NameInMap("WatermarkTypes")
        public java.util.List<String> watermarkTypes;

        public static ModifyBrowserInstanceGroupRequestPolicyWatermarkPolicy build(java.util.Map<String, ?> map) throws Exception {
            ModifyBrowserInstanceGroupRequestPolicyWatermarkPolicy self = new ModifyBrowserInstanceGroupRequestPolicyWatermarkPolicy();
            return TeaModel.build(map, self);
        }

        public ModifyBrowserInstanceGroupRequestPolicyWatermarkPolicy setWatermarkSwitch(String watermarkSwitch) {
            this.watermarkSwitch = watermarkSwitch;
            return this;
        }
        public String getWatermarkSwitch() {
            return this.watermarkSwitch;
        }

        public ModifyBrowserInstanceGroupRequestPolicyWatermarkPolicy setWatermarkTypes(java.util.List<String> watermarkTypes) {
            this.watermarkTypes = watermarkTypes;
            return this;
        }
        public java.util.List<String> getWatermarkTypes() {
            return this.watermarkTypes;
        }

    }

    public static class ModifyBrowserInstanceGroupRequestPolicy extends TeaModel {
        /**
         * <p>The clipboard policy settings.</p>
         */
        @NameInMap("ClipboardPolicy")
        public ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy clipboardPolicy;

        /**
         * <p>The data retention policy for sessions after disconnection.</p>
         * 
         * <strong>example:</strong>
         * <p>customTime</p>
         */
        @NameInMap("DisconnectKeepSession")
        public String disconnectKeepSession;

        /**
         * <p>The session retention duration after disconnection.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("DisconnectKeepSessionTime")
        public Integer disconnectKeepSessionTime;

        /**
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("FileManager")
        public String fileManager;

        /**
         * <p>The file transfer policy for the web client.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Html5FileTransfer")
        public String html5FileTransfer;

        /**
         * <p>The policy for disconnecting sessions after no operation.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("NoOperationDisconnect")
        public String noOperationDisconnect;

        /**
         * <p>The idle timeout period before disconnection, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NoOperationDisconnectTime")
        public Integer noOperationDisconnectTime;

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-12345</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The policy version.</p>
         * 
         * <strong>example:</strong>
         * <p>Center</p>
         */
        @NameInMap("PolicyVersion")
        public String policyVersion;

        /**
         * <p>The display policy.</p>
         */
        @NameInMap("VideoPolicy")
        public ModifyBrowserInstanceGroupRequestPolicyVideoPolicy videoPolicy;

        /**
         * <p>The watermark configuration.</p>
         */
        @NameInMap("WatermarkPolicy")
        public ModifyBrowserInstanceGroupRequestPolicyWatermarkPolicy watermarkPolicy;

        public static ModifyBrowserInstanceGroupRequestPolicy build(java.util.Map<String, ?> map) throws Exception {
            ModifyBrowserInstanceGroupRequestPolicy self = new ModifyBrowserInstanceGroupRequestPolicy();
            return TeaModel.build(map, self);
        }

        public ModifyBrowserInstanceGroupRequestPolicy setClipboardPolicy(ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy clipboardPolicy) {
            this.clipboardPolicy = clipboardPolicy;
            return this;
        }
        public ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy getClipboardPolicy() {
            return this.clipboardPolicy;
        }

        public ModifyBrowserInstanceGroupRequestPolicy setDisconnectKeepSession(String disconnectKeepSession) {
            this.disconnectKeepSession = disconnectKeepSession;
            return this;
        }
        public String getDisconnectKeepSession() {
            return this.disconnectKeepSession;
        }

        public ModifyBrowserInstanceGroupRequestPolicy setDisconnectKeepSessionTime(Integer disconnectKeepSessionTime) {
            this.disconnectKeepSessionTime = disconnectKeepSessionTime;
            return this;
        }
        public Integer getDisconnectKeepSessionTime() {
            return this.disconnectKeepSessionTime;
        }

        public ModifyBrowserInstanceGroupRequestPolicy setFileManager(String fileManager) {
            this.fileManager = fileManager;
            return this;
        }
        public String getFileManager() {
            return this.fileManager;
        }

        public ModifyBrowserInstanceGroupRequestPolicy setHtml5FileTransfer(String html5FileTransfer) {
            this.html5FileTransfer = html5FileTransfer;
            return this;
        }
        public String getHtml5FileTransfer() {
            return this.html5FileTransfer;
        }

        public ModifyBrowserInstanceGroupRequestPolicy setNoOperationDisconnect(String noOperationDisconnect) {
            this.noOperationDisconnect = noOperationDisconnect;
            return this;
        }
        public String getNoOperationDisconnect() {
            return this.noOperationDisconnect;
        }

        public ModifyBrowserInstanceGroupRequestPolicy setNoOperationDisconnectTime(Integer noOperationDisconnectTime) {
            this.noOperationDisconnectTime = noOperationDisconnectTime;
            return this;
        }
        public Integer getNoOperationDisconnectTime() {
            return this.noOperationDisconnectTime;
        }

        public ModifyBrowserInstanceGroupRequestPolicy setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ModifyBrowserInstanceGroupRequestPolicy setPolicyVersion(String policyVersion) {
            this.policyVersion = policyVersion;
            return this;
        }
        public String getPolicyVersion() {
            return this.policyVersion;
        }

        public ModifyBrowserInstanceGroupRequestPolicy setVideoPolicy(ModifyBrowserInstanceGroupRequestPolicyVideoPolicy videoPolicy) {
            this.videoPolicy = videoPolicy;
            return this;
        }
        public ModifyBrowserInstanceGroupRequestPolicyVideoPolicy getVideoPolicy() {
            return this.videoPolicy;
        }

        public ModifyBrowserInstanceGroupRequestPolicy setWatermarkPolicy(ModifyBrowserInstanceGroupRequestPolicyWatermarkPolicy watermarkPolicy) {
            this.watermarkPolicy = watermarkPolicy;
            return this;
        }
        public ModifyBrowserInstanceGroupRequestPolicyWatermarkPolicy getWatermarkPolicy() {
            return this.watermarkPolicy;
        }

    }

    public static class ModifyBrowserInstanceGroupRequestStoragePolicyUserProfile extends TeaModel {
        @NameInMap("UserProfileSwitch")
        public Boolean userProfileSwitch;

        public static ModifyBrowserInstanceGroupRequestStoragePolicyUserProfile build(java.util.Map<String, ?> map) throws Exception {
            ModifyBrowserInstanceGroupRequestStoragePolicyUserProfile self = new ModifyBrowserInstanceGroupRequestStoragePolicyUserProfile();
            return TeaModel.build(map, self);
        }

        public ModifyBrowserInstanceGroupRequestStoragePolicyUserProfile setUserProfileSwitch(Boolean userProfileSwitch) {
            this.userProfileSwitch = userProfileSwitch;
            return this;
        }
        public Boolean getUserProfileSwitch() {
            return this.userProfileSwitch;
        }

    }

    public static class ModifyBrowserInstanceGroupRequestStoragePolicy extends TeaModel {
        @NameInMap("UserProfile")
        public ModifyBrowserInstanceGroupRequestStoragePolicyUserProfile userProfile;

        public static ModifyBrowserInstanceGroupRequestStoragePolicy build(java.util.Map<String, ?> map) throws Exception {
            ModifyBrowserInstanceGroupRequestStoragePolicy self = new ModifyBrowserInstanceGroupRequestStoragePolicy();
            return TeaModel.build(map, self);
        }

        public ModifyBrowserInstanceGroupRequestStoragePolicy setUserProfile(ModifyBrowserInstanceGroupRequestStoragePolicyUserProfile userProfile) {
            this.userProfile = userProfile;
            return this;
        }
        public ModifyBrowserInstanceGroupRequestStoragePolicyUserProfile getUserProfile() {
            return this.userProfile;
        }

    }

    public static class ModifyBrowserInstanceGroupRequestTimers extends TeaModel {
        /**
         * <p>The interval.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The timer type.</p>
         * 
         * <strong>example:</strong>
         * <p>SESSION_TIMEOUT</p>
         */
        @NameInMap("TimerType")
        public String timerType;

        public static ModifyBrowserInstanceGroupRequestTimers build(java.util.Map<String, ?> map) throws Exception {
            ModifyBrowserInstanceGroupRequestTimers self = new ModifyBrowserInstanceGroupRequestTimers();
            return TeaModel.build(map, self);
        }

        public ModifyBrowserInstanceGroupRequestTimers setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ModifyBrowserInstanceGroupRequestTimers setTimerType(String timerType) {
            this.timerType = timerType;
            return this;
        }
        public String getTimerType() {
            return this.timerType;
        }

    }

}
