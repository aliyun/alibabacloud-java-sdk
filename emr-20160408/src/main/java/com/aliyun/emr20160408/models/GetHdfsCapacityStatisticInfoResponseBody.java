// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetHdfsCapacityStatisticInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HdfsCapacityList")
    public GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityList hdfsCapacityList;

    public static GetHdfsCapacityStatisticInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHdfsCapacityStatisticInfoResponseBody self = new GetHdfsCapacityStatisticInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHdfsCapacityStatisticInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHdfsCapacityStatisticInfoResponseBody setHdfsCapacityList(GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityList hdfsCapacityList) {
        this.hdfsCapacityList = hdfsCapacityList;
        return this;
    }
    public GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityList getHdfsCapacityList() {
        return this.hdfsCapacityList;
    }

    public static class GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityListClusterStatHdfsCapacity extends TeaModel {
        @NameInMap("CapacityUsedNonDfs")
        public Long capacityUsedNonDfs;

        @NameInMap("CapacityTotal")
        public Long capacityTotal;

        @NameInMap("CapacityTotalGB")
        public Long capacityTotalGB;

        @NameInMap("CapacityRemaining")
        public Long capacityRemaining;

        @NameInMap("CapacityUsed")
        public Long capacityUsed;

        @NameInMap("ClusterBizId")
        public String clusterBizId;

        @NameInMap("CapacityUsedGB")
        public Long capacityUsedGB;

        @NameInMap("DateTime")
        public String dateTime;

        @NameInMap("CapacityRemainingGB")
        public Long capacityRemainingGB;

        public static GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityListClusterStatHdfsCapacity build(java.util.Map<String, ?> map) throws Exception {
            GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityListClusterStatHdfsCapacity self = new GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityListClusterStatHdfsCapacity();
            return TeaModel.build(map, self);
        }

        public GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityListClusterStatHdfsCapacity setCapacityUsedNonDfs(Long capacityUsedNonDfs) {
            this.capacityUsedNonDfs = capacityUsedNonDfs;
            return this;
        }
        public Long getCapacityUsedNonDfs() {
            return this.capacityUsedNonDfs;
        }

        public GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityListClusterStatHdfsCapacity setCapacityTotal(Long capacityTotal) {
            this.capacityTotal = capacityTotal;
            return this;
        }
        public Long getCapacityTotal() {
            return this.capacityTotal;
        }

        public GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityListClusterStatHdfsCapacity setCapacityTotalGB(Long capacityTotalGB) {
            this.capacityTotalGB = capacityTotalGB;
            return this;
        }
        public Long getCapacityTotalGB() {
            return this.capacityTotalGB;
        }

        public GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityListClusterStatHdfsCapacity setCapacityRemaining(Long capacityRemaining) {
            this.capacityRemaining = capacityRemaining;
            return this;
        }
        public Long getCapacityRemaining() {
            return this.capacityRemaining;
        }

        public GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityListClusterStatHdfsCapacity setCapacityUsed(Long capacityUsed) {
            this.capacityUsed = capacityUsed;
            return this;
        }
        public Long getCapacityUsed() {
            return this.capacityUsed;
        }

        public GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityListClusterStatHdfsCapacity setClusterBizId(String clusterBizId) {
            this.clusterBizId = clusterBizId;
            return this;
        }
        public String getClusterBizId() {
            return this.clusterBizId;
        }

        public GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityListClusterStatHdfsCapacity setCapacityUsedGB(Long capacityUsedGB) {
            this.capacityUsedGB = capacityUsedGB;
            return this;
        }
        public Long getCapacityUsedGB() {
            return this.capacityUsedGB;
        }

        public GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityListClusterStatHdfsCapacity setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }
        public String getDateTime() {
            return this.dateTime;
        }

        public GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityListClusterStatHdfsCapacity setCapacityRemainingGB(Long capacityRemainingGB) {
            this.capacityRemainingGB = capacityRemainingGB;
            return this;
        }
        public Long getCapacityRemainingGB() {
            return this.capacityRemainingGB;
        }

    }

    public static class GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityList extends TeaModel {
        @NameInMap("ClusterStatHdfsCapacity")
        public java.util.List<GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityListClusterStatHdfsCapacity> clusterStatHdfsCapacity;

        public static GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityList build(java.util.Map<String, ?> map) throws Exception {
            GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityList self = new GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityList();
            return TeaModel.build(map, self);
        }

        public GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityList setClusterStatHdfsCapacity(java.util.List<GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityListClusterStatHdfsCapacity> clusterStatHdfsCapacity) {
            this.clusterStatHdfsCapacity = clusterStatHdfsCapacity;
            return this;
        }
        public java.util.List<GetHdfsCapacityStatisticInfoResponseBodyHdfsCapacityListClusterStatHdfsCapacity> getClusterStatHdfsCapacity() {
            return this.clusterStatHdfsCapacity;
        }

    }

}
