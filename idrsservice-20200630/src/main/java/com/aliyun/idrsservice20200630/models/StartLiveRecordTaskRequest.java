// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class StartLiveRecordTaskRequest extends TeaModel {
    @NameInMap("BackgroundColor")
    public Integer backgroundColor;

    @NameInMap("ClockWidgets")
    public java.util.List<StartLiveRecordTaskRequestClockWidgets> clockWidgets;

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
    public java.util.List<StartLiveRecordTaskRequestUserPanes> userPanes;

    public static StartLiveRecordTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StartLiveRecordTaskRequest self = new StartLiveRecordTaskRequest();
        return TeaModel.build(map, self);
    }

    public StartLiveRecordTaskRequest setBackgroundColor(Integer backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public StartLiveRecordTaskRequest setClockWidgets(java.util.List<StartLiveRecordTaskRequestClockWidgets> clockWidgets) {
        this.clockWidgets = clockWidgets;
        return this;
    }
    public java.util.List<StartLiveRecordTaskRequestClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    public StartLiveRecordTaskRequest setDynamicLayout(Boolean dynamicLayout) {
        this.dynamicLayout = dynamicLayout;
        return this;
    }
    public Boolean getDynamicLayout() {
        return this.dynamicLayout;
    }

    public StartLiveRecordTaskRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public StartLiveRecordTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public StartLiveRecordTaskRequest setRtcCode(String rtcCode) {
        this.rtcCode = rtcCode;
        return this;
    }
    public String getRtcCode() {
        return this.rtcCode;
    }

    public StartLiveRecordTaskRequest setSourceType(Boolean sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public Boolean getSourceType() {
        return this.sourceType;
    }

    public StartLiveRecordTaskRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public StartLiveRecordTaskRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public StartLiveRecordTaskRequest setUserPanes(java.util.List<StartLiveRecordTaskRequestUserPanes> userPanes) {
        this.userPanes = userPanes;
        return this;
    }
    public java.util.List<StartLiveRecordTaskRequestUserPanes> getUserPanes() {
        return this.userPanes;
    }

    public static class StartLiveRecordTaskRequestClockWidgets extends TeaModel {
        @NameInMap("FontColor")
        public Integer fontColor;

        @NameInMap("FontSize")
        public Integer fontSize;

        @NameInMap("FontType")
        public Integer fontType;

        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        @NameInMap("ZOrder")
        public Integer ZOrder;

        public static StartLiveRecordTaskRequestClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            StartLiveRecordTaskRequestClockWidgets self = new StartLiveRecordTaskRequestClockWidgets();
            return TeaModel.build(map, self);
        }

        public StartLiveRecordTaskRequestClockWidgets setFontColor(Integer fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Integer getFontColor() {
            return this.fontColor;
        }

        public StartLiveRecordTaskRequestClockWidgets setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public StartLiveRecordTaskRequestClockWidgets setFontType(Integer fontType) {
            this.fontType = fontType;
            return this;
        }
        public Integer getFontType() {
            return this.fontType;
        }

        public StartLiveRecordTaskRequestClockWidgets setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public StartLiveRecordTaskRequestClockWidgets setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public StartLiveRecordTaskRequestClockWidgets setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class StartLiveRecordTaskRequestUserPanesImages extends TeaModel {
        @NameInMap("Display")
        public Integer display;

        @NameInMap("Height")
        public Float height;

        @NameInMap("Url")
        public String url;

        @NameInMap("Width")
        public Float width;

        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        @NameInMap("ZOrder")
        public Integer ZOrder;

        public static StartLiveRecordTaskRequestUserPanesImages build(java.util.Map<String, ?> map) throws Exception {
            StartLiveRecordTaskRequestUserPanesImages self = new StartLiveRecordTaskRequestUserPanesImages();
            return TeaModel.build(map, self);
        }

        public StartLiveRecordTaskRequestUserPanesImages setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public StartLiveRecordTaskRequestUserPanesImages setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public StartLiveRecordTaskRequestUserPanesImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartLiveRecordTaskRequestUserPanesImages setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public StartLiveRecordTaskRequestUserPanesImages setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public StartLiveRecordTaskRequestUserPanesImages setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public StartLiveRecordTaskRequestUserPanesImages setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class StartLiveRecordTaskRequestUserPanesTexts extends TeaModel {
        @NameInMap("FontColor")
        public Integer fontColor;

        @NameInMap("FontSize")
        public Integer fontSize;

        @NameInMap("FontType")
        public Integer fontType;

        @NameInMap("Text")
        public String text;

        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        @NameInMap("ZOrder")
        public Integer ZOrder;

        public static StartLiveRecordTaskRequestUserPanesTexts build(java.util.Map<String, ?> map) throws Exception {
            StartLiveRecordTaskRequestUserPanesTexts self = new StartLiveRecordTaskRequestUserPanesTexts();
            return TeaModel.build(map, self);
        }

        public StartLiveRecordTaskRequestUserPanesTexts setFontColor(Integer fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Integer getFontColor() {
            return this.fontColor;
        }

        public StartLiveRecordTaskRequestUserPanesTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public StartLiveRecordTaskRequestUserPanesTexts setFontType(Integer fontType) {
            this.fontType = fontType;
            return this;
        }
        public Integer getFontType() {
            return this.fontType;
        }

        public StartLiveRecordTaskRequestUserPanesTexts setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public StartLiveRecordTaskRequestUserPanesTexts setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public StartLiveRecordTaskRequestUserPanesTexts setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public StartLiveRecordTaskRequestUserPanesTexts setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class StartLiveRecordTaskRequestUserPanes extends TeaModel {
        @NameInMap("Images")
        public java.util.List<StartLiveRecordTaskRequestUserPanesImages> images;

        @NameInMap("PaneId")
        public Integer paneId;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Texts")
        public java.util.List<StartLiveRecordTaskRequestUserPanesTexts> texts;

        @NameInMap("UserId")
        public String userId;

        public static StartLiveRecordTaskRequestUserPanes build(java.util.Map<String, ?> map) throws Exception {
            StartLiveRecordTaskRequestUserPanes self = new StartLiveRecordTaskRequestUserPanes();
            return TeaModel.build(map, self);
        }

        public StartLiveRecordTaskRequestUserPanes setImages(java.util.List<StartLiveRecordTaskRequestUserPanesImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<StartLiveRecordTaskRequestUserPanesImages> getImages() {
            return this.images;
        }

        public StartLiveRecordTaskRequestUserPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

        public StartLiveRecordTaskRequestUserPanes setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public StartLiveRecordTaskRequestUserPanes setTexts(java.util.List<StartLiveRecordTaskRequestUserPanesTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<StartLiveRecordTaskRequestUserPanesTexts> getTexts() {
            return this.texts;
        }

        public StartLiveRecordTaskRequestUserPanes setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
