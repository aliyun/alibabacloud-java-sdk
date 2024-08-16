// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListWarehousesResponseBody extends TeaModel {
    /**
     * <p>The list of virtual warehouse instances.</p>
     */
    @NameInMap("WarehouseList")
    public java.util.List<ListWarehousesResponseBodyWarehouseList> warehouseList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>819A7F0F-2951-540F-BD94-6A41ECF0281F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListWarehousesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWarehousesResponseBody self = new ListWarehousesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWarehousesResponseBody setWarehouseList(java.util.List<ListWarehousesResponseBodyWarehouseList> warehouseList) {
        this.warehouseList = warehouseList;
        return this;
    }
    public java.util.List<ListWarehousesResponseBodyWarehouseList> getWarehouseList() {
        return this.warehouseList;
    }

    public ListWarehousesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListWarehousesResponseBodyWarehouseList extends TeaModel {
        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("Cpu")
        public Long cpu;

        /**
         * <p>The ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The memory capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Mem")
        public Long mem;

        /**
         * <p>The name of the virtual warehouse instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MyWarehouse</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of compute nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NodeCount")
        public Long nodeCount;

        /**
         * <p>The status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>kRunning</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>kSuspended</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>kInit</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>kFailed</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>kAllocating</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>kRunning</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListWarehousesResponseBodyWarehouseList build(java.util.Map<String, ?> map) throws Exception {
            ListWarehousesResponseBodyWarehouseList self = new ListWarehousesResponseBodyWarehouseList();
            return TeaModel.build(map, self);
        }

        public ListWarehousesResponseBodyWarehouseList setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public ListWarehousesResponseBodyWarehouseList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListWarehousesResponseBodyWarehouseList setMem(Long mem) {
            this.mem = mem;
            return this;
        }
        public Long getMem() {
            return this.mem;
        }

        public ListWarehousesResponseBodyWarehouseList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWarehousesResponseBodyWarehouseList setNodeCount(Long nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Long getNodeCount() {
            return this.nodeCount;
        }

        public ListWarehousesResponseBodyWarehouseList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
