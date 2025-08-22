// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateRumUploadFileUrlRequest extends TeaModel {
    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The type of the file. You can set this parameter to &quot;application/zip&quot;, &quot;text/plain&quot;, or an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>text/plain</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The file name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test.js.map</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The process ID (PID) of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>iioe7jcnuk@582846f37******</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The file type. Valid values: source-map: SourceMap files. mapping: symbol table files for Android. dsym: dSYM files for iOS.</p>
     * 
     * <strong>example:</strong>
     * <p>source-map</p>
     */
    @NameInMap("SourcemapType")
    public String sourcemapType;

    /**
     * <p>The file ID.</p>
     * 
     * <strong>example:</strong>
     * <p>125bdb39-a415-4503-bd96-e293925fc64c</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    /**
     * <p>The version number of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("Workspace")
    public String workspace;

    public static CreateRumUploadFileUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRumUploadFileUrlRequest self = new CreateRumUploadFileUrlRequest();
        return TeaModel.build(map, self);
    }

    public CreateRumUploadFileUrlRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateRumUploadFileUrlRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public CreateRumUploadFileUrlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateRumUploadFileUrlRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public CreateRumUploadFileUrlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRumUploadFileUrlRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateRumUploadFileUrlRequest setSourcemapType(String sourcemapType) {
        this.sourcemapType = sourcemapType;
        return this;
    }
    public String getSourcemapType() {
        return this.sourcemapType;
    }

    public CreateRumUploadFileUrlRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public CreateRumUploadFileUrlRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public CreateRumUploadFileUrlRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
