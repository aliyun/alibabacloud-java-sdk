// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPromClustersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PromClusterList")
    @Validation(required = true)
    public java.util.List<ListPromClustersResponsePromClusterList> promClusterList;

    public static ListPromClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPromClustersResponse self = new ListPromClustersResponse();
        return TeaModel.build(map, self);
    }

    public static class ListPromClustersResponsePromClusterList extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("ClusterId")
        @Validation(required = true)
        public String clusterId;

        @NameInMap("ClusterName")
        @Validation(required = true)
        public String clusterName;

        @NameInMap("AgentStatus")
        @Validation(required = true)
        public String agentStatus;

        @NameInMap("ClusterType")
        @Validation(required = true)
        public String clusterType;

        @NameInMap("ControllerId")
        @Validation(required = true)
        public String controllerId;

        @NameInMap("IsControllerInstalled")
        @Validation(required = true)
        public Boolean isControllerInstalled;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("PluginsJsonArray")
        @Validation(required = true)
        public String pluginsJsonArray;

        @NameInMap("StateJson")
        @Validation(required = true)
        public String stateJson;

        @NameInMap("NodeNum")
        @Validation(required = true)
        public Integer nodeNum;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        @NameInMap("LastHeartBeatTime")
        @Validation(required = true)
        public Long lastHeartBeatTime;

        @NameInMap("InstallTime")
        @Validation(required = true)
        public Long installTime;

        @NameInMap("Extra")
        @Validation(required = true)
        public String extra;

        @NameInMap("Options")
        @Validation(required = true)
        public String options;

        public static ListPromClustersResponsePromClusterList build(java.util.Map<String, ?> map) throws Exception {
            ListPromClustersResponsePromClusterList self = new ListPromClustersResponsePromClusterList();
            return TeaModel.build(map, self);
        }

    }

}
