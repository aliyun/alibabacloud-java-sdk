// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateBizTypeRequest extends TeaModel {
    @NameInMap("BizTypeImport")
    public String bizTypeImport;

    @NameInMap("BizTypeName")
    public String bizTypeName;

    @NameInMap("CiteTemplate")
    public Boolean citeTemplate;

    @NameInMap("Description")
    public String description;

    @NameInMap("IndustryInfo")
    public String industryInfo;

    public static CreateBizTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBizTypeRequest self = new CreateBizTypeRequest();
        return TeaModel.build(map, self);
    }

    public CreateBizTypeRequest setBizTypeImport(String bizTypeImport) {
        this.bizTypeImport = bizTypeImport;
        return this;
    }
    public String getBizTypeImport() {
        return this.bizTypeImport;
    }

    public CreateBizTypeRequest setBizTypeName(String bizTypeName) {
        this.bizTypeName = bizTypeName;
        return this;
    }
    public String getBizTypeName() {
        return this.bizTypeName;
    }

    public CreateBizTypeRequest setCiteTemplate(Boolean citeTemplate) {
        this.citeTemplate = citeTemplate;
        return this;
    }
    public Boolean getCiteTemplate() {
        return this.citeTemplate;
    }

    public CreateBizTypeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBizTypeRequest setIndustryInfo(String industryInfo) {
        this.industryInfo = industryInfo;
        return this;
    }
    public String getIndustryInfo() {
        return this.industryInfo;
    }

}
