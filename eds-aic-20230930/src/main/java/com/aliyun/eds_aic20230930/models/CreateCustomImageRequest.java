// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateCustomImageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>create for cc5g group auth rules test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom image name</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acp-2zecay9ponatdc4m****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateCustomImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomImageRequest self = new CreateCustomImageRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomImageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCustomImageRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public CreateCustomImageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
