// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSDGShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SDGIds")
    public String SDGIdsShrink;

    public static DescribeSDGShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDGShrinkRequest self = new DescribeSDGShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSDGShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSDGShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSDGShrinkRequest setSDGIdsShrink(String SDGIdsShrink) {
        this.SDGIdsShrink = SDGIdsShrink;
        return this;
    }
    public String getSDGIdsShrink() {
        return this.SDGIdsShrink;
    }

}
