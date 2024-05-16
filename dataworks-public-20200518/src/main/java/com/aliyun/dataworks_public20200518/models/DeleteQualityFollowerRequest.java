// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteQualityFollowerRequest extends TeaModel {
    /**
     * <p>The ID of the subscription relationship between the partition filter expression and the subscriber. You can call the [GetQualityFollower](https://help.aliyun.com/document_detail/174000.html) operation to obtain the ID of the subscription relationship.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FollowerId")
    public Long followerId;

    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the compute engine or data source for which the partition filter expression is configured. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Monitoring Rules page of Data Quality to obtain the name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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

    public DeleteQualityFollowerRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeleteQualityFollowerRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
