// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lx20150701.models;

import com.aliyun.tea.*;

public class PageQueryByPipCodeRequest extends TeaModel {
    @NameInMap("PipCode")
    public String pipCode;

    @NameInMap("Page")
    public Integer page;

    public static PageQueryByPipCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        PageQueryByPipCodeRequest self = new PageQueryByPipCodeRequest();
        return TeaModel.build(map, self);
    }

    public PageQueryByPipCodeRequest setPipCode(String pipCode) {
        this.pipCode = pipCode;
        return this;
    }
    public String getPipCode() {
        return this.pipCode;
    }

    public PageQueryByPipCodeRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

}
