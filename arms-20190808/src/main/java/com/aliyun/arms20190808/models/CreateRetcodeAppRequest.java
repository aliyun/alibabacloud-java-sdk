// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateRetcodeAppRequest extends TeaModel {
    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // The name of the application that you want to monitor by using Browser Monitoring.
    @NameInMap("RetcodeAppName")
    public String retcodeAppName;

    // The type of the application. Valid values:
    // 
    // *   `web`: web application
    // *   `weex`: Weex mobile app
    // *   `mini_dd`: DingTalk mini program
    // *   `mini_alipay`: Alipay mini program
    // *   `mini_wx`: WeChat mini program
    // *   `mini_common`: mini program on other platforms
    @NameInMap("RetcodeAppType")
    public String retcodeAppType;

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
        @NameInMap("Key")
        public String key;

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
