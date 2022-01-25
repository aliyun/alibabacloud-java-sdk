// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateLiveRecordTemplateRequest extends TeaModel {
    @NameInMap("BackgroundColor")
    public Integer backgroundColor;

    @NameInMap("Backgrounds")
    public java.util.List<CreateLiveRecordTemplateRequestBackgrounds> backgrounds;

    @NameInMap("ClockWidgets")
    public java.util.List<CreateLiveRecordTemplateRequestClockWidgets> clockWidgets;

    @NameInMap("LayoutIds")
    public java.util.List<String> layoutIds;

    @NameInMap("Name")
    public String name;

    @NameInMap("RtcCode")
    public String rtcCode;

    @NameInMap("Watermarks")
    public java.util.List<CreateLiveRecordTemplateRequestWatermarks> watermarks;

    public static CreateLiveRecordTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveRecordTemplateRequest self = new CreateLiveRecordTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveRecordTemplateRequest setBackgroundColor(Integer backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public CreateLiveRecordTemplateRequest setBackgrounds(java.util.List<CreateLiveRecordTemplateRequestBackgrounds> backgrounds) {
        this.backgrounds = backgrounds;
        return this;
    }
    public java.util.List<CreateLiveRecordTemplateRequestBackgrounds> getBackgrounds() {
        return this.backgrounds;
    }

    public CreateLiveRecordTemplateRequest setClockWidgets(java.util.List<CreateLiveRecordTemplateRequestClockWidgets> clockWidgets) {
        this.clockWidgets = clockWidgets;
        return this;
    }
    public java.util.List<CreateLiveRecordTemplateRequestClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    public CreateLiveRecordTemplateRequest setLayoutIds(java.util.List<String> layoutIds) {
        this.layoutIds = layoutIds;
        return this;
    }
    public java.util.List<String> getLayoutIds() {
        return this.layoutIds;
    }

    public CreateLiveRecordTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLiveRecordTemplateRequest setRtcCode(String rtcCode) {
        this.rtcCode = rtcCode;
        return this;
    }
    public String getRtcCode() {
        return this.rtcCode;
    }

    public CreateLiveRecordTemplateRequest setWatermarks(java.util.List<CreateLiveRecordTemplateRequestWatermarks> watermarks) {
        this.watermarks = watermarks;
        return this;
    }
    public java.util.List<CreateLiveRecordTemplateRequestWatermarks> getWatermarks() {
        return this.watermarks;
    }

    public static class CreateLiveRecordTemplateRequestBackgrounds extends TeaModel {
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

        public static CreateLiveRecordTemplateRequestBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveRecordTemplateRequestBackgrounds self = new CreateLiveRecordTemplateRequestBackgrounds();
            return TeaModel.build(map, self);
        }

        public CreateLiveRecordTemplateRequestBackgrounds setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public CreateLiveRecordTemplateRequestBackgrounds setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public CreateLiveRecordTemplateRequestBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public CreateLiveRecordTemplateRequestBackgrounds setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public CreateLiveRecordTemplateRequestBackgrounds setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public CreateLiveRecordTemplateRequestBackgrounds setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public CreateLiveRecordTemplateRequestBackgrounds setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class CreateLiveRecordTemplateRequestClockWidgets extends TeaModel {
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

        public static CreateLiveRecordTemplateRequestClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveRecordTemplateRequestClockWidgets self = new CreateLiveRecordTemplateRequestClockWidgets();
            return TeaModel.build(map, self);
        }

        public CreateLiveRecordTemplateRequestClockWidgets setFontColor(Integer fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Integer getFontColor() {
            return this.fontColor;
        }

        public CreateLiveRecordTemplateRequestClockWidgets setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public CreateLiveRecordTemplateRequestClockWidgets setFontType(Integer fontType) {
            this.fontType = fontType;
            return this;
        }
        public Integer getFontType() {
            return this.fontType;
        }

        public CreateLiveRecordTemplateRequestClockWidgets setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public CreateLiveRecordTemplateRequestClockWidgets setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public CreateLiveRecordTemplateRequestClockWidgets setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class CreateLiveRecordTemplateRequestWatermarks extends TeaModel {
        @NameInMap("Alpha")
        public Float alpha;

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

        public static CreateLiveRecordTemplateRequestWatermarks build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveRecordTemplateRequestWatermarks self = new CreateLiveRecordTemplateRequestWatermarks();
            return TeaModel.build(map, self);
        }

        public CreateLiveRecordTemplateRequestWatermarks setAlpha(Float alpha) {
            this.alpha = alpha;
            return this;
        }
        public Float getAlpha() {
            return this.alpha;
        }

        public CreateLiveRecordTemplateRequestWatermarks setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public CreateLiveRecordTemplateRequestWatermarks setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public CreateLiveRecordTemplateRequestWatermarks setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public CreateLiveRecordTemplateRequestWatermarks setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public CreateLiveRecordTemplateRequestWatermarks setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public CreateLiveRecordTemplateRequestWatermarks setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public CreateLiveRecordTemplateRequestWatermarks setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

}
