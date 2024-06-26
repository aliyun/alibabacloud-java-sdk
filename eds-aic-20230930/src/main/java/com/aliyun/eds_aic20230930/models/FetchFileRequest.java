// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class FetchFileRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AndroidInstanceIdList")
    public java.util.List<String> androidInstanceIdList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/data/a.txt</p>
     */
    @NameInMap("SourceFilePath")
    public String sourceFilePath;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-hangzhou.aliyuncs.com</p>
     */
    @NameInMap("UploadEndpoint")
    public String uploadEndpoint;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("UploadType")
    public String uploadType;

    /**
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
