// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyAICInstanceTypeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[object Object]</p>
     */
    @NameInMap("EnvironmentVar")
    public String environmentVar;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Frequency")
    public Long frequency;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourImage ID</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aic-xxxx-0</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aic.cf52r.c1.np</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>720*1280</p>
     */
    @NameInMap("Resolution")
    public String resolution;

    public static ModifyAICInstanceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAICInstanceTypeRequest self = new ModifyAICInstanceTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAICInstanceTypeRequest setEnvironmentVar(String environmentVar) {
        this.environmentVar = environmentVar;
        return this;
    }
    public String getEnvironmentVar() {
        return this.environmentVar;
    }

    public ModifyAICInstanceTypeRequest setFrequency(Long frequency) {
        this.frequency = frequency;
        return this;
    }
    public Long getFrequency() {
        return this.frequency;
    }

    public ModifyAICInstanceTypeRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyAICInstanceTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyAICInstanceTypeRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ModifyAICInstanceTypeRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

}
