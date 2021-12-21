// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowProjectClusterSettingResponseBody extends TeaModel {
    @NameInMap("ClusterSettings")
    public ListFlowProjectClusterSettingResponseBodyClusterSettings clusterSettings;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    public static ListFlowProjectClusterSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowProjectClusterSettingResponseBody self = new ListFlowProjectClusterSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowProjectClusterSettingResponseBody setClusterSettings(ListFlowProjectClusterSettingResponseBodyClusterSettings clusterSettings) {
        this.clusterSettings = clusterSettings;
        return this;
    }
    public ListFlowProjectClusterSettingResponseBodyClusterSettings getClusterSettings() {
        return this.clusterSettings;
    }

    public ListFlowProjectClusterSettingResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowProjectClusterSettingResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowProjectClusterSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowProjectClusterSettingResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingHostList extends TeaModel {
        @NameInMap("Host")
        public java.util.List<String> host;

        public static ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingHostList build(java.util.Map<String, ?> map) throws Exception {
            ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingHostList self = new ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingHostList();
            return TeaModel.build(map, self);
        }

        public ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingHostList setHost(java.util.List<String> host) {
            this.host = host;
            return this;
        }
        public java.util.List<String> getHost() {
            return this.host;
        }

    }

    public static class ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingQueueList extends TeaModel {
        @NameInMap("Queue")
        public java.util.List<String> queue;

        public static ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingQueueList build(java.util.Map<String, ?> map) throws Exception {
            ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingQueueList self = new ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingQueueList();
            return TeaModel.build(map, self);
        }

        public ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingQueueList setQueue(java.util.List<String> queue) {
            this.queue = queue;
            return this;
        }
        public java.util.List<String> getQueue() {
            return this.queue;
        }

    }

    public static class ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingUserList extends TeaModel {
        @NameInMap("User")
        public java.util.List<String> user;

        public static ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingUserList build(java.util.Map<String, ?> map) throws Exception {
            ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingUserList self = new ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingUserList();
            return TeaModel.build(map, self);
        }

        public ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingUserList setUser(java.util.List<String> user) {
            this.user = user;
            return this;
        }
        public java.util.List<String> getUser() {
            return this.user;
        }

    }

    public static class ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSetting extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("DefaultQueue")
        public String defaultQueue;

        @NameInMap("DefaultUser")
        public String defaultUser;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("HostList")
        public ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingHostList hostList;

        @NameInMap("K8sClusterId")
        public String k8sClusterId;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("QueueList")
        public ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingQueueList queueList;

        @NameInMap("UserList")
        public ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingUserList userList;

        public static ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSetting build(java.util.Map<String, ?> map) throws Exception {
            ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSetting self = new ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSetting();
            return TeaModel.build(map, self);
        }

        public ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSetting setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSetting setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSetting setDefaultQueue(String defaultQueue) {
            this.defaultQueue = defaultQueue;
            return this;
        }
        public String getDefaultQueue() {
            return this.defaultQueue;
        }

        public ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSetting setDefaultUser(String defaultUser) {
            this.defaultUser = defaultUser;
            return this;
        }
        public String getDefaultUser() {
            return this.defaultUser;
        }

        public ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSetting setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSetting setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSetting setHostList(ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingHostList hostList) {
            this.hostList = hostList;
            return this;
        }
        public ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingHostList getHostList() {
            return this.hostList;
        }

        public ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSetting setK8sClusterId(String k8sClusterId) {
            this.k8sClusterId = k8sClusterId;
            return this;
        }
        public String getK8sClusterId() {
            return this.k8sClusterId;
        }

        public ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSetting setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSetting setQueueList(ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingQueueList queueList) {
            this.queueList = queueList;
            return this;
        }
        public ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingQueueList getQueueList() {
            return this.queueList;
        }

        public ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSetting setUserList(ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingUserList userList) {
            this.userList = userList;
            return this;
        }
        public ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSettingUserList getUserList() {
            return this.userList;
        }

    }

    public static class ListFlowProjectClusterSettingResponseBodyClusterSettings extends TeaModel {
        @NameInMap("ClusterSetting")
        public java.util.List<ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSetting> clusterSetting;

        public static ListFlowProjectClusterSettingResponseBodyClusterSettings build(java.util.Map<String, ?> map) throws Exception {
            ListFlowProjectClusterSettingResponseBodyClusterSettings self = new ListFlowProjectClusterSettingResponseBodyClusterSettings();
            return TeaModel.build(map, self);
        }

        public ListFlowProjectClusterSettingResponseBodyClusterSettings setClusterSetting(java.util.List<ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSetting> clusterSetting) {
            this.clusterSetting = clusterSetting;
            return this;
        }
        public java.util.List<ListFlowProjectClusterSettingResponseBodyClusterSettingsClusterSetting> getClusterSetting() {
            return this.clusterSetting;
        }

    }

}
