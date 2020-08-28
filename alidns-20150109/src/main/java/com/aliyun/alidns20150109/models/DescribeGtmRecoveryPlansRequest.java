// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmRecoveryPlansRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeGtmRecoveryPlansRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmRecoveryPlansRequest self = new DescribeGtmRecoveryPlansRequest();
        return TeaModel.build(map, self);
    }

}
