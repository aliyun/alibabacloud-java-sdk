// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListRegionsRequest extends TeaModel {
    /**
     * <p>The language of the response. The default value is zh-CN. Valid values:</p>
     * <ul>
     * <li><p>zh-CN (default): Chinese.</p>
     * </li>
     * <li><p>en-US: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0axxxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The product name. The default value is Next. Valid values:</p>
     * <ul>
     * <li><p>Next: The E-HPC Cluster product, formerly known as E-HPC NEXT.</p>
     * </li>
     * <li><p>Instant: The E-HPC Instant product.</p>
     * </li>
     * </ul>
     * 
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
