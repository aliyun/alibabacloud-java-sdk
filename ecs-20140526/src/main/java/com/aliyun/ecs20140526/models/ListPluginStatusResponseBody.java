// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ListPluginStatusResponseBody extends TeaModel {
    /**
     * <p>The states of the Cloud Assistant plug-ins on the ECS instances.</p>
     */
    @NameInMap("InstancePluginStatusSet")
    public ListPluginStatusResponseBodyInstancePluginStatusSet instancePluginStatusSet;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListPluginStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPluginStatusResponseBody self = new ListPluginStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPluginStatusResponseBody setInstancePluginStatusSet(ListPluginStatusResponseBodyInstancePluginStatusSet instancePluginStatusSet) {
        this.instancePluginStatusSet = instancePluginStatusSet;
        return this;
    }
    public ListPluginStatusResponseBodyInstancePluginStatusSet getInstancePluginStatusSet() {
        return this.instancePluginStatusSet;
    }

    public ListPluginStatusResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListPluginStatusResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPluginStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPluginStatusResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus extends TeaModel {
        /**
         * <p>The first time when Cloud Assistant reported the state of the plug-in.</p>
         */
        @NameInMap("FirstHeartbeatTime")
        public String firstHeartbeatTime;

        /**
         * <p>The last time when Cloud Assistant reported the state of the plug-in.</p>
         */
        @NameInMap("LastHeartbeatTime")
        public String lastHeartbeatTime;

        /**
         * <p>The name of the plug-in.</p>
         */
        @NameInMap("PluginName")
        public String pluginName;

        /**
         * <p>The state of the Cloud Assistant plug-in. Valid values:</p>
         * <br>
         * <p>* NotInstalled: The plug-in is not installed.</p>
         * <p>* Installed: The one-time plug-in is installed.</p>
         * <p>* Running: The long-running plug-in is running.</p>
         * <p>* Stopped: The long-running plug-in is not running.</p>
         * <p>* Crashed: The plug-in is abnormal.</p>
         * <p>* Removed: The plug-in is uninstalled.</p>
         * <p>* Unknown: The state of the plug-in is unknown.</p>
         */
        @NameInMap("PluginStatus")
        public String pluginStatus;

        /**
         * <p>The version of the plug-in</p>
         */
        @NameInMap("PluginVersion")
        public String pluginVersion;

        public static ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus build(java.util.Map<String, ?> map) throws Exception {
            ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus self = new ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus();
            return TeaModel.build(map, self);
        }

        public ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus setFirstHeartbeatTime(String firstHeartbeatTime) {
            this.firstHeartbeatTime = firstHeartbeatTime;
            return this;
        }
        public String getFirstHeartbeatTime() {
            return this.firstHeartbeatTime;
        }

        public ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus setLastHeartbeatTime(String lastHeartbeatTime) {
            this.lastHeartbeatTime = lastHeartbeatTime;
            return this;
        }
        public String getLastHeartbeatTime() {
            return this.lastHeartbeatTime;
        }

        public ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus setPluginStatus(String pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }
        public String getPluginStatus() {
            return this.pluginStatus;
        }

        public ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus setPluginVersion(String pluginVersion) {
            this.pluginVersion = pluginVersion;
            return this;
        }
        public String getPluginVersion() {
            return this.pluginVersion;
        }

    }

    public static class ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSet extends TeaModel {
        @NameInMap("PluginStatus")
        public java.util.List<ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus> pluginStatus;

        public static ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSet build(java.util.Map<String, ?> map) throws Exception {
            ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSet self = new ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSet();
            return TeaModel.build(map, self);
        }

        public ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSet setPluginStatus(java.util.List<ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus> pluginStatus) {
            this.pluginStatus = pluginStatus;
            return this;
        }
        public java.util.List<ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSetPluginStatus> getPluginStatus() {
            return this.pluginStatus;
        }

    }

    public static class ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatus extends TeaModel {
        /**
         * <p>The ID of the ECS instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Details about the Cloud Assistant plug-in.</p>
         */
        @NameInMap("PluginStatusSet")
        public ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSet pluginStatusSet;

        public static ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatus build(java.util.Map<String, ?> map) throws Exception {
            ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatus self = new ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatus();
            return TeaModel.build(map, self);
        }

        public ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatus setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatus setPluginStatusSet(ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSet pluginStatusSet) {
            this.pluginStatusSet = pluginStatusSet;
            return this;
        }
        public ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatusPluginStatusSet getPluginStatusSet() {
            return this.pluginStatusSet;
        }

    }

    public static class ListPluginStatusResponseBodyInstancePluginStatusSet extends TeaModel {
        @NameInMap("InstancePluginStatus")
        public java.util.List<ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatus> instancePluginStatus;

        public static ListPluginStatusResponseBodyInstancePluginStatusSet build(java.util.Map<String, ?> map) throws Exception {
            ListPluginStatusResponseBodyInstancePluginStatusSet self = new ListPluginStatusResponseBodyInstancePluginStatusSet();
            return TeaModel.build(map, self);
        }

        public ListPluginStatusResponseBodyInstancePluginStatusSet setInstancePluginStatus(java.util.List<ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatus> instancePluginStatus) {
            this.instancePluginStatus = instancePluginStatus;
            return this;
        }
        public java.util.List<ListPluginStatusResponseBodyInstancePluginStatusSetInstancePluginStatus> getInstancePluginStatus() {
            return this.instancePluginStatus;
        }

    }

}
