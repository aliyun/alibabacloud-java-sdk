// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosdiversion20230701.models;

import com.aliyun.tea.*;

public class ListInstanceRequest extends TeaModel {
    /**
     * <p>The name of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries per page. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Num")
    public Long num;

    /**
     * <p>The page number. Default value: 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Long page;

    /**
     * <p>The ID of the anti-DDoS diversion instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ddos_diversion_public_cn-xxxxxxxxxxxxx</p>
     */
    @NameInMap("SaleId")
    public String saleId;

    /**
     * <p>The status of the instance. Valid values:</p>
     * <ul>
     * <li>normal</li>
     * <li>expired</li>
     * <li>deleting</li>
     * <li>stopped</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceRequest self = new ListInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListInstanceRequest setNum(Long num) {
        this.num = num;
        return this;
    }
    public Long getNum() {
        return this.num;
    }

    public ListInstanceRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListInstanceRequest setSaleId(String saleId) {
        this.saleId = saleId;
        return this;
    }
    public String getSaleId() {
        return this.saleId;
    }

    public ListInstanceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
