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
        @NameInMap("Abuse")
        public String abuse;

        @NameInMap("Ad")
        public String ad;

        @NameInMap("Contraband")
        public String contraband;

        @NameInMap("Live")
        public String live;

        @NameInMap("Logo")
        public String logo;

        @NameInMap("Name")
        public String name;

        @NameInMap("Politics")
        public String politics;

        @NameInMap("Porn")
        public String porn;

        @NameInMap("Qrcode")
        public String qrcode;

        @NameInMap("Spam")
        public String spam;

        @NameInMap("State")
        public String state;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("Terrorism")
        public String terrorism;

        public static UpdateMCTemplateResponseBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            UpdateMCTemplateResponseBodyTemplate self = new UpdateMCTemplateResponseBodyTemplate();
            return TeaModel.build(map, self);
        }

        public UpdateMCTemplateResponseBodyTemplate setAbuse(String abuse) {
            this.abuse = abuse;
            return this;
        }
        public String getAbuse() {
            return this.abuse;
        }

        public UpdateMCTemplateResponseBodyTemplate setAd(String ad) {
            this.ad = ad;
            return this;
        }
        public String getAd() {
            return this.ad;
        }

        public UpdateMCTemplateResponseBodyTemplate setContraband(String contraband) {
            this.contraband = contraband;
            return this;
        }
        public String getContraband() {
            return this.contraband;
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

        public UpdateMCTemplateResponseBodyTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateMCTemplateResponseBodyTemplate setPolitics(String politics) {
            this.politics = politics;
            return this;
        }
        public String getPolitics() {
            return this.politics;
        }

        public UpdateMCTemplateResponseBodyTemplate setPorn(String porn) {
            this.porn = porn;
            return this;
        }
        public String getPorn() {
            return this.porn;
        }

        public UpdateMCTemplateResponseBodyTemplate setQrcode(String qrcode) {
            this.qrcode = qrcode;
            return this;
        }
        public String getQrcode() {
            return this.qrcode;
        }

        public UpdateMCTemplateResponseBodyTemplate setSpam(String spam) {
            this.spam = spam;
            return this;
        }
        public String getSpam() {
            return this.spam;
        }

        public UpdateMCTemplateResponseBodyTemplate setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateMCTemplateResponseBodyTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public UpdateMCTemplateResponseBodyTemplate setTerrorism(String terrorism) {
            this.terrorism = terrorism;
            return this;
        }
        public String getTerrorism() {
            return this.terrorism;
        }

    }

}
