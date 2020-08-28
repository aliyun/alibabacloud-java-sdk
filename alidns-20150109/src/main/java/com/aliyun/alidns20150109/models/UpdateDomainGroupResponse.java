// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDomainGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    @NameInMap("GroupName")
    @Validation(required = true)
    public String groupName;

    public static UpdateDomainGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainGroupResponse self = new UpdateDomainGroupResponse();
        return TeaModel.build(map, self);
    }

}
