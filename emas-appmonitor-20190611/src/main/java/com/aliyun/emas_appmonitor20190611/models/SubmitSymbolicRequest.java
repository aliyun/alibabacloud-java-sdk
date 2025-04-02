// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class SubmitSymbolicRequest extends TeaModel {
    /**
     * <p>appKey</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>24781204</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <strong>example:</strong>
     * <p>ab6b81d800968f2</p>
     */
    @NameInMap("BuildId")
    public String buildId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_so.zip</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>24781204@android/1743506690915-app_so.zip</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>APP_SO</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>android</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <p>uuid</p>
     * 
     * <strong>example:</strong>
     * <p>abcf4a4b-158c-4a0b-b81c-262785d84c4f</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static SubmitSymbolicRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSymbolicRequest self = new SubmitSymbolicRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSymbolicRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public SubmitSymbolicRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public SubmitSymbolicRequest setBuildId(String buildId) {
        this.buildId = buildId;
        return this;
    }
    public String getBuildId() {
        return this.buildId;
    }

    public SubmitSymbolicRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitSymbolicRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public SubmitSymbolicRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public SubmitSymbolicRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public SubmitSymbolicRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
