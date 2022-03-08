// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDeviceValuesRequest extends TeaModel {
    // 查询属性对应JSON中主键
    @NameInMap("AttributeGroup")
    public String attributeGroup;

    // 查询属性主键
    @NameInMap("AttributeKeyword")
    public String attributeKeyword;

    // 设备形态ID
    @NameInMap("DeviceFormId")
    public String deviceFormId;

    // 设备形态名称
    @NameInMap("DeviceFormName")
    public String deviceFormName;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListDeviceValuesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceValuesRequest self = new ListDeviceValuesRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceValuesRequest setAttributeGroup(String attributeGroup) {
        this.attributeGroup = attributeGroup;
        return this;
    }
    public String getAttributeGroup() {
        return this.attributeGroup;
    }

    public ListDeviceValuesRequest setAttributeKeyword(String attributeKeyword) {
        this.attributeKeyword = attributeKeyword;
        return this;
    }
    public String getAttributeKeyword() {
        return this.attributeKeyword;
    }

    public ListDeviceValuesRequest setDeviceFormId(String deviceFormId) {
        this.deviceFormId = deviceFormId;
        return this;
    }
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

    public ListDeviceValuesRequest setDeviceFormName(String deviceFormName) {
        this.deviceFormName = deviceFormName;
        return this;
    }
    public String getDeviceFormName() {
        return this.deviceFormName;
    }

    public ListDeviceValuesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
