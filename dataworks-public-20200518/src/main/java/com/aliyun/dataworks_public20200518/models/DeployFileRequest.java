// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeployFileRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    @NameInMap("FileId")
    public Long fileId;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("NodeId")
    public Long nodeId;

    public static DeployFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployFileRequest self = new DeployFileRequest();
        return TeaModel.build(map, self);
    }

}
