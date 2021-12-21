// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeFlowProjectClusterSettingResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DefaultQueue")
    public String defaultQueue;

    @NameInMap("DefaultUser")
    public String defaultUser;

    @NameInMap("GmtCreate")
    public Long gmtCreate;

    @NameInMap("GmtModified")
    public Long gmtModified;

    @NameInMap("HostList")
    public DescribeFlowProjectClusterSettingResponseBodyHostList hostList;

    @NameInMap("K8sClusterId")
    public String k8sClusterId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("QueueList")
    public DescribeFlowProjectClusterSettingResponseBodyQueueList queueList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserList")
    public DescribeFlowProjectClusterSettingResponseBodyUserList userList;

    public static DescribeFlowProjectClusterSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowProjectClusterSettingResponseBody self = new DescribeFlowProjectClusterSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowProjectClusterSettingResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeFlowProjectClusterSettingResponseBody setDefaultQueue(String defaultQueue) {
        this.defaultQueue = defaultQueue;
        return this;
    }
    public String getDefaultQueue() {
        return this.defaultQueue;
    }

    public DescribeFlowProjectClusterSettingResponseBody setDefaultUser(String defaultUser) {
        this.defaultUser = defaultUser;
        return this;
    }
    public String getDefaultUser() {
        return this.defaultUser;
    }

    public DescribeFlowProjectClusterSettingResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public DescribeFlowProjectClusterSettingResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public DescribeFlowProjectClusterSettingResponseBody setHostList(DescribeFlowProjectClusterSettingResponseBodyHostList hostList) {
        this.hostList = hostList;
        return this;
    }
    public DescribeFlowProjectClusterSettingResponseBodyHostList getHostList() {
        return this.hostList;
    }

    public DescribeFlowProjectClusterSettingResponseBody setK8sClusterId(String k8sClusterId) {
        this.k8sClusterId = k8sClusterId;
        return this;
    }
    public String getK8sClusterId() {
        return this.k8sClusterId;
    }

    public DescribeFlowProjectClusterSettingResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeFlowProjectClusterSettingResponseBody setQueueList(DescribeFlowProjectClusterSettingResponseBodyQueueList queueList) {
        this.queueList = queueList;
        return this;
    }
    public DescribeFlowProjectClusterSettingResponseBodyQueueList getQueueList() {
        return this.queueList;
    }

    public DescribeFlowProjectClusterSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowProjectClusterSettingResponseBody setUserList(DescribeFlowProjectClusterSettingResponseBodyUserList userList) {
        this.userList = userList;
        return this;
    }
    public DescribeFlowProjectClusterSettingResponseBodyUserList getUserList() {
        return this.userList;
    }

    public static class DescribeFlowProjectClusterSettingResponseBodyHostList extends TeaModel {
        @NameInMap("Host")
        public java.util.List<String> host;

        public static DescribeFlowProjectClusterSettingResponseBodyHostList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowProjectClusterSettingResponseBodyHostList self = new DescribeFlowProjectClusterSettingResponseBodyHostList();
            return TeaModel.build(map, self);
        }

        public DescribeFlowProjectClusterSettingResponseBodyHostList setHost(java.util.List<String> host) {
            this.host = host;
            return this;
        }
        public java.util.List<String> getHost() {
            return this.host;
        }

    }

    public static class DescribeFlowProjectClusterSettingResponseBodyQueueList extends TeaModel {
        @NameInMap("Queue")
        public java.util.List<String> queue;

        public static DescribeFlowProjectClusterSettingResponseBodyQueueList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowProjectClusterSettingResponseBodyQueueList self = new DescribeFlowProjectClusterSettingResponseBodyQueueList();
            return TeaModel.build(map, self);
        }

        public DescribeFlowProjectClusterSettingResponseBodyQueueList setQueue(java.util.List<String> queue) {
            this.queue = queue;
            return this;
        }
        public java.util.List<String> getQueue() {
            return this.queue;
        }

    }

    public static class DescribeFlowProjectClusterSettingResponseBodyUserList extends TeaModel {
        @NameInMap("User")
        public java.util.List<String> user;

        public static DescribeFlowProjectClusterSettingResponseBodyUserList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowProjectClusterSettingResponseBodyUserList self = new DescribeFlowProjectClusterSettingResponseBodyUserList();
            return TeaModel.build(map, self);
        }

        public DescribeFlowProjectClusterSettingResponseBodyUserList setUser(java.util.List<String> user) {
            this.user = user;
            return this;
        }
        public java.util.List<String> getUser() {
            return this.user;
        }

    }

}
