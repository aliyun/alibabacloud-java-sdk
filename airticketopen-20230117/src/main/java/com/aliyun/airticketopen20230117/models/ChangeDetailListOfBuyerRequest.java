// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeDetailListOfBuyerRequest extends TeaModel {
    @NameInMap("page_index")
    public Integer pageIndex;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("utc_create_begin")
    public Long utcCreateBegin;

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
