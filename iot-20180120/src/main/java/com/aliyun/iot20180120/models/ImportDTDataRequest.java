// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ImportDTDataRequest extends TeaModel {
    @NameInMap("DTInstanceId")
    public String DTInstanceId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Items")
    public java.util.List<ImportDTDataRequestItems> items;

    @NameInMap("ProductKey")
    public String productKey;

    public static ImportDTDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDTDataRequest self = new ImportDTDataRequest();
        return TeaModel.build(map, self);
    }

    public ImportDTDataRequest setDTInstanceId(String DTInstanceId) {
        this.DTInstanceId = DTInstanceId;
        return this;
    }
    public String getDTInstanceId() {
        return this.DTInstanceId;
    }

    public ImportDTDataRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ImportDTDataRequest setItems(java.util.List<ImportDTDataRequestItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ImportDTDataRequestItems> getItems() {
        return this.items;
    }

    public ImportDTDataRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public static class ImportDTDataRequestItems extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("Params")
        public String params;

        public static ImportDTDataRequestItems build(java.util.Map<String, ?> map) throws Exception {
            ImportDTDataRequestItems self = new ImportDTDataRequestItems();
            return TeaModel.build(map, self);
        }

        public ImportDTDataRequestItems setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ImportDTDataRequestItems setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

    }

}
