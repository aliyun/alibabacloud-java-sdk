// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class MosQueryRegistrationInfoRequest extends TeaModel {
    @NameInMap("ActivityId")
    public String activityId;

    @NameInMap("CheckinStatus")
    public String checkinStatus;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("QrCode")
    public String qrCode;

    public static MosQueryRegistrationInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        MosQueryRegistrationInfoRequest self = new MosQueryRegistrationInfoRequest();
        return TeaModel.build(map, self);
    }

    public MosQueryRegistrationInfoRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public MosQueryRegistrationInfoRequest setCheckinStatus(String checkinStatus) {
        this.checkinStatus = checkinStatus;
        return this;
    }
    public String getCheckinStatus() {
        return this.checkinStatus;
    }

    public MosQueryRegistrationInfoRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public MosQueryRegistrationInfoRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public MosQueryRegistrationInfoRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public MosQueryRegistrationInfoRequest setQrCode(String qrCode) {
        this.qrCode = qrCode;
        return this;
    }
    public String getQrCode() {
        return this.qrCode;
    }

}
