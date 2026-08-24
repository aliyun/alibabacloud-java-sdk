// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class ListKVCacheStoreAvailableHpnZonesResponseBody extends TeaModel {
    @NameInMap("InstanceHpnZones")
    public java.util.List<ListKVCacheStoreAvailableHpnZonesResponseBodyInstanceHpnZones> instanceHpnZones;

    /**
     * <strong>example:</strong>
     * <p>019FB5E9-F9E8-52F5-9C56-2CDF479CBEB2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListKVCacheStoreAvailableHpnZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKVCacheStoreAvailableHpnZonesResponseBody self = new ListKVCacheStoreAvailableHpnZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKVCacheStoreAvailableHpnZonesResponseBody setInstanceHpnZones(java.util.List<ListKVCacheStoreAvailableHpnZonesResponseBodyInstanceHpnZones> instanceHpnZones) {
        this.instanceHpnZones = instanceHpnZones;
        return this;
    }
    public java.util.List<ListKVCacheStoreAvailableHpnZonesResponseBodyInstanceHpnZones> getInstanceHpnZones() {
        return this.instanceHpnZones;
    }

    public ListKVCacheStoreAvailableHpnZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListKVCacheStoreAvailableHpnZonesResponseBodyInstanceHpnZonesAvailableHpnZones extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("HpnZone")
        public String hpnZone;

        public static ListKVCacheStoreAvailableHpnZonesResponseBodyInstanceHpnZonesAvailableHpnZones build(java.util.Map<String, ?> map) throws Exception {
            ListKVCacheStoreAvailableHpnZonesResponseBodyInstanceHpnZonesAvailableHpnZones self = new ListKVCacheStoreAvailableHpnZonesResponseBodyInstanceHpnZonesAvailableHpnZones();
            return TeaModel.build(map, self);
        }

        public ListKVCacheStoreAvailableHpnZonesResponseBodyInstanceHpnZonesAvailableHpnZones setHpnZone(String hpnZone) {
            this.hpnZone = hpnZone;
            return this;
        }
        public String getHpnZone() {
            return this.hpnZone;
        }

    }

    public static class ListKVCacheStoreAvailableHpnZonesResponseBodyInstanceHpnZones extends TeaModel {
        @NameInMap("AvailableHpnZones")
        public java.util.List<ListKVCacheStoreAvailableHpnZonesResponseBodyInstanceHpnZonesAvailableHpnZones> availableHpnZones;

        /**
         * <strong>example:</strong>
         * <p>kvcs-xxxxx</p>
         */
        @NameInMap("KvcsId")
        public String kvcsId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListKVCacheStoreAvailableHpnZonesResponseBodyInstanceHpnZones build(java.util.Map<String, ?> map) throws Exception {
            ListKVCacheStoreAvailableHpnZonesResponseBodyInstanceHpnZones self = new ListKVCacheStoreAvailableHpnZonesResponseBodyInstanceHpnZones();
            return TeaModel.build(map, self);
        }

        public ListKVCacheStoreAvailableHpnZonesResponseBodyInstanceHpnZones setAvailableHpnZones(java.util.List<ListKVCacheStoreAvailableHpnZonesResponseBodyInstanceHpnZonesAvailableHpnZones> availableHpnZones) {
            this.availableHpnZones = availableHpnZones;
            return this;
        }
        public java.util.List<ListKVCacheStoreAvailableHpnZonesResponseBodyInstanceHpnZonesAvailableHpnZones> getAvailableHpnZones() {
            return this.availableHpnZones;
        }

        public ListKVCacheStoreAvailableHpnZonesResponseBodyInstanceHpnZones setKvcsId(String kvcsId) {
            this.kvcsId = kvcsId;
            return this;
        }
        public String getKvcsId() {
            return this.kvcsId;
        }

        public ListKVCacheStoreAvailableHpnZonesResponseBodyInstanceHpnZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
