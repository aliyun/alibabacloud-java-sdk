// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateAppTemplateConfigRequest extends TeaModel {
    // 应用模板唯一标识
    @NameInMap("AppTemplateId")
    public String appTemplateId;

    // 更新配置
    @NameInMap("ConfigList")
    public java.util.List<UpdateAppTemplateConfigRequestConfigList> configList;

    // 地域
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateAppTemplateConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppTemplateConfigRequest self = new UpdateAppTemplateConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppTemplateConfigRequest setAppTemplateId(String appTemplateId) {
        this.appTemplateId = appTemplateId;
        return this;
    }
    public String getAppTemplateId() {
        return this.appTemplateId;
    }

    public UpdateAppTemplateConfigRequest setConfigList(java.util.List<UpdateAppTemplateConfigRequestConfigList> configList) {
        this.configList = configList;
        return this;
    }
    public java.util.List<UpdateAppTemplateConfigRequestConfigList> getConfigList() {
        return this.configList;
    }

    public UpdateAppTemplateConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class UpdateAppTemplateConfigRequestConfigList extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateAppTemplateConfigRequestConfigList build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppTemplateConfigRequestConfigList self = new UpdateAppTemplateConfigRequestConfigList();
            return TeaModel.build(map, self);
        }

        public UpdateAppTemplateConfigRequestConfigList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateAppTemplateConfigRequestConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
