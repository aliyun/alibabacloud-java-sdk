// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListComponentInstancesResponseBody extends TeaModel {
    /**
     * <p>The list of instance component installation information.</p>
     */
    @NameInMap("ComponentInstances")
    public java.util.List<ComponentInstances> componentInstances;

    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If you leave this parameter empty, the query starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7345241A-014C-17D2-A3AC-C72771188F46</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>KNOX</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The status of the component service. Valid values:</p>
         * <ul>
         * <li>active: the primary service.</li>
         * <li>standby: the standby service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("BizState")
        public String bizState;

        /**
         * <p>The status of the Commission. Valid values:</p>
         * <ul>
         * <li>COMMISSIONED</li>
         * <li>COMMISSIONING</li>
         * <li>DECOMMISSIONED</li>
         * <li>DECOMMISSIONINPROGRESS</li>
         * <li>DECOMMISSIONFAILED</li>
         * <li>INSERVICE</li>
         * <li>UNKNOWN</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INSERVICE</p>
         */
        @NameInMap("CommissionState")
        public String commissionState;

        /**
         * <p>The status of the component. Valid values:</p>
         * <ul>
         * <li>WAITING</li>
         * <li>INSTALLING</li>
         * <li>INSTALLED</li>
         * <li>INSTALL_FAILED</li>
         * <li>STARTING</li>
         * <li>STARTED</li>
         * <li>START_FAILED</li>
         * <li>STOPPING</li>
         * <li>STOPPED</li>
         * <li>STOP_FAILED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STARTED</p>
         */
        @NameInMap("ComponentInstanceState")
        public String componentInstanceState;

        /**
         * <p>The component name.</p>
         * 
         * <strong>example:</strong>
         * <p>KNOX</p>
         */
        @NameInMap("ComponentName")
        public String componentName;

        /**
         * <p>The timestamp of the installation.</p>
         * 
         * <strong>example:</strong>
         * <p>1628248947000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Valid values:</p>
         * <ul>
         * <li>WAITING</li>
         * <li>INSTALLING</li>
         * <li>INSTALLED</li>
         * <li>INSTALL_FAILED</li>
         * <li>STARTING</li>
         * <li>STARTED</li>
         * <li>START_FAILED</li>
         * <li>STOPPING</li>
         * <li>STOPPED</li>
         * <li>STOP_FAILED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STARTED</p>
         */
        @NameInMap("DesiredState")
        public String desiredState;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp17yy050pxo01m2****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>emr-worker-1</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

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

        public ComponentInstances setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
