// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteResponseRuleRequest extends TeaModel {
    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve the next page of results. If you do not specify this parameter, the service returns the first page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the data management center for threat analysis. This must be the region where your assets are located. Valid values:</p>
     * <ul>
     * <li><p><code>cn-hangzhou</code>: for assets in the Chinese mainland or Hong Kong (China).</p>
     * </li>
     * <li><p><code>ap-southeast-1</code>: for assets in international regions.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the automatic response rule to delete.</p>
     * 
     * <strong>example:</strong>
     * <p>403235</p>
     */
    @NameInMap("ResponseRuleId")
    public String responseRuleId;

    public static DeleteResponseRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResponseRuleRequest self = new DeleteResponseRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResponseRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteResponseRuleRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DeleteResponseRuleRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DeleteResponseRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteResponseRuleRequest setResponseRuleId(String responseRuleId) {
        this.responseRuleId = responseRuleId;
        return this;
    }
    public String getResponseRuleId() {
        return this.responseRuleId;
    }

}
