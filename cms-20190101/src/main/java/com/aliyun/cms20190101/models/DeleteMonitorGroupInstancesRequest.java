// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupInstancesRequest extends TeaModel {
    @NameInMap("GroupId")
    @Validation(required = true)
    public Long groupId;

    @NameInMap("InstanceIdList")
    @Validation(required = true)
    public String instanceIdList;

    @NameInMap("Category")
    @Validation(required = true)
    public String category;

    public static DeleteMonitorGroupInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorGroupInstancesRequest self = new DeleteMonitorGroupInstancesRequest();
        return TeaModel.build(map, self);
    }

}
