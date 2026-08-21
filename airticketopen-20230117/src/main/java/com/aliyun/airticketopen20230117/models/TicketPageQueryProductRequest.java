// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketPageQueryProductRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AccountNo")
    public Long accountNo;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ScenicId")
    public Long scenicId;

    public static TicketPageQueryProductRequest build(java.util.Map<String, ?> map) throws Exception {
        TicketPageQueryProductRequest self = new TicketPageQueryProductRequest();
        return TeaModel.build(map, self);
    }

    public TicketPageQueryProductRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public TicketPageQueryProductRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public TicketPageQueryProductRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public TicketPageQueryProductRequest setScenicId(Long scenicId) {
        this.scenicId = scenicId;
        return this;
    }
    public Long getScenicId() {
        return this.scenicId;
    }

}
