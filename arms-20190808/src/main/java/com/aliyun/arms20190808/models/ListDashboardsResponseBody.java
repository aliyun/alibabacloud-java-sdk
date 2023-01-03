// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListDashboardsResponseBody extends TeaModel {
    // The information about the Grafana dashboards.
    @NameInMap("DashboardVos")
    public java.util.List<ListDashboardsResponseBodyDashboardVos> dashboardVos;

    // The ID of the request.
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
        // The type of the Grafana dashboard. This parameter has the same effect as the Exporter parameter whereas provides clearer implication.
        @NameInMap("DashboardType")
        public String dashboardType;

        // The type of the exporter access source. Valid values:
        // 
        // *   Prometheus
        // *   Node
        // *   GPU
        // *   Redis
        // *   MySQL
        // *   Kafka
        // *   NGINX V2
        // *   Nginx
        // *   ZooKeeper
        // *   MongoDB
        // *   RabbitMQ
        // *   PostgreSQL
        // *   Kubernetes
        // *   Client Library
        // *   Elasticsearch
        // *   RocketMQ
        @NameInMap("Exporter")
        public String exporter;

        // The URL of the Grafana dashboard.
        @NameInMap("HttpUrl")
        public String httpUrl;

        // The URL of the Grafana dashboard.
        @NameInMap("HttpsUrl")
        public String httpsUrl;

        // The ID of the Grafana dashboard. The value is unique only when you install the Grafana dashboard.
        @NameInMap("Id")
        public String id;

        // Indicates whether the exporter was provided by ARMS. Valid values:
        // 
        // *   `true`: The exporter is provided by ARMS.
        // *   `false`: The exporter is not provided by ARMS.
        @NameInMap("IsArmsExporter")
        public Boolean isArmsExporter;

        // The category of the Grafana dashboard. Valid values: BASIC, THIRD, LIMIT, and CUSTOM.
        @NameInMap("Kind")
        public String kind;

        // The language of the Grafana dashboard.
        @NameInMap("Language")
        public String language;

        // The name of the Grafana dashboard. This parameter is different from the **Title** parameter as this parameter cannot be changed.
        @NameInMap("Name")
        public String name;

        // Indicates whether the Grafana dashboard had a new version that was available for upgrade.
        @NameInMap("NeedUpdate")
        public Boolean needUpdate;

        // The tags of the Grafana dashboard.
        @NameInMap("Tags")
        public java.util.List<String> tags;

        // The timestamp when the Grafana dashboard was created.
        @NameInMap("Time")
        public String time;

        // The title of the Grafana dashboard.
        @NameInMap("Title")
        public String title;

        // The type of the Grafana dashboard. Valid values:
        // 
        // *   `dash-db`: a dashboard
        // *   `dash-folder`: a folder that can include a dashboard
        @NameInMap("Type")
        public String type;

        // The unique identifier of a dashboard when multiple Grafana dashboards were installed. It is a unique business ID displayed on the page.
        @NameInMap("Uid")
        public String uid;

        // The complete URL of the Grafana dashboard.
        @NameInMap("Url")
        public String url;

        // The version of the Grafana dashboard. The combination of version and name uniquely identifies a dashboard.
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
        // The type of the Grafana dashboard. This parameter has the same effect as the Exporter parameter whereas provides clearer implication.
        @NameInMap("DashboardType")
        public String dashboardType;

        // The type of the exporter access source. Valid values:
        // 
        // *   Prometheus
        // *   Node
        // *   GPU
        // *   Redis
        // *   MySQL
        // *   Kafka
        // *   NGINX V2
        // *   Nginx
        // *   ZooKeeper
        // *   MongoDB
        // *   RabbitMQ
        // *   PostgreSQL
        // *   Kubernetes
        // *   Client Library
        // *   Elasticsearch
        // *   RocketMQ
        @NameInMap("Exporter")
        public String exporter;

        // The URL of the Grafana dashboard.
        @NameInMap("HttpUrl")
        public String httpUrl;

        // The URL of the Grafana dashboard.
        @NameInMap("HttpsUrl")
        public String httpsUrl;

        // The information about the Grafana dashboard.
        @NameInMap("I18nChild")
        public ListDashboardsResponseBodyDashboardVosI18nChild i18nChild;

        // The ID of the Grafana dashboard. The value is unique only when you install the Grafana dashboard.
        @NameInMap("Id")
        public String id;

        // Indicates whether the exporter was provided by ARMS. Valid values:
        // 
        // *   `true`: The exporter is provided by ARMS.
        // *   `false`: The exporter is not provided by ARMS.
        @NameInMap("IsArmsExporter")
        public Boolean isArmsExporter;

        // The type of the dashboard. Valid values: BASIC, THIRD, LIMIT, and CUSTOM. BASIC indicates a basic dashboard. THIRD indicates a third-party dashboard. LIMIT indicates a time-limited free dashboard. CUSTOM indicates a custom dashboard.
        @NameInMap("Kind")
        public String kind;

        // The language of the Grafana dashboard.
        @NameInMap("Language")
        public String language;

        // The name of the Grafana dashboard. This parameter is different from the **Title** parameter as this parameter cannot be changed.
        @NameInMap("Name")
        public String name;

        // Indicates whether the Grafana dashboard had a new version that was available for upgrade.
        @NameInMap("NeedUpdate")
        public Boolean needUpdate;

        // The tags of the Grafana dashboard.
        @NameInMap("Tags")
        public java.util.List<String> tags;

        // The timestamp when the Grafana dashboard was created.
        @NameInMap("Time")
        public String time;

        // The title of the Grafana dashboard.
        @NameInMap("Title")
        public String title;

        // The type of the Grafana dashboard. Valid values:
        // 
        // *   `dash-db`: a dashboard
        // *   `dash-folder`: a folder that can include a dashboard
        @NameInMap("Type")
        public String type;

        // The unique identifier of a dashboard when multiple Grafana dashboards were installed. It is a unique business ID displayed on the page.
        @NameInMap("Uid")
        public String uid;

        // The complete URL of the Grafana dashboard.
        @NameInMap("Url")
        public String url;

        // The version of the Grafana dashboard. The combination of version and name uniquely identifies a dashboard.
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
