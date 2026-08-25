// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListServerIdeImagesRequest extends TeaModel {
    /**
     * <p>The image label filter condition. Separate multiple Key=Value conditions with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>system.chipType=GPU,system.official=true</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The maximum number of records to return in a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The image name filter condition. Supports fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>tensorflow_2.9</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The pagination token used to continue a query. You do not need to specify this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESG****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number. The value starts from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListServerIdeImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServerIdeImagesRequest self = new ListServerIdeImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListServerIdeImagesRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public ListServerIdeImagesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServerIdeImagesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListServerIdeImagesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServerIdeImagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListServerIdeImagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
