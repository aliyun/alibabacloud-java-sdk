// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafDefaultRulesRequest extends TeaModel {
    /**
     * <p>The query conditions. The value is a string in the JSON format. Format: `QueryArgs={"DefenseScene":"anti_scan"}`</p>
     */
    @NameInMap("QueryArgs")
    public String queryArgs;

    public static DescribeDcdnWafDefaultRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafDefaultRulesRequest self = new DescribeDcdnWafDefaultRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafDefaultRulesRequest setQueryArgs(String queryArgs) {
        this.queryArgs = queryArgs;
        return this;
    }
    public String getQueryArgs() {
        return this.queryArgs;
    }

}
