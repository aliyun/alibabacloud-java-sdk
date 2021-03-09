// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class EditQualityRuleTagRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("AnalysisTypes")
    public java.util.List<EditQualityRuleTagRequestAnalysisTypes> analysisTypes;

    public static EditQualityRuleTagRequest build(java.util.Map<String, ?> map) throws Exception {
        EditQualityRuleTagRequest self = new EditQualityRuleTagRequest();
        return TeaModel.build(map, self);
    }

    public EditQualityRuleTagRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EditQualityRuleTagRequest setAnalysisTypes(java.util.List<EditQualityRuleTagRequestAnalysisTypes> analysisTypes) {
        this.analysisTypes = analysisTypes;
        return this;
    }
    public java.util.List<EditQualityRuleTagRequestAnalysisTypes> getAnalysisTypes() {
        return this.analysisTypes;
    }

    public static class EditQualityRuleTagRequestAnalysisTypes extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static EditQualityRuleTagRequestAnalysisTypes build(java.util.Map<String, ?> map) throws Exception {
            EditQualityRuleTagRequestAnalysisTypes self = new EditQualityRuleTagRequestAnalysisTypes();
            return TeaModel.build(map, self);
        }

        public EditQualityRuleTagRequestAnalysisTypes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public EditQualityRuleTagRequestAnalysisTypes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
