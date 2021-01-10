// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetBatchSignedUrlRequest extends TeaModel {
    @NameInMap("FileUrlList")
    public java.util.List<String> fileUrlList;

    public static GetBatchSignedUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBatchSignedUrlRequest self = new GetBatchSignedUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetBatchSignedUrlRequest setFileUrlList(java.util.List<String> fileUrlList) {
        this.fileUrlList = fileUrlList;
        return this;
    }
    public java.util.List<String> getFileUrlList() {
        return this.fileUrlList;
    }

}
