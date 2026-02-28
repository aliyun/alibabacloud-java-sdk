// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDeviceDistributeJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceName")
    public java.util.List<String> deviceName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Strategy")
    public Integer strategy;

    @NameInMap("TargetAliyunId")
    public String targetAliyunId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetInstanceConfig")
    public java.util.List<CreateDeviceDistributeJobRequestTargetInstanceConfig> targetInstanceConfig;

    @NameInMap("TargetUid")
    public String targetUid;

    public static CreateDeviceDistributeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceDistributeJobRequest self = new CreateDeviceDistributeJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeviceDistributeJobRequest setDeviceName(java.util.List<String> deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public java.util.List<String> getDeviceName() {
        return this.deviceName;
    }

    public CreateDeviceDistributeJobRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateDeviceDistributeJobRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public CreateDeviceDistributeJobRequest setStrategy(Integer strategy) {
        this.strategy = strategy;
        return this;
    }
    public Integer getStrategy() {
        return this.strategy;
    }

    public CreateDeviceDistributeJobRequest setTargetAliyunId(String targetAliyunId) {
        this.targetAliyunId = targetAliyunId;
        return this;
    }
    public String getTargetAliyunId() {
        return this.targetAliyunId;
    }

    public CreateDeviceDistributeJobRequest setTargetInstanceConfig(java.util.List<CreateDeviceDistributeJobRequestTargetInstanceConfig> targetInstanceConfig) {
        this.targetInstanceConfig = targetInstanceConfig;
        return this;
    }
    public java.util.List<CreateDeviceDistributeJobRequestTargetInstanceConfig> getTargetInstanceConfig() {
        return this.targetInstanceConfig;
    }

    public CreateDeviceDistributeJobRequest setTargetUid(String targetUid) {
        this.targetUid = targetUid;
        return this;
    }
    public String getTargetUid() {
        return this.targetUid;
    }

    public static class CreateDeviceDistributeJobRequestTargetInstanceConfig extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
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
