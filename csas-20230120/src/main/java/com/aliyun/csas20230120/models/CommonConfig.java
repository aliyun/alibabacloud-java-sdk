// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CommonConfig extends TeaModel {
    @NameInMap("Idp")
    public CommonConfigIdp idp;

    public static CommonConfig build(java.util.Map<String, ?> map) throws Exception {
        CommonConfig self = new CommonConfig();
        return TeaModel.build(map, self);
    }

    public CommonConfig setIdp(CommonConfigIdp idp) {
        this.idp = idp;
        return this;
    }
    public CommonConfigIdp getIdp() {
        return this.idp;
    }

    public static class CommonConfigIdpDingtalk extends TeaModel {
        @NameInMap("EventCallbackBase")
        public String eventCallbackBase;

        @NameInMap("EventLabel")
        public String eventLabel;

        @NameInMap("HomePage")
        public String homePage;

        @NameInMap("LoginRedirect")
        public String loginRedirect;

        public static CommonConfigIdpDingtalk build(java.util.Map<String, ?> map) throws Exception {
            CommonConfigIdpDingtalk self = new CommonConfigIdpDingtalk();
            return TeaModel.build(map, self);
        }

        public CommonConfigIdpDingtalk setEventCallbackBase(String eventCallbackBase) {
            this.eventCallbackBase = eventCallbackBase;
            return this;
        }
        public String getEventCallbackBase() {
            return this.eventCallbackBase;
        }

        public CommonConfigIdpDingtalk setEventLabel(String eventLabel) {
            this.eventLabel = eventLabel;
            return this;
        }
        public String getEventLabel() {
            return this.eventLabel;
        }

        public CommonConfigIdpDingtalk setHomePage(String homePage) {
            this.homePage = homePage;
            return this;
        }
        public String getHomePage() {
            return this.homePage;
        }

        public CommonConfigIdpDingtalk setLoginRedirect(String loginRedirect) {
            this.loginRedirect = loginRedirect;
            return this;
        }
        public String getLoginRedirect() {
            return this.loginRedirect;
        }

    }

    public static class CommonConfigIdpFeishu extends TeaModel {
        @NameInMap("EventCallbackBase")
        public String eventCallbackBase;

        @NameInMap("EventLabel")
        public String eventLabel;

        @NameInMap("HomePage")
        public String homePage;

        @NameInMap("LoginRedirect")
        public String loginRedirect;

        public static CommonConfigIdpFeishu build(java.util.Map<String, ?> map) throws Exception {
            CommonConfigIdpFeishu self = new CommonConfigIdpFeishu();
            return TeaModel.build(map, self);
        }

        public CommonConfigIdpFeishu setEventCallbackBase(String eventCallbackBase) {
            this.eventCallbackBase = eventCallbackBase;
            return this;
        }
        public String getEventCallbackBase() {
            return this.eventCallbackBase;
        }

        public CommonConfigIdpFeishu setEventLabel(String eventLabel) {
            this.eventLabel = eventLabel;
            return this;
        }
        public String getEventLabel() {
            return this.eventLabel;
        }

        public CommonConfigIdpFeishu setHomePage(String homePage) {
            this.homePage = homePage;
            return this;
        }
        public String getHomePage() {
            return this.homePage;
        }

        public CommonConfigIdpFeishu setLoginRedirect(String loginRedirect) {
            this.loginRedirect = loginRedirect;
            return this;
        }
        public String getLoginRedirect() {
            return this.loginRedirect;
        }

    }

    public static class CommonConfigIdpIdaas2 extends TeaModel {
        @NameInMap("EventCallbackBase")
        public String eventCallbackBase;

        @NameInMap("EventLabel")
        public String eventLabel;

        public static CommonConfigIdpIdaas2 build(java.util.Map<String, ?> map) throws Exception {
            CommonConfigIdpIdaas2 self = new CommonConfigIdpIdaas2();
            return TeaModel.build(map, self);
        }

        public CommonConfigIdpIdaas2 setEventCallbackBase(String eventCallbackBase) {
            this.eventCallbackBase = eventCallbackBase;
            return this;
        }
        public String getEventCallbackBase() {
            return this.eventCallbackBase;
        }

        public CommonConfigIdpIdaas2 setEventLabel(String eventLabel) {
            this.eventLabel = eventLabel;
            return this;
        }
        public String getEventLabel() {
            return this.eventLabel;
        }

    }

    public static class CommonConfigIdpSaml extends TeaModel {
        @NameInMap("Acs")
        public String acs;

        @NameInMap("Metadata")
        public String metadata;

        public static CommonConfigIdpSaml build(java.util.Map<String, ?> map) throws Exception {
            CommonConfigIdpSaml self = new CommonConfigIdpSaml();
            return TeaModel.build(map, self);
        }

        public CommonConfigIdpSaml setAcs(String acs) {
            this.acs = acs;
            return this;
        }
        public String getAcs() {
            return this.acs;
        }

        public CommonConfigIdpSaml setMetadata(String metadata) {
            this.metadata = metadata;
            return this;
        }
        public String getMetadata() {
            return this.metadata;
        }

    }

    public static class CommonConfigIdp extends TeaModel {
        @NameInMap("ApOidcCallbackUrl")
        public String apOidcCallbackUrl;

        @NameInMap("Dingtalk")
        public CommonConfigIdpDingtalk dingtalk;

        @NameInMap("Feishu")
        public CommonConfigIdpFeishu feishu;

        @NameInMap("Idaas2")
        public CommonConfigIdpIdaas2 idaas2;

        @NameInMap("Saml")
        public CommonConfigIdpSaml saml;

        public static CommonConfigIdp build(java.util.Map<String, ?> map) throws Exception {
            CommonConfigIdp self = new CommonConfigIdp();
            return TeaModel.build(map, self);
        }

        public CommonConfigIdp setApOidcCallbackUrl(String apOidcCallbackUrl) {
            this.apOidcCallbackUrl = apOidcCallbackUrl;
            return this;
        }
        public String getApOidcCallbackUrl() {
            return this.apOidcCallbackUrl;
        }

        public CommonConfigIdp setDingtalk(CommonConfigIdpDingtalk dingtalk) {
            this.dingtalk = dingtalk;
            return this;
        }
        public CommonConfigIdpDingtalk getDingtalk() {
            return this.dingtalk;
        }

        public CommonConfigIdp setFeishu(CommonConfigIdpFeishu feishu) {
            this.feishu = feishu;
            return this;
        }
        public CommonConfigIdpFeishu getFeishu() {
            return this.feishu;
        }

        public CommonConfigIdp setIdaas2(CommonConfigIdpIdaas2 idaas2) {
            this.idaas2 = idaas2;
            return this;
        }
        public CommonConfigIdpIdaas2 getIdaas2() {
            return this.idaas2;
        }

        public CommonConfigIdp setSaml(CommonConfigIdpSaml saml) {
            this.saml = saml;
            return this;
        }
        public CommonConfigIdpSaml getSaml() {
            return this.saml;
        }

    }

}
