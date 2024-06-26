// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CheckResourceStockResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>805D8FB6-512A-531C-9E4D-2A807D3C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceStockModels")
    public java.util.List<CheckResourceStockResponseBodyResourceStockModels> resourceStockModels;

    public static CheckResourceStockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceStockResponseBody self = new CheckResourceStockResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckResourceStockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckResourceStockResponseBody setResourceStockModels(java.util.List<CheckResourceStockResponseBodyResourceStockModels> resourceStockModels) {
        this.resourceStockModels = resourceStockModels;
        return this;
    }
    public java.util.List<CheckResourceStockResponseBodyResourceStockModels> getResourceStockModels() {
        return this.resourceStockModels;
    }

    public static class CheckResourceStockResponseBodyResourceStockModels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("StockStatus")
        public String stockStatus;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CheckResourceStockResponseBodyResourceStockModels build(java.util.Map<String, ?> map) throws Exception {
            CheckResourceStockResponseBodyResourceStockModels self = new CheckResourceStockResponseBodyResourceStockModels();
            return TeaModel.build(map, self);
        }

        public CheckResourceStockResponseBodyResourceStockModels setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CheckResourceStockResponseBodyResourceStockModels setStockStatus(String stockStatus) {
            this.stockStatus = stockStatus;
            return this;
        }
        public String getStockStatus() {
            return this.stockStatus;
        }

        public CheckResourceStockResponseBodyResourceStockModels setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
