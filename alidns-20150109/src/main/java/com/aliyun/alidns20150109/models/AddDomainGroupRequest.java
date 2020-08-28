// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDomainGroupRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("GroupName")
    @Validation(required = true)
    public String groupName;

    public static AddDomainGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDomainGroupRequest self = new AddDomainGroupRequest();
        return TeaModel.build(map, self);
    }

}
