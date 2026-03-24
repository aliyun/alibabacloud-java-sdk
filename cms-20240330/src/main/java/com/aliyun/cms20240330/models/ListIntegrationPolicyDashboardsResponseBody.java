// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPolicyDashboardsResponseBody extends TeaModel {
    /**
     * <p>The list of dashboards.</p>
     */
    @NameInMap("dashboards")
    public java.util.List<ListIntegrationPolicyDashboardsResponseBodyDashboards> dashboards;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CD8BA7D6-995D-578D-9941-78B0FECD14B5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The number of components.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListIntegrationPolicyDashboardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPolicyDashboardsResponseBody self = new ListIntegrationPolicyDashboardsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPolicyDashboardsResponseBody setDashboards(java.util.List<ListIntegrationPolicyDashboardsResponseBodyDashboards> dashboards) {
        this.dashboards = dashboards;
        return this;
    }
    public java.util.List<ListIntegrationPolicyDashboardsResponseBodyDashboards> getDashboards() {
        return this.dashboards;
    }

    public ListIntegrationPolicyDashboardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIntegrationPolicyDashboardsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListIntegrationPolicyDashboardsResponseBodyDashboards extends TeaModel {
        /**
         * <p>The dashboard engine. Valid values:
         * grafana: shared Grafana.
         * cms: the self-developed dashboard engine of CloudMonitor.</p>
         * 
         * <strong>example:</strong>
         * <p>grafana</p>
         */
        @NameInMap("engine")
        public String engine;

        /**
         * <p>The UID of the dashboard folder.</p>
         * 
         * <strong>example:</strong>
         * <p>Env-AAA</p>
         */
        @NameInMap("folderUid")
        public String folderUid;

        /**
         * <p>The dashboard name.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-pod</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hongkong</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<String> tags;

        /**
         * <p>The title of the UI module. This is different from the name parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>The ID of the current Alibaba Cloud account. This parameter is read-only.</p>
         * 
         * <strong>example:</strong>
         * <p>1258199346721590</p>
         */
        @NameInMap("uid")
        public String uid;

        /**
         * <p>The webhook URL for PagerDuty integration. V1 and V2 are supported.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://agi.alicdn.com/user/0/0_0_5255362686.png?x-oss-process=image/quality,q_75/format,jpg&file=1734574878007.jpg">https://agi.alicdn.com/user/0/0_0_5255362686.png?x-oss-process=image/quality,q_75/format,jpg&amp;file=1734574878007.jpg</a></p>
         */
        @NameInMap("url")
        public String url;

        public static ListIntegrationPolicyDashboardsResponseBodyDashboards build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPolicyDashboardsResponseBodyDashboards self = new ListIntegrationPolicyDashboardsResponseBodyDashboards();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPolicyDashboardsResponseBodyDashboards setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public ListIntegrationPolicyDashboardsResponseBodyDashboards setFolderUid(String folderUid) {
            this.folderUid = folderUid;
            return this;
        }
        public String getFolderUid() {
            return this.folderUid;
        }

        public ListIntegrationPolicyDashboardsResponseBodyDashboards setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIntegrationPolicyDashboardsResponseBodyDashboards setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListIntegrationPolicyDashboardsResponseBodyDashboards setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public ListIntegrationPolicyDashboardsResponseBodyDashboards setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListIntegrationPolicyDashboardsResponseBodyDashboards setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListIntegrationPolicyDashboardsResponseBodyDashboards setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
