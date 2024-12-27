// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListBatchesRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return. Valid values: 0 to 100.</p>
     * <p>If you do not specify this parameter or set the parameter to 0, the default value of 100 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * <p>The pagination token is used in the next request to retrieve a new page of results if the total number of results exceeds the value of the MaxResults parameter. The next call to the operation returns results lexicographically after the NextToken parameter value.</p>
     * <p>You do not need to specify this parameter in your initial request.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpwZw==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li>ASC: sorts the results in ascending order. This is the default sort order.</li>
     * <li>DES: sorts the results in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The name of the project.<a href="~~478153~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The sort field. Valid values:</p>
     * <ul>
     * <li>CreateTime</li>
     * <li>UpdateTime</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2020-11-11T06:51:17.5Z</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The task status.</p>
     * <ul>
     * <li>Ready: The task is newly created and ready.</li>
     * <li>Running: The task is running.</li>
     * <li>Failed: The task failed and cannot be automatically recovered.</li>
     * <li>Suspended: The task is suspended.</li>
     * <li>Succeeded: The task is successful.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Succeed</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The custom tag. You can use this parameter to query tasks that have the specified tag.</p>
     * 
     * <strong>example:</strong>
     * <p>test=val1</p>
     */
    @NameInMap("TagSelector")
    public String tagSelector;

    public static ListBatchesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBatchesRequest self = new ListBatchesRequest();
        return TeaModel.build(map, self);
    }

    public ListBatchesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListBatchesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBatchesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListBatchesRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ListBatchesRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListBatchesRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ListBatchesRequest setTagSelector(String tagSelector) {
        this.tagSelector = tagSelector;
        return this;
    }
    public String getTagSelector() {
        return this.tagSelector;
    }

}
