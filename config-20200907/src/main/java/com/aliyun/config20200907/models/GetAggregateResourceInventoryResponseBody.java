// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceInventoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("ResourceInventoryGenerateTime")
        public Long resourceInventoryGenerateTime;

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
