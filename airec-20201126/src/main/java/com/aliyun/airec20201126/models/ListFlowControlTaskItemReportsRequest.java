// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListFlowControlTaskItemReportsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("count")
    public String count;

    /**
     * <strong>example:</strong>
     * <p>yesterDay</p>
     */
    @NameInMap("selectTimeType")
    public String selectTimeType;

    /**
     * <strong>example:</strong>
     * <p>invalidItem</p>
     */
    @NameInMap("selectType")
    public String selectType;

    public static ListFlowControlTaskItemReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowControlTaskItemReportsRequest self = new ListFlowControlTaskItemReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowControlTaskItemReportsRequest setCount(String count) {
        this.count = count;
        return this;
    }
    public String getCount() {
        return this.count;
    }

    public ListFlowControlTaskItemReportsRequest setSelectTimeType(String selectTimeType) {
        this.selectTimeType = selectTimeType;
        return this;
    }
    public String getSelectTimeType() {
        return this.selectTimeType;
    }

    public ListFlowControlTaskItemReportsRequest setSelectType(String selectType) {
        this.selectType = selectType;
        return this;
    }
    public String getSelectType() {
        return this.selectType;
    }

}
