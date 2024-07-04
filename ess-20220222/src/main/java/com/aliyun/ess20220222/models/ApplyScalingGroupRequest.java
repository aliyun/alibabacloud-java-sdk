// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ApplyScalingGroupRequest extends TeaModel {
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
     * spec:
     *   replicas: 3
     *   selector:
     *     matchLabels:
     *       app: nginx
     *   template:
     *     metadata:
     *       labels:
     *         app: nginx
     *       annotations:
     *         k8s.aliyun.com/eip-bandwidth: 10
     *         k8s.aliyun.com/eci-with-eip: true
     *     spec:
     *       containers:
     *       - name: nginx
     *         image: nginx:1.14.2
     *         ports:
     *         - containerPort: 80</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>YAML</p>
     */
    @NameInMap("Format")
    public String format;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ApplyScalingGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyScalingGroupRequest self = new ApplyScalingGroupRequest();
        return TeaModel.build(map, self);
    }

    public ApplyScalingGroupRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ApplyScalingGroupRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public ApplyScalingGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
