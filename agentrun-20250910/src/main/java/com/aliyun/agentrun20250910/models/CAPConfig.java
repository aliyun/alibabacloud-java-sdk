// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CAPConfig extends TeaModel {
    @NameInMap("functionName")
    public String functionName;

    @NameInMap("name")
    public String name;

    @NameInMap("templateId")
    public Integer templateId;

    public static CAPConfig build(java.util.Map<String, ?> map) throws Exception {
        CAPConfig self = new CAPConfig();
        return TeaModel.build(map, self);
    }

    public CAPConfig setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public CAPConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CAPConfig setTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }
    public Integer getTemplateId() {
        return this.templateId;
    }

}
