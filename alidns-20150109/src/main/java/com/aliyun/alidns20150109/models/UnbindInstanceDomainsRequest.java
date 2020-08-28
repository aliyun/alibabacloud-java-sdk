// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UnbindInstanceDomainsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("DomainNames")
    @Validation(required = true)
    public String domainNames;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    public static UnbindInstanceDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindInstanceDomainsRequest self = new UnbindInstanceDomainsRequest();
        return TeaModel.build(map, self);
    }

}
