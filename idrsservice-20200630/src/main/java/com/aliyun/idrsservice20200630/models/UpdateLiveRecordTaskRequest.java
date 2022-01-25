// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateLiveRecordTaskRequest extends TeaModel {
    @NameInMap("BackgroundColor")
    public Integer backgroundColor;

    @NameInMap("ClockWidgets")
    public java.util.List<UpdateLiveRecordTaskRequestClockWidgets> clockWidgets;

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
    public java.util.List<UpdateLiveRecordTaskRequestUserPanes> userPanes;

    public static UpdateLiveRecordTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRecordTaskRequest self = new UpdateLiveRecordTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRecordTaskRequest setBackgroundColor(Integer backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public UpdateLiveRecordTaskRequest setClockWidgets(java.util.List<UpdateLiveRecordTaskRequestClockWidgets> clockWidgets) {
        this.clockWidgets = clockWidgets;
        return this;
    }
    public java.util.List<UpdateLiveRecordTaskRequestClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    public UpdateLiveRecordTaskRequest setDynamicLayout(Boolean dynamicLayout) {
        this.dynamicLayout = dynamicLayout;
        return this;
    }
    public Boolean getDynamicLayout() {
        return this.dynamicLayout;
    }

    public UpdateLiveRecordTaskRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public UpdateLiveRecordTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLiveRecordTaskRequest setRtcCode(String rtcCode) {
        this.rtcCode = rtcCode;
        return this;
    }
    public String getRtcCode() {
        return this.rtcCode;
    }

    public UpdateLiveRecordTaskRequest setSourceType(Boolean sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public Boolean getSourceType() {
        return this.sourceType;
    }

    public UpdateLiveRecordTaskRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateLiveRecordTaskRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateLiveRecordTaskRequest setUserPanes(java.util.List<UpdateLiveRecordTaskRequestUserPanes> userPanes) {
        this.userPanes = userPanes;
        return this;
    }
    public java.util.List<UpdateLiveRecordTaskRequestUserPanes> getUserPanes() {
        return this.userPanes;
    }

    public static class UpdateLiveRecordTaskRequestClockWidgets extends TeaModel {
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

        public static UpdateLiveRecordTaskRequestClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveRecordTaskRequestClockWidgets self = new UpdateLiveRecordTaskRequestClockWidgets();
            return TeaModel.build(map, self);
        }

        public UpdateLiveRecordTaskRequestClockWidgets setFontColor(Integer fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Integer getFontColor() {
            return this.fontColor;
        }

        public UpdateLiveRecordTaskRequestClockWidgets setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public UpdateLiveRecordTaskRequestClockWidgets setFontType(Integer fontType) {
            this.fontType = fontType;
            return this;
        }
        public Integer getFontType() {
            return this.fontType;
        }

        public UpdateLiveRecordTaskRequestClockWidgets setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public UpdateLiveRecordTaskRequestClockWidgets setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateLiveRecordTaskRequestClockWidgets setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class UpdateLiveRecordTaskRequestUserPanesImages extends TeaModel {
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

        public static UpdateLiveRecordTaskRequestUserPanesImages build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveRecordTaskRequestUserPanesImages self = new UpdateLiveRecordTaskRequestUserPanesImages();
            return TeaModel.build(map, self);
        }

        public UpdateLiveRecordTaskRequestUserPanesImages setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public UpdateLiveRecordTaskRequestUserPanesImages setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public UpdateLiveRecordTaskRequestUserPanesImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateLiveRecordTaskRequestUserPanesImages setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public UpdateLiveRecordTaskRequestUserPanesImages setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public UpdateLiveRecordTaskRequestUserPanesImages setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateLiveRecordTaskRequestUserPanesImages setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class UpdateLiveRecordTaskRequestUserPanesTexts extends TeaModel {
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

        public static UpdateLiveRecordTaskRequestUserPanesTexts build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveRecordTaskRequestUserPanesTexts self = new UpdateLiveRecordTaskRequestUserPanesTexts();
            return TeaModel.build(map, self);
        }

        public UpdateLiveRecordTaskRequestUserPanesTexts setFontColor(Integer fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Integer getFontColor() {
            return this.fontColor;
        }

        public UpdateLiveRecordTaskRequestUserPanesTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public UpdateLiveRecordTaskRequestUserPanesTexts setFontType(Integer fontType) {
            this.fontType = fontType;
            return this;
        }
        public Integer getFontType() {
            return this.fontType;
        }

        public UpdateLiveRecordTaskRequestUserPanesTexts setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public UpdateLiveRecordTaskRequestUserPanesTexts setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public UpdateLiveRecordTaskRequestUserPanesTexts setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateLiveRecordTaskRequestUserPanesTexts setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class UpdateLiveRecordTaskRequestUserPanes extends TeaModel {
        @NameInMap("Images")
        public java.util.List<UpdateLiveRecordTaskRequestUserPanesImages> images;

        @NameInMap("PaneId")
        public Integer paneId;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Texts")
        public java.util.List<UpdateLiveRecordTaskRequestUserPanesTexts> texts;

        @NameInMap("UserId")
        public String userId;

        public static UpdateLiveRecordTaskRequestUserPanes build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveRecordTaskRequestUserPanes self = new UpdateLiveRecordTaskRequestUserPanes();
            return TeaModel.build(map, self);
        }

        public UpdateLiveRecordTaskRequestUserPanes setImages(java.util.List<UpdateLiveRecordTaskRequestUserPanesImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<UpdateLiveRecordTaskRequestUserPanesImages> getImages() {
            return this.images;
        }

        public UpdateLiveRecordTaskRequestUserPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

        public UpdateLiveRecordTaskRequestUserPanes setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateLiveRecordTaskRequestUserPanes setTexts(java.util.List<UpdateLiveRecordTaskRequestUserPanesTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<UpdateLiveRecordTaskRequestUserPanesTexts> getTexts() {
            return this.texts;
        }

        public UpdateLiveRecordTaskRequestUserPanes setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
