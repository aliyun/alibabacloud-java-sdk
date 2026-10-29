// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class SendFileRequest extends TeaModel {
    /**
     * <p>The list of instances.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AndroidInstanceIdList")
    public java.util.List<String> androidInstanceIdList;

    /**
     * <p>Specifies whether to automatically install the uploaded application.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoInstall")
    public Boolean autoInstall;

    /**
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. The token can be up to 100 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The MD5 value of the input file.</p>
     */
    @NameInMap("FileMd5")
    public String fileMd5;

    /**
     * <p>The upload path inside the cloud phone to which the file is uploaded.</p>
     * <blockquote>
     * <p>If UploadType is OSS or OSS_BRIDGED, the upload path SourceFilePath inside the cloud phone must be a directory, such as /sdcard/Download. If UploadType is DOWNLOAD_URL, the upload path SourceFilePath inside the cloud phone must be a file, such as /sdcard/Download/MyFile.txt.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/sdcard/Download</p>
     */
    @NameInMap("SourceFilePath")
    public String sourceFilePath;

    /**
     * <p>The name of the file uploaded from OSS to the cloud phone.</p>
     * <blockquote>
     * <p>If UploadType is OSS or OSS_BRIDGED, the TargetFileName parameter is optional. If TargetFileName is empty, the original file name is retained when the OSS file is uploaded to the cloud phone. If TargetFileName is not empty, the file name in the SourceFilePath directory on the cloud phone is set to the value of TargetFileName. If UploadType is DOWNLOAD_URL, the TargetFileName parameter does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test.txt</p>
     */
    @NameInMap("TargetFileName")
    public String targetFileName;

    /**
     * <p>The service domain name for uploading files to OSS. This parameter is required when UploadType is set to OSS or OSS_BRIDGED.</p>
     * <blockquote>
     * <p>If the cloud phone and the OSS bucket are in the same region, you can use an internal endpoint to accelerate the transmission speed and avoid Internet traffic fees. For example, the internal endpoint for the China (Hangzhou) region is <code>oss-cn-hangzhou-internal.aliyuncs.com</code>. For more information about the mapping between regions and endpoints, see <a href="https://help.aliyun.com/document_detail/31837.html">Regions and endpoints</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-hangzhou-internal.aliyuncs.com</p>
     */
    @NameInMap("UploadEndpoint")
    public String uploadEndpoint;

    /**
     * <p>The storage type of the file to be uploaded.</p>
     * <ul>
     * <li>OSS: The file to be uploaded is an OSS resource.</li>
     * <li>DOWNLOAD_URL: The file to be uploaded is a public download URL.</li>
     * <li>OSS_BRIDGED: The file is synchronized to OSS through a public download URL and then distributed to cloud phone instances over the OSS internal network.</li>
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
     * <li>If UploadType is OSS, UploadUrl is the cloud address of the file uploaded to OSS.<blockquote>
     * <p>The OSS bucket name must start with the prefix &quot;cloudphone-saved-bucket-&quot;, such as &quot;cloudphone-saved-bucket-example&quot;. You must create an OSS folder as the backup directory. The format of UploadUrl is &quot;oss://&quot; + &quot;Bucket name&quot; + &quot;/&quot; + &quot;Folder name&quot; + &quot;Uploaded file name&quot;.</p>
     * </blockquote>
     * </li>
     * <li>If UploadType is DOWNLOAD or OSS_BRIDGED, UploadUrl is the public download URL of the file.</li>
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
