// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListComponentInstancesResponseBody extends TeaModel {
    @NameInMap("ComponentInstances")
    public java.util.List<ComponentInstances> componentInstances;

    /**
     * <p>本次请求所返回的最大记录条数。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>返回读取到的数据位置，空代表数据已经读取完毕。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>本次请求条件下的数据总量。</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
         * 
         * <strong>example:</strong>
         * <p>HDFS</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>组件服务状态，取值如下：</p>
         * <ul>
         * <li>active：主服务</li>
         * <li>standby：备用服务。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("BizState")
        public String bizState;

        /**
         * <p>Commission状态，取值如下：</p>
         * <ul>
         * <li>COMMISSIONED：已上线</li>
         * <li>COMMISSIONING：上线中</li>
         * <li>DECOMMISSIONED：已下线</li>
         * <li>DECOMMISSIONINPROGRESS：下线进程中</li>
         * <li>DECOMMISSIONFAILED：下线失败</li>
         * <li>INSERVICE：服务中</li>
         * <li>UNKNOWN：未知状态。<p></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INSERVICE</p>
         */
        @NameInMap("CommissionState")
        public String commissionState;

        /**
         * <p>组件实例操作状态，取值如下：</p>
         * <ul>
         * <li>WAITING：等待中</li>
         * <li>INSTALLING：安装中</li>
         * <li>INSTALLED：已安装</li>
         * <li>INSTALL_FAILED：安装失败</li>
         * <li>STARTING：启动中</li>
         * <li>STARTED：已启动</li>
         * <li>START_FAILED：启动失败</li>
         * <li>STOPPING：停止中</li>
         * <li>STOPPED：已停止</li>
         * <li>STOP_FAILED：停止失败</li>
         * </ul>
         */
        @NameInMap("ComponentInstanceState")
        public String componentInstanceState;

        /**
         * <p>组件名称。</p>
         * 
         * <strong>example:</strong>
         * <p>DataNode</p>
         */
        @NameInMap("ComponentName")
        public String componentName;

        /**
         * <p>安装时间戳。</p>
         * 
         * <strong>example:</strong>
         * <p>1628248947000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>期望状态，取值如下：</p>
         * <ul>
         * <li>WAITING：等待中</li>
         * <li>INSTALLING：安装中</li>
         * <li>INSTALLED：已安装</li>
         * <li>INSTALL_FAILED：安装失败</li>
         * <li>STARTING：启动中</li>
         * <li>STARTED：已启动</li>
         * <li>START_FAILED：启动失败</li>
         * <li>STOPPING：停止中</li>
         * <li>STOPPED：已停止</li>
         * <li>STOP_FAILED：停止失败。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STARTED</p>
         */
        @NameInMap("DesiredState")
        public String desiredState;

        /**
         * <p>节点ID。</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1cudc25w2bfwl5****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>节点名称。</p>
         * 
         * <strong>example:</strong>
         * <p>core1-1</p>
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
