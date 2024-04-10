// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListFlowRequest extends TeaModel {
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
    public ListFlowRequestPage page;

    public static ListFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowRequest self = new ListFlowRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ListFlowRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public ListFlowRequest setPage(ListFlowRequestPage page) {
        this.page = page;
        return this;
    }
    public ListFlowRequestPage getPage() {
        return this.page;
    }

    public static class ListFlowRequestPage extends TeaModel {
        /**
         * <p>The page number.</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static ListFlowRequestPage build(java.util.Map<String, ?> map) throws Exception {
            ListFlowRequestPage self = new ListFlowRequestPage();
            return TeaModel.build(map, self);
        }

        public ListFlowRequestPage setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListFlowRequestPage setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

}
