// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class SendFileRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud phone instances.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AndroidInstanceIdList")
    public java.util.List<String> androidInstanceIdList;

    /**
     * <p>The path to which you want to upload the pushed file in the cloud phone instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/data</p>
     */
    @NameInMap("SourceFilePath")
    public String sourceFilePath;

    /**
     * <p>The name of the file uploaded from the Object Storage Service (OSS) to the cloud phone instance.</p>
     * <blockquote>
     * <p> If UploadType is set to OSS, you must specify TargetFileName. If TargetFileName is empty, the file uploaded from the OSS bucket to the cloud phone instance retains its original name. If TargetFileName is provided with a value, the uploaded file in the SourceFilePath directory uses the specified name (TargetFileName). If UploadType is set to DOWNLOAD_URL, TargetFileName does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test.txt</p>
     */
    @NameInMap("TargetFileName")
    public String targetFileName;

    /**
     * <p>The endpoint of the OSS bucket in which the file is stored.</p>
     * <blockquote>
     * <p> Set the value to an internal endpoint when the cloud phone instance and the OSS bucket are in the same region to improve transfer speed without incurring public traffic fees. Sample endpoint: <code>oss-cn-hangzhou-internal.aliyuncs.com</code>. For more information, see <a href="https://help.aliyun.com/document_detail/31837.html">OSS regions and endpoints</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-hangzhou.aliyuncs.com</p>
     */
    @NameInMap("UploadEndpoint")
    public String uploadEndpoint;

    /**
     * <p>The storage type of the file that you want to upload.</p>
     * <ul>
     * <li>Set the value to OSS.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("UploadType")
    public String uploadType;

    /**
     * <p>The OSS URL of the file.</p>
     * <blockquote>
     * <p> The OSS bucket name must start with &quot;cloudphone-saved-bucket-&quot;, for example, &quot;cloudphone-saved-bucket-example&quot;. You must also create an OSS directory to store the backup data. Set the value for UploadUrl in this format: oss://\<BucketName>/\<OSSDirectoryName>\<FileName>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
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
