// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListRegionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0axxxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>Next</p>
     */
    @NameInMap("SpecCode")
    public String specCode;

    public static ListRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRegionsRequest self = new ListRegionsRequest();
        return TeaModel.build(map, self);
    }

    public ListRegionsRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListRegionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRegionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRegionsRequest setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

}
