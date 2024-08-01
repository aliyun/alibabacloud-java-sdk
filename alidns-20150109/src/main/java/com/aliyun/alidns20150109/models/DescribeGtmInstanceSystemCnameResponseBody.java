// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceSystemCnameResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The CNAME record assigned by the system.</p>
     * 
     * <strong>example:</strong>
     * <p>gtm-cn-mp91004xxxx.gtm-a2b4.com</p>
     */
    @NameInMap("SystemCname")
    public String systemCname;

    public static DescribeGtmInstanceSystemCnameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceSystemCnameResponseBody self = new DescribeGtmInstanceSystemCnameResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceSystemCnameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmInstanceSystemCnameResponseBody setSystemCname(String systemCname) {
        this.systemCname = systemCname;
        return this;
    }
    public String getSystemCname() {
        return this.systemCname;
    }

}
