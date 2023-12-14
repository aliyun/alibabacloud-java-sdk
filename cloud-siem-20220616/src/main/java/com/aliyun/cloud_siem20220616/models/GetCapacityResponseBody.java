// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class GetCapacityResponseBody extends TeaModel {
    /**
     * <p>The information about the storage capacity.</p>
     */
    @NameInMap("Data")
    public GetCapacityResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCapacityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCapacityResponseBody self = new GetCapacityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCapacityResponseBody setData(GetCapacityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCapacityResponseBodyData getData() {
        return this.data;
    }

    public GetCapacityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCapacityResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the Logstores for the threat analysis feature exist on the user side. Valid values:</p>
         * <br>
         * <p>*   true: The logs are in the normal state. The log analysis feature is available.</p>
         * <p>*   false: The logs are being cleared. The log analysis feature is unavailable.</p>
         */
        @NameInMap("ExistLogStore")
        public Boolean existLogStore;

        /**
         * <p>The purchased storage capacity of the threat analysis feature. Unit: GB.</p>
         */
        @NameInMap("PreservedCapacity")
        public Long preservedCapacity;

        /**
         * <p>The billable storage capacity of the threat analysis feature. Unit: GB.</p>
         */
        @NameInMap("UsedCapacity")
        public Double usedCapacity;

        public static GetCapacityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCapacityResponseBodyData self = new GetCapacityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCapacityResponseBodyData setExistLogStore(Boolean existLogStore) {
            this.existLogStore = existLogStore;
            return this;
        }
        public Boolean getExistLogStore() {
            return this.existLogStore;
        }

        public GetCapacityResponseBodyData setPreservedCapacity(Long preservedCapacity) {
            this.preservedCapacity = preservedCapacity;
            return this;
        }
        public Long getPreservedCapacity() {
            return this.preservedCapacity;
        }

        public GetCapacityResponseBodyData setUsedCapacity(Double usedCapacity) {
            this.usedCapacity = usedCapacity;
            return this;
        }
        public Double getUsedCapacity() {
            return this.usedCapacity;
        }

    }

}
