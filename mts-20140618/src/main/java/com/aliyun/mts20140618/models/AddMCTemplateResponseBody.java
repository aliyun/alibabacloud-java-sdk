// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddMCTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Template")
    public AddMCTemplateResponseBodyTemplate template;

    public static AddMCTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMCTemplateResponseBody self = new AddMCTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMCTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMCTemplateResponseBody setTemplate(AddMCTemplateResponseBodyTemplate template) {
        this.template = template;
        return this;
    }
    public AddMCTemplateResponseBodyTemplate getTemplate() {
        return this.template;
    }

    public static class AddMCTemplateResponseBodyTemplate extends TeaModel {
        @NameInMap("Logo")
        public String logo;

        @NameInMap("Abuse")
        public String abuse;

        @NameInMap("Terrorism")
        public String terrorism;

        @NameInMap("Politics")
        public String politics;

        @NameInMap("Qrcode")
        public String qrcode;

        @NameInMap("Spam")
        public String spam;

        @NameInMap("Live")
        public String live;

        @NameInMap("Contraband")
        public String contraband;

        @NameInMap("Ad")
        public String ad;

        @NameInMap("Porn")
        public String porn;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateId")
        public String templateId;

        public static AddMCTemplateResponseBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            AddMCTemplateResponseBodyTemplate self = new AddMCTemplateResponseBodyTemplate();
            return TeaModel.build(map, self);
        }

        public AddMCTemplateResponseBodyTemplate setLogo(String logo) {
            this.logo = logo;
            return this;
        }
        public String getLogo() {
            return this.logo;
        }

        public AddMCTemplateResponseBodyTemplate setAbuse(String abuse) {
            this.abuse = abuse;
            return this;
        }
        public String getAbuse() {
            return this.abuse;
        }

        public AddMCTemplateResponseBodyTemplate setTerrorism(String terrorism) {
            this.terrorism = terrorism;
            return this;
        }
        public String getTerrorism() {
            return this.terrorism;
        }

        public AddMCTemplateResponseBodyTemplate setPolitics(String politics) {
            this.politics = politics;
            return this;
        }
        public String getPolitics() {
            return this.politics;
        }

        public AddMCTemplateResponseBodyTemplate setQrcode(String qrcode) {
            this.qrcode = qrcode;
            return this;
        }
        public String getQrcode() {
            return this.qrcode;
        }

        public AddMCTemplateResponseBodyTemplate setSpam(String spam) {
            this.spam = spam;
            return this;
        }
        public String getSpam() {
            return this.spam;
        }

        public AddMCTemplateResponseBodyTemplate setLive(String live) {
            this.live = live;
            return this;
        }
        public String getLive() {
            return this.live;
        }

        public AddMCTemplateResponseBodyTemplate setContraband(String contraband) {
            this.contraband = contraband;
            return this;
        }
        public String getContraband() {
            return this.contraband;
        }

        public AddMCTemplateResponseBodyTemplate setAd(String ad) {
            this.ad = ad;
            return this;
        }
        public String getAd() {
            return this.ad;
        }

        public AddMCTemplateResponseBodyTemplate setPorn(String porn) {
            this.porn = porn;
            return this;
        }
        public String getPorn() {
            return this.porn;
        }

        public AddMCTemplateResponseBodyTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddMCTemplateResponseBodyTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
