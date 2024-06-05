// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListRecycledDirectoriesAndFilesRequest extends TeaModel {
    /**
     * <p>The ID of the directory that you want to query.</p>
     * <br>
     * <p>You can call the [ListRecycleBinJobs](https://help.aliyun.com/document_detail/264192.html) operation to query the value of the FileId parameter.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The ID of the file system.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The number of files or directories to return for each query.</p>
     * <br>
     * <p>Valid values: 10 to 1000.</p>
     * <br>
     * <p>Default value: 100.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.</p>
     * <br>
     * <p>If all the files and directories are incompletely returned in a query, the return value of the NextToken parameter is not empty. In this case, you can specify a valid value for the NextToken parameter to continue the query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListRecycledDirectoriesAndFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRecycledDirectoriesAndFilesRequest self = new ListRecycledDirectoriesAndFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListRecycledDirectoriesAndFilesRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ListRecycledDirectoriesAndFilesRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ListRecycledDirectoriesAndFilesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListRecycledDirectoriesAndFilesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
