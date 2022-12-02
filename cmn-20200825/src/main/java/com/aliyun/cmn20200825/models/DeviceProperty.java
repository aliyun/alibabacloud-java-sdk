// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeviceProperty extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("DeviceForm")
    public String deviceForm;

    @NameInMap("Format")
    public String format;

    @NameInMap("NameCn")
    public String nameCn;

    @NameInMap("NameEn")
    public String nameEn;

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
