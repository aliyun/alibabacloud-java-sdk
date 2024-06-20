// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeL7UsKeepaliveRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    public static DescribeL7UsKeepaliveRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeL7UsKeepaliveRequest self = new DescribeL7UsKeepaliveRequest();
        return TeaModel.build(map, self);
    }

    public DescribeL7UsKeepaliveRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
