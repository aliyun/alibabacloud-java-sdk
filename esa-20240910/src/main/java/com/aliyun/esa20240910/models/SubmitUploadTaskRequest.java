// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SubmitUploadTaskRequest extends TeaModel {
    /**
     * <p>Specifies whether to purge resources in the corresponding directory when the back-to-origin content is inconsistent with the origin server resources. Default value: false. This parameter is valid only for purge tasks.</p>
     * <ul>
     * <li><strong>true</strong>: Purges all resources in the corresponding directory.</li>
     * <li><strong>false</strong>: Purges only the changed resources in the corresponding directory.</li>
     * </ul>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The file upload task ID, which is generated when you call the <a href="~~UploadTask~~">UploadTask</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>1593805857882113</p>
     */
    @NameInMap("UploadId")
    public Long uploadId;

    public static SubmitUploadTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitUploadTaskRequest self = new SubmitUploadTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitUploadTaskRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public SubmitUploadTaskRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public SubmitUploadTaskRequest setUploadId(Long uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public Long getUploadId() {
        return this.uploadId;
    }

}
