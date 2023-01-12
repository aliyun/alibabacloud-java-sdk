// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDevicePropertyResponseBody extends TeaModel {
    @NameInMap("DeviceProperty")
    public GetDevicePropertyResponseBodyDeviceProperty deviceProperty;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDevicePropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDevicePropertyResponseBody self = new GetDevicePropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDevicePropertyResponseBody setDeviceProperty(GetDevicePropertyResponseBodyDeviceProperty deviceProperty) {
        this.deviceProperty = deviceProperty;
        return this;
    }
    public GetDevicePropertyResponseBodyDeviceProperty getDeviceProperty() {
        return this.deviceProperty;
    }

    public GetDevicePropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDevicePropertyResponseBodyDeviceProperty extends TeaModel {
        @NameInMap("BuiltIn")
        public Boolean builtIn;

        @NameInMap("DeviceFormId")
        public String deviceFormId;

        @NameInMap("DeviceFormName")
        public String deviceFormName;

        @NameInMap("DevicePropertyId")
        public String devicePropertyId;

        @NameInMap("PropertyContent")
        public String propertyContent;

        @NameInMap("PropertyFormat")
        public String propertyFormat;

        @NameInMap("PropertyKey")
        public String propertyKey;

        @NameInMap("PropertyName")
        public String propertyName;

        public static GetDevicePropertyResponseBodyDeviceProperty build(java.util.Map<String, ?> map) throws Exception {
            GetDevicePropertyResponseBodyDeviceProperty self = new GetDevicePropertyResponseBodyDeviceProperty();
            return TeaModel.build(map, self);
        }

        public GetDevicePropertyResponseBodyDeviceProperty setBuiltIn(Boolean builtIn) {
            this.builtIn = builtIn;
            return this;
        }
        public Boolean getBuiltIn() {
            return this.builtIn;
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

        public GetDevicePropertyResponseBodyDeviceProperty setDevicePropertyId(String devicePropertyId) {
            this.devicePropertyId = devicePropertyId;
            return this;
        }
        public String getDevicePropertyId() {
            return this.devicePropertyId;
        }

        public GetDevicePropertyResponseBodyDeviceProperty setPropertyContent(String propertyContent) {
            this.propertyContent = propertyContent;
            return this;
        }
        public String getPropertyContent() {
            return this.propertyContent;
        }

        public GetDevicePropertyResponseBodyDeviceProperty setPropertyFormat(String propertyFormat) {
            this.propertyFormat = propertyFormat;
            return this;
        }
        public String getPropertyFormat() {
            return this.propertyFormat;
        }

        public GetDevicePropertyResponseBodyDeviceProperty setPropertyKey(String propertyKey) {
            this.propertyKey = propertyKey;
            return this;
        }
        public String getPropertyKey() {
            return this.propertyKey;
        }

        public GetDevicePropertyResponseBodyDeviceProperty setPropertyName(String propertyName) {
            this.propertyName = propertyName;
            return this;
        }
        public String getPropertyName() {
            return this.propertyName;
        }

    }

}
