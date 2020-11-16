// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201001.models;

import com.aliyun.tea.*;

public class DescribeDirectoriesRequest extends TeaModel {
    @NameInMap("DirectoryType")
    @Validation(required = true)
    public String directoryType;

    @NameInMap("DirectoryId")
    public java.util.List<String> directoryId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    public static DescribeDirectoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDirectoriesRequest self = new DescribeDirectoriesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDirectoriesRequest setDirectoryType(String directoryType) {
        this.directoryType = directoryType;
        return this;
    }
    public String getDirectoryType() {
        return this.directoryType;
    }

    public DescribeDirectoriesRequest setDirectoryId(java.util.List<String> directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public java.util.List<String> getDirectoryId() {
        return this.directoryId;
    }

    public DescribeDirectoriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDirectoriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
