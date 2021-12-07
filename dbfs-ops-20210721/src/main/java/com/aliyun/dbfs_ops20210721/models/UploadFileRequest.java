// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs_ops20210721.models;

import com.aliyun.tea.*;

public class UploadFileRequest extends TeaModel {
    @NameInMap("file")
    public java.io.InputStream file;

    @NameInMap("data")
    public String data;

    public static UploadFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadFileRequest self = new UploadFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadFileRequest setFile(java.io.InputStream file) {
        this.file = file;
        return this;
    }
    public java.io.InputStream getFile() {
        return this.file;
    }

    public UploadFileRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
