// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceSystemCnameResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SystemCname")
    @Validation(required = true)
    public String systemCname;

    public static DescribeGtmInstanceSystemCnameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceSystemCnameResponse self = new DescribeGtmInstanceSystemCnameResponse();
        return TeaModel.build(map, self);
    }

}
