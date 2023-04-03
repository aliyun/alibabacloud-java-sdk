// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceSystemCnameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The CNAME domain name assigned by the system.</p>
     */
    @NameInMap("SystemCname")
    public String systemCname;

    public static DescribeDnsGtmInstanceSystemCnameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstanceSystemCnameResponseBody self = new DescribeDnsGtmInstanceSystemCnameResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstanceSystemCnameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmInstanceSystemCnameResponseBody setSystemCname(String systemCname) {
        this.systemCname = systemCname;
        return this;
    }
    public String getSystemCname() {
        return this.systemCname;
    }

}
