// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeOssStockStatusRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("StockTaskId")
    public Long stockTaskId;

    public static DescribeOssStockStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssStockStatusRequest self = new DescribeOssStockStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOssStockStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOssStockStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeOssStockStatusRequest setStockTaskId(Long stockTaskId) {
        this.stockTaskId = stockTaskId;
        return this;
    }
    public Long getStockTaskId() {
        return this.stockTaskId;
    }

}
