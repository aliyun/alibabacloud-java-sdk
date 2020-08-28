// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetFileVersionRequest extends TeaModel {
    @NameInMap("FileId")
    @Validation(required = true)
    public Long fileId;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    @NameInMap("FileVersion")
    @Validation(required = true)
    public Integer fileVersion;

    public static GetFileVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileVersionRequest self = new GetFileVersionRequest();
        return TeaModel.build(map, self);
    }

}
