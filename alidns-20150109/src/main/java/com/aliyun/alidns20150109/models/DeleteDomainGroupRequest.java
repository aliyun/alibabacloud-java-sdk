// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDomainGroupRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    public static DeleteDomainGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainGroupRequest self = new DeleteDomainGroupRequest();
        return TeaModel.build(map, self);
    }

}
