// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateFolderRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    @NameInMap("FolderPath")
    @Validation(required = true)
    public String folderPath;

    public static CreateFolderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFolderRequest self = new CreateFolderRequest();
        return TeaModel.build(map, self);
    }

}
