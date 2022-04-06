// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateVideoMergeTaskRequest extends TeaModel {
    @NameInMap("VideoList")
    public String videoList;

    @NameInMap("WatermarkText")
    public String watermarkText;

    @NameInMap("WatermarkTime")
    public Long watermarkTime;

    public static CreateVideoMergeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoMergeTaskRequest self = new CreateVideoMergeTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateVideoMergeTaskRequest setVideoList(String videoList) {
        this.videoList = videoList;
        return this;
    }
    public String getVideoList() {
        return this.videoList;
    }

    public CreateVideoMergeTaskRequest setWatermarkText(String watermarkText) {
        this.watermarkText = watermarkText;
        return this;
    }
    public String getWatermarkText() {
        return this.watermarkText;
    }

    public CreateVideoMergeTaskRequest setWatermarkTime(Long watermarkTime) {
        this.watermarkTime = watermarkTime;
        return this;
    }
    public Long getWatermarkTime() {
        return this.watermarkTime;
    }

}
