// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteGroupMonitoringAgentProcessRequest extends TeaModel {
    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    @NameInMap("Id")
    public String id;

    public static DeleteGroupMonitoringAgentProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupMonitoringAgentProcessRequest self = new DeleteGroupMonitoringAgentProcessRequest();
        return TeaModel.build(map, self);
    }

}
