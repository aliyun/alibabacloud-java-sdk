// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetRumSymbolFilesRequest extends TeaModel {
    /**
     * <p>The filter for the symbol file type. Valid values: map, dsym, txt, so, sym, pdb, and json. This parameter is used for query filtering and differs from the fileKind dimension in the upload API GetRumSymbolFileParams: uploading dsym (.dSYM.zip) corresponds to artifactType=dsym; standard symbol-zip (.zip) is not currently supported for filtering by artifactType.</p>
     * 
     * <strong>example:</strong>
     * <p>txt</p>
     */
    @NameInMap("artifactType")
    public String artifactType;

    /**
     * <p>The list of search keywords. You can specify up to 50 keywords to match file names, UUIDs, version numbers, and more.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;new-app&quot;]</p>
     */
    @NameInMap("keywords")
    public java.util.List<String> keywords;

    /**
     * <p>The paging token. To query the next page, specify the nextToken value returned in the previous response. The example is for illustration purposes only and cannot be used for actual queries.</p>
     * 
     * <strong>example:</strong>
     * <p>next</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The filter for the platform type. Valid values: web, miniapp, minigame, uniapp, android, ios, harmonyos, windows, macos, and linux.</p>
     * 
     * <strong>example:</strong>
     * <p>android</p>
     */
    @NameInMap("platform")
    public String platform;

    /**
     * <p>The service ID of the RUM application. This parameter is required, cannot be an empty string, and must be used together with workspace to locate the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4e5@f67890</p>
     */
    @NameInMap("serviceId")
    public String serviceId;

    /**
     * <p>The filter for the application version number.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>The name of the workspace to which the RUM application belongs. This parameter is required, cannot be an empty string, and must be used together with serviceId to locate the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-1234567890-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static GetRumSymbolFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRumSymbolFilesRequest self = new GetRumSymbolFilesRequest();
        return TeaModel.build(map, self);
    }

    public GetRumSymbolFilesRequest setArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }
    public String getArtifactType() {
        return this.artifactType;
    }

    public GetRumSymbolFilesRequest setKeywords(java.util.List<String> keywords) {
        this.keywords = keywords;
        return this;
    }
    public java.util.List<String> getKeywords() {
        return this.keywords;
    }

    public GetRumSymbolFilesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetRumSymbolFilesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetRumSymbolFilesRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public GetRumSymbolFilesRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetRumSymbolFilesRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetRumSymbolFilesRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
