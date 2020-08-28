// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDomainGroupRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    @NameInMap("GroupName")
    @Validation(required = true)
    public String groupName;

    public static UpdateDomainGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainGroupRequest self = new UpdateDomainGroupRequest();
        return TeaModel.build(map, self);
    }

}
