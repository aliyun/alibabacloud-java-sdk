// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreatePictureSearchJobRequest extends TeaModel {
    @NameInMap("AppInstanceId")
    @Validation(required = true)
    public String appInstanceId;

    @NameInMap("SearchPicUrl")
    @Validation(required = true)
    public String searchPicUrl;

    @NameInMap("StartTime")
    @Validation(required = true)
    public Long startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public Long endTime;

    @NameInMap("Threshold")
    @Validation(required = true)
    public Float threshold;

    public static CreatePictureSearchJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePictureSearchJobRequest self = new CreatePictureSearchJobRequest();
        return TeaModel.build(map, self);
    }

    public CreatePictureSearchJobRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public CreatePictureSearchJobRequest setSearchPicUrl(String searchPicUrl) {
        this.searchPicUrl = searchPicUrl;
        return this;
    }
    public String getSearchPicUrl() {
        return this.searchPicUrl;
    }

    public CreatePictureSearchJobRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreatePictureSearchJobRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreatePictureSearchJobRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

}
