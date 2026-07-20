// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class CustomerNoteListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5625862916391497</p>
     */
    @NameInMap("CustomerUid")
    public String customerUid;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static CustomerNoteListRequest build(java.util.Map<String, ?> map) throws Exception {
        CustomerNoteListRequest self = new CustomerNoteListRequest();
        return TeaModel.build(map, self);
    }

    public CustomerNoteListRequest setCustomerUid(String customerUid) {
        this.customerUid = customerUid;
        return this;
    }
    public String getCustomerUid() {
        return this.customerUid;
    }

    public CustomerNoteListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public CustomerNoteListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
