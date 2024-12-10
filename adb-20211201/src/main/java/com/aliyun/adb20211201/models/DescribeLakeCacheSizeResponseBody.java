// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeLakeCacheSizeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeLakeCacheSizeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLakeCacheSizeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLakeCacheSizeResponseBody self = new DescribeLakeCacheSizeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLakeCacheSizeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeLakeCacheSizeResponseBody setData(DescribeLakeCacheSizeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeLakeCacheSizeResponseBodyData getData() {
        return this.data;
    }

    public DescribeLakeCacheSizeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLakeCacheSizeResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <strong>example:</strong>
         * <p>amv-bp10b6646l07akdt</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DataSize")
        public Long dataSize;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableLakeCache")
        public Boolean enableLakeCache;

        @NameInMap("Instances")
        public java.util.List<String> instances;

        public static DescribeLakeCacheSizeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLakeCacheSizeResponseBodyData self = new DescribeLakeCacheSizeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeLakeCacheSizeResponseBodyData setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeLakeCacheSizeResponseBodyData setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeLakeCacheSizeResponseBodyData setDataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Long getDataSize() {
            return this.dataSize;
        }

        public DescribeLakeCacheSizeResponseBodyData setEnableLakeCache(Boolean enableLakeCache) {
            this.enableLakeCache = enableLakeCache;
            return this;
        }
        public Boolean getEnableLakeCache() {
            return this.enableLakeCache;
        }

        public DescribeLakeCacheSizeResponseBodyData setInstances(java.util.List<String> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<String> getInstances() {
            return this.instances;
        }

    }

}
