// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ChangeDomainGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    @NameInMap("GroupName")
    @Validation(required = true)
    public String groupName;

    public static ChangeDomainGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeDomainGroupResponse self = new ChangeDomainGroupResponse();
        return TeaModel.build(map, self);
    }

}
