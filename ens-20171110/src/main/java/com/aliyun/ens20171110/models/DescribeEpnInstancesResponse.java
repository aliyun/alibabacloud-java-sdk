// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("EPNInstances")
    @Validation(required = true)
    public DescribeEpnInstancesResponseEPNInstances EPNInstances;

    public static DescribeEpnInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEpnInstancesResponse self = new DescribeEpnInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEpnInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEpnInstancesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeEpnInstancesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEpnInstancesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEpnInstancesResponse setEPNInstances(DescribeEpnInstancesResponseEPNInstances EPNInstances) {
        this.EPNInstances = EPNInstances;
        return this;
    }
    public DescribeEpnInstancesResponseEPNInstances getEPNInstances() {
        return this.EPNInstances;
    }

    public static class DescribeEpnInstancesResponseEPNInstancesEPNInstance extends TeaModel {
        @NameInMap("EPNInstanceId")
        @Validation(required = true)
        public String EPNInstanceId;

        @NameInMap("EPNInstanceName")
        @Validation(required = true)
        public String EPNInstanceName;

        @NameInMap("NetworkingModel")
        @Validation(required = true)
        public String networkingModel;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public String modifyTime;

        @NameInMap("EPNInstanceType")
        @Validation(required = true)
        public String EPNInstanceType;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("InternetMaxBandwidthOut")
        @Validation(required = true)
        public Integer internetMaxBandwidthOut;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        public static DescribeEpnInstancesResponseEPNInstancesEPNInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeEpnInstancesResponseEPNInstancesEPNInstance self = new DescribeEpnInstancesResponseEPNInstancesEPNInstance();
            return TeaModel.build(map, self);
        }

        public DescribeEpnInstancesResponseEPNInstancesEPNInstance setEPNInstanceId(String EPNInstanceId) {
            this.EPNInstanceId = EPNInstanceId;
            return this;
        }
        public String getEPNInstanceId() {
            return this.EPNInstanceId;
        }

        public DescribeEpnInstancesResponseEPNInstancesEPNInstance setEPNInstanceName(String EPNInstanceName) {
            this.EPNInstanceName = EPNInstanceName;
            return this;
        }
        public String getEPNInstanceName() {
            return this.EPNInstanceName;
        }

        public DescribeEpnInstancesResponseEPNInstancesEPNInstance setNetworkingModel(String networkingModel) {
            this.networkingModel = networkingModel;
            return this;
        }
        public String getNetworkingModel() {
            return this.networkingModel;
        }

        public DescribeEpnInstancesResponseEPNInstancesEPNInstance setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeEpnInstancesResponseEPNInstancesEPNInstance setEPNInstanceType(String EPNInstanceType) {
            this.EPNInstanceType = EPNInstanceType;
            return this;
        }
        public String getEPNInstanceType() {
            return this.EPNInstanceType;
        }

        public DescribeEpnInstancesResponseEPNInstancesEPNInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeEpnInstancesResponseEPNInstancesEPNInstance setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeEpnInstancesResponseEPNInstancesEPNInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeEpnInstancesResponseEPNInstancesEPNInstance setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeEpnInstancesResponseEPNInstancesEPNInstance setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

    public static class DescribeEpnInstancesResponseEPNInstances extends TeaModel {
        @NameInMap("EPNInstance")
        @Validation(required = true)
        public java.util.List<DescribeEpnInstancesResponseEPNInstancesEPNInstance> EPNInstance;

        public static DescribeEpnInstancesResponseEPNInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeEpnInstancesResponseEPNInstances self = new DescribeEpnInstancesResponseEPNInstances();
            return TeaModel.build(map, self);
        }

        public DescribeEpnInstancesResponseEPNInstances setEPNInstance(java.util.List<DescribeEpnInstancesResponseEPNInstancesEPNInstance> EPNInstance) {
            this.EPNInstance = EPNInstance;
            return this;
        }
        public java.util.List<DescribeEpnInstancesResponseEPNInstancesEPNInstance> getEPNInstance() {
            return this.EPNInstance;
        }

    }

}
