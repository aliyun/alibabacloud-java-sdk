// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListDashboardsResponseBody extends TeaModel {
    @NameInMap("DashboardVos")
    public java.util.List<ListDashboardsResponseBodyDashboardVos> dashboardVos;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDashboardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardsResponseBody self = new ListDashboardsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDashboardsResponseBody setDashboardVos(java.util.List<ListDashboardsResponseBodyDashboardVos> dashboardVos) {
        this.dashboardVos = dashboardVos;
        return this;
    }
    public java.util.List<ListDashboardsResponseBodyDashboardVos> getDashboardVos() {
        return this.dashboardVos;
    }

    public ListDashboardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDashboardsResponseBodyDashboardVosI18nChild extends TeaModel {
        @NameInMap("DashboardType")
        public String dashboardType;

        @NameInMap("Exporter")
        public String exporter;

        @NameInMap("HttpUrl")
        public String httpUrl;

        @NameInMap("HttpsUrl")
        public String httpsUrl;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsArmsExporter")
        public Boolean isArmsExporter;

        @NameInMap("Kind")
        public String kind;

        @NameInMap("Language")
        public String language;

        @NameInMap("Name")
        public String name;

        @NameInMap("NeedUpdate")
        public Boolean needUpdate;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        @NameInMap("Time")
        public String time;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("Url")
        public String url;

        @NameInMap("Version")
        public String version;

        public static ListDashboardsResponseBodyDashboardVosI18nChild build(java.util.Map<String, ?> map) throws Exception {
            ListDashboardsResponseBodyDashboardVosI18nChild self = new ListDashboardsResponseBodyDashboardVosI18nChild();
            return TeaModel.build(map, self);
        }

        public ListDashboardsResponseBodyDashboardVosI18nChild setDashboardType(String dashboardType) {
            this.dashboardType = dashboardType;
            return this;
        }
        public String getDashboardType() {
            return this.dashboardType;
        }

        public ListDashboardsResponseBodyDashboardVosI18nChild setExporter(String exporter) {
            this.exporter = exporter;
            return this;
        }
        public String getExporter() {
            return this.exporter;
        }

        public ListDashboardsResponseBodyDashboardVosI18nChild setHttpUrl(String httpUrl) {
            this.httpUrl = httpUrl;
            return this;
        }
        public String getHttpUrl() {
            return this.httpUrl;
        }

        public ListDashboardsResponseBodyDashboardVosI18nChild setHttpsUrl(String httpsUrl) {
            this.httpsUrl = httpsUrl;
            return this;
        }
        public String getHttpsUrl() {
            return this.httpsUrl;
        }

        public ListDashboardsResponseBodyDashboardVosI18nChild setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDashboardsResponseBodyDashboardVosI18nChild setIsArmsExporter(Boolean isArmsExporter) {
            this.isArmsExporter = isArmsExporter;
            return this;
        }
        public Boolean getIsArmsExporter() {
            return this.isArmsExporter;
        }

        public ListDashboardsResponseBodyDashboardVosI18nChild setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public ListDashboardsResponseBodyDashboardVosI18nChild setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListDashboardsResponseBodyDashboardVosI18nChild setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDashboardsResponseBodyDashboardVosI18nChild setNeedUpdate(Boolean needUpdate) {
            this.needUpdate = needUpdate;
            return this;
        }
        public Boolean getNeedUpdate() {
            return this.needUpdate;
        }

        public ListDashboardsResponseBodyDashboardVosI18nChild setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public ListDashboardsResponseBodyDashboardVosI18nChild setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public ListDashboardsResponseBodyDashboardVosI18nChild setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListDashboardsResponseBodyDashboardVosI18nChild setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDashboardsResponseBodyDashboardVosI18nChild setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListDashboardsResponseBodyDashboardVosI18nChild setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ListDashboardsResponseBodyDashboardVosI18nChild setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListDashboardsResponseBodyDashboardVos extends TeaModel {
        @NameInMap("DashboardType")
        public String dashboardType;

        @NameInMap("Exporter")
        public String exporter;

        @NameInMap("HttpUrl")
        public String httpUrl;

        @NameInMap("HttpsUrl")
        public String httpsUrl;

        @NameInMap("I18nChild")
        public ListDashboardsResponseBodyDashboardVosI18nChild i18nChild;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsArmsExporter")
        public Boolean isArmsExporter;

        @NameInMap("Kind")
        public String kind;

        @NameInMap("Language")
        public String language;

        @NameInMap("Name")
        public String name;

        @NameInMap("NeedUpdate")
        public Boolean needUpdate;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        @NameInMap("Time")
        public String time;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("Url")
        public String url;

        @NameInMap("Version")
        public String version;

        public static ListDashboardsResponseBodyDashboardVos build(java.util.Map<String, ?> map) throws Exception {
            ListDashboardsResponseBodyDashboardVos self = new ListDashboardsResponseBodyDashboardVos();
            return TeaModel.build(map, self);
        }

        public ListDashboardsResponseBodyDashboardVos setDashboardType(String dashboardType) {
            this.dashboardType = dashboardType;
            return this;
        }
        public String getDashboardType() {
            return this.dashboardType;
        }

        public ListDashboardsResponseBodyDashboardVos setExporter(String exporter) {
            this.exporter = exporter;
            return this;
        }
        public String getExporter() {
            return this.exporter;
        }

        public ListDashboardsResponseBodyDashboardVos setHttpUrl(String httpUrl) {
            this.httpUrl = httpUrl;
            return this;
        }
        public String getHttpUrl() {
            return this.httpUrl;
        }

        public ListDashboardsResponseBodyDashboardVos setHttpsUrl(String httpsUrl) {
            this.httpsUrl = httpsUrl;
            return this;
        }
        public String getHttpsUrl() {
            return this.httpsUrl;
        }

        public ListDashboardsResponseBodyDashboardVos setI18nChild(ListDashboardsResponseBodyDashboardVosI18nChild i18nChild) {
            this.i18nChild = i18nChild;
            return this;
        }
        public ListDashboardsResponseBodyDashboardVosI18nChild getI18nChild() {
            return this.i18nChild;
        }

        public ListDashboardsResponseBodyDashboardVos setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDashboardsResponseBodyDashboardVos setIsArmsExporter(Boolean isArmsExporter) {
            this.isArmsExporter = isArmsExporter;
            return this;
        }
        public Boolean getIsArmsExporter() {
            return this.isArmsExporter;
        }

        public ListDashboardsResponseBodyDashboardVos setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public ListDashboardsResponseBodyDashboardVos setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListDashboardsResponseBodyDashboardVos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDashboardsResponseBodyDashboardVos setNeedUpdate(Boolean needUpdate) {
            this.needUpdate = needUpdate;
            return this;
        }
        public Boolean getNeedUpdate() {
            return this.needUpdate;
        }

        public ListDashboardsResponseBodyDashboardVos setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public ListDashboardsResponseBodyDashboardVos setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public ListDashboardsResponseBodyDashboardVos setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListDashboardsResponseBodyDashboardVos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDashboardsResponseBodyDashboardVos setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListDashboardsResponseBodyDashboardVos setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ListDashboardsResponseBodyDashboardVos setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
