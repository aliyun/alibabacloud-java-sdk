// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetTestcaseListRequest extends TeaModel {
    @NameInMap("conditions")
    public String conditions;

    @NameInMap("directoryIdentifier")
    public String directoryIdentifier;

    @NameInMap("maxResult")
    public String maxResult;

    @NameInMap("nextToken")
    public String nextToken;

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
