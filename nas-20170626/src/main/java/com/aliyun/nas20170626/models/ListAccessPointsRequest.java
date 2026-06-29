// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListAccessPointsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0913nx15amuix9a****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("Filters")
    public java.util.List<ListAccessPointsRequestFilters> filters;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>MTY4NzcxOTcwMjAzMDk2Nzc0MyM4MDM4****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListAccessPointsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccessPointsRequest self = new ListAccessPointsRequest();
        return TeaModel.build(map, self);
    }

    public ListAccessPointsRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ListAccessPointsRequest setFilters(java.util.List<ListAccessPointsRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<ListAccessPointsRequestFilters> getFilters() {
        return this.filters;
    }

    public ListAccessPointsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAccessPointsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListAccessPointsRequestFilters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AccessPointId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAccessPointsRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            ListAccessPointsRequestFilters self = new ListAccessPointsRequestFilters();
            return TeaModel.build(map, self);
        }

        public ListAccessPointsRequestFilters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAccessPointsRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
