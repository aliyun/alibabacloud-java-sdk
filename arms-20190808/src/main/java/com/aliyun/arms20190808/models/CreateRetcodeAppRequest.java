// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateRetcodeAppRequest extends TeaModel {
    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. You can obtain the resource group ID in the **Resource Management** console.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the application.</p>
     */
    @NameInMap("RetcodeAppName")
    public String retcodeAppName;

    /**
     * <p>The type of the application. Valid values:</p>
     * <br>
     * <p>*   `web`: web application</p>
     * <p>*   `weex`: Weex mobile app</p>
     * <p>*   `mini_dd`: DingTalk mini program</p>
     * <p>*   `mini_alipay`: Alipay mini program</p>
     * <p>*   `mini_wx`: WeChat mini program</p>
     * <p>*   `mini_common`: mini program on other platforms</p>
     */
    @NameInMap("RetcodeAppType")
    public String retcodeAppType;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateRetcodeAppRequestTags> tags;

    public static CreateRetcodeAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRetcodeAppRequest self = new CreateRetcodeAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateRetcodeAppRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRetcodeAppRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateRetcodeAppRequest setRetcodeAppName(String retcodeAppName) {
        this.retcodeAppName = retcodeAppName;
        return this;
    }
    public String getRetcodeAppName() {
        return this.retcodeAppName;
    }

    public CreateRetcodeAppRequest setRetcodeAppType(String retcodeAppType) {
        this.retcodeAppType = retcodeAppType;
        return this;
    }
    public String getRetcodeAppType() {
        return this.retcodeAppType;
    }

    public CreateRetcodeAppRequest setTags(java.util.List<CreateRetcodeAppRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateRetcodeAppRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateRetcodeAppRequestTags extends TeaModel {
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

        public static CreateRetcodeAppRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateRetcodeAppRequestTags self = new CreateRetcodeAppRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateRetcodeAppRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRetcodeAppRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
