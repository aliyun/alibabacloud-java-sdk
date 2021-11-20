// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceInventoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AccountId")
        public Long accountId;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("ResourceInventoryGenerateTime")
        public Long resourceInventoryGenerateTime;

        @NameInMap("Status")
        public String status;

        public static GetResourceInventoryResponseBodyResourceInventory build(java.util.Map<String, ?> map) throws Exception {
            GetResourceInventoryResponseBodyResourceInventory self = new GetResourceInventoryResponseBodyResourceInventory();
            return TeaModel.build(map, self);
        }

        public GetResourceInventoryResponseBodyResourceInventory setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
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
