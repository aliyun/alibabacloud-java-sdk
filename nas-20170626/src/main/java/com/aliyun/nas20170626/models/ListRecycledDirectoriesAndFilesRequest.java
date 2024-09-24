// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListRecycledDirectoriesAndFilesRequest extends TeaModel {
    /**
     * <p>The ID of the directory that you want to query.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2412173.html">ListRecentlyRecycledDirectories </a>operation to query the file ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>04***08</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The ID of the file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1ca404****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The number of files or directories to return for each query.</p>
     * <p>Valid values: 10 to 1000.</p>
     * <p>Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.</p>
     * <p>If all the files and directories are incompletely returned in a query, the return value of the NextToken parameter is not empty. In this case, you can specify a valid value for the NextToken parameter to continue the query.</p>
     * 
     * <strong>example:</strong>
     * <p>CJyNARIsMTY5OTI2NjQ3NTEzMjY2OTMwOF8xODA5NF8ufnl0YkROTl9uZXcuaXB5bmI=</p>
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
