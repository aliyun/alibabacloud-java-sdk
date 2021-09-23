// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListRecentlyRecycledDirectoriesRequest extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Long maxResults;

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

    public ListRecentlyRecycledDirectoriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRecentlyRecycledDirectoriesRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

}
