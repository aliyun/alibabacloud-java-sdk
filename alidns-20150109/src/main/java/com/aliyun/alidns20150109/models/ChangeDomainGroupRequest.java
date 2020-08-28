// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ChangeDomainGroupRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("GroupId")
    public String groupId;

    public static ChangeDomainGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeDomainGroupRequest self = new ChangeDomainGroupRequest();
        return TeaModel.build(map, self);
    }

}
