// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDeviceFormRequest extends TeaModel {
    @NameInMap("AccountConfig")
    public Boolean accountConfig;

    @NameInMap("AttributeList")
    public java.util.List<UpdateDeviceFormRequestAttributeList> attributeList;

    @NameInMap("ConfigCompare")
    public Boolean configCompare;

    @NameInMap("DetailDisplay")
    public Boolean detailDisplay;

    @NameInMap("DeviceFormId")
    public String deviceFormId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RelatedDeviceFormId")
    public String relatedDeviceFormId;

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
        @NameInMap("AttributeFormat")
        public String attributeFormat;

        @NameInMap("AttributeFuzzyQuery")
        public Boolean attributeFuzzyQuery;

        @NameInMap("AttributeKey")
        public String attributeKey;

        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("AttributePlaceholder")
        public String attributePlaceholder;

        @NameInMap("AttributeQuery")
        public Boolean attributeQuery;

        @NameInMap("AttributeReference")
        public String attributeReference;

        @NameInMap("AttributeRequirement")
        public Boolean attributeRequirement;

        @NameInMap("AttributeSequence")
        public Integer attributeSequence;

        @NameInMap("AttributeTableDisplay")
        public Boolean attributeTableDisplay;

        @NameInMap("AttributeType")
        public String attributeType;

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

        public UpdateDeviceFormRequestAttributeList setAttributeSequence(Integer attributeSequence) {
            this.attributeSequence = attributeSequence;
            return this;
        }
        public Integer getAttributeSequence() {
            return this.attributeSequence;
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
