// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ImportDeviceRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("DeviceSecret")
    public String deviceSecret;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Nickname")
    public String nickname;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("Sn")
    public String sn;

    public static ImportDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDeviceRequest self = new ImportDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ImportDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public ImportDeviceRequest setDeviceSecret(String deviceSecret) {
        this.deviceSecret = deviceSecret;
        return this;
    }
    public String getDeviceSecret() {
        return this.deviceSecret;
    }

    public ImportDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ImportDeviceRequest setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public ImportDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public ImportDeviceRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public static class BatchCheckImportDeviceRequestDeviceList extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceSecret")
        public String deviceSecret;

        @NameInMap("Sn")
        public String sn;

        public static BatchCheckImportDeviceRequestDeviceList build(java.util.Map<String, ?> map) throws Exception {
            BatchCheckImportDeviceRequestDeviceList self = new BatchCheckImportDeviceRequestDeviceList();
            return TeaModel.build(map, self);
        }

        public BatchCheckImportDeviceRequestDeviceList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchCheckImportDeviceRequestDeviceList setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public BatchCheckImportDeviceRequestDeviceList setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

    }

    public static class BatchImportDeviceRequestDeviceList extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceSecret")
        public String deviceSecret;

        @NameInMap("Sn")
        public String sn;

        public static BatchImportDeviceRequestDeviceList build(java.util.Map<String, ?> map) throws Exception {
            BatchImportDeviceRequestDeviceList self = new BatchImportDeviceRequestDeviceList();
            return TeaModel.build(map, self);
        }

        public BatchImportDeviceRequestDeviceList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchImportDeviceRequestDeviceList setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public BatchImportDeviceRequestDeviceList setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

    }

}
