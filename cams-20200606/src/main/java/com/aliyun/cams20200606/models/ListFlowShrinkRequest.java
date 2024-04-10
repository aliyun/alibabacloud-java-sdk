// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListFlowShrinkRequest extends TeaModel {
    /**
     * <p>The space ID of the user within the independent software vendor (ISV) account.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The name of the Flow.</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>The returned pages.</p>
     */
    @NameInMap("Page")
    public String pageShrink;

    public static ListFlowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowShrinkRequest self = new ListFlowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ListFlowShrinkRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public ListFlowShrinkRequest setPageShrink(String pageShrink) {
        this.pageShrink = pageShrink;
        return this;
    }
    public String getPageShrink() {
        return this.pageShrink;
    }

}
