// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListPrometheusDashboardsResponseBody extends TeaModel {
    /**
     * <p>List of Prometheus instance dashboards.</p>
     */
    @NameInMap("prometheusDashboards")
    public java.util.List<ListPrometheusDashboardsResponseBodyPrometheusDashboards> prometheusDashboards;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Total number of instances</p>
     * 
     * <strong>example:</strong>
     * <p>66</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListPrometheusDashboardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusDashboardsResponseBody self = new ListPrometheusDashboardsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrometheusDashboardsResponseBody setPrometheusDashboards(java.util.List<ListPrometheusDashboardsResponseBodyPrometheusDashboards> prometheusDashboards) {
        this.prometheusDashboards = prometheusDashboards;
        return this;
    }
    public java.util.List<ListPrometheusDashboardsResponseBodyPrometheusDashboards> getPrometheusDashboards() {
        return this.prometheusDashboards;
    }

    public ListPrometheusDashboardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPrometheusDashboardsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPrometheusDashboardsResponseBodyPrometheusDashboards extends TeaModel {
        /**
         * <p>Dashboard ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>Dashboard name.</p>
         * 
         * <strong>example:</strong>
         * <p>pod</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<String> tags;

        /**
         * <p>Dashboard title.</p>
         * 
         * <strong>example:</strong>
         * <p>ceshi</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>Dashboard UID.</p>
         * 
         * <strong>example:</strong>
         * <p>1987395500251724</p>
         */
        @NameInMap("uid")
        public String uid;

        /**
         * <p>Dashboard URL address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://gnew.console.aliyun.com/d/xxx-17460385-807-7-6/cs-cost-application">https://gnew.console.aliyun.com/d/xxx-17460385-807-7-6/cs-cost-application</a></p>
         */
        @NameInMap("url")
        public String url;

        public static ListPrometheusDashboardsResponseBodyPrometheusDashboards build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusDashboardsResponseBodyPrometheusDashboards self = new ListPrometheusDashboardsResponseBodyPrometheusDashboards();
            return TeaModel.build(map, self);
        }

        public ListPrometheusDashboardsResponseBodyPrometheusDashboards setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListPrometheusDashboardsResponseBodyPrometheusDashboards setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPrometheusDashboardsResponseBodyPrometheusDashboards setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public ListPrometheusDashboardsResponseBodyPrometheusDashboards setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListPrometheusDashboardsResponseBodyPrometheusDashboards setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListPrometheusDashboardsResponseBodyPrometheusDashboards setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
