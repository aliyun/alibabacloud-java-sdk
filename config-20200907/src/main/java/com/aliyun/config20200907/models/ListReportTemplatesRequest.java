// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListReportTemplatesRequest extends TeaModel {
    /**
     * <p>The keyword for your search.</p>
     * <p>You can perform a fuzzy query on template ID, template name, or template description.</p>
     * 
     * <strong>example:</strong>
     * <p>test-description</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of entries to return per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>If the response is truncated, use NextToken to send another request and get results after the truncation point.</p>
     * 
     * <strong>example:</strong>
     * <p>IWBjqMYSy0is7zSMGu16****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListReportTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListReportTemplatesRequest self = new ListReportTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListReportTemplatesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListReportTemplatesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListReportTemplatesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
