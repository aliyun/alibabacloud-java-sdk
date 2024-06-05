// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFilesetsRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The filter that is used to query filesets.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeFilesetsRequestFilters> filters;

    /**
     * <p>The number of results for each query.</p>
     * <br>
     * <p>Valid values: 10 to 100. Default value: 20.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static DescribeFilesetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFilesetsRequest self = new DescribeFilesetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFilesetsRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeFilesetsRequest setFilters(java.util.List<DescribeFilesetsRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribeFilesetsRequestFilters> getFilters() {
        return this.filters;
    }

    public DescribeFilesetsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeFilesetsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class DescribeFilesetsRequestFilters extends TeaModel {
        /**
         * <p>The filter name. Valid values:</p>
         * <br>
         * <p>*   FsetIds: filters filesets by fileset ID.</p>
         * <p>*   FileSystemPath: filters filesets based on the path of a fileset in a CPFS file system.</p>
         * <p>*   Description: filters filesets based on the fileset description.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter value. This parameter does not support wildcards.</p>
         * <br>
         * <p>*   If Key is set to FsetIds, set Value to a fileset ID or a part of the fileset ID. You can specify a fileset ID or a group of fileset IDs. You can specify a maximum of 10 fileset IDs. Example: `fset-12345678` or `fset-12345678,fset-12345679`.</p>
         * <p>*   If Key is set to FileSystemPath, set Value to the path or a part of the path of a fileset in a CPFS file system. The value must be 2 to 1,024 characters in length. The value must be encoded in UTF-8.</p>
         * <p>*   If Key is set to Description, set Value to a fileset description or a part of the fileset description.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeFilesetsRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeFilesetsRequestFilters self = new DescribeFilesetsRequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribeFilesetsRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeFilesetsRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
