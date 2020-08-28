// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListTopicsRequest extends TeaModel {
    @NameInMap("BeginTime")
    @Validation(required = true)
    public String beginTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("TopicTypes")
    public String topicTypes;

    @NameInMap("TopicStatuses")
    public String topicStatuses;

    @NameInMap("NodeId")
    public Long nodeId;

    @NameInMap("InstanceId")
    public Long instanceId;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    public static ListTopicsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTopicsRequest self = new ListTopicsRequest();
        return TeaModel.build(map, self);
    }

}
