// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetRefPackageJobRequest extends TeaModel {
    @NameInMap("pageIndex")
    public Integer pageIndex;

    @NameInMap("pageSize")
    public Integer pageSize;

    public static GetRefPackageJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRefPackageJobRequest self = new GetRefPackageJobRequest();
        return TeaModel.build(map, self);
    }

    public GetRefPackageJobRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetRefPackageJobRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
