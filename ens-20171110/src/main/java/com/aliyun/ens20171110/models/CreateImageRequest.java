// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateImageRequest extends TeaModel {
    @NameInMap("DeleteAfterImageUpload")
    public String deleteAfterImageUpload;

    @NameInMap("ImageName")
    public String imageName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("product")
    public String product;

    public static CreateImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageRequest self = new CreateImageRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageRequest setDeleteAfterImageUpload(String deleteAfterImageUpload) {
        this.deleteAfterImageUpload = deleteAfterImageUpload;
        return this;
    }
    public String getDeleteAfterImageUpload() {
        return this.deleteAfterImageUpload;
    }

    public CreateImageRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public CreateImageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateImageRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
