// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class StartLiveRecordTaskShrinkRequest extends TeaModel {
    @NameInMap("BackgroundColor")
    public Integer backgroundColor;

    @NameInMap("ClockWidgets")
    public String clockWidgetsShrink;

    @NameInMap("DynamicLayout")
    public Boolean dynamicLayout;

    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("Name")
    public String name;

    @NameInMap("RtcCode")
    public String rtcCode;

    @NameInMap("SourceType")
    public Boolean sourceType;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserPanes")
    public String userPanesShrink;

    public static StartLiveRecordTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartLiveRecordTaskShrinkRequest self = new StartLiveRecordTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartLiveRecordTaskShrinkRequest setBackgroundColor(Integer backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public StartLiveRecordTaskShrinkRequest setClockWidgetsShrink(String clockWidgetsShrink) {
        this.clockWidgetsShrink = clockWidgetsShrink;
        return this;
    }
    public String getClockWidgetsShrink() {
        return this.clockWidgetsShrink;
    }

    public StartLiveRecordTaskShrinkRequest setDynamicLayout(Boolean dynamicLayout) {
        this.dynamicLayout = dynamicLayout;
        return this;
    }
    public Boolean getDynamicLayout() {
        return this.dynamicLayout;
    }

    public StartLiveRecordTaskShrinkRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public StartLiveRecordTaskShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public StartLiveRecordTaskShrinkRequest setRtcCode(String rtcCode) {
        this.rtcCode = rtcCode;
        return this;
    }
    public String getRtcCode() {
        return this.rtcCode;
    }

    public StartLiveRecordTaskShrinkRequest setSourceType(Boolean sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public Boolean getSourceType() {
        return this.sourceType;
    }

    public StartLiveRecordTaskShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public StartLiveRecordTaskShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public StartLiveRecordTaskShrinkRequest setUserPanesShrink(String userPanesShrink) {
        this.userPanesShrink = userPanesShrink;
        return this;
    }
    public String getUserPanesShrink() {
        return this.userPanesShrink;
    }

}
