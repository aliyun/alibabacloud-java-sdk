// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceSystemCnameResponseBody extends TeaModel {
    @NameInMap("SystemCname")
    public String systemCname;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDnsGtmInstanceSystemCnameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstanceSystemCnameResponseBody self = new DescribeDnsGtmInstanceSystemCnameResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstanceSystemCnameResponseBody setSystemCname(String systemCname) {
        this.systemCname = systemCname;
        return this;
    }
    public String getSystemCname() {
        return this.systemCname;
    }

    public DescribeDnsGtmInstanceSystemCnameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
