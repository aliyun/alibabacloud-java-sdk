// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetCaseFileUploadUrlRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetCaseFileUploadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCaseFileUploadUrlRequest self = new GetCaseFileUploadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetCaseFileUploadUrlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetCaseFileUploadUrlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
