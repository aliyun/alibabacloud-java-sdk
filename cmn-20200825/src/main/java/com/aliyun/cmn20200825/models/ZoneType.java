// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ZoneType extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("ZoneTypeId")
    public String zoneTypeId;

    @NameInMap("ZoneTypeLayer")
    public java.util.List<ZoneTypeZoneTypeLayer> zoneTypeLayer;

    @NameInMap("ZoneTypeName")
    public String zoneTypeName;

    public static ZoneType build(java.util.Map<String, ?> map) throws Exception {
        ZoneType self = new ZoneType();
        return TeaModel.build(map, self);
    }

    public ZoneType setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ZoneType setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ZoneType setZoneTypeId(String zoneTypeId) {
        this.zoneTypeId = zoneTypeId;
        return this;
    }
    public String getZoneTypeId() {
        return this.zoneTypeId;
    }

    public ZoneType setZoneTypeLayer(java.util.List<ZoneTypeZoneTypeLayer> zoneTypeLayer) {
        this.zoneTypeLayer = zoneTypeLayer;
        return this;
    }
    public java.util.List<ZoneTypeZoneTypeLayer> getZoneTypeLayer() {
        return this.zoneTypeLayer;
    }

    public ZoneType setZoneTypeName(String zoneTypeName) {
        this.zoneTypeName = zoneTypeName;
        return this;
    }
    public String getZoneTypeName() {
        return this.zoneTypeName;
    }

    public static class ZoneTypeZoneTypeLayer extends TeaModel {
        @NameInMap("Mask")
        public Long mask;

        @NameInMap("Name")
        public String name;

        public static ZoneTypeZoneTypeLayer build(java.util.Map<String, ?> map) throws Exception {
            ZoneTypeZoneTypeLayer self = new ZoneTypeZoneTypeLayer();
            return TeaModel.build(map, self);
        }

        public ZoneTypeZoneTypeLayer setMask(Long mask) {
            this.mask = mask;
            return this;
        }
        public Long getMask() {
            return this.mask;
        }

        public ZoneTypeZoneTypeLayer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
