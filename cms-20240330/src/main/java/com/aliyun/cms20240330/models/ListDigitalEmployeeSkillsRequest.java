// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListDigitalEmployeeSkillsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return for this request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page. A null value indicates that there are no more pages.</p>
     * 
     * <strong>example:</strong>
     * <p>sjC5rekx93Ew7K7VcmI3wkBZBYQ-GphB2ilQu3zJCGxoZuicwyJznfo2riTjr-lq</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The name of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("skillName")
    public String skillName;

    public static ListDigitalEmployeeSkillsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDigitalEmployeeSkillsRequest self = new ListDigitalEmployeeSkillsRequest();
        return TeaModel.build(map, self);
    }

    public ListDigitalEmployeeSkillsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDigitalEmployeeSkillsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDigitalEmployeeSkillsRequest setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

}
