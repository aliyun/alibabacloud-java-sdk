// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateLiveRecordTemplateRequest extends TeaModel {
    @NameInMap("BackgroundColor")
    public Integer backgroundColor;

    @NameInMap("Backgrounds")
    public java.util.List<UpdateLiveRecordTemplateRequestBackgrounds> backgrounds;

    @NameInMap("ClockWidgets")
    public java.util.List<UpdateLiveRecordTemplateRequestClockWidgets> clockWidgets;

    @NameInMap("Id")
    public String id;

    @NameInMap("LayoutIds")
    public java.util.List<String> layoutIds;

    @NameInMap("Name")
    public String name;

    @NameInMap("RtcCode")
    public String rtcCode;

    @NameInMap("Watermarks")
    public java.util.List<UpdateLiveRecordTemplateRequestWatermarks> watermarks;

    public static UpdateLiveRecordTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRecordTemplateRequest self = new UpdateLiveRecordTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRecordTemplateRequest setBackgroundColor(Integer backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public UpdateLiveRecordTemplateRequest setBackgrounds(java.util.List<UpdateLiveRecordTemplateRequestBackgrounds> backgrounds) {
        this.backgrounds = backgrounds;
        return this;
    }
    public java.util.List<UpdateLiveRecordTemplateRequestBackgrounds> getBackgrounds() {
        return this.backgrounds;
    }

    public UpdateLiveRecordTemplateRequest setClockWidgets(java.util.List<UpdateLiveRecordTemplateRequestClockWidgets> clockWidgets) {
        this.clockWidgets = clockWidgets;
        return this;
    }
    public java.util.List<UpdateLiveRecordTemplateRequestClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    public UpdateLiveRecordTemplateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLiveRecordTemplateRequest setLayoutIds(java.util.List<String> layoutIds) {
        this.layoutIds = layoutIds;
        return this;
    }
    public java.util.List<String> getLayoutIds() {
        return this.layoutIds;
    }

    public UpdateLiveRecordTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLiveRecordTemplateRequest setRtcCode(String rtcCode) {
        this.rtcCode = rtcCode;
        return this;
    }
    public String getRtcCode() {
        return this.rtcCode;
    }

    public UpdateLiveRecordTemplateRequest setWatermarks(java.util.List<UpdateLiveRecordTemplateRequestWatermarks> watermarks) {
        this.watermarks = watermarks;
        return this;
    }
    public java.util.List<UpdateLiveRecordTemplateRequestWatermarks> getWatermarks() {
        return this.watermarks;
    }

    public static class UpdateLiveRecordTemplateRequestBackgrounds extends TeaModel {
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

        public static UpdateLiveRecordTemplateRequestBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveRecordTemplateRequestBackgrounds self = new UpdateLiveRecordTemplateRequestBackgrounds();
            return TeaModel.build(map, self);
        }

        public UpdateLiveRecordTemplateRequestBackgrounds setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public UpdateLiveRecordTemplateRequestBackgrounds setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public UpdateLiveRecordTemplateRequestBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateLiveRecordTemplateRequestBackgrounds setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public UpdateLiveRecordTemplateRequestBackgrounds setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public UpdateLiveRecordTemplateRequestBackgrounds setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateLiveRecordTemplateRequestBackgrounds setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class UpdateLiveRecordTemplateRequestClockWidgets extends TeaModel {
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

        public static UpdateLiveRecordTemplateRequestClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveRecordTemplateRequestClockWidgets self = new UpdateLiveRecordTemplateRequestClockWidgets();
            return TeaModel.build(map, self);
        }

        public UpdateLiveRecordTemplateRequestClockWidgets setFontColor(Integer fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Integer getFontColor() {
            return this.fontColor;
        }

        public UpdateLiveRecordTemplateRequestClockWidgets setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public UpdateLiveRecordTemplateRequestClockWidgets setFontType(Integer fontType) {
            this.fontType = fontType;
            return this;
        }
        public Integer getFontType() {
            return this.fontType;
        }

        public UpdateLiveRecordTemplateRequestClockWidgets setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public UpdateLiveRecordTemplateRequestClockWidgets setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateLiveRecordTemplateRequestClockWidgets setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class UpdateLiveRecordTemplateRequestWatermarks extends TeaModel {
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

        public static UpdateLiveRecordTemplateRequestWatermarks build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveRecordTemplateRequestWatermarks self = new UpdateLiveRecordTemplateRequestWatermarks();
            return TeaModel.build(map, self);
        }

        public UpdateLiveRecordTemplateRequestWatermarks setAlpha(Float alpha) {
            this.alpha = alpha;
            return this;
        }
        public Float getAlpha() {
            return this.alpha;
        }

        public UpdateLiveRecordTemplateRequestWatermarks setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public UpdateLiveRecordTemplateRequestWatermarks setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public UpdateLiveRecordTemplateRequestWatermarks setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateLiveRecordTemplateRequestWatermarks setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public UpdateLiveRecordTemplateRequestWatermarks setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public UpdateLiveRecordTemplateRequestWatermarks setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateLiveRecordTemplateRequestWatermarks setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

}
