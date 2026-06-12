// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListSkillFilesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results. This token is returned only when more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAWns8w4MmhzeptXVRG0PUEU=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2849EE73-AFFA-5AFD-9575-12FA886451DA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Skill files.</p>
     */
    @NameInMap("SkillFiles")
    public java.util.List<ListSkillFilesResponseBodySkillFiles> skillFiles;

    /**
     * <p>The total number of entries that match the query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSkillFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillFilesResponseBody self = new ListSkillFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillFilesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSkillFilesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSkillFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSkillFilesResponseBody setSkillFiles(java.util.List<ListSkillFilesResponseBodySkillFiles> skillFiles) {
        this.skillFiles = skillFiles;
        return this;
    }
    public java.util.List<ListSkillFilesResponseBodySkillFiles> getSkillFiles() {
        return this.skillFiles;
    }

    public ListSkillFilesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSkillFilesResponseBodySkillFiles extends TeaModel {
        /**
         * <p>The relative path of the file within the Skill.</p>
         * 
         * <strong>example:</strong>
         * <p>SKILL.md</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>The pre-signed URL for accessing the file in OSS.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/SKILL.md">https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/SKILL.md</a></p>
         */
        @NameInMap("SignedUrl")
        public String signedUrl;

        public static ListSkillFilesResponseBodySkillFiles build(java.util.Map<String, ?> map) throws Exception {
            ListSkillFilesResponseBodySkillFiles self = new ListSkillFilesResponseBodySkillFiles();
            return TeaModel.build(map, self);
        }

        public ListSkillFilesResponseBodySkillFiles setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListSkillFilesResponseBodySkillFiles setSignedUrl(String signedUrl) {
            this.signedUrl = signedUrl;
            return this;
        }
        public String getSignedUrl() {
            return this.signedUrl;
        }

    }

}
