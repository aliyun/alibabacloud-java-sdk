// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateImageByInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoCleanUserdata")
    public Boolean autoCleanUserdata;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <strong>example:</strong>
     * <p>my test image v1.0</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <strong>example:</strong>
     * <p>ws-0buj1s9gm******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>WuyingServer</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>WuyingServer</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <strong>example:</strong>
     * <p>p-0cc7s3n1l*****</p>
     */
    @NameInMap("SubInstanceId")
    public String subInstanceId;

    public static CreateImageByInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageByInstanceRequest self = new CreateImageByInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageByInstanceRequest setAutoCleanUserdata(Boolean autoCleanUserdata) {
        this.autoCleanUserdata = autoCleanUserdata;
        return this;
    }
    public Boolean getAutoCleanUserdata() {
        return this.autoCleanUserdata;
    }

    public CreateImageByInstanceRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public CreateImageByInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateImageByInstanceRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public CreateImageByInstanceRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public CreateImageByInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateImageByInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateImageByInstanceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public CreateImageByInstanceRequest setSubInstanceId(String subInstanceId) {
        this.subInstanceId = subInstanceId;
        return this;
    }
    public String getSubInstanceId() {
        return this.subInstanceId;
    }

}
