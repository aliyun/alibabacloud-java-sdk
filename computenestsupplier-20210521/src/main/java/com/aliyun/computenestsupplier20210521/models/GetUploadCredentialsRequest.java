// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetUploadCredentialsRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    public static GetUploadCredentialsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUploadCredentialsRequest self = new GetUploadCredentialsRequest();
        return TeaModel.build(map, self);
    }

    public GetUploadCredentialsRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
