// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class DescribeScanResultsByEngineRequest extends TeaModel {
    /**
     * <p>按 baseline_state 过滤 findings。值为 new/unchanged/absent/updated 之一。</p>
     */
    @NameInMap("baselineState")
    public String baselineState;

    @NameInMap("lang")
    public String lang;

    @NameInMap("maxResults")
    public Long maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("packageName")
    public String packageName;

    public static DescribeScanResultsByEngineRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScanResultsByEngineRequest self = new DescribeScanResultsByEngineRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScanResultsByEngineRequest setBaselineState(String baselineState) {
        this.baselineState = baselineState;
        return this;
    }
    public String getBaselineState() {
        return this.baselineState;
    }

    public DescribeScanResultsByEngineRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeScanResultsByEngineRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeScanResultsByEngineRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeScanResultsByEngineRequest setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

}
