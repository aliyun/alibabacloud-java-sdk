// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeTemplatesRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("page_num")
    public Long pageNum;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("page_size")
    public Long pageSize;

    /**
     * <p>The type of template. This parameter can be set to a custom value.</p>
     * <br>
     * <p>*   If the parameter is set to `kubernetes`, the template is displayed on the Templates page in the console.</p>
     * <p>*   If you set the parameter to `compose`, the template is not displayed on the Templates page in the console.</p>
     * <br>
     * <p>Default value: `kubernetes`.</p>
     */
    @NameInMap("template_type")
    public String templateType;

    public static DescribeTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplatesRequest self = new DescribeTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTemplatesRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeTemplatesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeTemplatesRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
