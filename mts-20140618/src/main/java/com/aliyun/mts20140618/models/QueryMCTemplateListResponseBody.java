// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMCTemplateListResponseBody extends TeaModel {
    @NameInMap("NonExistTids")
    public QueryMCTemplateListResponseBodyNonExistTids nonExistTids;

    @NameInMap("TemplateList")
    public QueryMCTemplateListResponseBodyTemplateList templateList;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryMCTemplateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMCTemplateListResponseBody self = new QueryMCTemplateListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMCTemplateListResponseBody setNonExistTids(QueryMCTemplateListResponseBodyNonExistTids nonExistTids) {
        this.nonExistTids = nonExistTids;
        return this;
    }
    public QueryMCTemplateListResponseBodyNonExistTids getNonExistTids() {
        return this.nonExistTids;
    }

    public QueryMCTemplateListResponseBody setTemplateList(QueryMCTemplateListResponseBodyTemplateList templateList) {
        this.templateList = templateList;
        return this;
    }
    public QueryMCTemplateListResponseBodyTemplateList getTemplateList() {
        return this.templateList;
    }

    public QueryMCTemplateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryMCTemplateListResponseBodyNonExistTids extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryMCTemplateListResponseBodyNonExistTids build(java.util.Map<String, ?> map) throws Exception {
            QueryMCTemplateListResponseBodyNonExistTids self = new QueryMCTemplateListResponseBodyNonExistTids();
            return TeaModel.build(map, self);
        }

        public QueryMCTemplateListResponseBodyNonExistTids setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class QueryMCTemplateListResponseBodyTemplateListTemplate extends TeaModel {
        @NameInMap("Logo")
        public String logo;

        @NameInMap("Abuse")
        public String abuse;

        @NameInMap("State")
        public String state;

        @NameInMap("Terrorism")
        public String terrorism;

        @NameInMap("Politics")
        public String politics;

        @NameInMap("Qrcode")
        public String qrcode;

        @NameInMap("Live")
        public String live;

        @NameInMap("Spam")
        public String spam;

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

        public static QueryMCTemplateListResponseBodyTemplateListTemplate build(java.util.Map<String, ?> map) throws Exception {
            QueryMCTemplateListResponseBodyTemplateListTemplate self = new QueryMCTemplateListResponseBodyTemplateListTemplate();
            return TeaModel.build(map, self);
        }

        public QueryMCTemplateListResponseBodyTemplateListTemplate setLogo(String logo) {
            this.logo = logo;
            return this;
        }
        public String getLogo() {
            return this.logo;
        }

        public QueryMCTemplateListResponseBodyTemplateListTemplate setAbuse(String abuse) {
            this.abuse = abuse;
            return this;
        }
        public String getAbuse() {
            return this.abuse;
        }

        public QueryMCTemplateListResponseBodyTemplateListTemplate setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryMCTemplateListResponseBodyTemplateListTemplate setTerrorism(String terrorism) {
            this.terrorism = terrorism;
            return this;
        }
        public String getTerrorism() {
            return this.terrorism;
        }

        public QueryMCTemplateListResponseBodyTemplateListTemplate setPolitics(String politics) {
            this.politics = politics;
            return this;
        }
        public String getPolitics() {
            return this.politics;
        }

        public QueryMCTemplateListResponseBodyTemplateListTemplate setQrcode(String qrcode) {
            this.qrcode = qrcode;
            return this;
        }
        public String getQrcode() {
            return this.qrcode;
        }

        public QueryMCTemplateListResponseBodyTemplateListTemplate setLive(String live) {
            this.live = live;
            return this;
        }
        public String getLive() {
            return this.live;
        }

        public QueryMCTemplateListResponseBodyTemplateListTemplate setSpam(String spam) {
            this.spam = spam;
            return this;
        }
        public String getSpam() {
            return this.spam;
        }

        public QueryMCTemplateListResponseBodyTemplateListTemplate setContraband(String contraband) {
            this.contraband = contraband;
            return this;
        }
        public String getContraband() {
            return this.contraband;
        }

        public QueryMCTemplateListResponseBodyTemplateListTemplate setAd(String ad) {
            this.ad = ad;
            return this;
        }
        public String getAd() {
            return this.ad;
        }

        public QueryMCTemplateListResponseBodyTemplateListTemplate setPorn(String porn) {
            this.porn = porn;
            return this;
        }
        public String getPorn() {
            return this.porn;
        }

        public QueryMCTemplateListResponseBodyTemplateListTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMCTemplateListResponseBodyTemplateListTemplate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class QueryMCTemplateListResponseBodyTemplateList extends TeaModel {
        @NameInMap("Template")
        public java.util.List<QueryMCTemplateListResponseBodyTemplateListTemplate> template;

        public static QueryMCTemplateListResponseBodyTemplateList build(java.util.Map<String, ?> map) throws Exception {
            QueryMCTemplateListResponseBodyTemplateList self = new QueryMCTemplateListResponseBodyTemplateList();
            return TeaModel.build(map, self);
        }

        public QueryMCTemplateListResponseBodyTemplateList setTemplate(java.util.List<QueryMCTemplateListResponseBodyTemplateListTemplate> template) {
            this.template = template;
            return this;
        }
        public java.util.List<QueryMCTemplateListResponseBodyTemplateListTemplate> getTemplate() {
            return this.template;
        }

    }

}
