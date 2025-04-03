// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateCustomImageRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. By default, this parameter is left empty. The token cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>20393E53-8FF1-524C-B494-B478A5369733</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the custom image.</p>
     * 
     * <strong>example:</strong>
     * <p>create for cc5g group auth rules test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the custom image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>custom image name</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The ID of the cloud phone instance.</p>
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

    public CreateCustomImageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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
