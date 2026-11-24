// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteResponseRuleRequest extends TeaModel {
    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of data records to return in the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that specifies the starting position for reading. Leave this parameter empty to start reading from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region where the data management center for threat analysis is located. You must select the region of the management center based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Assets are located in the Chinese mainland and Hong Kong (China).</li>
     * <li>ap-southeast-1: Assets are located outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the automated response rule.</p>
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
