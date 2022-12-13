// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListRouteRulesByAssignWhoIdRequest extends TeaModel {
    @NameInMap("assignWhoId")
    public Long assignWhoId;

    @NameInMap("assignWhoType")
    public Long assignWhoType;

    public static ListRouteRulesByAssignWhoIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRouteRulesByAssignWhoIdRequest self = new ListRouteRulesByAssignWhoIdRequest();
        return TeaModel.build(map, self);
    }

    public ListRouteRulesByAssignWhoIdRequest setAssignWhoId(Long assignWhoId) {
        this.assignWhoId = assignWhoId;
        return this;
    }
    public Long getAssignWhoId() {
        return this.assignWhoId;
    }

    public ListRouteRulesByAssignWhoIdRequest setAssignWhoType(Long assignWhoType) {
        this.assignWhoType = assignWhoType;
        return this;
    }
    public Long getAssignWhoType() {
        return this.assignWhoType;
    }

}
