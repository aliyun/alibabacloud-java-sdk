// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class DescribeScanResultsByEngineRequest extends TeaModel {
    /**
     * <p>Filters results by the baseline state of incremental scans. Valid values: new, unchanged, absent, and updated.</p>
     * 
     * <strong>example:</strong>
     * <p>unchanged</p>
     */
    @NameInMap("baselineState")
    public String baselineState;

    /**
     * <p>The language. Valid values:</p>
     * <ul>
     * <li>zh: Chinese (default).</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("lang")
    public String lang;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <p>The pagination token. Do not specify this parameter for the first page or set it to an empty string. For subsequent pages, pass the nextToken value from the previous response without any modification. If the nextToken value in the response is empty, the last page has been reached.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJ0IjoiMjAyNi0wNy0xNlQwNzo1MzozOC4wMjFaIiwiaSI6MTAwMDQ0OH0</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The component name for fuzzy match. This parameter takes effect only when engine is set to sca.</p>
     * 
     * <strong>example:</strong>
     * <p>app10000006824_fulljoin_61b2c_global_ad_budget_ctrl_v1.5.jar</p>
     */
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
