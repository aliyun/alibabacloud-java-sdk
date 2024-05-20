// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetOssUploadTokenResult extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("uploadInfo")
    public UploadInfo uploadInfo;

    public static GetOssUploadTokenResult build(java.util.Map<String, ?> map) throws Exception {
        GetOssUploadTokenResult self = new GetOssUploadTokenResult();
        return TeaModel.build(map, self);
    }

    public GetOssUploadTokenResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOssUploadTokenResult setUploadInfo(UploadInfo uploadInfo) {
        this.uploadInfo = uploadInfo;
        return this;
    }
    public UploadInfo getUploadInfo() {
        return this.uploadInfo;
    }

}
