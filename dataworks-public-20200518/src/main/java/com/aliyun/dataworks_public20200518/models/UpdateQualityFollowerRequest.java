// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateQualityFollowerRequest extends TeaModel {
    @NameInMap("ProjectName")
    @Validation(required = true)
    public String projectName;

    @NameInMap("FollowerId")
    @Validation(required = true)
    public Long followerId;

    @NameInMap("Follower")
    @Validation(required = true)
    public String follower;

    @NameInMap("AlarmMode")
    @Validation(required = true)
    public Integer alarmMode;

    public static UpdateQualityFollowerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQualityFollowerRequest self = new UpdateQualityFollowerRequest();
        return TeaModel.build(map, self);
    }

}
