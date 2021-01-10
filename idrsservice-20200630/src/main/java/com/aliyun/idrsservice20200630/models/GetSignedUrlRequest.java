// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetSignedUrlRequest extends TeaModel {
    @NameInMap("FileUrl")
    public String fileUrl;

    public static GetSignedUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSignedUrlRequest self = new GetSignedUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetSignedUrlRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
