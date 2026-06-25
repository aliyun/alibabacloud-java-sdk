// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class FetchFileRequest extends TeaModel {
    /**
     * <p>A list of cloud phone instance IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AndroidInstanceIdList")
    public java.util.List<String> androidInstanceIdList;

    /**
     * <p>A client-generated token, up to 100 characters long, that ensures the idempotency of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The path of the file or folder to fetch from the cloud phone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/data/a.txt</p>
     */
    @NameInMap("SourceFilePath")
    public String sourceFilePath;

    /**
     * <p>The endpoint for uploading files to OSS.</p>
     * <blockquote>
     * <p>If the cloud phone and the destination OSS bucket are in the same region, you can use an internal endpoint to accelerate the transfer and avoid public network charges. For example, in the China (Hangzhou) region, use <code>oss-cn-hangzhou-internal.aliyuncs.com</code>. For a complete list of endpoints, see <a href="https://help.aliyun.com/document_detail/31837.html">OSS regions and endpoints</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-hangzhou-internal.aliyuncs.com</p>
     */
    @NameInMap("UploadEndpoint")
    public String uploadEndpoint;

    /**
     * <p>The type of storage service for the fetched file.</p>
     * <blockquote>
     * <p>Currently, only Object Storage Service (OSS) is supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("UploadType")
    public String uploadType;

    /**
     * <p>The destination URL in OSS.</p>
     * <blockquote>
     * <p>The destination bucket name must be prefixed with <code>cloudphone-saved-bucket-</code>. For example, <code>cloudphone-saved-bucket-example</code>. You must also create a folder in the bucket to serve as the destination directory. The <code>UploadUrl</code> must follow the format: <code>oss://&lt;bucket_name&gt;/&lt;folder_name&gt;</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://cloudphone-saved-bucket-example/received</p>
     */
    @NameInMap("UploadUrl")
    public String uploadUrl;

    public static FetchFileRequest build(java.util.Map<String, ?> map) throws Exception {
        FetchFileRequest self = new FetchFileRequest();
        return TeaModel.build(map, self);
    }

    public FetchFileRequest setAndroidInstanceIdList(java.util.List<String> androidInstanceIdList) {
        this.androidInstanceIdList = androidInstanceIdList;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIdList() {
        return this.androidInstanceIdList;
    }

    public FetchFileRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public FetchFileRequest setSourceFilePath(String sourceFilePath) {
        this.sourceFilePath = sourceFilePath;
        return this;
    }
    public String getSourceFilePath() {
        return this.sourceFilePath;
    }

    public FetchFileRequest setUploadEndpoint(String uploadEndpoint) {
        this.uploadEndpoint = uploadEndpoint;
        return this;
    }
    public String getUploadEndpoint() {
        return this.uploadEndpoint;
    }

    public FetchFileRequest setUploadType(String uploadType) {
        this.uploadType = uploadType;
        return this;
    }
    public String getUploadType() {
        return this.uploadType;
    }

    public FetchFileRequest setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }
    public String getUploadUrl() {
        return this.uploadUrl;
    }

}
