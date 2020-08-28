// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeExporterRuleListRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeExporterRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExporterRuleListRequest self = new DescribeExporterRuleListRequest();
        return TeaModel.build(map, self);
    }

}
