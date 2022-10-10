// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListAlipayActivityDetailRequest extends TeaModel {
    @NameInMap("ActivityIds")
    public String activityIds;

    @NameInMap("BizId")
    public String bizId;

    public static ListAlipayActivityDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlipayActivityDetailRequest self = new ListAlipayActivityDetailRequest();
        return TeaModel.build(map, self);
    }

    public ListAlipayActivityDetailRequest setActivityIds(String activityIds) {
        this.activityIds = activityIds;
        return this;
    }
    public String getActivityIds() {
        return this.activityIds;
    }

    public ListAlipayActivityDetailRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
