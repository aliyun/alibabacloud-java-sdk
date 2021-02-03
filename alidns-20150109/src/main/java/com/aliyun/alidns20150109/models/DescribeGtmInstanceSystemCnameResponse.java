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

    public DescribeGtmInstanceSystemCnameResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmInstanceSystemCnameResponse setSystemCname(String systemCname) {
        this.systemCname = systemCname;
        return this;
    }
    public String getSystemCname() {
        return this.systemCname;
    }

}
