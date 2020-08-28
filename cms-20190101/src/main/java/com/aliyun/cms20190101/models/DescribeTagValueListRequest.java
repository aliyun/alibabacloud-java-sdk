// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeTagValueListRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TagKey")
    @Validation(required = true)
    public String tagKey;

    public static DescribeTagValueListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagValueListRequest self = new DescribeTagValueListRequest();
        return TeaModel.build(map, self);
    }

}
