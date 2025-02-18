// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAppInstancesResponseBody extends TeaModel {
    /**
     * <p>The IDs of the application instances.</p>
     */
    @NameInMap("AppInstanceModels")
    public java.util.List<ListAppInstancesResponseBodyAppInstanceModels> appInstanceModels;

    /**
     * <p>The page number of the returned page. We recommend that you configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page. The value cannot be greater than <code>100</code>. We recommend that you configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>18</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAppInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppInstancesResponseBody self = new ListAppInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppInstancesResponseBody setAppInstanceModels(java.util.List<ListAppInstancesResponseBodyAppInstanceModels> appInstanceModels) {
        this.appInstanceModels = appInstanceModels;
        return this;
    }
    public java.util.List<ListAppInstancesResponseBodyAppInstanceModels> getAppInstanceModels() {
        return this.appInstanceModels;
    }

    public ListAppInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAppInstancesResponseBodyAppInstanceModelsBindInfo extends TeaModel {
        /**
         * <p>The ID of the end user that is bound to the application instance.</p>
         * 
         * <strong>example:</strong>
         * <p>app.test</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The use duration of the application instance. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("UsageDuration")
        public Long usageDuration;

        public static ListAppInstancesResponseBodyAppInstanceModelsBindInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstancesResponseBodyAppInstanceModelsBindInfo self = new ListAppInstancesResponseBodyAppInstanceModelsBindInfo();
            return TeaModel.build(map, self);
        }

        public ListAppInstancesResponseBodyAppInstanceModelsBindInfo setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public ListAppInstancesResponseBodyAppInstanceModelsBindInfo setUsageDuration(Long usageDuration) {
            this.usageDuration = usageDuration;
            return this;
        }
        public Long getUsageDuration() {
            return this.usageDuration;
        }

    }

    public static class ListAppInstancesResponseBodyAppInstanceModels extends TeaModel {
        /**
         * <p>The ID of the delivery group.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-dk8p95irqfst9****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <p>The ID of the application instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ai-8dl7dzchklmka****</p>
         */
        @NameInMap("AppInstanceId")
        public String appInstanceId;

        /**
         * <p>The information about the binding between the application instance and end users.</p>
         */
        @NameInMap("BindInfo")
        public ListAppInstancesResponseBodyAppInstanceModelsBindInfo bindInfo;

        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The time when the application instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-07T20:29:19.000+08:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the application instance was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-07T20:29:19.000+08:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The public IP address associated with the primary NIC. This value is returned only if <code>StrategyType</code> is set to <code>Mixed</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>10.13.13.211</p>
         */
        @NameInMap("MainEthPublicIp")
        public String mainEthPublicIp;

        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The session status. This parameter is returned only if the application instance is in the <code>RUNNING</code> state.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>disconnect: disconnected</li>
         * <li>connect: connected</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>connect</p>
         */
        @NameInMap("SessionStatus")
        public String sessionStatus;

        /**
         * <p>The status of the application instance.</p>
         * 
         * <strong>example:</strong>
         * <p>BOUND</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListAppInstancesResponseBodyAppInstanceModels build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstancesResponseBodyAppInstanceModels self = new ListAppInstancesResponseBodyAppInstanceModels();
            return TeaModel.build(map, self);
        }

        public ListAppInstancesResponseBodyAppInstanceModels setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public ListAppInstancesResponseBodyAppInstanceModels setAppInstanceId(String appInstanceId) {
            this.appInstanceId = appInstanceId;
            return this;
        }
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        public ListAppInstancesResponseBodyAppInstanceModels setBindInfo(ListAppInstancesResponseBodyAppInstanceModelsBindInfo bindInfo) {
            this.bindInfo = bindInfo;
            return this;
        }
        public ListAppInstancesResponseBodyAppInstanceModelsBindInfo getBindInfo() {
            return this.bindInfo;
        }

        public ListAppInstancesResponseBodyAppInstanceModels setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListAppInstancesResponseBodyAppInstanceModels setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAppInstancesResponseBodyAppInstanceModels setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAppInstancesResponseBodyAppInstanceModels setMainEthPublicIp(String mainEthPublicIp) {
            this.mainEthPublicIp = mainEthPublicIp;
            return this;
        }
        public String getMainEthPublicIp() {
            return this.mainEthPublicIp;
        }

        public ListAppInstancesResponseBodyAppInstanceModels setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListAppInstancesResponseBodyAppInstanceModels setSessionStatus(String sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;
        }
        public String getSessionStatus() {
            return this.sessionStatus;
        }

        public ListAppInstancesResponseBodyAppInstanceModels setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
