// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetUploadContentRequest extends TeaModel {
    /**
     * <p>The OSS URL of the uploaded file.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oss-cip-shanghai.oss-cn-shanghai.aliyuncs.com/image/upload/test_text.txt">https://oss-cip-shanghai.oss-cn-shanghai.aliyuncs.com/image/upload/test_text.txt</a></p>
     */
    @NameInMap("UploadUrl")
    public String uploadUrl;

    public static GetUploadContentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUploadContentRequest self = new GetUploadContentRequest();
        return TeaModel.build(map, self);
    }

    public GetUploadContentRequest setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }
    public String getUploadUrl() {
        return this.uploadUrl;
    }

}
