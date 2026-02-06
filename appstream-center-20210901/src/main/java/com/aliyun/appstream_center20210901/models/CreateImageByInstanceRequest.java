// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateImageByInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is applicable only to scenarios in which the instance type is Cloud Desktop. Specifies whether to clear private data of users. If this parameter is set to true, the created image clears data in directories other than Administrator and Public in the C:\Users directory.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: cleanup.</li>
     * <li>false: does not clear.</li>
     * </ul>
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
     * <p>The description of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>my test image v1.0</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The type of disk data contained in the image. By default, the system disk and data disk of the instance are included.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>SYSTEM: only system disk.</li>
     * <li>ALL: system disk + data disk</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The name of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The ID of the RDS instance. The instance can be a CloudDesktop instance, a workstation instance. To ensure data consistency in the image, we recommend that you shut down the instance before you create an image.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-0buj1s9gm******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CloudDesktop: Cloud Desktop.</li>
     * <li>WuyingServer: Workstation</li>
     * </ul>
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
     * <p>The ID of the child instance. This parameter is not used in cloud computing scenarios. Workstation scenarios, you need to specify a persistent session ID to ensure that a specific instance is located.</p>
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
