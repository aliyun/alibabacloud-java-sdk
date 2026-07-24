// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeDetailListOfBuyerRequest extends TeaModel {
    /**
     * <p>The page index.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page_index")
    public Integer pageIndex;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("page_size")
    public Integer pageSize;

    /**
     * <p>The start time for change order creation. The value is a 13-digit UTC timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1677415276000</p>
     */
    @NameInMap("utc_create_begin")
    public Long utcCreateBegin;

    /**
     * <p>The end time for change order creation. The value is a 13-digit UTC timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1677415279000</p>
     */
    @NameInMap("utc_create_end")
    public Long utcCreateEnd;

    public static ChangeDetailListOfBuyerRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeDetailListOfBuyerRequest self = new ChangeDetailListOfBuyerRequest();
        return TeaModel.build(map, self);
    }

    public ChangeDetailListOfBuyerRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ChangeDetailListOfBuyerRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ChangeDetailListOfBuyerRequest setUtcCreateBegin(Long utcCreateBegin) {
        this.utcCreateBegin = utcCreateBegin;
        return this;
    }
    public Long getUtcCreateBegin() {
        return this.utcCreateBegin;
    }

    public ChangeDetailListOfBuyerRequest setUtcCreateEnd(Long utcCreateEnd) {
        this.utcCreateEnd = utcCreateEnd;
        return this;
    }
    public Long getUtcCreateEnd() {
        return this.utcCreateEnd;
    }

}
