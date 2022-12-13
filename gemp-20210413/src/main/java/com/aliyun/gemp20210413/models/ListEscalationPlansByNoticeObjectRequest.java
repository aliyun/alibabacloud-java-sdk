// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListEscalationPlansByNoticeObjectRequest extends TeaModel {
    @NameInMap("noticeObjectId")
    public Long noticeObjectId;

    @NameInMap("noticeObjectType")
    public Long noticeObjectType;

    public static ListEscalationPlansByNoticeObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEscalationPlansByNoticeObjectRequest self = new ListEscalationPlansByNoticeObjectRequest();
        return TeaModel.build(map, self);
    }

    public ListEscalationPlansByNoticeObjectRequest setNoticeObjectId(Long noticeObjectId) {
        this.noticeObjectId = noticeObjectId;
        return this;
    }
    public Long getNoticeObjectId() {
        return this.noticeObjectId;
    }

    public ListEscalationPlansByNoticeObjectRequest setNoticeObjectType(Long noticeObjectType) {
        this.noticeObjectType = noticeObjectType;
        return this;
    }
    public Long getNoticeObjectType() {
        return this.noticeObjectType;
    }

}
