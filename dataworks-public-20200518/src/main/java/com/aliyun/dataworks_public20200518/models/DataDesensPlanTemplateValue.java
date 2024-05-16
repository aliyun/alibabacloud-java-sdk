// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DataDesensPlanTemplateValue extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("SupportWaterMark")
    public Boolean supportWaterMark;

    @NameInMap("ExtParamTemplate")
    public java.util.List<?> extParamTemplate;

    public static DataDesensPlanTemplateValue build(java.util.Map<String, ?> map) throws Exception {
        DataDesensPlanTemplateValue self = new DataDesensPlanTemplateValue();
        return TeaModel.build(map, self);
    }

    public DataDesensPlanTemplateValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DataDesensPlanTemplateValue setSupportWaterMark(Boolean supportWaterMark) {
        this.supportWaterMark = supportWaterMark;
        return this;
    }
    public Boolean getSupportWaterMark() {
        return this.supportWaterMark;
    }

    public DataDesensPlanTemplateValue setExtParamTemplate(java.util.List<?> extParamTemplate) {
        this.extParamTemplate = extParamTemplate;
        return this;
    }
    public java.util.List<?> getExtParamTemplate() {
        return this.extParamTemplate;
    }

}
