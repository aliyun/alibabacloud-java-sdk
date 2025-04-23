// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListTerraformProviderVersionsRequest extends TeaModel {
    @NameInMap("keyword")
    public String keyword;

    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("usage")
    public String usage;

    public static ListTerraformProviderVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTerraformProviderVersionsRequest self = new ListTerraformProviderVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListTerraformProviderVersionsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListTerraformProviderVersionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTerraformProviderVersionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTerraformProviderVersionsRequest setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

}
