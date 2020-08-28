// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetTopicInfluenceRequest extends TeaModel {
    @NameInMap("TopicId")
    @Validation(required = true)
    public Long topicId;

    public static GetTopicInfluenceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTopicInfluenceRequest self = new GetTopicInfluenceRequest();
        return TeaModel.build(map, self);
    }

}
