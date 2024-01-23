// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateEnvironmentRequest extends TeaModel {
    /**
     * <p>The language. Valid values: zh and en. Default value: zh.</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>The ID of the resource bound to the environment, such as the container ID or VPC ID. For a Cloud environment, specify the region ID.</p>
     */
    @NameInMap("BindResourceId")
    public String bindResourceId;

    /**
     * <p>The name of the environment.</p>
     */
    @NameInMap("EnvironmentName")
    public String environmentName;

    /**
     * <p>The subtype of the environment. Valid values:</p>
     * <br>
     * <p>*   CS: Container Service for Kubernetes (ACK)</p>
     * <p>*   ECS: Elastic Compute Service (ECS)</p>
     * <p>*   Cloud: cloud service</p>
     */
    @NameInMap("EnvironmentSubType")
    public String environmentSubType;

    /**
     * <p>The type of the environment. Valid values:</p>
     * <br>
     * <p>*   CS: Container Service</p>
     * <p>*   ECS: Elastic Compute Service</p>
     * <p>*   Cloud: cloud service</p>
     */
    @NameInMap("EnvironmentType")
    public String environmentType;

    /**
     * <p>type of managed: </p>
     * <p>- none: not managed. default value of prometheus for ACK.</p>
     * <p>- agent: managed agent. default value of  promehtues for ASK/ACS/AckOne.</p>
     * <p>- agent-exproter: maanged agent and exporter. default of prometheus for Cloud.</p>
     */
    @NameInMap("ManagedType")
    public String managedType;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags of the instance. You can specify this parameter to manage tags for the instance.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateEnvironmentRequestTags> tags;

    public static CreateEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentRequest self = new CreateEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public CreateEnvironmentRequest setBindResourceId(String bindResourceId) {
        this.bindResourceId = bindResourceId;
        return this;
    }
    public String getBindResourceId() {
        return this.bindResourceId;
    }

    public CreateEnvironmentRequest setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }
    public String getEnvironmentName() {
        return this.environmentName;
    }

    public CreateEnvironmentRequest setEnvironmentSubType(String environmentSubType) {
        this.environmentSubType = environmentSubType;
        return this;
    }
    public String getEnvironmentSubType() {
        return this.environmentSubType;
    }

    public CreateEnvironmentRequest setEnvironmentType(String environmentType) {
        this.environmentType = environmentType;
        return this;
    }
    public String getEnvironmentType() {
        return this.environmentType;
    }

    public CreateEnvironmentRequest setManagedType(String managedType) {
        this.managedType = managedType;
        return this;
    }
    public String getManagedType() {
        return this.managedType;
    }

    public CreateEnvironmentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateEnvironmentRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateEnvironmentRequest setTags(java.util.List<CreateEnvironmentRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateEnvironmentRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateEnvironmentRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEnvironmentRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateEnvironmentRequestTags self = new CreateEnvironmentRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateEnvironmentRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEnvironmentRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
