// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserConfigsRequest extends TeaModel {
    /**
     * <p>The name of the configuration.</p>
     * <br>
     * <p>The configuration that is specified by enterprise users and public service sectors.</p>
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
