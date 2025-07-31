// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetUploadLinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.aliyuncs.com/test.mp3">http://www.aliyuncs.com/test.mp3</a></p>
     */
    @NameInMap("UploadUrl")
    public String uploadUrl;

    public static GetUploadLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUploadLinkRequest self = new GetUploadLinkRequest();
        return TeaModel.build(map, self);
    }

    public GetUploadLinkRequest setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }
    public String getUploadUrl() {
        return this.uploadUrl;
    }

}
