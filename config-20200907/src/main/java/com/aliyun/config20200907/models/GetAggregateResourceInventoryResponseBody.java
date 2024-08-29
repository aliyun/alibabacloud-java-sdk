// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceInventoryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1A6D3604-EF1A-5798-A576-2A5FB855493C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the resource inventory.</p>
     */
    @NameInMap("ResourceInventory")
    public GetAggregateResourceInventoryResponseBodyResourceInventory resourceInventory;

    public static GetAggregateResourceInventoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceInventoryResponseBody self = new GetAggregateResourceInventoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceInventoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAggregateResourceInventoryResponseBody setResourceInventory(GetAggregateResourceInventoryResponseBodyResourceInventory resourceInventory) {
        this.resourceInventory = resourceInventory;
        return this;
    }
    public GetAggregateResourceInventoryResponseBodyResourceInventory getResourceInventory() {
        return this.resourceInventory;
    }

    public static class GetAggregateResourceInventoryResponseBodyResourceInventory extends TeaModel {
        /**
         * <p>The download URL of the resource inventory.</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The time when the resource inventory was generated. The value is a timestamp.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1687674774123</p>
         */
        @NameInMap("ResourceInventoryGenerateTime")
        public Long resourceInventoryGenerateTime;

        /**
         * <p>The generation status of the resource inventory. Valid values:</p>
         * <ul>
         * <li>CREATING: The resource inventory is being generated.</li>
         * <li>COMPLETE: The resource inventory is generated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetAggregateResourceInventoryResponseBodyResourceInventory build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateResourceInventoryResponseBodyResourceInventory self = new GetAggregateResourceInventoryResponseBodyResourceInventory();
            return TeaModel.build(map, self);
        }

        public GetAggregateResourceInventoryResponseBodyResourceInventory setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetAggregateResourceInventoryResponseBodyResourceInventory setResourceInventoryGenerateTime(Long resourceInventoryGenerateTime) {
            this.resourceInventoryGenerateTime = resourceInventoryGenerateTime;
            return this;
        }
        public Long getResourceInventoryGenerateTime() {
            return this.resourceInventoryGenerateTime;
        }

        public GetAggregateResourceInventoryResponseBodyResourceInventory setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
