// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20221230.models;

import com.aliyun.tea.*;

public class NoticeInstanceUserRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5000000264872</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    @NameInMap("NoticeParam")
    public String noticeParam;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NoticeType")
    public Long noticeType;

    public static NoticeInstanceUserRequest build(java.util.Map<String, ?> map) throws Exception {
        NoticeInstanceUserRequest self = new NoticeInstanceUserRequest();
        return TeaModel.build(map, self);
    }

    public NoticeInstanceUserRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public NoticeInstanceUserRequest setNoticeParam(String noticeParam) {
        this.noticeParam = noticeParam;
        return this;
    }
    public String getNoticeParam() {
        return this.noticeParam;
    }

    public NoticeInstanceUserRequest setNoticeType(Long noticeType) {
        this.noticeType = noticeType;
        return this;
    }
    public Long getNoticeType() {
        return this.noticeType;
    }

}
