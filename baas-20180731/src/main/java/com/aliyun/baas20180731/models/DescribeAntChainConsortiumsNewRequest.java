// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainConsortiumsNewRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeAntChainConsortiumsNewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainConsortiumsNewRequest self = new DescribeAntChainConsortiumsNewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainConsortiumsNewRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAntChainConsortiumsNewRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
