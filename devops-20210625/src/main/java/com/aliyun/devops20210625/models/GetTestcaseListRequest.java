// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetTestcaseListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{\&quot;conditionGroups\&quot;:[[{\&quot;fieldIdentifier\&quot;:\&quot;status\&quot;,\&quot;operator\&quot;:\&quot;CONTAINS\&quot;,\&quot;value\&quot;:[\&quot;cc961a18adf770c6e423ccc5\&quot;],\&quot;toValue\&quot;:null,,\&quot;className\&quot;:\&quot;status\&quot;,\&quot;format\&quot;:\&quot;list\&quot;}]]}</p>
     */
    @NameInMap("conditions")
    public String conditions;

    /**
     * <strong>example:</strong>
     * <p>e27b8eace6501ce51cf5d56784</p>
     */
    @NameInMap("directoryIdentifier")
    public String directoryIdentifier;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResult")
    public String maxResult;

    /**
     * <strong>example:</strong>
     * <p>2591861102250c4522380b33a6</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6d5984c7d92b23fa53d4743c37</p>
     */
    @NameInMap("spaceIdentifier")
    public String spaceIdentifier;

    public static GetTestcaseListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTestcaseListRequest self = new GetTestcaseListRequest();
        return TeaModel.build(map, self);
    }

    public GetTestcaseListRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public GetTestcaseListRequest setDirectoryIdentifier(String directoryIdentifier) {
        this.directoryIdentifier = directoryIdentifier;
        return this;
    }
    public String getDirectoryIdentifier() {
        return this.directoryIdentifier;
    }

    public GetTestcaseListRequest setMaxResult(String maxResult) {
        this.maxResult = maxResult;
        return this;
    }
    public String getMaxResult() {
        return this.maxResult;
    }

    public GetTestcaseListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetTestcaseListRequest setSpaceIdentifier(String spaceIdentifier) {
        this.spaceIdentifier = spaceIdentifier;
        return this;
    }
    public String getSpaceIdentifier() {
        return this.spaceIdentifier;
    }

}
