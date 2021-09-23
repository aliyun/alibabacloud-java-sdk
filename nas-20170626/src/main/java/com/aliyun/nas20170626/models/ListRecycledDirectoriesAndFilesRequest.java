// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListRecycledDirectoriesAndFilesRequest extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("FileId")
    public String fileId;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Long maxResults;

    public static ListRecycledDirectoriesAndFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRecycledDirectoriesAndFilesRequest self = new ListRecycledDirectoriesAndFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListRecycledDirectoriesAndFilesRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ListRecycledDirectoriesAndFilesRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ListRecycledDirectoriesAndFilesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRecycledDirectoriesAndFilesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

}
