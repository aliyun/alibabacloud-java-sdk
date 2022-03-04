// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeVirtualWareHouseClassSetResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeVirtualWareHouseClassSetResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVirtualWareHouseClassSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualWareHouseClassSetResponseBody self = new DescribeVirtualWareHouseClassSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualWareHouseClassSetResponseBody setData(java.util.List<DescribeVirtualWareHouseClassSetResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeVirtualWareHouseClassSetResponseBodyData> getData() {
        return this.data;
    }

    public DescribeVirtualWareHouseClassSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVirtualWareHouseClassSetResponseBodyData extends TeaModel {
        // 最大本地缓存空间调整步长 GiB
        @NameInMap("CacheStorageStep")
        public Integer cacheStorageStep;

        // CPU资源 cores
        @NameInMap("CpuCores")
        public Integer cpuCores;

        // 最大本地缓存空间 GiB
        @NameInMap("MaxCacheStorage")
        public Integer maxCacheStorage;

        // 内存资源 GiB
        @NameInMap("MemoryGiB")
        public Integer memoryGiB;

        // 最小本地缓存空间 GiB
        @NameInMap("MinCacheStorage")
        public Integer minCacheStorage;

        // 规格码
        @NameInMap("Value")
        public String value;

        public static DescribeVirtualWareHouseClassSetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualWareHouseClassSetResponseBodyData self = new DescribeVirtualWareHouseClassSetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualWareHouseClassSetResponseBodyData setCacheStorageStep(Integer cacheStorageStep) {
            this.cacheStorageStep = cacheStorageStep;
            return this;
        }
        public Integer getCacheStorageStep() {
            return this.cacheStorageStep;
        }

        public DescribeVirtualWareHouseClassSetResponseBodyData setCpuCores(Integer cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public Integer getCpuCores() {
            return this.cpuCores;
        }

        public DescribeVirtualWareHouseClassSetResponseBodyData setMaxCacheStorage(Integer maxCacheStorage) {
            this.maxCacheStorage = maxCacheStorage;
            return this;
        }
        public Integer getMaxCacheStorage() {
            return this.maxCacheStorage;
        }

        public DescribeVirtualWareHouseClassSetResponseBodyData setMemoryGiB(Integer memoryGiB) {
            this.memoryGiB = memoryGiB;
            return this;
        }
        public Integer getMemoryGiB() {
            return this.memoryGiB;
        }

        public DescribeVirtualWareHouseClassSetResponseBodyData setMinCacheStorage(Integer minCacheStorage) {
            this.minCacheStorage = minCacheStorage;
            return this;
        }
        public Integer getMinCacheStorage() {
            return this.minCacheStorage;
        }

        public DescribeVirtualWareHouseClassSetResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
