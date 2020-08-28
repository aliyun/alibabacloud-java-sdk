// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteFolderRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    @NameInMap("FolderId")
    @Validation(required = true)
    public String folderId;

    public static DeleteFolderRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFolderRequest self = new DeleteFolderRequest();
        return TeaModel.build(map, self);
    }

}
