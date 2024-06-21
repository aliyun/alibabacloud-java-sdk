// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentDashboardsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The result of the operation.</p>
     */
    @NameInMap("Data")
    public ListEnvironmentDashboardsResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A5EC8221-08F2-4C95-9AF1-49FD998C647A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The UID of the folder.</p>
         * 
         * <strong>example:</strong>
         * <p>1374923841627893</p>
         */
        @NameInMap("FolderUid")
        public String folderUid;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The keyword.</p>
         */
        @NameInMap("Tags")
        public java.util.List<String> tags;

        /**
         * <p>The title of the Grafana dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>kafka-instance</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The unique identifier of the dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p>1537863211936042</p>
         */
        @NameInMap("Uid")
        public String uid;

        /**
         * <p>The complete URL of the dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx">http://xxx</a></p>
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
         * <p>The dashboards.</p>
         */
        @NameInMap("Dashboards")
        public java.util.List<ListEnvironmentDashboardsResponseBodyDataDashboards> dashboards;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
