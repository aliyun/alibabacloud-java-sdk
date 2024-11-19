// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDeviceDistributeJobRequest extends TeaModel {
    /**
     * <p>The names of the devices to be distributed. You can specify a maximum of 10,000 device names.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RepeatList</p>
     */
    @NameInMap("DeviceName")
    public java.util.List<String> deviceName;

    /**
     * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The ID of the source instance to which the device belongs.</p>
     * <ul>
     * <li><p>The IDs of public instances in different regions:</p>
     * <ul>
     * <li>China (Shanghai): iotx-oxssharez200.</li>
     * <li>Japan (Tokyo): iotx-oxssharez300.</li>
     * <li>Singapore (Singapore): iotx-oxssharez400.</li>
     * <li>US (Silicon Valley): iotx-oxssharez500.</li>
     * <li>US (Virginia): iotx-oxssharez600.</li>
     * <li>Germany (Frankfurt): iotx-oxssharez700.</li>
     * </ul>
     * </li>
     * <li><p>The IDs of Enterprise Edition instances:</p>
     * <p>1\. Log on to the IoT Platform console. Select a region from the drop-down list in the upper-left corner of the top navigation bar.</p>
     * <p>2\. On the <strong>Overview</strong> page, click the instance name. On the <strong>Instance Details</strong> page, view the instance ID in the <strong>Basic Information</strong> section.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-060***</p>
     */
    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    /**
     * <p>The distribution policy. Default value: 0.</p>
     * <ul>
     * <li><strong>0</strong>: distributes devices to instances in a specified region.</li>
     * <li><strong>1</strong>: configures instance IDs in multiple regions and distributes devices to the nearest regions based on the IP addresses of the devices.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Strategy")
    public Integer strategy;

    /**
     * <p>The Alibaba Cloud account to which the device belongs. You can log on to the IoT Platform console, click the profile picture, and then view the account ID on the <strong>Security Settings</strong> page.</p>
     * <p>The <strong>TargetUid</strong> and <strong>TargetAliyunId</strong> parameters cannot be left empty at the same time.</p>
     * 
     * <strong>example:</strong>
     * <p>io****@example.com</p>
     */
    @NameInMap("TargetAliyunId")
    public String targetAliyunId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetInstanceConfig")
    public java.util.List<CreateDeviceDistributeJobRequestTargetInstanceConfig> targetInstanceConfig;

    /**
     * <p>The ID of the Alibaba Cloud account to which the device belongs. You can log on to the IoT Platform console, click the profile picture, and then view the account ID on the <strong>Security Settings</strong> page.</p>
     * <p>The <strong>TargetUid</strong> and <strong>TargetAliyunId</strong> parameters cannot be left empty at the same time.</p>
     * 
     * <strong>example:</strong>
     * <p>198***</p>
     */
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
         * <p>The configurations of the destination instance to which the device is distributed. For more information about instance IDs, see the description of the <strong>SourceInstanceId</strong> parameter.</p>
         * <ul>
         * <li>If the value of the <strong>Strategy</strong> parameter is <strong>1</strong>, you can specify multiple instance IDs.</li>
         * <li>If the value of the <strong>Strategy</strong> parameter is <strong>0</strong>, you can specify only one instance ID.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-6ja***</p>
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
