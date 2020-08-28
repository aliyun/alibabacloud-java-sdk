// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeProjectMetaRequest extends TeaModel {
    @NameInMap("Labels")
    public String labels;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeProjectMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectMetaRequest self = new DescribeProjectMetaRequest();
        return TeaModel.build(map, self);
    }

}
