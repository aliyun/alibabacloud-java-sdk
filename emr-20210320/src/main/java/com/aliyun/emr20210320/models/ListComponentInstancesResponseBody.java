// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListComponentInstancesResponseBody extends TeaModel {
    @NameInMap("ComponentInstances")
    public java.util.List<ComponentInstances> componentInstances;

    /**
     * <p>本次请求所返回的最大记录条数。</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>返回读取到的数据位置，空代表数据已经读取完毕。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>本次请求条件下的数据总量。</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListComponentInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListComponentInstancesResponseBody self = new ListComponentInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListComponentInstancesResponseBody setComponentInstances(java.util.List<ComponentInstances> componentInstances) {
        this.componentInstances = componentInstances;
        return this;
    }
    public java.util.List<ComponentInstances> getComponentInstances() {
        return this.componentInstances;
    }

    public ListComponentInstancesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListComponentInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListComponentInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListComponentInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ComponentInstances extends TeaModel {
        /**
         * <p>应用名称。</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>组件服务状态，取值如下：</p>
         * <p>- active：主服务</p>
         * <p>- standby：备用服务。</p>
         */
        @NameInMap("BizState")
        public String bizState;

        /**
         * <p>Commission状态，取值如下：</p>
         * <p>- COMMISSIONED：已上线</p>
         * <p>- COMMISSIONING：上线中</p>
         * <p>- DECOMMISSIONED：已下线</p>
         * <p>- DECOMMISSIONINPROGRESS：下线进程中</p>
         * <p>- DECOMMISSIONFAILED：下线失败</p>
         * <p>- INSERVICE：服务中</p>
         * <p>- UNKNOWN：未知状态。</p>
         * <p><p></p>
         */
        @NameInMap("CommissionState")
        public String commissionState;

        /**
         * <p>组件实例操作状态，取值如下：</p>
         * <p>- WAITING：等待中</p>
         * <p>- INSTALLING：安装中</p>
         * <p>- INSTALLED：已安装</p>
         * <p>- INSTALL_FAILED：安装失败</p>
         * <p>- STARTING：启动中</p>
         * <p>- STARTED：已启动</p>
         * <p>- START_FAILED：启动失败</p>
         * <p>- STOPPING：停止中</p>
         * <p>- STOPPED：已停止</p>
         * <p>- STOP_FAILED：停止失败</p>
         */
        @NameInMap("ComponentInstanceState")
        public String componentInstanceState;

        /**
         * <p>组件名称。</p>
         */
        @NameInMap("ComponentName")
        public String componentName;

        /**
         * <p>安装时间戳。</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>期望状态，取值如下：</p>
         * <p>- WAITING：等待中</p>
         * <p>- INSTALLING：安装中</p>
         * <p>- INSTALLED：已安装</p>
         * <p>- INSTALL_FAILED：安装失败</p>
         * <p>- STARTING：启动中</p>
         * <p>- STARTED：已启动</p>
         * <p>- START_FAILED：启动失败</p>
         * <p>- STOPPING：停止中</p>
         * <p>- STOPPED：已停止</p>
         * <p>- STOP_FAILED：停止失败。</p>
         */
        @NameInMap("DesiredState")
        public String desiredState;

        /**
         * <p>节点ID。</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>节点名称。</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        public static ComponentInstances build(java.util.Map<String, ?> map) throws Exception {
            ComponentInstances self = new ComponentInstances();
            return TeaModel.build(map, self);
        }

        public ComponentInstances setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public ComponentInstances setBizState(String bizState) {
            this.bizState = bizState;
            return this;
        }
        public String getBizState() {
            return this.bizState;
        }

        public ComponentInstances setCommissionState(String commissionState) {
            this.commissionState = commissionState;
            return this;
        }
        public String getCommissionState() {
            return this.commissionState;
        }

        public ComponentInstances setComponentInstanceState(String componentInstanceState) {
            this.componentInstanceState = componentInstanceState;
            return this;
        }
        public String getComponentInstanceState() {
            return this.componentInstanceState;
        }

        public ComponentInstances setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public ComponentInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ComponentInstances setDesiredState(String desiredState) {
            this.desiredState = desiredState;
            return this;
        }
        public String getDesiredState() {
            return this.desiredState;
        }

        public ComponentInstances setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ComponentInstances setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

    }

}
