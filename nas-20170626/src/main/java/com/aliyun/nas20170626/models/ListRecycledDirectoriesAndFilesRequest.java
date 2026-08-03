// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListRecycledDirectoriesAndFilesRequest extends TeaModel {
    /**
     * <p>The FileId of the directory to query.</p>
     * <p>If the recycle bin is empty, you can call this operation with FileId=2 (root directory inode) to verify the reachability of the operation or query the recycle bin content under the root directory. You can obtain other valid FileId values by calling the <a href="https://help.aliyun.com/document_detail/2412173.html">ListRecentlyRecycledDirectories</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>04***08</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The file system ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1ca404****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The number of files or directories returned per query.</p>
     * <p>Valid values: 10 to 1000.</p>
     * <p>Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token for the next page. You do not need to specify this parameter for the first query.</p>
     * <p>If a single query does not return all files and directories, a non-empty NextToken is returned. You can specify the correct NextToken in subsequent queries to continue listing.</p>
     * 
     * <strong>example:</strong>
     * <p>1256****25</p>
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
