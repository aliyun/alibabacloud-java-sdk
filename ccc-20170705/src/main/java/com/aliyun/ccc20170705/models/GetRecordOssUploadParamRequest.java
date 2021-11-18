// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetRecordOssUploadParamRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetRecordOssUploadParamRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRecordOssUploadParamRequest self = new GetRecordOssUploadParamRequest();
        return TeaModel.build(map, self);
    }

    public GetRecordOssUploadParamRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetRecordOssUploadParamRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
