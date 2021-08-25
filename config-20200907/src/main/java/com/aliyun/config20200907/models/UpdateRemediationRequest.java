// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateRemediationRequest extends TeaModel {
    @NameInMap("RemediationId")
    public String remediationId;

    @NameInMap("RemediationType")
    public String remediationType;

    @NameInMap("RemediationTemplateId")
    public String remediationTemplateId;

    @NameInMap("InvokeType")
    public String invokeType;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("Params")
    public String params;

    public static UpdateRemediationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRemediationRequest self = new UpdateRemediationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRemediationRequest setRemediationId(String remediationId) {
        this.remediationId = remediationId;
        return this;
    }
    public String getRemediationId() {
        return this.remediationId;
    }

    public UpdateRemediationRequest setRemediationType(String remediationType) {
        this.remediationType = remediationType;
        return this;
    }
    public String getRemediationType() {
        return this.remediationType;
    }

    public UpdateRemediationRequest setRemediationTemplateId(String remediationTemplateId) {
        this.remediationTemplateId = remediationTemplateId;
        return this;
    }
    public String getRemediationTemplateId() {
        return this.remediationTemplateId;
    }

    public UpdateRemediationRequest setInvokeType(String invokeType) {
        this.invokeType = invokeType;
        return this;
    }
    public String getInvokeType() {
        return this.invokeType;
    }

    public UpdateRemediationRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public UpdateRemediationRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
