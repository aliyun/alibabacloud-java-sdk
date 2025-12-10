// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeForwardEntryAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the DNAT entry.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fwd-5tfi6f0rutmd00xrhkag7****</p>
     */
    @NameInMap("ForwardEntryId")
    public String forwardEntryId;

    public static DescribeForwardEntryAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeForwardEntryAttributeRequest self = new DescribeForwardEntryAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeForwardEntryAttributeRequest setForwardEntryId(String forwardEntryId) {
        this.forwardEntryId = forwardEntryId;
        return this;
    }
    public String getForwardEntryId() {
        return this.forwardEntryId;
    }

}
