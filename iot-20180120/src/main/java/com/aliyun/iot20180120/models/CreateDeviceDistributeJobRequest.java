// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDeviceDistributeJobRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("DeviceName")
    public java.util.List<String> deviceName;

    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("TargetUid")
    public String targetUid;

    @NameInMap("TargetAliyunId")
    public String targetAliyunId;

    @NameInMap("Captcha")
    public String captcha;

    @NameInMap("TargetInstanceConfig")
    public java.util.List<CreateDeviceDistributeJobRequestTargetInstanceConfig> targetInstanceConfig;

    @NameInMap("Strategy")
    public Integer strategy;

    public static CreateDeviceDistributeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceDistributeJobRequest self = new CreateDeviceDistributeJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeviceDistributeJobRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public CreateDeviceDistributeJobRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public CreateDeviceDistributeJobRequest setDeviceName(java.util.List<String> deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public java.util.List<String> getDeviceName() {
        return this.deviceName;
    }

    public CreateDeviceDistributeJobRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public CreateDeviceDistributeJobRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateDeviceDistributeJobRequest setTargetUid(String targetUid) {
        this.targetUid = targetUid;
        return this;
    }
    public String getTargetUid() {
        return this.targetUid;
    }

    public CreateDeviceDistributeJobRequest setTargetAliyunId(String targetAliyunId) {
        this.targetAliyunId = targetAliyunId;
        return this;
    }
    public String getTargetAliyunId() {
        return this.targetAliyunId;
    }

    public CreateDeviceDistributeJobRequest setCaptcha(String captcha) {
        this.captcha = captcha;
        return this;
    }
    public String getCaptcha() {
        return this.captcha;
    }

    public CreateDeviceDistributeJobRequest setTargetInstanceConfig(java.util.List<CreateDeviceDistributeJobRequestTargetInstanceConfig> targetInstanceConfig) {
        this.targetInstanceConfig = targetInstanceConfig;
        return this;
    }
    public java.util.List<CreateDeviceDistributeJobRequestTargetInstanceConfig> getTargetInstanceConfig() {
        return this.targetInstanceConfig;
    }

    public CreateDeviceDistributeJobRequest setStrategy(Integer strategy) {
        this.strategy = strategy;
        return this;
    }
    public Integer getStrategy() {
        return this.strategy;
    }

    public static class CreateDeviceDistributeJobRequestTargetInstanceConfig extends TeaModel {
        @NameInMap("TargetInstanceId")
        public String targetInstanceId;

        public static CreateDeviceDistributeJobRequestTargetInstanceConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDeviceDistributeJobRequestTargetInstanceConfig self = new CreateDeviceDistributeJobRequestTargetInstanceConfig();
            return TeaModel.build(map, self);
        }

        public CreateDeviceDistributeJobRequestTargetInstanceConfig setTargetInstanceId(String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

    }

}
