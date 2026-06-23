// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UploadFileAdvanceRequest extends TeaModel {
    /**
     * <p>The site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The type of the refresh or prefetch task. Valid values:</p>
     * <ul>
     * <li><strong>file</strong> (default): file refresh.</li>
     * <li><strong>preload</strong>: file prefetch.</li>
     * <li><strong>directory</strong>: directory refresh.</li>
     * <li><strong>ignoreParams</strong>: parameter-ignored refresh.</li>
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
     * <p>The URL of the refresh or prefetch file stored in OSS. The Url parameter accepts URLs in two formats:</p>
     * <ul>
     * <li><p>Transit URL (recommended): automatically generated through the file transfer feature of the ESA console or SDK.</p>
     * </li>
     * <li><p>OSS pre-signed HTTPS URL: generated after you upload the file to an authorized OSS bucket. The isFileTransferUrl field specifies whether to use the transit URL mode.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://XXXXXX.oss-cn-hangzhou.aliyuncs.com/%7Bprefix%7D_%7Baccount_uid%7D_%7Bhash%7D">https://XXXXXX.oss-cn-hangzhou.aliyuncs.com/{prefix}_{account_uid}_{hash}</a></p>
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
