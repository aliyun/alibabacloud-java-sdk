// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeSimpleDomainsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainList")
    @Validation(required = true)
    public java.util.List<String> domainList;

    public static DescribeSimpleDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSimpleDomainsResponse self = new DescribeSimpleDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSimpleDomainsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSimpleDomainsResponse setDomainList(java.util.List<String> domainList) {
        this.domainList = domainList;
        return this;
    }
    public java.util.List<String> getDomainList() {
        return this.domainList;
    }

}
