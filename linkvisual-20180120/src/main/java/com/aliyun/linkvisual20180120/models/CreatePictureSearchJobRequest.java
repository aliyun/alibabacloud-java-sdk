// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreatePictureSearchJobRequest extends TeaModel {
    @NameInMap("AppInstanceId")
    public String appInstanceId;

    @NameInMap("BodyThreshold")
    public Float bodyThreshold;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("PictureSearchType")
    public Integer pictureSearchType;

    @NameInMap("SearchPicUrl")
    public String searchPicUrl;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Threshold")
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

    public CreatePictureSearchJobRequest setBodyThreshold(Float bodyThreshold) {
        this.bodyThreshold = bodyThreshold;
        return this;
    }
    public Float getBodyThreshold() {
        return this.bodyThreshold;
    }

    public CreatePictureSearchJobRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreatePictureSearchJobRequest setPictureSearchType(Integer pictureSearchType) {
        this.pictureSearchType = pictureSearchType;
        return this;
    }
    public Integer getPictureSearchType() {
        return this.pictureSearchType;
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

    public CreatePictureSearchJobRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

}
