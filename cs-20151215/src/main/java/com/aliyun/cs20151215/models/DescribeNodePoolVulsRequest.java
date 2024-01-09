// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeNodePoolVulsRequest extends TeaModel {
    /**
     * <p>The priority to fix the vulnerability. Separate multiple priorities with commas (,). Valid values:</p>
     * <br>
     * <p>*   `asap`: high</p>
     * <p>*   `later`: medium</p>
     * <p>*   `nntf`: low</p>
     */
    @NameInMap("necessity")
    public String necessity;

    public static DescribeNodePoolVulsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodePoolVulsRequest self = new DescribeNodePoolVulsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNodePoolVulsRequest setNecessity(String necessity) {
        this.necessity = necessity;
        return this;
    }
    public String getNecessity() {
        return this.necessity;
    }

}
