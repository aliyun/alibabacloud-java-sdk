// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateTempFileUploadUrlRequest extends TeaModel {
    /**
     * <p>The name of the file to be uploaded.</p>
     */
    @NameInMap("FileName")
    public String fileName;

    public static CreateTempFileUploadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTempFileUploadUrlRequest self = new CreateTempFileUploadUrlRequest();
        return TeaModel.build(map, self);
    }

    public CreateTempFileUploadUrlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
