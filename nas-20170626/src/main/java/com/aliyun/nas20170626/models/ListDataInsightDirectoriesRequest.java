// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListDataInsightDirectoriesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-030wldnqm8evtpy****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("ParentDir")
    public String parentDir;

    public static ListDataInsightDirectoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataInsightDirectoriesRequest self = new ListDataInsightDirectoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListDataInsightDirectoriesRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ListDataInsightDirectoriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataInsightDirectoriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataInsightDirectoriesRequest setParentDir(String parentDir) {
        this.parentDir = parentDir;
        return this;
    }
    public String getParentDir() {
        return this.parentDir;
    }

}
