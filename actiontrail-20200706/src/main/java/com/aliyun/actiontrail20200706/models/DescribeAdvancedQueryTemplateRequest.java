// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeAdvancedQueryTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TemplateName")
    public String templateName;

    public static DescribeAdvancedQueryTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvancedQueryTemplateRequest self = new DescribeAdvancedQueryTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAdvancedQueryTemplateRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAdvancedQueryTemplateRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAdvancedQueryTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
