// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeEslModelByTemplateVersionRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static DescribeEslModelByTemplateVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEslModelByTemplateVersionRequest self = new DescribeEslModelByTemplateVersionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEslModelByTemplateVersionRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEslModelByTemplateVersionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEslModelByTemplateVersionRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
