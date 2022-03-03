// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GisQueryDeviceLocationRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ThingList")
    public java.util.List<GisQueryDeviceLocationRequestThingList> thingList;

    public static GisQueryDeviceLocationRequest build(java.util.Map<String, ?> map) throws Exception {
        GisQueryDeviceLocationRequest self = new GisQueryDeviceLocationRequest();
        return TeaModel.build(map, self);
    }

    public GisQueryDeviceLocationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public GisQueryDeviceLocationRequest setThingList(java.util.List<GisQueryDeviceLocationRequestThingList> thingList) {
        this.thingList = thingList;
        return this;
    }
    public java.util.List<GisQueryDeviceLocationRequestThingList> getThingList() {
        return this.thingList;
    }

    public static class GisQueryDeviceLocationRequestThingList extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("ProductKey")
        public String productKey;

        public static GisQueryDeviceLocationRequestThingList build(java.util.Map<String, ?> map) throws Exception {
            GisQueryDeviceLocationRequestThingList self = new GisQueryDeviceLocationRequestThingList();
            return TeaModel.build(map, self);
        }

        public GisQueryDeviceLocationRequestThingList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public GisQueryDeviceLocationRequestThingList setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

}
