// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListAppTemplatesRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("Source")
    public String source;

    @NameInMap("TemplateType")
    public String templateType;

    public static ListAppTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppTemplatesRequest self = new ListAppTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListAppTemplatesRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public ListAppTemplatesRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListAppTemplatesRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
