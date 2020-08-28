// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeTagKeyListRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeTagKeyListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagKeyListRequest self = new DescribeTagKeyListRequest();
        return TeaModel.build(map, self);
    }

}
