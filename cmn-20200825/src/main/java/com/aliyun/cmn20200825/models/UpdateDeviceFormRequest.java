// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDeviceFormRequest extends TeaModel {
    // 是否需要账号配置
    @NameInMap("AccountConfig")
    public Boolean accountConfig;

    // 设备形态属性列表
    @NameInMap("AttributeList")
    public java.util.List<UpdateDeviceFormRequestAttributeList> attributeList;

    // 是否支持配置生成
    @NameInMap("ConfigCompare")
    public Boolean configCompare;

    // 是否展示设备详情
    @NameInMap("DetailDisplay")
    public Boolean detailDisplay;

    // 设备形态ID
    @NameInMap("DeviceFormId")
    public String deviceFormId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 关联设备形态ID
    @NameInMap("RelatedDeviceFormId")
    public String relatedDeviceFormId;

    // 设备代码
    @NameInMap("Script")
    public String script;

    public static UpdateDeviceFormRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceFormRequest self = new UpdateDeviceFormRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceFormRequest setAccountConfig(Boolean accountConfig) {
        this.accountConfig = accountConfig;
        return this;
    }
    public Boolean getAccountConfig() {
        return this.accountConfig;
    }

    public UpdateDeviceFormRequest setAttributeList(java.util.List<UpdateDeviceFormRequestAttributeList> attributeList) {
        this.attributeList = attributeList;
        return this;
    }
    public java.util.List<UpdateDeviceFormRequestAttributeList> getAttributeList() {
        return this.attributeList;
    }

    public UpdateDeviceFormRequest setConfigCompare(Boolean configCompare) {
        this.configCompare = configCompare;
        return this;
    }
    public Boolean getConfigCompare() {
        return this.configCompare;
    }

    public UpdateDeviceFormRequest setDetailDisplay(Boolean detailDisplay) {
        this.detailDisplay = detailDisplay;
        return this;
    }
    public Boolean getDetailDisplay() {
        return this.detailDisplay;
    }

    public UpdateDeviceFormRequest setDeviceFormId(String deviceFormId) {
        this.deviceFormId = deviceFormId;
        return this;
    }
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

    public UpdateDeviceFormRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDeviceFormRequest setRelatedDeviceFormId(String relatedDeviceFormId) {
        this.relatedDeviceFormId = relatedDeviceFormId;
        return this;
    }
    public String getRelatedDeviceFormId() {
        return this.relatedDeviceFormId;
    }

    public UpdateDeviceFormRequest setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

    public static class UpdateDeviceFormRequestAttributeList extends TeaModel {
        // 设备形态属性值格式
        @NameInMap("AttributeFormat")
        public String attributeFormat;

        // 查询支持模糊搜索
        @NameInMap("AttributeFuzzyQuery")
        public Boolean attributeFuzzyQuery;

        // 设备形态属性主键
        @NameInMap("AttributeKey")
        public String attributeKey;

        // 设备形态属性名称
        @NameInMap("AttributeName")
        public String attributeName;

        // 前端查询控件占位符
        @NameInMap("AttributePlaceholder")
        public String attributePlaceholder;

        // 前端展示搜索控件
        @NameInMap("AttributeQuery")
        public Boolean attributeQuery;

        // 设备形态属性关联对象
        @NameInMap("AttributeReference")
        public String attributeReference;

        // 设备形态属性是否必填
        @NameInMap("AttributeRequirement")
        public Boolean attributeRequirement;

        // 设备形态属性是否表格可见
        @NameInMap("AttributeTableDisplay")
        public Boolean attributeTableDisplay;

        // 设备形态属性值类型
        @NameInMap("AttributeType")
        public String attributeType;

        // 设备形态属性是否唯一
        @NameInMap("AttributeUniqueness")
        public Boolean attributeUniqueness;

        public static UpdateDeviceFormRequestAttributeList build(java.util.Map<String, ?> map) throws Exception {
            UpdateDeviceFormRequestAttributeList self = new UpdateDeviceFormRequestAttributeList();
            return TeaModel.build(map, self);
        }

        public UpdateDeviceFormRequestAttributeList setAttributeFormat(String attributeFormat) {
            this.attributeFormat = attributeFormat;
            return this;
        }
        public String getAttributeFormat() {
            return this.attributeFormat;
        }

        public UpdateDeviceFormRequestAttributeList setAttributeFuzzyQuery(Boolean attributeFuzzyQuery) {
            this.attributeFuzzyQuery = attributeFuzzyQuery;
            return this;
        }
        public Boolean getAttributeFuzzyQuery() {
            return this.attributeFuzzyQuery;
        }

        public UpdateDeviceFormRequestAttributeList setAttributeKey(String attributeKey) {
            this.attributeKey = attributeKey;
            return this;
        }
        public String getAttributeKey() {
            return this.attributeKey;
        }

        public UpdateDeviceFormRequestAttributeList setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public UpdateDeviceFormRequestAttributeList setAttributePlaceholder(String attributePlaceholder) {
            this.attributePlaceholder = attributePlaceholder;
            return this;
        }
        public String getAttributePlaceholder() {
            return this.attributePlaceholder;
        }

        public UpdateDeviceFormRequestAttributeList setAttributeQuery(Boolean attributeQuery) {
            this.attributeQuery = attributeQuery;
            return this;
        }
        public Boolean getAttributeQuery() {
            return this.attributeQuery;
        }

        public UpdateDeviceFormRequestAttributeList setAttributeReference(String attributeReference) {
            this.attributeReference = attributeReference;
            return this;
        }
        public String getAttributeReference() {
            return this.attributeReference;
        }

        public UpdateDeviceFormRequestAttributeList setAttributeRequirement(Boolean attributeRequirement) {
            this.attributeRequirement = attributeRequirement;
            return this;
        }
        public Boolean getAttributeRequirement() {
            return this.attributeRequirement;
        }

        public UpdateDeviceFormRequestAttributeList setAttributeTableDisplay(Boolean attributeTableDisplay) {
            this.attributeTableDisplay = attributeTableDisplay;
            return this;
        }
        public Boolean getAttributeTableDisplay() {
            return this.attributeTableDisplay;
        }

        public UpdateDeviceFormRequestAttributeList setAttributeType(String attributeType) {
            this.attributeType = attributeType;
            return this;
        }
        public String getAttributeType() {
            return this.attributeType;
        }

        public UpdateDeviceFormRequestAttributeList setAttributeUniqueness(Boolean attributeUniqueness) {
            this.attributeUniqueness = attributeUniqueness;
            return this;
        }
        public Boolean getAttributeUniqueness() {
            return this.attributeUniqueness;
        }

    }

}
