// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class BindInstanceDomainsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("DomainNames")
    @Validation(required = true)
    public String domainNames;

    public static BindInstanceDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        BindInstanceDomainsRequest self = new BindInstanceDomainsRequest();
        return TeaModel.build(map, self);
    }

}
