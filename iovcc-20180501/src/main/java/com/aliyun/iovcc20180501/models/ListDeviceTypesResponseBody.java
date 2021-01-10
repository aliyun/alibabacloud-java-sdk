// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListDeviceTypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceTypes")
    public java.util.List<ListDeviceTypesResponseBodyDeviceTypes> deviceTypes;

    public static ListDeviceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceTypesResponseBody self = new ListDeviceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceTypesResponseBody setDeviceTypes(java.util.List<ListDeviceTypesResponseBodyDeviceTypes> deviceTypes) {
        this.deviceTypes = deviceTypes;
        return this;
    }
    public java.util.List<ListDeviceTypesResponseBodyDeviceTypes> getDeviceTypes() {
        return this.deviceTypes;
    }

    public static class ListDeviceTypesResponseBodyDeviceTypes extends TeaModel {
        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("Name")
        public String name;

        public static ListDeviceTypesResponseBodyDeviceTypes build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceTypesResponseBodyDeviceTypes self = new ListDeviceTypesResponseBodyDeviceTypes();
            return TeaModel.build(map, self);
        }

        public ListDeviceTypesResponseBodyDeviceTypes setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListDeviceTypesResponseBodyDeviceTypes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
