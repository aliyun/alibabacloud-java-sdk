// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetRumSymbolFilesResponseBody extends TeaModel {
    /**
     * <p>The list of symbol files.</p>
     */
    @NameInMap("files")
    public java.util.List<GetRumSymbolFilesResponseBodyFiles> files;

    /**
     * <p>Indicates whether more data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("hasMore")
    public Boolean hasMore;

    /**
     * <p>The pagination token for the next page. The example is for illustration purposes only and cannot be used for actual queries. To query the next page, use the actual value returned in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>next</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The number of entries returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetRumSymbolFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRumSymbolFilesResponseBody self = new GetRumSymbolFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRumSymbolFilesResponseBody setFiles(java.util.List<GetRumSymbolFilesResponseBodyFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<GetRumSymbolFilesResponseBodyFiles> getFiles() {
        return this.files;
    }

    public GetRumSymbolFilesResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public GetRumSymbolFilesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetRumSymbolFilesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetRumSymbolFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRumSymbolFilesResponseBodyFiles extends TeaModel {
        /**
         * <p>The object path of the symbol file.</p>
         * 
         * <strong>example:</strong>
         * <p>user/workspace/service-id/3.0.0/build-1/new-app.map</p>
         */
        @NameInMap("artifactPath")
        public String artifactPath;

        /**
         * <p>The type of the symbol file.</p>
         * 
         * <strong>example:</strong>
         * <p>map</p>
         */
        @NameInMap("artifactType")
        public String artifactType;

        /**
         * <p>The name of the symbol file.</p>
         * 
         * <strong>example:</strong>
         * <p>new-app.map</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <p>The list of matched search keywords.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;new-app&quot;]</p>
         */
        @NameInMap("matchedKeywords")
        public java.util.List<String> matchedKeywords;

        /**
         * <p>The platform type to which the file belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>web</p>
         */
        @NameInMap("platform")
        public String platform;

        /**
         * <p>The size of the file in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <p>The source of the symbol file. This query API returns only symbol files uploaded by users, which is fixed to user. The value system is reserved for internal system symbols of the platform.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The timestamp of the last time the file was updated, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1778806923000</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        /**
         * <p>The UUID or Debug ID of the symbol file.</p>
         * 
         * <strong>example:</strong>
         * <p>build-1</p>
         */
        @NameInMap("uuid")
        public String uuid;

        /**
         * <p>The associated application version number.</p>
         * 
         * <strong>example:</strong>
         * <p>3.0.0</p>
         */
        @NameInMap("version")
        public String version;

        public static GetRumSymbolFilesResponseBodyFiles build(java.util.Map<String, ?> map) throws Exception {
            GetRumSymbolFilesResponseBodyFiles self = new GetRumSymbolFilesResponseBodyFiles();
            return TeaModel.build(map, self);
        }

        public GetRumSymbolFilesResponseBodyFiles setArtifactPath(String artifactPath) {
            this.artifactPath = artifactPath;
            return this;
        }
        public String getArtifactPath() {
            return this.artifactPath;
        }

        public GetRumSymbolFilesResponseBodyFiles setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public GetRumSymbolFilesResponseBodyFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetRumSymbolFilesResponseBodyFiles setMatchedKeywords(java.util.List<String> matchedKeywords) {
            this.matchedKeywords = matchedKeywords;
            return this;
        }
        public java.util.List<String> getMatchedKeywords() {
            return this.matchedKeywords;
        }

        public GetRumSymbolFilesResponseBodyFiles setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public GetRumSymbolFilesResponseBodyFiles setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetRumSymbolFilesResponseBodyFiles setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetRumSymbolFilesResponseBodyFiles setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetRumSymbolFilesResponseBodyFiles setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public GetRumSymbolFilesResponseBodyFiles setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
