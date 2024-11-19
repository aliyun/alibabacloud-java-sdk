// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class AddDeviceToSharePromotionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceSimpleInfoList")
    public java.util.List<AddDeviceToSharePromotionRequestDeviceSimpleInfoList> deviceSimpleInfoList;

    /**
     * <strong>example:</strong>
     * <p>iot-cv3********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61******_****<em>4901</em><strong><strong>_47</strong></strong>*******</p>
     */
    @NameInMap("SharePromotionActivityId")
    public String sharePromotionActivityId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>52******_7<strong>e_4</strong>3_9<strong>e_61</strong>********</p>
     */
    @NameInMap("ShareTaskCode")
    public String shareTaskCode;

    public static AddDeviceToSharePromotionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceToSharePromotionRequest self = new AddDeviceToSharePromotionRequest();
        return TeaModel.build(map, self);
    }

    public AddDeviceToSharePromotionRequest setDeviceSimpleInfoList(java.util.List<AddDeviceToSharePromotionRequestDeviceSimpleInfoList> deviceSimpleInfoList) {
        this.deviceSimpleInfoList = deviceSimpleInfoList;
        return this;
    }
    public java.util.List<AddDeviceToSharePromotionRequestDeviceSimpleInfoList> getDeviceSimpleInfoList() {
        return this.deviceSimpleInfoList;
    }

    public AddDeviceToSharePromotionRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public AddDeviceToSharePromotionRequest setSharePromotionActivityId(String sharePromotionActivityId) {
        this.sharePromotionActivityId = sharePromotionActivityId;
        return this;
    }
    public String getSharePromotionActivityId() {
        return this.sharePromotionActivityId;
    }

    public AddDeviceToSharePromotionRequest setShareTaskCode(String shareTaskCode) {
        this.shareTaskCode = shareTaskCode;
        return this;
    }
    public String getShareTaskCode() {
        return this.shareTaskCode;
    }

    public static class AddDeviceToSharePromotionRequestDeviceSimpleInfoList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>device01</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a2YwD2****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        public static AddDeviceToSharePromotionRequestDeviceSimpleInfoList build(java.util.Map<String, ?> map) throws Exception {
            AddDeviceToSharePromotionRequestDeviceSimpleInfoList self = new AddDeviceToSharePromotionRequestDeviceSimpleInfoList();
            return TeaModel.build(map, self);
        }

        public AddDeviceToSharePromotionRequestDeviceSimpleInfoList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public AddDeviceToSharePromotionRequestDeviceSimpleInfoList setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

}
