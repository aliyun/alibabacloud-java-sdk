// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumUploadFilesRequest extends TeaModel {
    /**
     * <p>The file type. Valid values: source-map: SourceMap files. mapping: symbol table files for Android. dsym: dSYM files for iOS.</p>
     * 
     * <strong>example:</strong>
     * <p>source-map</p>
     */
    @NameInMap("AppType")
    public String appType;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The process ID (PID) of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>aoxxxxxly@741623b4e91****</p>
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

    /**
     * <p>The version number of the files. If you do not specify this parameter, all versions of the files are returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static GetRumUploadFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRumUploadFilesRequest self = new GetRumUploadFilesRequest();
        return TeaModel.build(map, self);
    }

    public GetRumUploadFilesRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetRumUploadFilesRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetRumUploadFilesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetRumUploadFilesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetRumUploadFilesRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public GetRumUploadFilesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetRumUploadFilesRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
