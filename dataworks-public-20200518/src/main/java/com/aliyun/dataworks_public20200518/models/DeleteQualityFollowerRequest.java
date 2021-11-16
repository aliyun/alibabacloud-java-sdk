// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteQualityFollowerRequest extends TeaModel {
    @NameInMap("FollowerId")
    public Long followerId;

    @NameInMap("ProjectName")
    public String projectName;

    public static DeleteQualityFollowerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityFollowerRequest self = new DeleteQualityFollowerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteQualityFollowerRequest setFollowerId(Long followerId) {
        this.followerId = followerId;
        return this;
    }
    public Long getFollowerId() {
        return this.followerId;
    }

    public DeleteQualityFollowerRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
