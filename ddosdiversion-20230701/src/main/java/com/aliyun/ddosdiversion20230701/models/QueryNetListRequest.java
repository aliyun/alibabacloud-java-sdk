// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosdiversion20230701.models;

import com.aliyun.tea.*;

public class QueryNetListRequest extends TeaModel {
    /**
     * <p>The primary CIDR block of the anti-DDoS diversion instance for which an extended CIDR block is configured. If no extended CIDR blocks are configured for the anti-DDoS diversion instance, leave this parameter empty.</p>
     */
    @NameInMap("MainNet")
    public String mainNet;

    /**
     * <p>The scheduling mode. Valid values:</p>
     * <br>
     * <p>*   manual: manual scheduling</p>
     * <p>*   netflow-auto: automatic scheduling</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The CIDR block of the anti-DDoS diversion instance.</p>
     * <br>
     * <p>>  If no extended CIDR blocks are configured for the anti-DDoS diversion instance, this parameter specifies the CIDR block of the instance. If an extended CIDR block is configured for the anti-DDoS diversion instance, this parameter specifies the extended CIDR block that is configured for the instance. If this parameter is specified, the MainNet parameter is required.</p>
     */
    @NameInMap("Net")
    public String net;

    /**
     * <p>The number of entries per page. Default value: 100.</p>
     */
    @NameInMap("Num")
    public Long num;

    /**
     * <p>The page number. Default value: 1</p>
     */
    @NameInMap("Page")
    public Long page;

    /**
     * <p>The ID of the anti-DDoS diversion instance.</p>
     */
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
