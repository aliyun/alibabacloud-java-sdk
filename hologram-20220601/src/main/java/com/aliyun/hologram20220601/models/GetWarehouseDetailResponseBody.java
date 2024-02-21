// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetWarehouseDetailResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WarehouseDetail")
    public GetWarehouseDetailResponseBodyWarehouseDetail warehouseDetail;

    public static GetWarehouseDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWarehouseDetailResponseBody self = new GetWarehouseDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWarehouseDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWarehouseDetailResponseBody setWarehouseDetail(GetWarehouseDetailResponseBodyWarehouseDetail warehouseDetail) {
        this.warehouseDetail = warehouseDetail;
        return this;
    }
    public GetWarehouseDetailResponseBodyWarehouseDetail getWarehouseDetail() {
        return this.warehouseDetail;
    }

    public static class GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList extends TeaModel {
        /**
         * <p>cpu</p>
         */
        @NameInMap("Cpu")
        public Long cpu;

        /**
         * <p>id</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Mem")
        public Long mem;

        @NameInMap("Name")
        public String name;

        @NameInMap("NodeCount")
        public Long nodeCount;

        @NameInMap("Status")
        public String status;

        public static GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList build(java.util.Map<String, ?> map) throws Exception {
            GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList self = new GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList();
            return TeaModel.build(map, self);
        }

        public GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList setMem(Long mem) {
            this.mem = mem;
            return this;
        }
        public Long getMem() {
            return this.mem;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList setNodeCount(Long nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Long getNodeCount() {
            return this.nodeCount;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetWarehouseDetailResponseBodyWarehouseDetail extends TeaModel {
        @NameInMap("RemainingCpu")
        public String remainingCpu;

        @NameInMap("ReservedCpu")
        public String reservedCpu;

        @NameInMap("WarehouseList")
        public java.util.List<GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList> warehouseList;

        public static GetWarehouseDetailResponseBodyWarehouseDetail build(java.util.Map<String, ?> map) throws Exception {
            GetWarehouseDetailResponseBodyWarehouseDetail self = new GetWarehouseDetailResponseBodyWarehouseDetail();
            return TeaModel.build(map, self);
        }

        public GetWarehouseDetailResponseBodyWarehouseDetail setRemainingCpu(String remainingCpu) {
            this.remainingCpu = remainingCpu;
            return this;
        }
        public String getRemainingCpu() {
            return this.remainingCpu;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetail setReservedCpu(String reservedCpu) {
            this.reservedCpu = reservedCpu;
            return this;
        }
        public String getReservedCpu() {
            return this.reservedCpu;
        }

        public GetWarehouseDetailResponseBodyWarehouseDetail setWarehouseList(java.util.List<GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList> warehouseList) {
            this.warehouseList = warehouseList;
            return this;
        }
        public java.util.List<GetWarehouseDetailResponseBodyWarehouseDetailWarehouseList> getWarehouseList() {
            return this.warehouseList;
        }

    }

}
