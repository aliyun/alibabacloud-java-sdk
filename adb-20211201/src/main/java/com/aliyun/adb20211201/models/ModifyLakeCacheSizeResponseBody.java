// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyLakeCacheSizeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ModifyLakeCacheSizeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>494486CE-6F49-574E-B304-29127EA12E36</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLakeCacheSizeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLakeCacheSizeResponseBody self = new ModifyLakeCacheSizeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLakeCacheSizeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ModifyLakeCacheSizeResponseBody setData(ModifyLakeCacheSizeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyLakeCacheSizeResponseBodyData getData() {
        return this.data;
    }

    public ModifyLakeCacheSizeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyLakeCacheSizeResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DataSize")
        public Long dataSize;

        @NameInMap("Instances")
        public java.util.List<String> instances;

        public static ModifyLakeCacheSizeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyLakeCacheSizeResponseBodyData self = new ModifyLakeCacheSizeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyLakeCacheSizeResponseBodyData setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public ModifyLakeCacheSizeResponseBodyData setDataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Long getDataSize() {
            return this.dataSize;
        }

        public ModifyLakeCacheSizeResponseBodyData setInstances(java.util.List<String> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<String> getInstances() {
            return this.instances;
        }

    }

}
