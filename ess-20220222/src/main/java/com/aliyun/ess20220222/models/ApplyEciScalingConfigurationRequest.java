// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ApplyEciScalingConfigurationRequest extends TeaModel {
    /**
     * <p>The content of the configuration file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apiVersion: apps/v1
     * kind: Deployment
     * metadata:
     *   name: nginx-deployment
     *   labels:
     *     app: nginx
     *   spec:
     *     replicas: 3
     *     selector:
     *        matchLabels:
     *         app: nginx
     *     template:
     *       metadata:
     *         labels:
     *           app: nginx
     *         annotations:
     *           k8s.aliyun.com/eip-bandwidth: 10
     *           k8s.aliyun.com/eci-with-eip: true
     *         spec:
     *           containers:
     *           - name: nginx
     *             image: nginx:1.14.2
     *             ports:
     *             - containerPort: 80</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>Optional. Set the value to YAML.</p>
     * 
     * <strong>example:</strong>
     * <p>YAML</p>
     */
    @NameInMap("Format")
    public String format;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the scaling configuration.</p>
     * <p>If you want the system to update a scaling configuration of the Elastic Container Instance type based on a YAML configuration file, you must specify <code>ScalingConfigurationId</code>. If you do not specify <code>ScalingConfigurationId</code>, the system creates a new scaling configuration based on the YAML configuration file.</p>
     * 
     * <strong>example:</strong>
     * <p>asc-bp1i65jd06v04vdh****</p>
     */
    @NameInMap("ScalingConfigurationId")
    public String scalingConfigurationId;

    /**
     * <p>The ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp1igpak5ft1flyp****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static ApplyEciScalingConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyEciScalingConfigurationRequest self = new ApplyEciScalingConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public ApplyEciScalingConfigurationRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ApplyEciScalingConfigurationRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public ApplyEciScalingConfigurationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ApplyEciScalingConfigurationRequest setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
        return this;
    }
    public String getScalingConfigurationId() {
        return this.scalingConfigurationId;
    }

    public ApplyEciScalingConfigurationRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
