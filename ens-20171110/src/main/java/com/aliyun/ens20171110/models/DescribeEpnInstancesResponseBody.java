// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnInstancesResponseBody extends TeaModel {
    /**
     * <p>Details of EPN instances.</p>
     */
    @NameInMap("EPNInstances")
    public DescribeEpnInstancesResponseBodyEPNInstances EPNInstances;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1707FC0-430C-423A-B624-284046B20399</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeEpnInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEpnInstancesResponseBody self = new DescribeEpnInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEpnInstancesResponseBody setEPNInstances(DescribeEpnInstancesResponseBodyEPNInstances EPNInstances) {
        this.EPNInstances = EPNInstances;
        return this;
    }
    public DescribeEpnInstancesResponseBodyEPNInstances getEPNInstances() {
        return this.EPNInstances;
    }

    public DescribeEpnInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEpnInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEpnInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEpnInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEpnInstancesResponseBodyEPNInstancesEPNInstance extends TeaModel {
        /**
         * <p>The time when the instance was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-01T06:08:46Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the EPN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>epn****</p>
         */
        @NameInMap("EPNInstanceId")
        public String EPNInstanceId;

        /**
         * <p>The name of the EPN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ens_test_epn</p>
         */
        @NameInMap("EPNInstanceName")
        public String EPNInstanceName;

        /**
         * <p>Set the value to EdgeToEdge.</p>
         * 
         * <strong>example:</strong>
         * <p>EdgeToEdge</p>
         */
        @NameInMap("EPNInstanceType")
        public String EPNInstanceType;

        /**
         * <p>The end of the time range during which the data was queried. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-01T06:08:46Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The inbound bandwidth. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        /**
         * <p>The time when the instance was last modified. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-01T06:08:46Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The networking mode. Valid values:</p>
         * <ul>
         * <li>SpeedUp: intelligent acceleration network (Internet)</li>
         * <li>Connection: internal network</li>
         * <li>SpeedUpAndConnection: intelligent acceleration network and internal network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SpeedUp</p>
         */
        @NameInMap("NetworkingModel")
        public String networkingModel;

        /**
         * <p>The beginning of the time range during which the data was queried. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-01T06:08:46Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li>Running</li>
         * <li>Excuting</li>
         * <li>Stopped</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeEpnInstancesResponseBodyEPNInstancesEPNInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeEpnInstancesResponseBodyEPNInstancesEPNInstance self = new DescribeEpnInstancesResponseBodyEPNInstancesEPNInstance();
            return TeaModel.build(map, self);
        }

        public DescribeEpnInstancesResponseBodyEPNInstancesEPNInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeEpnInstancesResponseBodyEPNInstancesEPNInstance setEPNInstanceId(String EPNInstanceId) {
            this.EPNInstanceId = EPNInstanceId;
            return this;
        }
        public String getEPNInstanceId() {
            return this.EPNInstanceId;
        }

        public DescribeEpnInstancesResponseBodyEPNInstancesEPNInstance setEPNInstanceName(String EPNInstanceName) {
            this.EPNInstanceName = EPNInstanceName;
            return this;
        }
        public String getEPNInstanceName() {
            return this.EPNInstanceName;
        }

        public DescribeEpnInstancesResponseBodyEPNInstancesEPNInstance setEPNInstanceType(String EPNInstanceType) {
            this.EPNInstanceType = EPNInstanceType;
            return this;
        }
        public String getEPNInstanceType() {
            return this.EPNInstanceType;
        }

        public DescribeEpnInstancesResponseBodyEPNInstancesEPNInstance setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeEpnInstancesResponseBodyEPNInstancesEPNInstance setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeEpnInstancesResponseBodyEPNInstancesEPNInstance setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeEpnInstancesResponseBodyEPNInstancesEPNInstance setNetworkingModel(String networkingModel) {
            this.networkingModel = networkingModel;
            return this;
        }
        public String getNetworkingModel() {
            return this.networkingModel;
        }

        public DescribeEpnInstancesResponseBodyEPNInstancesEPNInstance setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeEpnInstancesResponseBodyEPNInstancesEPNInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeEpnInstancesResponseBodyEPNInstances extends TeaModel {
        @NameInMap("EPNInstance")
        public java.util.List<DescribeEpnInstancesResponseBodyEPNInstancesEPNInstance> EPNInstance;

        public static DescribeEpnInstancesResponseBodyEPNInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeEpnInstancesResponseBodyEPNInstances self = new DescribeEpnInstancesResponseBodyEPNInstances();
            return TeaModel.build(map, self);
        }

        public DescribeEpnInstancesResponseBodyEPNInstances setEPNInstance(java.util.List<DescribeEpnInstancesResponseBodyEPNInstancesEPNInstance> EPNInstance) {
            this.EPNInstance = EPNInstance;
            return this;
        }
        public java.util.List<DescribeEpnInstancesResponseBodyEPNInstancesEPNInstance> getEPNInstance() {
            return this.EPNInstance;
        }

    }

}
