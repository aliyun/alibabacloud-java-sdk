// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetUploadTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <strong>example:</strong>
     * <p>159253299357****</p>
     */
    @NameInMap("UploadId")
    public Long uploadId;

    public static GetUploadTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUploadTaskRequest self = new GetUploadTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetUploadTaskRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public GetUploadTaskRequest setUploadId(Long uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public Long getUploadId() {
        return this.uploadId;
    }

}
