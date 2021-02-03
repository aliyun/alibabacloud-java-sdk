// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceSystemCnameResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SystemCname")
    @Validation(required = true)
    public String systemCname;

    public static DescribeDnsGtmInstanceSystemCnameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstanceSystemCnameResponse self = new DescribeDnsGtmInstanceSystemCnameResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstanceSystemCnameResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmInstanceSystemCnameResponse setSystemCname(String systemCname) {
        this.systemCname = systemCname;
        return this;
    }
    public String getSystemCname() {
        return this.systemCname;
    }

}
