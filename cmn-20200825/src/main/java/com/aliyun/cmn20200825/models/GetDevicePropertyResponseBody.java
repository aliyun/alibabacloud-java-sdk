// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDevicePropertyResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 设备属性详情
    @NameInMap("DeviceProperty")
    public GetDevicePropertyResponseBodyDeviceProperty deviceProperty;

    public static GetDevicePropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDevicePropertyResponseBody self = new GetDevicePropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDevicePropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDevicePropertyResponseBody setDeviceProperty(GetDevicePropertyResponseBodyDeviceProperty deviceProperty) {
        this.deviceProperty = deviceProperty;
        return this;
    }
    public GetDevicePropertyResponseBodyDeviceProperty getDeviceProperty() {
        return this.deviceProperty;
    }

    public static class GetDevicePropertyResponseBodyDeviceProperty extends TeaModel {
        // 设备属性ID
        @NameInMap("DevicePropertyId")
        public String devicePropertyId;

        // 设备形态ID
        @NameInMap("DeviceFormId")
        public String deviceFormId;

        // 设备形态名称
        @NameInMap("DeviceFormName")
        public String deviceFormName;

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

        // 是否内置属性
        @NameInMap("BuiltIn")
        public Boolean builtIn;

        public static GetDevicePropertyResponseBodyDeviceProperty build(java.util.Map<String, ?> map) throws Exception {
            GetDevicePropertyResponseBodyDeviceProperty self = new GetDevicePropertyResponseBodyDeviceProperty();
            return TeaModel.build(map, self);
        }

        public GetDevicePropertyResponseBodyDeviceProperty setDevicePropertyId(String devicePropertyId) {
            this.devicePropertyId = devicePropertyId;
            return this;
        }
        public String getDevicePropertyId() {
            return this.devicePropertyId;
        }

        public GetDevicePropertyResponseBodyDeviceProperty setDeviceFormId(String deviceFormId) {
            this.deviceFormId = deviceFormId;
            return this;
        }
        public String getDeviceFormId() {
            return this.deviceFormId;
        }

        public GetDevicePropertyResponseBodyDeviceProperty setDeviceFormName(String deviceFormName) {
            this.deviceFormName = deviceFormName;
            return this;
        }
        public String getDeviceFormName() {
            return this.deviceFormName;
        }

        public GetDevicePropertyResponseBodyDeviceProperty setPropertyName(String propertyName) {
            this.propertyName = propertyName;
            return this;
        }
        public String getPropertyName() {
            return this.propertyName;
        }

        public GetDevicePropertyResponseBodyDeviceProperty setPropertyKey(String propertyKey) {
            this.propertyKey = propertyKey;
            return this;
        }
        public String getPropertyKey() {
            return this.propertyKey;
        }

        public GetDevicePropertyResponseBodyDeviceProperty setPropertyFormat(String propertyFormat) {
            this.propertyFormat = propertyFormat;
            return this;
        }
        public String getPropertyFormat() {
            return this.propertyFormat;
        }

        public GetDevicePropertyResponseBodyDeviceProperty setPropertyContent(String propertyContent) {
            this.propertyContent = propertyContent;
            return this;
        }
        public String getPropertyContent() {
            return this.propertyContent;
        }

        public GetDevicePropertyResponseBodyDeviceProperty setBuiltIn(Boolean builtIn) {
            this.builtIn = builtIn;
            return this;
        }
        public Boolean getBuiltIn() {
            return this.builtIn;
        }

    }

}
