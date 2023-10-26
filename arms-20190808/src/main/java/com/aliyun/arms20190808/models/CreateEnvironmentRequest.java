// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateEnvironmentRequest extends TeaModel {
    /**
     * <p>Locale, the default is Chinese zh | en.</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>Resource instance ID bound to the environment, including container instance ID or VpcId.</p>
     */
    @NameInMap("BindResourceId")
    public String bindResourceId;

    /**
     * <p>Environment name.</p>
     */
    @NameInMap("EnvironmentName")
    public String environmentName;

    /**
     * <p>Environment subtypes:</p>
     * <p>- CS: Currently supports ACK.</p>
     * <p>- ECS: ECS is currently supported.</p>
     * <p>- Cloud: Currently supports Cloud.</p>
     */
    @NameInMap("EnvironmentSubType")
    public String environmentSubType;

    /**
     * <p>Environment type:</p>
     * <p>- CS: Container Service.</p>
     * <p>- ECS.</p>
     * <p>- Cloud: cloud service.</p>
     */
    @NameInMap("EnvironmentType")
    public String environmentType;

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
     * <p>The list of tags.</p>
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
