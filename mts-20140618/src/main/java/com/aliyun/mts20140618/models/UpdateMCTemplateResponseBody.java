// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMCTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Template")
    public UpdateMCTemplateResponseBodyTemplate template;

    public static UpdateMCTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMCTemplateResponseBody self = new UpdateMCTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMCTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMCTemplateResponseBody setTemplate(UpdateMCTemplateResponseBodyTemplate template) {
        this.template = template;
        return this;
    }
    public UpdateMCTemplateResponseBodyTemplate getTemplate() {
        return this.template;
    }

    public static class UpdateMCTemplateResponseBodyTemplate extends TeaModel {
        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("Name")
        public String name;

        @NameInMap("State")
        public String state;

        @NameInMap("Porn")
        public String porn;

        @NameInMap("Terrorism")
        public String terrorism;

        @NameInMap("Politics")
        public String politics;

        @NameInMap("Ad")
        public String ad;

        @NameInMap("Qrcode")
        public String qrcode;

        @NameInMap("Live")
        public String live;

        @NameInMap("Logo")
        public String logo;

        @NameInMap("Abuse")
        public String abuse;

        @NameInMap("Contraband")
        public String contraband;

        @NameInMap("Spam")
        public String spam;

        public static UpdateMCTemplateResponseBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            UpdateMCTemplateResponseBodyTemplate self = new UpdateMCTemplateResponseBodyTemplate();
            return TeaModel.build(map, self);
        }

        public UpdateMCTemplateResponseBodyTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public UpdateMCTemplateResponseBodyTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateMCTemplateResponseBodyTemplate setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateMCTemplateResponseBodyTemplate setPorn(String porn) {
            this.porn = porn;
            return this;
        }
        public String getPorn() {
            return this.porn;
        }

        public UpdateMCTemplateResponseBodyTemplate setTerrorism(String terrorism) {
            this.terrorism = terrorism;
            return this;
        }
        public String getTerrorism() {
            return this.terrorism;
        }

        public UpdateMCTemplateResponseBodyTemplate setPolitics(String politics) {
            this.politics = politics;
            return this;
        }
        public String getPolitics() {
            return this.politics;
        }

        public UpdateMCTemplateResponseBodyTemplate setAd(String ad) {
            this.ad = ad;
            return this;
        }
        public String getAd() {
            return this.ad;
        }

        public UpdateMCTemplateResponseBodyTemplate setQrcode(String qrcode) {
            this.qrcode = qrcode;
            return this;
        }
        public String getQrcode() {
            return this.qrcode;
        }

        public UpdateMCTemplateResponseBodyTemplate setLive(String live) {
            this.live = live;
            return this;
        }
        public String getLive() {
            return this.live;
        }

        public UpdateMCTemplateResponseBodyTemplate setLogo(String logo) {
            this.logo = logo;
            return this;
        }
        public String getLogo() {
            return this.logo;
        }

        public UpdateMCTemplateResponseBodyTemplate setAbuse(String abuse) {
            this.abuse = abuse;
            return this;
        }
        public String getAbuse() {
            return this.abuse;
        }

        public UpdateMCTemplateResponseBodyTemplate setContraband(String contraband) {
            this.contraband = contraband;
            return this;
        }
        public String getContraband() {
            return this.contraband;
        }

        public UpdateMCTemplateResponseBodyTemplate setSpam(String spam) {
            this.spam = spam;
            return this;
        }
        public String getSpam() {
            return this.spam;
        }

    }

}
