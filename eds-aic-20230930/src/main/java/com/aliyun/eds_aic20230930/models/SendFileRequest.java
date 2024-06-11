// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class SendFileRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AndroidInstanceIdList")
    public java.util.List<String> androidInstanceIdList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceFilePath")
    public String sourceFilePath;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UploadEndpoint")
    public String uploadEndpoint;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UploadType")
    public String uploadType;

    /**
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
