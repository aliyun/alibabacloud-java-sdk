// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPolicyDashboardsResponseBody extends TeaModel {
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
        @NameInMap("folderUid")
        public String folderUid;

        @NameInMap("region")
        public String region;

        @NameInMap("tags")
        public java.util.List<String> tags;

        @NameInMap("title")
        public String title;

        @NameInMap("uid")
        public String uid;

        @NameInMap("url")
        public String url;

        public static ListIntegrationPolicyDashboardsResponseBodyDashboards build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationPolicyDashboardsResponseBodyDashboards self = new ListIntegrationPolicyDashboardsResponseBodyDashboards();
            return TeaModel.build(map, self);
        }

        public ListIntegrationPolicyDashboardsResponseBodyDashboards setFolderUid(String folderUid) {
            this.folderUid = folderUid;
            return this;
        }
        public String getFolderUid() {
            return this.folderUid;
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
