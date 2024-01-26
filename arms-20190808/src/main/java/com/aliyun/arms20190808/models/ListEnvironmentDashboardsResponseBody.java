// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentDashboardsResponseBody extends TeaModel {
    /**
     * <p>Status code: 200 indicates success.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned struct.</p>
     */
    @NameInMap("Data")
    public ListEnvironmentDashboardsResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The call was successful.</p>
     * <p>*   `false`: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListEnvironmentDashboardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentDashboardsResponseBody self = new ListEnvironmentDashboardsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentDashboardsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListEnvironmentDashboardsResponseBody setData(ListEnvironmentDashboardsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvironmentDashboardsResponseBodyData getData() {
        return this.data;
    }

    public ListEnvironmentDashboardsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEnvironmentDashboardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEnvironmentDashboardsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEnvironmentDashboardsResponseBodyDataDashboards extends TeaModel {
        /**
         * <p>Dashboard folder UID.</p>
         */
        @NameInMap("FolderUid")
        public String folderUid;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>List of tabs on the dashboard.</p>
         */
        @NameInMap("Tags")
        public java.util.List<String> tags;

        /**
         * <p>The title on the dashboard.</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The UID on the dashboard.</p>
         */
        @NameInMap("Uid")
        public String uid;

        /**
         * <p>The URL on the dashboard.</p>
         */
        @NameInMap("Url")
        public String url;

        public static ListEnvironmentDashboardsResponseBodyDataDashboards build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentDashboardsResponseBodyDataDashboards self = new ListEnvironmentDashboardsResponseBodyDataDashboards();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentDashboardsResponseBodyDataDashboards setFolderUid(String folderUid) {
            this.folderUid = folderUid;
            return this;
        }
        public String getFolderUid() {
            return this.folderUid;
        }

        public ListEnvironmentDashboardsResponseBodyDataDashboards setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListEnvironmentDashboardsResponseBodyDataDashboards setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public ListEnvironmentDashboardsResponseBodyDataDashboards setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListEnvironmentDashboardsResponseBodyDataDashboards setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListEnvironmentDashboardsResponseBodyDataDashboards setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListEnvironmentDashboardsResponseBodyData extends TeaModel {
        /**
         * <p>List of dashboard.</p>
         */
        @NameInMap("Dashboards")
        public java.util.List<ListEnvironmentDashboardsResponseBodyDataDashboards> dashboards;

        /**
         * <p>Totle of the dashboards.</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListEnvironmentDashboardsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentDashboardsResponseBodyData self = new ListEnvironmentDashboardsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentDashboardsResponseBodyData setDashboards(java.util.List<ListEnvironmentDashboardsResponseBodyDataDashboards> dashboards) {
            this.dashboards = dashboards;
            return this;
        }
        public java.util.List<ListEnvironmentDashboardsResponseBodyDataDashboards> getDashboards() {
            return this.dashboards;
        }

        public ListEnvironmentDashboardsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
