// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnInstancesResponseBody extends TeaModel {
    @NameInMap("EPNInstances")
    public DescribeEpnInstancesResponseBodyEPNInstances EPNInstances;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("EPNInstanceId")
        public String EPNInstanceId;

        @NameInMap("EPNInstanceName")
        public String EPNInstanceName;

        @NameInMap("EPNInstanceType")
        public String EPNInstanceType;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("NetworkingModel")
        public String networkingModel;

        @NameInMap("StartTime")
        public String startTime;

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
