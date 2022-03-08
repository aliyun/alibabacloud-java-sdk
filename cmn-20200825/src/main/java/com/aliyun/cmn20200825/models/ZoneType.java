// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ZoneType extends TeaModel {
    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 园区类型名称
    @NameInMap("Name")
    public String name;

    // 资源一级ID
    @NameInMap("ZoneTypeId")
    public String zoneTypeId;

    // 园区层级
    @NameInMap("ZoneTypeLayer")
    public java.util.List<ZoneTypeZoneTypeLayer> zoneTypeLayer;

    // 资源名称
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
        // 园区层级掩码
        @NameInMap("Mask")
        public Long mask;

        // 园区层级名称
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
