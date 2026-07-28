// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListDetectConfigsRequest extends TeaModel {
    /**
     * <p>Name of the drift detection configuration (fuzzy match).</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("detectConfigName")
    public String detectConfigName;

    /**
     * <p>Maximum number of records to retrieve in a single request. Valid range: 1–200. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>Query credential (Token). Set this parameter to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>30BaZ9ekYWXJdqshYecA++coNg7qT1Zbm3RfLyFIZeY=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListDetectConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDetectConfigsRequest self = new ListDetectConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListDetectConfigsRequest setDetectConfigName(String detectConfigName) {
        this.detectConfigName = detectConfigName;
        return this;
    }
    public String getDetectConfigName() {
        return this.detectConfigName;
    }

    public ListDetectConfigsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDetectConfigsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
