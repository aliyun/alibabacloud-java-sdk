// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListRecentlyRecycledDirectoriesRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The number of directories to return for each query.</p>
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
     * <p>If not all directories are returned in a query, the return value of the NextToken parameter is not empty. In this case, you can specify a valid value for the NextToken parameter to continue the query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListRecentlyRecycledDirectoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRecentlyRecycledDirectoriesRequest self = new ListRecentlyRecycledDirectoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListRecentlyRecycledDirectoriesRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ListRecentlyRecycledDirectoriesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListRecentlyRecycledDirectoriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
