// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ettrafficisp20230830.models;

import com.aliyun.tea.*;

public class AkListPageRequest extends TeaModel {
    @NameInMap("page")
    public Integer page;

    @NameInMap("size")
    public Integer size;

    @NameInMap("start")
    public Integer start;

    public static AkListPageRequest build(java.util.Map<String, ?> map) throws Exception {
        AkListPageRequest self = new AkListPageRequest();
        return TeaModel.build(map, self);
    }

    public AkListPageRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public AkListPageRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public AkListPageRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

}
