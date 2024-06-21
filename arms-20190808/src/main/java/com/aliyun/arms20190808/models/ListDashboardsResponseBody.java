// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListDashboardsResponseBody extends TeaModel {
    /**
     * <p>The information about the Grafana dashboard.</p>
     */
    @NameInMap("DashboardVos")
    public java.util.List<ListDashboardsResponseBodyDashboardVos> dashboardVos;

    /**
     * <p>The environment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>env-ebd54733482581fc8c4237******</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>Whether to enable Grafana service.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("GrafanaServiceOpened")
    public String grafanaServiceOpened;

    /**
     * <p>Whether or not to turn on Prometheus service.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PrometheusServiceOpened")
    public String prometheusServiceOpened;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2A0CEDF1-06FE-44AC-8E21-21A5BE65****</p>
     */
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

    public ListDashboardsResponseBody setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public ListDashboardsResponseBody setGrafanaServiceOpened(String grafanaServiceOpened) {
        this.grafanaServiceOpened = grafanaServiceOpened;
        return this;
    }
    public String getGrafanaServiceOpened() {
        return this.grafanaServiceOpened;
    }

    public ListDashboardsResponseBody setPrometheusServiceOpened(String prometheusServiceOpened) {
        this.prometheusServiceOpened = prometheusServiceOpened;
        return this;
    }
    public String getPrometheusServiceOpened() {
        return this.prometheusServiceOpened;
    }

    public ListDashboardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDashboardsResponseBodyDashboardVosI18nChild extends TeaModel {
        /**
         * <p>The type of the Grafana dashboard. This parameter has the same effect as the Exporter parameter whereas provides clearer implication.</p>
         * 
         * <strong>example:</strong>
         * <p>Node</p>
         */
        @NameInMap("DashboardType")
        public String dashboardType;

        /**
         * <p>The type of the exporter access source. Valid values:</p>
         * <ul>
         * <li>Prometheus</li>
         * <li>Node</li>
         * <li>GPU</li>
         * <li>Redis</li>
         * <li>MySQL</li>
         * <li>Kafka</li>
         * <li>NGINX V2</li>
         * <li>Nginx</li>
         * <li>ZooKeeper</li>
         * <li>MongoDB</li>
         * <li>RabbitMQ</li>
         * <li>PostgreSQL</li>
         * <li>Kubernetes</li>
         * <li>Client Library</li>
         * <li>Elasticsearch</li>
         * <li>RocketMQ</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Nginx</p>
         */
        @NameInMap("Exporter")
        public String exporter;

        /**
         * <p>The URL of the Grafana dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&refresh=60s">http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&amp;refresh=60s</a></p>
         */
        @NameInMap("HttpUrl")
        public String httpUrl;

        /**
         * <p>The URL of the Grafana dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&refresh=60s">http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&amp;refresh=60s</a></p>
         */
        @NameInMap("HttpsUrl")
        public String httpsUrl;

        /**
         * <p>The ID of the Grafana dashboard. The value is unique only when you install the Grafana dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>1100**</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether the exporter was provided by ARMS. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The exporter is provided by ARMS.</li>
         * <li><code>false</code>: The exporter is not provided by ARMS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsArmsExporter")
        public Boolean isArmsExporter;

        /**
         * <p>The category of the Grafana dashboard. Valid values: BASIC, THIRD, LIMIT, and CUSTOM.</p>
         * 
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        @NameInMap("Kind")
        public String kind;

        /**
         * <p>The language of the Grafana dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The name of the Grafana dashboard. This parameter is different from the <strong>Title</strong> parameter as this parameter cannot be changed.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-node-overview</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the Grafana dashboard has a new version that was available for upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NeedUpdate")
        public Boolean needUpdate;

        /**
         * <p>The tags of the Grafana dashboard.</p>
         */
        @NameInMap("Tags")
        public java.util.List<String> tags;

        /**
         * <p>The timestamp when the Grafana dashboard was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1590136924</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The title of the Grafana dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>ApiServer</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The type of the Grafana dashboard. Valid values:</p>
         * <ul>
         * <li><code>dash-db</code>: a dashboard</li>
         * <li><code>dash-folder</code>: a folder that can include a dashboard</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dash-db</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The unique identifier of a dashboard when multiple Grafana dashboards were installed. It is a unique business ID displayed on the page.</p>
         * 
         * <strong>example:</strong>
         * <p>1131971649496228-*****-59</p>
         */
        @NameInMap("Uid")
        public String uid;

        /**
         * <p>The complete URL of the Grafana dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&refresh=60s">http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&amp;refresh=60s</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The version of the Grafana dashboard. The combination of version and name uniquely identifies a dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
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
        /**
         * <p>The type of the Grafana dashboard. This parameter has the same effect as the Exporter parameter whereas provides clearer implication.</p>
         * 
         * <strong>example:</strong>
         * <p>Node</p>
         */
        @NameInMap("DashboardType")
        public String dashboardType;

        /**
         * <p>The type of the exporter access source. Valid values:</p>
         * <ul>
         * <li>Prometheus</li>
         * <li>Node</li>
         * <li>GPU</li>
         * <li>Redis</li>
         * <li>MySQL</li>
         * <li>Kafka</li>
         * <li>NGINX V2</li>
         * <li>Nginx</li>
         * <li>ZooKeeper</li>
         * <li>MongoDB</li>
         * <li>RabbitMQ</li>
         * <li>PostgreSQL</li>
         * <li>Kubernetes</li>
         * <li>Client Library</li>
         * <li>Elasticsearch</li>
         * <li>RocketMQ</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Nginx</p>
         */
        @NameInMap("Exporter")
        public String exporter;

        /**
         * <p>The URL of the Grafana dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&refresh=60s">http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&amp;refresh=60s</a></p>
         */
        @NameInMap("HttpUrl")
        public String httpUrl;

        /**
         * <p>The URL of the Grafana dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&refresh=60s">http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&amp;refresh=60s</a></p>
         */
        @NameInMap("HttpsUrl")
        public String httpsUrl;

        /**
         * <p>The information about the Grafana dashboards.</p>
         */
        @NameInMap("I18nChild")
        public ListDashboardsResponseBodyDashboardVosI18nChild i18nChild;

        /**
         * <p>The ID of the Grafana dashboard. The value is unique only when you install the Grafana dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>1100**</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether the exporter was provided by ARMS. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The exporter is provided by ARMS.</li>
         * <li><code>false</code>: The exporter is not provided by ARMS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsArmsExporter")
        public Boolean isArmsExporter;

        /**
         * <p>The type of the dashboard. Valid values: BASIC, THIRD, LIMIT, and CUSTOM. BASIC indicates a basic dashboard. THIRD indicates a third-party dashboard. LIMIT indicates a time-limited free dashboard. CUSTOM indicates a custom dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        @NameInMap("Kind")
        public String kind;

        /**
         * <p>The language of the Grafana dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The name of the Grafana dashboard. This parameter is different from the <strong>Title</strong> parameter as this parameter cannot be changed.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-node-overview</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the Grafana dashboard has a new version that was available for upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NeedUpdate")
        public Boolean needUpdate;

        /**
         * <p>The tags of the Grafana dashboard.</p>
         */
        @NameInMap("Tags")
        public java.util.List<String> tags;

        /**
         * <p>The timestamp generated when the Grafana dashboard was created. Unit: seconds</p>
         * 
         * <strong>example:</strong>
         * <p>1590136924</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The title of the Grafana dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>ApiServer</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The type of the Grafana dashboard. Valid values:</p>
         * <ul>
         * <li><code>dash-db</code>: a dashboard</li>
         * <li><code>dash-folder</code>: a folder that can include a dashboard</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dash-db</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The unique identifier of a dashboard when multiple Grafana dashboards were installed. It is a unique business ID displayed on the page.</p>
         * 
         * <strong>example:</strong>
         * <p>1131971649496228-*****-59</p>
         */
        @NameInMap("Uid")
        public String uid;

        /**
         * <p>The complete URL of the Grafana dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&refresh=60s">http://g.console.aliyun.com/d/1131971649496228-*****-59/ApiServer?orgId=3**&amp;refresh=60s</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The version of the Grafana dashboard. The combination of version and name uniquely identifies a dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
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
