// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetFileMetaResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // File list.
    @NameInMap("Files")
    public java.util.List<File> files;

    public static GetFileMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileMetaResponseBody self = new GetFileMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFileMetaResponseBody setFiles(java.util.List<File> files) {
        this.files = files;
        return this;
    }
    public java.util.List<File> getFiles() {
        return this.files;
    }

}
