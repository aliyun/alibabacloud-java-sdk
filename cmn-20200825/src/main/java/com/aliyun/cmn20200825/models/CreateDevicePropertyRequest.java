// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateDevicePropertyRequest extends TeaModel {
    // 设备形态ID
    @NameInMap("DeviceFormId")
    public String deviceFormId;

    // 属性名称
    @NameInMap("PropertyName")
    public String propertyName;

    // 属性主键
    @NameInMap("PropertyKey")
    public String propertyKey;

    // 属性格式
    @NameInMap("PropertyFormat")
    public String propertyFormat;

    // 属性内容
    @NameInMap("PropertyContent")
    public String propertyContent;

    // 幂等校验 token
    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateDevicePropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDevicePropertyRequest self = new CreateDevicePropertyRequest();
        return TeaModel.build(map, self);
    }

    public CreateDevicePropertyRequest setDeviceFormId(String deviceFormId) {
        this.deviceFormId = deviceFormId;
        return this;
    }
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

    public CreateDevicePropertyRequest setPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }
    public String getPropertyName() {
        return this.propertyName;
    }

    public CreateDevicePropertyRequest setPropertyKey(String propertyKey) {
        this.propertyKey = propertyKey;
        return this;
    }
    public String getPropertyKey() {
        return this.propertyKey;
    }

    public CreateDevicePropertyRequest setPropertyFormat(String propertyFormat) {
        this.propertyFormat = propertyFormat;
        return this;
    }
    public String getPropertyFormat() {
        return this.propertyFormat;
    }

    public CreateDevicePropertyRequest setPropertyContent(String propertyContent) {
        this.propertyContent = propertyContent;
        return this;
    }
    public String getPropertyContent() {
        return this.propertyContent;
    }

    public CreateDevicePropertyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
