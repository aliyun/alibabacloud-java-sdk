// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeviceProperty extends TeaModel {
    // 属性值
    @NameInMap("Content")
    public String content;

    // 设备形态
    @NameInMap("DeviceForm")
    public String deviceForm;

    // 属性格式，包括JSON和SPLITTER（分隔符）
    @NameInMap("Format")
    public String format;

    // 属性展示名称
    @NameInMap("NameCn")
    public String nameCn;

    // 属性英文主键
    @NameInMap("NameEn")
    public String nameEn;

    // 设备属性ID
    @NameInMap("PropertyId")
    public String propertyId;

    public static DeviceProperty build(java.util.Map<String, ?> map) throws Exception {
        DeviceProperty self = new DeviceProperty();
        return TeaModel.build(map, self);
    }

    public DeviceProperty setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DeviceProperty setDeviceForm(String deviceForm) {
        this.deviceForm = deviceForm;
        return this;
    }
    public String getDeviceForm() {
        return this.deviceForm;
    }

    public DeviceProperty setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public DeviceProperty setNameCn(String nameCn) {
        this.nameCn = nameCn;
        return this;
    }
    public String getNameCn() {
        return this.nameCn;
    }

    public DeviceProperty setNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }
    public String getNameEn() {
        return this.nameEn;
    }

    public DeviceProperty setPropertyId(String propertyId) {
        this.propertyId = propertyId;
        return this;
    }
    public String getPropertyId() {
        return this.propertyId;
    }

}
