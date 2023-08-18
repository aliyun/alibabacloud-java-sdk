// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListTaskJobRequest extends TeaModel {
    @NameInMap("pageIndex")
    public Integer pageIndex;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("state")
    public java.util.List<String> state;

    public static ListTaskJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskJobRequest self = new ListTaskJobRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskJobRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListTaskJobRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTaskJobRequest setState(java.util.List<String> state) {
        this.state = state;
        return this;
    }
    public java.util.List<String> getState() {
        return this.state;
    }

}
