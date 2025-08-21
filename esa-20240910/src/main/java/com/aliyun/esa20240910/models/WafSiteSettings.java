// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class WafSiteSettings extends TeaModel {
    @NameInMap("AddBotProtectionHeaders")
    public WafSiteSettingsAddBotProtectionHeaders addBotProtectionHeaders;

    @NameInMap("AddSecurityHeaders")
    public WafSiteSettingsAddSecurityHeaders addSecurityHeaders;

    @NameInMap("BandwidthAbuseProtection")
    public WafSiteSettingsBandwidthAbuseProtection bandwidthAbuseProtection;

    @NameInMap("BotManagement")
    public WafSiteSettingsBotManagement botManagement;

    @NameInMap("ClientIpIdentifier")
    public WafSiteSettingsClientIpIdentifier clientIpIdentifier;

    @NameInMap("DisableSecurityModule")
    public WafSiteSettingsDisableSecurityModule disableSecurityModule;

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

    public WafSiteSettings setSecurityLevel(WafSiteSettingsSecurityLevel securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }
    public WafSiteSettingsSecurityLevel getSecurityLevel() {
        return this.securityLevel;
    }

    public static class WafSiteSettingsAddBotProtectionHeaders extends TeaModel {
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
        @NameInMap("Action")
        public String action;

        @NameInMap("Id")
        public Long id;

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
        @NameInMap("Action")
        public String action;

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
        @NameInMap("Action")
        public String action;

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
        @NameInMap("Action")
        public String action;

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
        @NameInMap("DefiniteBots")
        public WafSiteSettingsBotManagementDefiniteBots definiteBots;

        @NameInMap("EffectOnStatic")
        public WafSiteSettingsBotManagementEffectOnStatic effectOnStatic;

        @NameInMap("JSDetection")
        public WafSiteSettingsBotManagementJSDetection JSDetection;

        @NameInMap("LikelyBots")
        public WafSiteSettingsBotManagementLikelyBots likelyBots;

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
        @NameInMap("Headers")
        public java.util.List<String> headers;

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

    public static class WafSiteSettingsSecurityLevel extends TeaModel {
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
