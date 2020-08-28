// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeExporterOutputListRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeExporterOutputListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExporterOutputListRequest self = new DescribeExporterOutputListRequest();
        return TeaModel.build(map, self);
    }

}
