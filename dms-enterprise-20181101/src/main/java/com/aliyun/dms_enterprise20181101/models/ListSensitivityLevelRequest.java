// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitivityLevelRequest extends TeaModel {
    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("TemplateType")
    public String templateType;

    @NameInMap("Tid")
    public Long tid;

    public static ListSensitivityLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSensitivityLevelRequest self = new ListSensitivityLevelRequest();
        return TeaModel.build(map, self);
    }

    public ListSensitivityLevelRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public ListSensitivityLevelRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public ListSensitivityLevelRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
