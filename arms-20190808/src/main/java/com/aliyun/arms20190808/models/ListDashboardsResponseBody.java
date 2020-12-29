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

    public static class ListDashboardsResponseBodyDashboardVos extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Time")
        public String time;

        @NameInMap("Exporter")
        public String exporter;

        @NameInMap("IsArmsExporter")
        public Boolean isArmsExporter;

        @NameInMap("Url")
        public String url;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        @NameInMap("Title")
        public String title;

        @NameInMap("Id")
        public String id;

        @NameInMap("Uid")
        public String uid;

        public static ListDashboardsResponseBodyDashboardVos build(java.util.Map<String, ?> map) throws Exception {
            ListDashboardsResponseBodyDashboardVos self = new ListDashboardsResponseBodyDashboardVos();
            return TeaModel.build(map, self);
        }

        public ListDashboardsResponseBodyDashboardVos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDashboardsResponseBodyDashboardVos setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public ListDashboardsResponseBodyDashboardVos setExporter(String exporter) {
            this.exporter = exporter;
            return this;
        }
        public String getExporter() {
            return this.exporter;
        }

        public ListDashboardsResponseBodyDashboardVos setIsArmsExporter(Boolean isArmsExporter) {
            this.isArmsExporter = isArmsExporter;
            return this;
        }
        public Boolean getIsArmsExporter() {
            return this.isArmsExporter;
        }

        public ListDashboardsResponseBodyDashboardVos setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ListDashboardsResponseBodyDashboardVos setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public ListDashboardsResponseBodyDashboardVos setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListDashboardsResponseBodyDashboardVos setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDashboardsResponseBodyDashboardVos setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
