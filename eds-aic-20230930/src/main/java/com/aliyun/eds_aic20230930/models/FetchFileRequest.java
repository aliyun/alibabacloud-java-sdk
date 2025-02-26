// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class FetchFileRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud phone instances.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AndroidInstanceIdList")
    public java.util.List<String> androidInstanceIdList;

    /**
     * <p>The path to the file that you want to pull from the cloud phone instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/data/a.txt</p>
     */
    @NameInMap("SourceFilePath")
    public String sourceFilePath;

    /**
     * <p>The endpoint of the OSS bucket in which you want to store the pulled file.</p>
     * <blockquote>
     * <p> Set the value to an internal endpoint when the cloud phone instance and the OSS bucket are in the same region to improve upload speed without incurring public traffic fees. Sample endpoint: <code>oss-cn-hangzhou-internal.aliyuncs.com</code>. For more information, see <a href="https://help.aliyun.com/document_detail/31837.html">OSS regions and endpoints</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-hangzhou.aliyuncs.com</p>
     */
    @NameInMap("UploadEndpoint")
    public String uploadEndpoint;

    /**
     * <p>The type of the storage service.</p>
     * <blockquote>
     * <p> Currently, only OSS is supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("UploadType")
    public String uploadType;

    /**
     * <p>The OSS URL of the pulled file.</p>
     * <blockquote>
     * <p> The OSS bucket name must start with &quot;cloudphone-saved-bucket-&quot;, for example, &quot;cloudphone-saved-bucket-example&quot;. You must also create an OSS directory to store the backup data. Set the value for UploadUrl in this format: oss://\<BucketName>/\<OSSDirectoryName>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
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
