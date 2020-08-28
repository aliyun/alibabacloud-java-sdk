// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDomainResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static DeleteDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainResponse self = new DeleteDomainResponse();
        return TeaModel.build(map, self);
    }

}
