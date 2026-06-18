// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SubmitUploadTaskRequest extends TeaModel {
    /**
     * <p>Specifies whether to refresh resources in the corresponding directory if the requested content is different from that on the origin server. Default value: false. This parameter takes effect for a purge task.</p>
     * <ul>
     * <li><strong>true</strong>: purges all resources in the directory.</li>
     * <li><strong>false</strong>: refresh the changed resources in the directory.</li>
     * </ul>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The website ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The ID of the file upload task, which is generated when you call <a href="~~UploadTask~~">UploadTask</a>.</p>
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
