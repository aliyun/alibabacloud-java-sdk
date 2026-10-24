// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class DescribeSimilarSecurityEventsRequest extends TeaModel {
    /**
     * <p>The page number of the returned results. Default value: <strong>1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The maximum number of entries to return in a single query. This parameter is reserved for compatibility. The backend currently uses CurrentPage and PageSize for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to start the query. You can obtain the token from the result of the previous request.</p>
     * 
     * <strong>example:</strong>
     * <p>****==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The Settings for the number of alerting events displayed on each page in a paged query. Default value: <strong>20</strong>, which indicates that 20 alerting events are displayed per paging.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the query task. You can call the <a href="~~CreateSimilarSecurityEventsQueryTask~~">CreateSimilarSecurityEventsQueryTask</a> operation to obtain this parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1689135</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static DescribeSimilarSecurityEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSimilarSecurityEventsRequest self = new DescribeSimilarSecurityEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSimilarSecurityEventsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSimilarSecurityEventsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSimilarSecurityEventsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSimilarSecurityEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSimilarSecurityEventsRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
