// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class AddUploadedFunctionFileInfoRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ObjectKey")
    public String objectKey;

    @NameInMap("FileName")
    public String fileName;

    public static AddUploadedFunctionFileInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUploadedFunctionFileInfoRequest self = new AddUploadedFunctionFileInfoRequest();
        return TeaModel.build(map, self);
    }

    public AddUploadedFunctionFileInfoRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AddUploadedFunctionFileInfoRequest setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

    public AddUploadedFunctionFileInfoRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
