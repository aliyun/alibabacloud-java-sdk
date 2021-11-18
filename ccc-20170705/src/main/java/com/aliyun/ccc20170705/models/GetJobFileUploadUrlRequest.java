// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetJobFileUploadUrlRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetJobFileUploadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobFileUploadUrlRequest self = new GetJobFileUploadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetJobFileUploadUrlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetJobFileUploadUrlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
