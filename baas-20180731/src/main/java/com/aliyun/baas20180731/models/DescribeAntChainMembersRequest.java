// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainMembersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsortiumId")
    public String consortiumId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeAntChainMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMembersRequest self = new DescribeAntChainMembersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMembersRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public DescribeAntChainMembersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAntChainMembersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
