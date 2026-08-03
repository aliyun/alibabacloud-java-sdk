// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListRecentlyRecycledDirectoriesRequest extends TeaModel {
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
     * <p>The maximum number of directories to return per query.</p>
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
     * <p>If the query results are not completely returned, the NextToken parameter is returned with a value. You can specify the NextToken value in the next request to continue the query.</p>
     * 
     * <strong>example:</strong>
     * <p>1256****25</p>
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
