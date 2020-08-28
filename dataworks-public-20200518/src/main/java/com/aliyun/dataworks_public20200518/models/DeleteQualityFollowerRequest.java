// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteQualityFollowerRequest extends TeaModel {
    @NameInMap("ProjectName")
    @Validation(required = true)
    public String projectName;

    @NameInMap("FollowerId")
    @Validation(required = true)
    public Long followerId;

    public static DeleteQualityFollowerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityFollowerRequest self = new DeleteQualityFollowerRequest();
        return TeaModel.build(map, self);
    }

}
