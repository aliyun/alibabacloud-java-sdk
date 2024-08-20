// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserConfigsRequest extends TeaModel {
    /**
     * <p>The configuration that you want to query. Valid values:</p>
     * <ul>
     * <li>domain_business_control: user configurations</li>
     * <li>bot_basic: the basic edition of bot traffic management, which supports authorized crawlers and provides threat intelligence</li>
     * <li>bot_Advance: the advanced edition of bot traffic management, which supports authorized crawlers and AI intelligent protection and provides threat intelligence</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>domain_business_control</p>
     */
    @NameInMap("FunctionName")
    public String functionName;

    public static DescribeDcdnUserConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserConfigsRequest self = new DescribeDcdnUserConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserConfigsRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

}
