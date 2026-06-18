// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class WafSiteSettings extends TeaModel {
    /**
     * <p>Configuration for adding bot protection headers.</p>
     */
    @NameInMap("AddBotProtectionHeaders")
    public WafSiteSettingsAddBotProtectionHeaders addBotProtectionHeaders;

    /**
     * <p>Configuration for adding security headers.</p>
     */
    @NameInMap("AddSecurityHeaders")
    public WafSiteSettingsAddSecurityHeaders addSecurityHeaders;

    /**
     * <p>The bandwidth abuse protection settings.</p>
     */
    @NameInMap("BandwidthAbuseProtection")
    public WafSiteSettingsBandwidthAbuseProtection bandwidthAbuseProtection;

    /**
     * <p>The bot management settings.</p>
     */
    @NameInMap("BotManagement")
    public WafSiteSettingsBotManagement botManagement;

    /**
     * <p>Configuration for client IP identification.</p>
     */
    @NameInMap("ClientIpIdentifier")
    public WafSiteSettingsClientIpIdentifier clientIpIdentifier;

    /**
     * <p>Configuration for disabling the security module.</p>
     */
    @NameInMap("DisableSecurityModule")
    public WafSiteSettingsDisableSecurityModule disableSecurityModule;

    /**
     * <p>Configuration for request body inspection.</p>
     */
    @NameInMap("RequestBodyInspection")
    public WafSiteSettingsRequestBodyInspection requestBodyInspection;

    /**
     * <p>The security level settings.</p>
     */
    @NameInMap("SecurityLevel")
    public WafSiteSettingsSecurityLevel securityLevel;

    public static WafSiteSettings build(java.util.Map<String, ?> map) throws Exception {
        WafSiteSettings self = new WafSiteSettings();
        return TeaModel.build(map, self);
    }

    public WafSiteSettings setAddBotProtectionHeaders(WafSiteSettingsAddBotProtectionHeaders addBotProtectionHeaders) {
        this.addBotProtectionHeaders = addBotProtectionHeaders;
        return this;
    }
    public WafSiteSettingsAddBotProtectionHeaders getAddBotProtectionHeaders() {
        return this.addBotProtectionHeaders;
    }

    public WafSiteSettings setAddSecurityHeaders(WafSiteSettingsAddSecurityHeaders addSecurityHeaders) {
        this.addSecurityHeaders = addSecurityHeaders;
        return this;
    }
    public WafSiteSettingsAddSecurityHeaders getAddSecurityHeaders() {
        return this.addSecurityHeaders;
    }

    public WafSiteSettings setBandwidthAbuseProtection(WafSiteSettingsBandwidthAbuseProtection bandwidthAbuseProtection) {
        this.bandwidthAbuseProtection = bandwidthAbuseProtection;
        return this;
    }
    public WafSiteSettingsBandwidthAbuseProtection getBandwidthAbuseProtection() {
        return this.bandwidthAbuseProtection;
    }

    public WafSiteSettings setBotManagement(WafSiteSettingsBotManagement botManagement) {
        this.botManagement = botManagement;
        return this;
    }
    public WafSiteSettingsBotManagement getBotManagement() {
        return this.botManagement;
    }

    public WafSiteSettings setClientIpIdentifier(WafSiteSettingsClientIpIdentifier clientIpIdentifier) {
        this.clientIpIdentifier = clientIpIdentifier;
        return this;
    }
    public WafSiteSettingsClientIpIdentifier getClientIpIdentifier() {
        return this.clientIpIdentifier;
    }

    public WafSiteSettings setDisableSecurityModule(WafSiteSettingsDisableSecurityModule disableSecurityModule) {
        this.disableSecurityModule = disableSecurityModule;
        return this;
    }
    public WafSiteSettingsDisableSecurityModule getDisableSecurityModule() {
        return this.disableSecurityModule;
    }

    public WafSiteSettings setRequestBodyInspection(WafSiteSettingsRequestBodyInspection requestBodyInspection) {
        this.requestBodyInspection = requestBodyInspection;
        return this;
    }
    public WafSiteSettingsRequestBodyInspection getRequestBodyInspection() {
        return this.requestBodyInspection;
    }

    public WafSiteSettings setSecurityLevel(WafSiteSettingsSecurityLevel securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }
    public WafSiteSettingsSecurityLevel getSecurityLevel() {
        return this.securityLevel;
    }

    public static class WafSiteSettingsAddBotProtectionHeaders extends TeaModel {
        /**
         * <p>Specifies whether to add bot protection headers.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        public static WafSiteSettingsAddBotProtectionHeaders build(java.util.Map<String, ?> map) throws Exception {
            WafSiteSettingsAddBotProtectionHeaders self = new WafSiteSettingsAddBotProtectionHeaders();
            return TeaModel.build(map, self);
        }

        public WafSiteSettingsAddBotProtectionHeaders setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class WafSiteSettingsAddSecurityHeaders extends TeaModel {
        /**
         * <p>Specifies whether to add security headers.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        public static WafSiteSettingsAddSecurityHeaders build(java.util.Map<String, ?> map) throws Exception {
            WafSiteSettingsAddSecurityHeaders self = new WafSiteSettingsAddSecurityHeaders();
            return TeaModel.build(map, self);
        }

        public WafSiteSettingsAddSecurityHeaders setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class WafSiteSettingsBandwidthAbuseProtection extends TeaModel {
        /**
         * <p>The action to perform for the bandwidth abuse protection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The rule ID for bandwidth abuse protection.</p>
         * 
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The status of the bandwidth abuse protection rule. Valid values: <code>on</code> and <code>off</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        public static WafSiteSettingsBandwidthAbuseProtection build(java.util.Map<String, ?> map) throws Exception {
            WafSiteSettingsBandwidthAbuseProtection self = new WafSiteSettingsBandwidthAbuseProtection();
            return TeaModel.build(map, self);
        }

        public WafSiteSettingsBandwidthAbuseProtection setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public WafSiteSettingsBandwidthAbuseProtection setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public WafSiteSettingsBandwidthAbuseProtection setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class WafSiteSettingsBotManagementDefiniteBots extends TeaModel {
        /**
         * <p>The action to perform.</p>
         * 
         * <strong>example:</strong>
         * <p>captcha</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20000001</p>
         */
        @NameInMap("Id")
        public Long id;

        public static WafSiteSettingsBotManagementDefiniteBots build(java.util.Map<String, ?> map) throws Exception {
            WafSiteSettingsBotManagementDefiniteBots self = new WafSiteSettingsBotManagementDefiniteBots();
            return TeaModel.build(map, self);
        }

        public WafSiteSettingsBotManagementDefiniteBots setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public WafSiteSettingsBotManagementDefiniteBots setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class WafSiteSettingsBotManagementEffectOnStatic extends TeaModel {
        /**
         * <p>Specifies whether to apply bot management to static resource requests.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        public static WafSiteSettingsBotManagementEffectOnStatic build(java.util.Map<String, ?> map) throws Exception {
            WafSiteSettingsBotManagementEffectOnStatic self = new WafSiteSettingsBotManagementEffectOnStatic();
            return TeaModel.build(map, self);
        }

        public WafSiteSettingsBotManagementEffectOnStatic setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class WafSiteSettingsBotManagementJSDetection extends TeaModel {
        /**
         * <p>Specifies whether to enable JavaScript detection.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        public static WafSiteSettingsBotManagementJSDetection build(java.util.Map<String, ?> map) throws Exception {
            WafSiteSettingsBotManagementJSDetection self = new WafSiteSettingsBotManagementJSDetection();
            return TeaModel.build(map, self);
        }

        public WafSiteSettingsBotManagementJSDetection setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class WafSiteSettingsBotManagementLikelyBots extends TeaModel {
        /**
         * <p>The action to perform.</p>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20000002</p>
         */
        @NameInMap("Id")
        public Long id;

        public static WafSiteSettingsBotManagementLikelyBots build(java.util.Map<String, ?> map) throws Exception {
            WafSiteSettingsBotManagementLikelyBots self = new WafSiteSettingsBotManagementLikelyBots();
            return TeaModel.build(map, self);
        }

        public WafSiteSettingsBotManagementLikelyBots setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public WafSiteSettingsBotManagementLikelyBots setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class WafSiteSettingsBotManagementVerifiedBots extends TeaModel {
        /**
         * <p>The action to perform.</p>
         * 
         * <strong>example:</strong>
         * <p>bypass</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20000003</p>
         */
        @NameInMap("Id")
        public Long id;

        public static WafSiteSettingsBotManagementVerifiedBots build(java.util.Map<String, ?> map) throws Exception {
            WafSiteSettingsBotManagementVerifiedBots self = new WafSiteSettingsBotManagementVerifiedBots();
            return TeaModel.build(map, self);
        }

        public WafSiteSettingsBotManagementVerifiedBots setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public WafSiteSettingsBotManagementVerifiedBots setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class WafSiteSettingsBotManagement extends TeaModel {
        /**
         * <p>Configuration for traffic identified as a definite bot.</p>
         */
        @NameInMap("DefiniteBots")
        public WafSiteSettingsBotManagementDefiniteBots definiteBots;

        /**
         * <p>Configuration to apply bot management to static resource requests.</p>
         */
        @NameInMap("EffectOnStatic")
        public WafSiteSettingsBotManagementEffectOnStatic effectOnStatic;

        /**
         * <p>The JavaScript detection settings.</p>
         */
        @NameInMap("JSDetection")
        public WafSiteSettingsBotManagementJSDetection JSDetection;

        /**
         * <p>Configuration for traffic identified as a likely bot.</p>
         */
        @NameInMap("LikelyBots")
        public WafSiteSettingsBotManagementLikelyBots likelyBots;

        /**
         * <p>Configuration for traffic identified as a verified bot.</p>
         */
        @NameInMap("VerifiedBots")
        public WafSiteSettingsBotManagementVerifiedBots verifiedBots;

        public static WafSiteSettingsBotManagement build(java.util.Map<String, ?> map) throws Exception {
            WafSiteSettingsBotManagement self = new WafSiteSettingsBotManagement();
            return TeaModel.build(map, self);
        }

        public WafSiteSettingsBotManagement setDefiniteBots(WafSiteSettingsBotManagementDefiniteBots definiteBots) {
            this.definiteBots = definiteBots;
            return this;
        }
        public WafSiteSettingsBotManagementDefiniteBots getDefiniteBots() {
            return this.definiteBots;
        }

        public WafSiteSettingsBotManagement setEffectOnStatic(WafSiteSettingsBotManagementEffectOnStatic effectOnStatic) {
            this.effectOnStatic = effectOnStatic;
            return this;
        }
        public WafSiteSettingsBotManagementEffectOnStatic getEffectOnStatic() {
            return this.effectOnStatic;
        }

        public WafSiteSettingsBotManagement setJSDetection(WafSiteSettingsBotManagementJSDetection JSDetection) {
            this.JSDetection = JSDetection;
            return this;
        }
        public WafSiteSettingsBotManagementJSDetection getJSDetection() {
            return this.JSDetection;
        }

        public WafSiteSettingsBotManagement setLikelyBots(WafSiteSettingsBotManagementLikelyBots likelyBots) {
            this.likelyBots = likelyBots;
            return this;
        }
        public WafSiteSettingsBotManagementLikelyBots getLikelyBots() {
            return this.likelyBots;
        }

        public WafSiteSettingsBotManagement setVerifiedBots(WafSiteSettingsBotManagementVerifiedBots verifiedBots) {
            this.verifiedBots = verifiedBots;
            return this;
        }
        public WafSiteSettingsBotManagementVerifiedBots getVerifiedBots() {
            return this.verifiedBots;
        }

    }

    public static class WafSiteSettingsClientIpIdentifier extends TeaModel {
        /**
         * <p>An array of headers to check for the client IP address.</p>
         */
        @NameInMap("Headers")
        public java.util.List<String> headers;

        /**
         * <p>The identification mode.</p>
         * 
         * <strong>example:</strong>
         * <p>headers</p>
         */
        @NameInMap("Mode")
        public String mode;

        public static WafSiteSettingsClientIpIdentifier build(java.util.Map<String, ?> map) throws Exception {
            WafSiteSettingsClientIpIdentifier self = new WafSiteSettingsClientIpIdentifier();
            return TeaModel.build(map, self);
        }

        public WafSiteSettingsClientIpIdentifier setHeaders(java.util.List<String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.List<String> getHeaders() {
            return this.headers;
        }

        public WafSiteSettingsClientIpIdentifier setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class WafSiteSettingsDisableSecurityModule extends TeaModel {
        /**
         * <p>Specifies whether to disable the security module. Set to <code>on</code> to disable.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        public static WafSiteSettingsDisableSecurityModule build(java.util.Map<String, ?> map) throws Exception {
            WafSiteSettingsDisableSecurityModule self = new WafSiteSettingsDisableSecurityModule();
            return TeaModel.build(map, self);
        }

        public WafSiteSettingsDisableSecurityModule setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class WafSiteSettingsRequestBodyInspection extends TeaModel {
        /**
         * <p>The action to perform when the request body size exceeds the limit.</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The rule ID for request body inspection.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The size limit, in bytes, for inspecting the request body.</p>
         */
        @NameInMap("SizeLimit")
        public String sizeLimit;

        public static WafSiteSettingsRequestBodyInspection build(java.util.Map<String, ?> map) throws Exception {
            WafSiteSettingsRequestBodyInspection self = new WafSiteSettingsRequestBodyInspection();
            return TeaModel.build(map, self);
        }

        public WafSiteSettingsRequestBodyInspection setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public WafSiteSettingsRequestBodyInspection setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public WafSiteSettingsRequestBodyInspection setSizeLimit(String sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public String getSizeLimit() {
            return this.sizeLimit;
        }

    }

    public static class WafSiteSettingsSecurityLevel extends TeaModel {
        /**
         * <p>The security level.</p>
         * 
         * <strong>example:</strong>
         * <p>low</p>
         */
        @NameInMap("Value")
        public String value;

        public static WafSiteSettingsSecurityLevel build(java.util.Map<String, ?> map) throws Exception {
            WafSiteSettingsSecurityLevel self = new WafSiteSettingsSecurityLevel();
            return TeaModel.build(map, self);
        }

        public WafSiteSettingsSecurityLevel setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
