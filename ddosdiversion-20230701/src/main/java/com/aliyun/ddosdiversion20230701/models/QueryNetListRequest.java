// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosdiversion20230701.models;

import com.aliyun.tea.*;

public class QueryNetListRequest extends TeaModel {
    @NameInMap("MainNet")
    public String mainNet;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("Net")
    public String net;

    @NameInMap("Num")
    public Long num;

    @NameInMap("Page")
    public Long page;

    @NameInMap("SaleId")
    public String saleId;

    public static QueryNetListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNetListRequest self = new QueryNetListRequest();
        return TeaModel.build(map, self);
    }

    public QueryNetListRequest setMainNet(String mainNet) {
        this.mainNet = mainNet;
        return this;
    }
    public String getMainNet() {
        return this.mainNet;
    }

    public QueryNetListRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public QueryNetListRequest setNet(String net) {
        this.net = net;
        return this;
    }
    public String getNet() {
        return this.net;
    }

    public QueryNetListRequest setNum(Long num) {
        this.num = num;
        return this;
    }
    public Long getNum() {
        return this.num;
    }

    public QueryNetListRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public QueryNetListRequest setSaleId(String saleId) {
        this.saleId = saleId;
        return this;
    }
    public String getSaleId() {
        return this.saleId;
    }

}
