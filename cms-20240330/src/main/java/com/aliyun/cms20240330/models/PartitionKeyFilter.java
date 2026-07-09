// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class PartitionKeyFilter extends TeaModel {
    /**
     * <p>Returns only items whose partition key value equals this string.</p>
     */
    @NameInMap("eq")
    public String eq;

    public static PartitionKeyFilter build(java.util.Map<String, ?> map) throws Exception {
        PartitionKeyFilter self = new PartitionKeyFilter();
        return TeaModel.build(map, self);
    }

    public PartitionKeyFilter setEq(String eq) {
        this.eq = eq;
        return this;
    }
    public String getEq() {
        return this.eq;
    }

}
