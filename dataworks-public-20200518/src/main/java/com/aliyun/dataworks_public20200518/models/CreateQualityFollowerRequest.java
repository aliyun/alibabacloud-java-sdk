// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateQualityFollowerRequest extends TeaModel {
    @NameInMap("ProjectName")
    @Validation(required = true)
    public String projectName;

    @NameInMap("Follower")
    @Validation(required = true)
    public String follower;

    @NameInMap("AlarmMode")
    @Validation(required = true)
    public Integer alarmMode;

    @NameInMap("EntityId")
    @Validation(required = true)
    public Long entityId;

    public static CreateQualityFollowerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityFollowerRequest self = new CreateQualityFollowerRequest();
        return TeaModel.build(map, self);
    }

}
