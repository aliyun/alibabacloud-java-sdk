// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteQualityFollowerRequest extends TeaModel {
    /**
     * <p>The ID of the subscription relationship between the partition filter expression and the subscriber. You can call the <a href="https://help.aliyun.com/document_detail/174000.html">GetQualityFollower</a> operation to obtain the ID of the subscription relationship.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("FollowerId")
    public Long followerId;

    /**
     * <p>The DataWorks workspace ID. You can log on to the DataWorks console and go to the Workspace page to obtain the workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the compute engine or data source for which the partition filter expression is configured. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the rule configuration page of Data Quality page to obtain the name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>autotest</p>
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
