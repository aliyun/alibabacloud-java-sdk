// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class BatchBindDeviceRequest extends TeaModel {
    @NameInMap("DeviceList")
    public java.util.List<BatchBindDeviceRequestDeviceList> deviceList;

    @NameInMap("IdentityId")
    public String identityId;

    @NameInMap("OpenId")
    public String openId;

    @NameInMap("OpenIdAppKey")
    public String openIdAppKey;

    public static BatchBindDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchBindDeviceRequest self = new BatchBindDeviceRequest();
        return TeaModel.build(map, self);
    }

    public BatchBindDeviceRequest setDeviceList(java.util.List<BatchBindDeviceRequestDeviceList> deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public java.util.List<BatchBindDeviceRequestDeviceList> getDeviceList() {
        return this.deviceList;
    }

    public BatchBindDeviceRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public BatchBindDeviceRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public BatchBindDeviceRequest setOpenIdAppKey(String openIdAppKey) {
        this.openIdAppKey = openIdAppKey;
        return this;
    }
    public String getOpenIdAppKey() {
        return this.openIdAppKey;
    }

    public static class BatchBindDeviceRequestDeviceList extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("ProductKey")
        public String productKey;

        public static BatchBindDeviceRequestDeviceList build(java.util.Map<String, ?> map) throws Exception {
            BatchBindDeviceRequestDeviceList self = new BatchBindDeviceRequestDeviceList();
            return TeaModel.build(map, self);
        }

        public BatchBindDeviceRequestDeviceList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchBindDeviceRequestDeviceList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public BatchBindDeviceRequestDeviceList setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

}
