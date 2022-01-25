// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateLiveRecordTemplateShrinkRequest extends TeaModel {
    @NameInMap("BackgroundColor")
    public Integer backgroundColor;

    @NameInMap("Backgrounds")
    public String backgroundsShrink;

    @NameInMap("ClockWidgets")
    public String clockWidgetsShrink;

    @NameInMap("Id")
    public String id;

    @NameInMap("LayoutIds")
    public java.util.List<String> layoutIds;

    @NameInMap("Name")
    public String name;

    @NameInMap("RtcCode")
    public String rtcCode;

    @NameInMap("Watermarks")
    public String watermarksShrink;

    public static UpdateLiveRecordTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRecordTemplateShrinkRequest self = new UpdateLiveRecordTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRecordTemplateShrinkRequest setBackgroundColor(Integer backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public UpdateLiveRecordTemplateShrinkRequest setBackgroundsShrink(String backgroundsShrink) {
        this.backgroundsShrink = backgroundsShrink;
        return this;
    }
    public String getBackgroundsShrink() {
        return this.backgroundsShrink;
    }

    public UpdateLiveRecordTemplateShrinkRequest setClockWidgetsShrink(String clockWidgetsShrink) {
        this.clockWidgetsShrink = clockWidgetsShrink;
        return this;
    }
    public String getClockWidgetsShrink() {
        return this.clockWidgetsShrink;
    }

    public UpdateLiveRecordTemplateShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLiveRecordTemplateShrinkRequest setLayoutIds(java.util.List<String> layoutIds) {
        this.layoutIds = layoutIds;
        return this;
    }
    public java.util.List<String> getLayoutIds() {
        return this.layoutIds;
    }

    public UpdateLiveRecordTemplateShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLiveRecordTemplateShrinkRequest setRtcCode(String rtcCode) {
        this.rtcCode = rtcCode;
        return this;
    }
    public String getRtcCode() {
        return this.rtcCode;
    }

    public UpdateLiveRecordTemplateShrinkRequest setWatermarksShrink(String watermarksShrink) {
        this.watermarksShrink = watermarksShrink;
        return this;
    }
    public String getWatermarksShrink() {
        return this.watermarksShrink;
    }

}
