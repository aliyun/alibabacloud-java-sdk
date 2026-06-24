// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateImageByInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is applicable only when the instance type is cloud desktop. Specifies whether to clear user personal data. If you set this parameter to true, the created image clears data in all directories under C:\Users except the Administrator and Public directories.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoCleanUserdata")
    public Boolean autoCleanUserdata;

    /**
     * <p>This parameter is not publicly available.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The image description.</p>
     * 
     * <strong>example:</strong>
     * <p>my test image v1.0</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The type of disk data included in the image. By default, the image includes both the system cloud disk and data cloud disk of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The image name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The WUYING instance ID. The instance can be a cloud desktop instance or a workstation instance. To ensure data consistency in the image, stop the instance before creating the image.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-0buj1s9gm******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>WuyingServer</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>This parameter is not publicly available.</p>
     * 
     * <strong>example:</strong>
     * <p>WuyingServer</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The sub-instance ID. This parameter is not applicable to cloud desktop scenarios. In workstation scenarios, specify the persistent session ID to identify a specific instance.</p>
     * 
     * <strong>example:</strong>
     * <p>p-0cc7s3n1l*****</p>
     */
    @NameInMap("SubInstanceId")
    public String subInstanceId;

    @NameInMap("TagList")
    public java.util.List<CreateImageByInstanceRequestTagList> tagList;

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

    public CreateImageByInstanceRequest setTagList(java.util.List<CreateImageByInstanceRequestTagList> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<CreateImageByInstanceRequestTagList> getTagList() {
        return this.tagList;
    }

    public static class CreateImageByInstanceRequestTagList extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateImageByInstanceRequestTagList build(java.util.Map<String, ?> map) throws Exception {
            CreateImageByInstanceRequestTagList self = new CreateImageByInstanceRequestTagList();
            return TeaModel.build(map, self);
        }

        public CreateImageByInstanceRequestTagList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateImageByInstanceRequestTagList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
