// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class EditQualityRuleTagRequest extends TeaModel {
    @NameInMap("AnalysisTypes")
    public java.util.List<EditQualityRuleTagRequestAnalysisTypes> analysisTypes;

    @NameInMap("InstanceId")
    public String instanceId;

    public static EditQualityRuleTagRequest build(java.util.Map<String, ?> map) throws Exception {
        EditQualityRuleTagRequest self = new EditQualityRuleTagRequest();
        return TeaModel.build(map, self);
    }

    public EditQualityRuleTagRequest setAnalysisTypes(java.util.List<EditQualityRuleTagRequestAnalysisTypes> analysisTypes) {
        this.analysisTypes = analysisTypes;
        return this;
    }
    public java.util.List<EditQualityRuleTagRequestAnalysisTypes> getAnalysisTypes() {
        return this.analysisTypes;
    }

    public EditQualityRuleTagRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class EditQualityRuleTagRequestAnalysisTypes extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static EditQualityRuleTagRequestAnalysisTypes build(java.util.Map<String, ?> map) throws Exception {
            EditQualityRuleTagRequestAnalysisTypes self = new EditQualityRuleTagRequestAnalysisTypes();
            return TeaModel.build(map, self);
        }

        public EditQualityRuleTagRequestAnalysisTypes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public EditQualityRuleTagRequestAnalysisTypes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
