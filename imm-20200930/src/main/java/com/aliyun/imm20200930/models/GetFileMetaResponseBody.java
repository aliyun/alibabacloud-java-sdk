// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetFileMetaResponseBody extends TeaModel {
    @NameInMap("Files")
    public java.util.List<File> files;

    /**
     * <strong>example:</strong>
     * <p>7F84C6D9-5AC0-49F9-914D-F02678E3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFileMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileMetaResponseBody self = new GetFileMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileMetaResponseBody setFiles(java.util.List<File> files) {
        this.files = files;
        return this;
    }
    public java.util.List<File> getFiles() {
        return this.files;
    }

    public GetFileMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
