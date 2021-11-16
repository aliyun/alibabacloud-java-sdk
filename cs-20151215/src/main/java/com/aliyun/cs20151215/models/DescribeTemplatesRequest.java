// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeTemplatesRequest extends TeaModel {
    // 对查询结果进行分页处理，指定返回第几页的数据。  默认值为 1
    @NameInMap("page_num")
    public Long pageNum;

    // 对查询结果进行分页处理，指定每页包含的数据条数。  默认值为 10
    @NameInMap("page_size")
    public Long pageSize;

    // 模板类型，部署模板类型，目前一共有2种类型，取值为：kubernetes或compose。
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
