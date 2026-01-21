// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyBrowserInstanceGroupRequest extends TeaModel {
    /**
     * <p>The browser settings.</p>
     */
    @NameInMap("BrowserConfig")
    public ModifyBrowserInstanceGroupRequestBrowserConfig browserConfig;

    /**
     * <p>The ID of the cloud browser to be modified.</p>
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
     * <p>The network configurations.</p>
     */
    @NameInMap("Network")
    public ModifyBrowserInstanceGroupRequestNetwork network;

    /**
     * <p>The access policy.</p>
     */
    @NameInMap("Policy")
    public ModifyBrowserInstanceGroupRequestPolicy policy;

    /**
     * <p>The timer.</p>
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

    public ModifyBrowserInstanceGroupRequest setTimers(java.util.List<ModifyBrowserInstanceGroupRequestTimers> timers) {
        this.timers = timers;
        return this;
    }
    public java.util.List<ModifyBrowserInstanceGroupRequestTimers> getTimers() {
        return this.timers;
    }

    public static class ModifyBrowserInstanceGroupRequestBrowserConfigBookmarks extends TeaModel {
        /**
         * <p>The folder where the bookmark is located.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("BookmarkFolder")
        public String bookmarkFolder;

        /**
         * <p>The ID of the bookmark. This parameter needs to be specified only to modify the bookmark.</p>
         * 
         * <strong>example:</strong>
         * <p>bm-12345</p>
         */
        @NameInMap("BookmarkId")
        public String bookmarkId;

        /**
         * <p>The name of the bookmark.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("BookmarkName")
        public String bookmarkName;

        /**
         * <p>The URL of the bookmark.</p>
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
         * <p>The bookmark.</p>
         */
        @NameInMap("Bookmarks")
        public java.util.List<ModifyBrowserInstanceGroupRequestBrowserConfigBookmarks> bookmarks;

        /**
         * <p>The startup parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>--incognito</p>
         */
        @NameInMap("BrowserParam")
        public String browserParam;

        /**
         * <p>The home page.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
         */
        @NameInMap("Homepage")
        public String homepage;

        /**
         * <p>The removed bookmarks.</p>
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

        public ModifyBrowserInstanceGroupRequestBrowserConfig setBrowserParam(String browserParam) {
            this.browserParam = browserParam;
            return this;
        }
        public String getBrowserParam() {
            return this.browserParam;
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
         * <p>The ID of the domain name. This parameter is required only when you want to modify the domain restriction configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ru-12345</p>
         */
        @NameInMap("RestrictedURLId")
        public String restrictedURLId;

        /**
         * <p>The restricted domain name.</p>
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
         * <p>The type of the access control list.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>ALLOW_LIST: The whitelist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALLOW_LIST</p>
         */
        @NameInMap("AccessRestriction")
        public String accessRestriction;

        /**
         * <p>The domain names to be removed.</p>
         */
        @NameInMap("RemoveRestrictedURLIds")
        public java.util.List<String> removeRestrictedURLIds;

        /**
         * <p>The domain restriction configurations.</p>
         */
        @NameInMap("RestrictedURLs")
        public java.util.List<ModifyBrowserInstanceGroupRequestNetworkRestrictedURLs> restrictedURLs;

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

    }

    public static class ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy extends TeaModel {
        /**
         * <p>The clipboard policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>read: Allows copying from the local device to the cloud browser.</li>
         * <li>readwrite: Allows copying in both directions.</li>
         * <li>write: Allows copying from the cloud browser to the local device.</li>
         * <li>off: Blocks copying in both directions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Clipboard")
        public String clipboard;

        /**
         * <p>The maximum number of characters allowed when copying from the clipboard.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ClipboardReadLimit")
        public Integer clipboardReadLimit;

        /**
         * <p>The clipboard control scope.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>grained: fine-grained control</li>
         * <li>global: global control</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("ClipboardScope")
        public String clipboardScope;

        @NameInMap("ClipboardSizeUnit")
        public String clipboardSizeUnit;

        /**
         * <p>The maximum number of characters allowed when copying to the clipboard.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ClipboardWriteLimit")
        public Integer clipboardWriteLimit;

        /**
         * <p>The file clipboard policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>read: Allows copying from the local device to the cloud browser.</li>
         * <li>readwrite: Allows copying in both directions.</li>
         * <li>write: Allows copying from the cloud browser to the local device.</li>
         * <li>off: Blocks copying in both directions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("FileClipboard")
        public String fileClipboard;

        /**
         * <p>The rich text clipboard policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>read: Allows copying from the local device to the cloud browser.</li>
         * <li>readwrite: Allows copying in both directions.</li>
         * <li>write: Allows copying from the cloud browser to the local device.</li>
         * <li>off: Blocks copying in both directions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("RichTextClipboard")
        public String richTextClipboard;

        /**
         * <p>The text clipboard policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>read: Allows copying from the local device to the cloud browser.</li>
         * <li>readwrite: Allows copying in both directions.</li>
         * <li>write: Allows copying from the cloud browser to the local device.</li>
         * <li>off: Blocks copying in both directions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("TextClipboard")
        public String textClipboard;

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

        public ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy setTextClipboard(String textClipboard) {
            this.textClipboard = textClipboard;
            return this;
        }
        public String getTextClipboard() {
            return this.textClipboard;
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
         * <p>Valid values:</p>
         * <ul>
         * <li>off</li>
         * <li>on</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("WatermarkSwitch")
        public String watermarkSwitch;

        /**
         * <p>The watermark types.</p>
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
         * <p>The settings related to clipboard control.</p>
         */
        @NameInMap("ClipboardPolicy")
        public ModifyBrowserInstanceGroupRequestPolicyClipboardPolicy clipboardPolicy;

        /**
         * <p>Defines what happens to a session when a user disconnects.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>customTime: The session will be terminated after a custom-defined timeout.</li>
         * <li>persistent: The session will never be automatically terminated..</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>customTime</p>
         */
        @NameInMap("DisconnectKeepSession")
        public String disconnectKeepSession;

        /**
         * <p>The session persistence duration.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("DisconnectKeepSessionTime")
        public Integer disconnectKeepSessionTime;

        /**
         * <p>The file transfer policy on the web client.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Html5FileTransfer")
        public String html5FileTransfer;

        @NameInMap("NoOperationDisconnect")
        public String noOperationDisconnect;

        @NameInMap("NoOperationDisconnectTime")
        public Integer noOperationDisconnectTime;

        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-12345</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The policy version.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>Center: center policy</li>
         * </ul>
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
         * <p>The timer type:</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>SESSION_TIMEOUT: Defines the timeout period before a disconnected session is terminated.</li>
         * </ul>
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
