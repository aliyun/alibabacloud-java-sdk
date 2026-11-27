// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListRecycledDirectoriesAndFilesRequest extends TeaModel {
    /**
     * <p>The FileId of the directory to be queried.</p>
     * <p>This field is the NFS inode number. When the recycle bin is empty, you can set FileId to 2 (the inode of the root directory) to directly call this operation to verify the accessibility of the operation or query the content of the recycle bin in the root directory. You can call the <a href="https://help.aliyun.com/document_detail/2412173.html">ListRecentlyRecycledDirectories</a> operation to query other valid FileIds.</p>
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
     * <p>The number of files or directories to return per query.</p>
     * <p>Valid values: 10 to 1000.</p>
     * <p>Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The token for the next page. You do not need to specify this parameter for the first query.</p>
     * <p>If the query does not return all files and directories, a non-empty NextToken is returned.
     * You can use the returned NextToken to continue the query.</p>
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
