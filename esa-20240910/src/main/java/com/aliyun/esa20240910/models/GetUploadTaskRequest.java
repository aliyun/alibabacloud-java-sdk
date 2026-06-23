// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetUploadTaskRequest extends TeaModel {
    /**
     * <p>The site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <blockquote>
     * <p>Notice: This parameter is required when querying an upload task..</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The file upload task ID, which is assigned when you call the <a href="https://help.aliyun.com/document_detail/2850466.html">UploadFile</a> operation.</p>
     * <blockquote>
     * <p>Notice: This parameter is required and must be a valid task ID returned by the UploadFile operation. If this parameter is not provided or the specified ID does not exist, an InvalidParameters (400) error is returned..</p>
     * </blockquote>
     * 
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
