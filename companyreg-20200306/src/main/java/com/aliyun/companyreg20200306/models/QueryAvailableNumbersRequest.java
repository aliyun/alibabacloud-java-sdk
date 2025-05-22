// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryAvailableNumbersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("BizType")
    public String bizType;

    public static QueryAvailableNumbersRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAvailableNumbersRequest self = new QueryAvailableNumbersRequest();
        return TeaModel.build(map, self);
    }

    public QueryAvailableNumbersRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
