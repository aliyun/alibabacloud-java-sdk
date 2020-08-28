// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SubmitFileRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    @NameInMap("FileId")
    @Validation(required = true)
    public Long fileId;

    @NameInMap("Comment")
    public String comment;

    public static SubmitFileRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitFileRequest self = new SubmitFileRequest();
        return TeaModel.build(map, self);
    }

}
