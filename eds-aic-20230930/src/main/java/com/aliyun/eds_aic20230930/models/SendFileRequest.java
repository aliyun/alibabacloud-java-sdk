// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class SendFileRequest extends TeaModel {
    /**
     * <p>The IDs of one or more cloud phone instances.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AndroidInstanceIdList")
    public java.util.List<String> androidInstanceIdList;

    /**
     * <p>Specifies whether to automatically install the application after the file is uploaded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoInstall")
    public Boolean autoInstall;

    /**
     * <p>A client-generated token that ensures request idempotence and prevents duplicate submissions. The token can contain up to 100 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("FileMd5")
    public String fileMd5;

    /**
     * <p>The destination path on the cloud phone.</p>
     * <blockquote>
     * <p>If <code>UploadType</code> is <code>OSS</code> or <code>OSS_BRIDGED</code>, <code>SourceFilePath</code> must specify a directory, for example, <code>/sdcard/Download/</code>. If <code>UploadType</code> is <code>DOWNLOAD_URL</code>, <code>SourceFilePath</code> must specify a full file path, for example, <code>/sdcard/Download/MyFile.txt</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/sdcard/Download</p>
     */
    @NameInMap("SourceFilePath")
    public String sourceFilePath;

    /**
     * <p>The name for the destination file on the cloud phone.</p>
     * <blockquote>
     * <p>This parameter is optional and takes effect only when <code>UploadType</code> is set to <code>OSS</code> or <code>OSS_BRIDGED</code>. If you specify this parameter, the file is saved with this name in the path specified by <code>SourceFilePath</code>. If you leave this parameter empty, the source file name is used. This parameter is ignored when <code>UploadType</code> is set to <code>DOWNLOAD_URL</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test.txt</p>
     */
    @NameInMap("TargetFileName")
    public String targetFileName;

    /**
     * <p>The service endpoint of Object Storage Service (OSS). This parameter is required if <code>UploadType</code> is <code>OSS</code> or <code>OSS_BRIDGED</code>.</p>
     * <blockquote>
     * <p>If the cloud phone instance and the OSS bucket are in the same region, you can specify an internal endpoint to accelerate data transfer and avoid public data transfer costs. For example, the internal endpoint for the China (Hangzhou) region is <code>oss-cn-hangzhou-internal.aliyuncs.com</code>. For a complete list of endpoints, see <a href="https://help.aliyun.com/document_detail/31837.html">OSS regions and endpoints</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-hangzhou-internal.aliyuncs.com</p>
     */
    @NameInMap("UploadEndpoint")
    public String uploadEndpoint;

    /**
     * <p>The storage type of the source file. Valid values:</p>
     * <ul>
     * <li><p><strong>OSS</strong>: The file is stored in Object Storage Service (OSS).</p>
     * </li>
     * <li><p><strong>DOWNLOAD_URL</strong>: The file is accessible via a public download link.</p>
     * </li>
     * <li><p><strong>OSS_BRIDGED</strong>: The service first downloads the file from a public download link to an internal OSS bucket, and then distributes it to the cloud phone instances over the internal network.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("UploadType")
    public String uploadType;

    /**
     * <ul>
     * <li>If <code>UploadType</code> is <code>OSS</code>, this parameter specifies the URI of the source object in Object Storage Service (OSS).</li>
     * </ul>
     * <blockquote>
     * <p>The URI must be in the <code>oss://&lt;bucket-name&gt;/&lt;object-key&gt;</code> format. The specified OSS bucket name must have the <code>cloudphone-saved-bucket-</code> prefix, for example, <code>cloudphone-saved-bucket-example</code>.</p>
     * </blockquote>
     * <ul>
     * <li>If <code>UploadType</code> is <code>DOWNLOAD_URL</code> or <code>OSS_BRIDGED</code>, this parameter specifies the public download link of the source file.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://cloudphone-saved-bucket-example/send/a.txt</p>
     */
    @NameInMap("UploadUrl")
    public String uploadUrl;

    public static SendFileRequest build(java.util.Map<String, ?> map) throws Exception {
        SendFileRequest self = new SendFileRequest();
        return TeaModel.build(map, self);
    }

    public SendFileRequest setAndroidInstanceIdList(java.util.List<String> androidInstanceIdList) {
        this.androidInstanceIdList = androidInstanceIdList;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIdList() {
        return this.androidInstanceIdList;
    }

    public SendFileRequest setAutoInstall(Boolean autoInstall) {
        this.autoInstall = autoInstall;
        return this;
    }
    public Boolean getAutoInstall() {
        return this.autoInstall;
    }

    public SendFileRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SendFileRequest setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
        return this;
    }
    public String getFileMd5() {
        return this.fileMd5;
    }

    public SendFileRequest setSourceFilePath(String sourceFilePath) {
        this.sourceFilePath = sourceFilePath;
        return this;
    }
    public String getSourceFilePath() {
        return this.sourceFilePath;
    }

    public SendFileRequest setTargetFileName(String targetFileName) {
        this.targetFileName = targetFileName;
        return this;
    }
    public String getTargetFileName() {
        return this.targetFileName;
    }

    public SendFileRequest setUploadEndpoint(String uploadEndpoint) {
        this.uploadEndpoint = uploadEndpoint;
        return this;
    }
    public String getUploadEndpoint() {
        return this.uploadEndpoint;
    }

    public SendFileRequest setUploadType(String uploadType) {
        this.uploadType = uploadType;
        return this;
    }
    public String getUploadType() {
        return this.uploadType;
    }

    public SendFileRequest setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }
    public String getUploadUrl() {
        return this.uploadUrl;
    }

}
