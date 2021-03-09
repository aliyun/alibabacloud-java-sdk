// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryHotlineInQueueRequest extends TeaModel {
    @NameInMap("OuterGroupId")
    public String outerGroupId;

    @NameInMap("OuterGroupType")
    public String outerGroupType;

    public static QueryHotlineInQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHotlineInQueueRequest self = new QueryHotlineInQueueRequest();
        return TeaModel.build(map, self);
    }

    public QueryHotlineInQueueRequest setOuterGroupId(String outerGroupId) {
        this.outerGroupId = outerGroupId;
        return this;
    }
    public String getOuterGroupId() {
        return this.outerGroupId;
    }

    public QueryHotlineInQueueRequest setOuterGroupType(String outerGroupType) {
        this.outerGroupType = outerGroupType;
        return this;
    }
    public String getOuterGroupType() {
        return this.outerGroupType;
    }

}
