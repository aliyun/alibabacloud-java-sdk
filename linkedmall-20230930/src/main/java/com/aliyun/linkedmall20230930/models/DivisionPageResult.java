// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class DivisionPageResult extends TeaModel {
    @NameInMap("divisionList")
    public java.util.List<Division> divisionList;

    /**
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DivisionPageResult build(java.util.Map<String, ?> map) throws Exception {
        DivisionPageResult self = new DivisionPageResult();
        return TeaModel.build(map, self);
    }

    public DivisionPageResult setDivisionList(java.util.List<Division> divisionList) {
        this.divisionList = divisionList;
        return this;
    }
    public java.util.List<Division> getDivisionList() {
        return this.divisionList;
    }

    public DivisionPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
