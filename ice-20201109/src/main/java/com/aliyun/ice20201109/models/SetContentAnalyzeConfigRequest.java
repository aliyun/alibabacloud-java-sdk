// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetContentAnalyzeConfigRequest extends TeaModel {
    @NameInMap("Auto")
    public Boolean auto;

    @NameInMap("SaveType")
    public String saveType;

    @NameInMap("TemplateId")
    public String templateId;

    public static SetContentAnalyzeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetContentAnalyzeConfigRequest self = new SetContentAnalyzeConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetContentAnalyzeConfigRequest setAuto(Boolean auto) {
        this.auto = auto;
        return this;
    }
    public Boolean getAuto() {
        return this.auto;
    }

    public SetContentAnalyzeConfigRequest setSaveType(String saveType) {
        this.saveType = saveType;
        return this;
    }
    public String getSaveType() {
        return this.saveType;
    }

    public SetContentAnalyzeConfigRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
