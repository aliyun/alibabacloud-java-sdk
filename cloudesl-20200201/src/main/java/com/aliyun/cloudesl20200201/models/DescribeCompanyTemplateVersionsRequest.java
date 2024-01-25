// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeCompanyTemplateVersionsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeCompanyTemplateVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCompanyTemplateVersionsRequest self = new DescribeCompanyTemplateVersionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCompanyTemplateVersionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCompanyTemplateVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
