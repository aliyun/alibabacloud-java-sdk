// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetFailFileRequest extends TeaModel {
    /**
     * <p>The site ID. You can obtain this value by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The ID of the file upload task.</p>
     * 
     * <strong>example:</strong>
     * <p>1593805857882113</p>
     */
    @NameInMap("UploadId")
    public Long uploadId;

    public static GetFailFileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFailFileRequest self = new GetFailFileRequest();
        return TeaModel.build(map, self);
    }

    public GetFailFileRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public GetFailFileRequest setUploadId(Long uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public Long getUploadId() {
        return this.uploadId;
    }

}
