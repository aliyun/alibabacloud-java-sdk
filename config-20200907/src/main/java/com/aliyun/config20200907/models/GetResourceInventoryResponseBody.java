// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceInventoryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the resource inventory.</p>
     */
    @NameInMap("ResourceInventory")
    public GetResourceInventoryResponseBodyResourceInventory resourceInventory;

    public static GetResourceInventoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceInventoryResponseBody self = new GetResourceInventoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceInventoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceInventoryResponseBody setResourceInventory(GetResourceInventoryResponseBodyResourceInventory resourceInventory) {
        this.resourceInventory = resourceInventory;
        return this;
    }
    public GetResourceInventoryResponseBodyResourceInventory getResourceInventory() {
        return this.resourceInventory;
    }

    public static class GetResourceInventoryResponseBodyResourceInventory extends TeaModel {
        /**
         * <p>The download URL of the resource inventory.</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The time when the resource inventory was generated. The value is a timestamp.</p>
         */
        @NameInMap("ResourceInventoryGenerateTime")
        public Long resourceInventoryGenerateTime;

        /**
         * <p>The generation status of the resource inventory. Valid values:</p>
         * <br>
         * <p>*   CREATING: The resource inventory is being generated.</p>
         * <p>*   COMPLETE: The resource inventory is generated.</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetResourceInventoryResponseBodyResourceInventory build(java.util.Map<String, ?> map) throws Exception {
            GetResourceInventoryResponseBodyResourceInventory self = new GetResourceInventoryResponseBodyResourceInventory();
            return TeaModel.build(map, self);
        }

        public GetResourceInventoryResponseBodyResourceInventory setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetResourceInventoryResponseBodyResourceInventory setResourceInventoryGenerateTime(Long resourceInventoryGenerateTime) {
            this.resourceInventoryGenerateTime = resourceInventoryGenerateTime;
            return this;
        }
        public Long getResourceInventoryGenerateTime() {
            return this.resourceInventoryGenerateTime;
        }

        public GetResourceInventoryResponseBodyResourceInventory setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
