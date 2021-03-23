// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GenerateAssistFileUploadUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FileKey")
    public String fileKey;

    @NameInMap("UploadUrl")
    public String uploadUrl;

    public static GenerateAssistFileUploadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateAssistFileUploadUrlResponseBody self = new GenerateAssistFileUploadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateAssistFileUploadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateAssistFileUploadUrlResponseBody setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public GenerateAssistFileUploadUrlResponseBody setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }
    public String getUploadUrl() {
        return this.uploadUrl;
    }

}
