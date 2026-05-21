// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListMigrationZonesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>819A7F0F-2951-540F-BD94-6A41ECF0281F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("zoneList")
    public java.util.List<ListMigrationZonesResponseBodyZoneList> zoneList;

    public static ListMigrationZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMigrationZonesResponseBody self = new ListMigrationZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMigrationZonesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMigrationZonesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMigrationZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMigrationZonesResponseBody setZoneList(java.util.List<ListMigrationZonesResponseBodyZoneList> zoneList) {
        this.zoneList = zoneList;
        return this;
    }
    public java.util.List<ListMigrationZonesResponseBodyZoneList> getZoneList() {
        return this.zoneList;
    }

    public static class ListMigrationZonesResponseBodyZoneList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("available")
        public Boolean available;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing-i</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static ListMigrationZonesResponseBodyZoneList build(java.util.Map<String, ?> map) throws Exception {
            ListMigrationZonesResponseBodyZoneList self = new ListMigrationZonesResponseBodyZoneList();
            return TeaModel.build(map, self);
        }

        public ListMigrationZonesResponseBodyZoneList setAvailable(Boolean available) {
            this.available = available;
            return this;
        }
        public Boolean getAvailable() {
            return this.available;
        }

        public ListMigrationZonesResponseBodyZoneList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
