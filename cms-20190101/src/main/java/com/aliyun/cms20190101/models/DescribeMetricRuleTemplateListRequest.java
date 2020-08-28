// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricRuleTemplateListRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("History")
    public Boolean history;

    public static DescribeMetricRuleTemplateListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricRuleTemplateListRequest self = new DescribeMetricRuleTemplateListRequest();
        return TeaModel.build(map, self);
    }

}
