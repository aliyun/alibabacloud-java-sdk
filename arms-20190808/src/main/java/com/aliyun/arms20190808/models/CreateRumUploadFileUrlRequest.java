// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateRumUploadFileUrlRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>text/plain</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <strong>example:</strong>
     * <p>test.js.map</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>iioe7jcnuk@582846f37******</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>source-map</p>
     */
    @NameInMap("SourcemapType")
    public String sourcemapType;

    /**
     * <strong>example:</strong>
     * <p>125bdb39-a415-4503-bd96-e293925fc64c</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    /**
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("VersionId")
    public String versionId;

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

}
