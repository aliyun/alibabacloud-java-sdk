// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlTemplatesRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateGroupId")
    public Long templateGroupId;

    @NameInMap("TemplateName")
    public String templateName;

    public static DescribeSqlTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlTemplatesRequest self = new DescribeSqlTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSqlTemplatesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSqlTemplatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSqlTemplatesRequest setTemplateGroupId(Long templateGroupId) {
        this.templateGroupId = templateGroupId;
        return this;
    }
    public Long getTemplateGroupId() {
        return this.templateGroupId;
    }

    public DescribeSqlTemplatesRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
