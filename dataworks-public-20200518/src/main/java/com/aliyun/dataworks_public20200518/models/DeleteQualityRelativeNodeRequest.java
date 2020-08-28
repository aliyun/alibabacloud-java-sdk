// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteQualityRelativeNodeRequest extends TeaModel {
    @NameInMap("EnvType")
    @Validation(required = true)
    public String envType;

    @NameInMap("MatchExpression")
    @Validation(required = true)
    public String matchExpression;

    @NameInMap("NodeId")
    @Validation(required = true)
    public Long nodeId;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("TargetNodeProjectName")
    @Validation(required = true)
    public String targetNodeProjectName;

    @NameInMap("ProjectName")
    @Validation(required = true)
    public String projectName;

    @NameInMap("TableName")
    @Validation(required = true)
    public String tableName;

    @NameInMap("TargetNodeProjectId")
    @Validation(required = true)
    public Long targetNodeProjectId;

    public static DeleteQualityRelativeNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityRelativeNodeRequest self = new DeleteQualityRelativeNodeRequest();
        return TeaModel.build(map, self);
    }

}
