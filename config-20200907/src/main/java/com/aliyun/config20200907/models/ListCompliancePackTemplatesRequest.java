// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListCompliancePackTemplatesRequest extends TeaModel {
    @NameInMap("CompliancePackTemplateId")
    public String compliancePackTemplateId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static ListCompliancePackTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCompliancePackTemplatesRequest self = new ListCompliancePackTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListCompliancePackTemplatesRequest setCompliancePackTemplateId(String compliancePackTemplateId) {
        this.compliancePackTemplateId = compliancePackTemplateId;
        return this;
    }
    public String getCompliancePackTemplateId() {
        return this.compliancePackTemplateId;
    }

    public ListCompliancePackTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCompliancePackTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

}
