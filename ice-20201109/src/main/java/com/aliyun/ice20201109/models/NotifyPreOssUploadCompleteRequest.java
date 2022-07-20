// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class NotifyPreOssUploadCompleteRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    public static NotifyPreOssUploadCompleteRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyPreOssUploadCompleteRequest self = new NotifyPreOssUploadCompleteRequest();
        return TeaModel.build(map, self);
    }

    public NotifyPreOssUploadCompleteRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
