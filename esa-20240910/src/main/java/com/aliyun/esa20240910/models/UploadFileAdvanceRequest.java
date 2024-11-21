// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UploadFileAdvanceRequest extends TeaModel {
    /**
     * <p>The website ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The type of the purge or prefetch task. Valid values:</p>
     * <ul>
     * <li><strong>file</strong> (default): purges the cache by file.</li>
     * <li><strong>preload</strong>: prefetches the file.</li>
     * <li><strong>directory</strong>: purges the cache by directory.</li>
     * <li><strong>ignoreParams</strong>: purges the cache by URL with specified parameters ignored.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>file</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The name of the upload task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>purge_task_2024_11_11</p>
     */
    @NameInMap("UploadTaskName")
    public String uploadTaskName;

    /**
     * <p>The OSS URL of the file that contains resources to be purged or prefetched.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxxx.oss-cn-shenzhen.aliyuncs.com/test_oss_file?Expires=1708659191&OSSAccessKeyId=**********&Signature=">https://xxxxx.oss-cn-shenzhen.aliyuncs.com/test_oss_file?Expires=1708659191&amp;OSSAccessKeyId=**********&amp;Signature=</a>**********</p>
     */
    @NameInMap("Url")
    public java.io.InputStream urlObject;

    public static UploadFileAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadFileAdvanceRequest self = new UploadFileAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public UploadFileAdvanceRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UploadFileAdvanceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UploadFileAdvanceRequest setUploadTaskName(String uploadTaskName) {
        this.uploadTaskName = uploadTaskName;
        return this;
    }
    public String getUploadTaskName() {
        return this.uploadTaskName;
    }

    public UploadFileAdvanceRequest setUrlObject(java.io.InputStream urlObject) {
        this.urlObject = urlObject;
        return this;
    }
    public java.io.InputStream getUrlObject() {
        return this.urlObject;
    }

}
