// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetLiveRecordTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetLiveRecordTemplateResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetLiveRecordTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveRecordTemplateResponseBody self = new GetLiveRecordTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveRecordTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLiveRecordTemplateResponseBody setData(GetLiveRecordTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLiveRecordTemplateResponseBodyData getData() {
        return this.data;
    }

    public GetLiveRecordTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLiveRecordTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLiveRecordTemplateResponseBodyDataBackgrounds extends TeaModel {
        @NameInMap("Display")
        public Long display;

        @NameInMap("Height")
        public Float height;

        @NameInMap("Width")
        public Float width;

        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        @NameInMap("ZOrder")
        public Long ZOrder;

        public static GetLiveRecordTemplateResponseBodyDataBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            GetLiveRecordTemplateResponseBodyDataBackgrounds self = new GetLiveRecordTemplateResponseBodyDataBackgrounds();
            return TeaModel.build(map, self);
        }

        public GetLiveRecordTemplateResponseBodyDataBackgrounds setDisplay(Long display) {
            this.display = display;
            return this;
        }
        public Long getDisplay() {
            return this.display;
        }

        public GetLiveRecordTemplateResponseBodyDataBackgrounds setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public GetLiveRecordTemplateResponseBodyDataBackgrounds setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public GetLiveRecordTemplateResponseBodyDataBackgrounds setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public GetLiveRecordTemplateResponseBodyDataBackgrounds setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public GetLiveRecordTemplateResponseBodyDataBackgrounds setZOrder(Long ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Long getZOrder() {
            return this.ZOrder;
        }

    }

    public static class GetLiveRecordTemplateResponseBodyDataClockWidgets extends TeaModel {
        @NameInMap("FontColor")
        public Long fontColor;

        @NameInMap("FontSize")
        public Long fontSize;

        @NameInMap("FontType")
        public Long fontType;

        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        @NameInMap("ZOrder")
        public Long ZOrder;

        public static GetLiveRecordTemplateResponseBodyDataClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            GetLiveRecordTemplateResponseBodyDataClockWidgets self = new GetLiveRecordTemplateResponseBodyDataClockWidgets();
            return TeaModel.build(map, self);
        }

        public GetLiveRecordTemplateResponseBodyDataClockWidgets setFontColor(Long fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Long getFontColor() {
            return this.fontColor;
        }

        public GetLiveRecordTemplateResponseBodyDataClockWidgets setFontSize(Long fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Long getFontSize() {
            return this.fontSize;
        }

        public GetLiveRecordTemplateResponseBodyDataClockWidgets setFontType(Long fontType) {
            this.fontType = fontType;
            return this;
        }
        public Long getFontType() {
            return this.fontType;
        }

        public GetLiveRecordTemplateResponseBodyDataClockWidgets setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public GetLiveRecordTemplateResponseBodyDataClockWidgets setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public GetLiveRecordTemplateResponseBodyDataClockWidgets setZOrder(Long ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Long getZOrder() {
            return this.ZOrder;
        }

    }

    public static class GetLiveRecordTemplateResponseBodyDataWatermarks extends TeaModel {
        @NameInMap("Alpha")
        public Float alpha;

        @NameInMap("Display")
        public Long display;

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
        public Long ZOrder;

        public static GetLiveRecordTemplateResponseBodyDataWatermarks build(java.util.Map<String, ?> map) throws Exception {
            GetLiveRecordTemplateResponseBodyDataWatermarks self = new GetLiveRecordTemplateResponseBodyDataWatermarks();
            return TeaModel.build(map, self);
        }

        public GetLiveRecordTemplateResponseBodyDataWatermarks setAlpha(Float alpha) {
            this.alpha = alpha;
            return this;
        }
        public Float getAlpha() {
            return this.alpha;
        }

        public GetLiveRecordTemplateResponseBodyDataWatermarks setDisplay(Long display) {
            this.display = display;
            return this;
        }
        public Long getDisplay() {
            return this.display;
        }

        public GetLiveRecordTemplateResponseBodyDataWatermarks setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public GetLiveRecordTemplateResponseBodyDataWatermarks setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetLiveRecordTemplateResponseBodyDataWatermarks setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public GetLiveRecordTemplateResponseBodyDataWatermarks setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public GetLiveRecordTemplateResponseBodyDataWatermarks setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public GetLiveRecordTemplateResponseBodyDataWatermarks setZOrder(Long ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Long getZOrder() {
            return this.ZOrder;
        }

    }

    public static class GetLiveRecordTemplateResponseBodyData extends TeaModel {
        @NameInMap("Backgrounds")
        public java.util.List<GetLiveRecordTemplateResponseBodyDataBackgrounds> backgrounds;

        @NameInMap("ClockWidgets")
        public java.util.List<GetLiveRecordTemplateResponseBodyDataClockWidgets> clockWidgets;

        @NameInMap("CreatedAt")
        public Integer createdAt;

        @NameInMap("Description")
        public String description;

        @NameInMap("Disabled")
        public String disabled;

        @NameInMap("Id")
        public String id;

        @NameInMap("LayoutIds")
        public java.util.List<byte[]> layoutIds;

        @NameInMap("Name")
        public String name;

        @NameInMap("RtcCode")
        public String rtcCode;

        @NameInMap("Watermarks")
        public java.util.List<GetLiveRecordTemplateResponseBodyDataWatermarks> watermarks;

        public static GetLiveRecordTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLiveRecordTemplateResponseBodyData self = new GetLiveRecordTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLiveRecordTemplateResponseBodyData setBackgrounds(java.util.List<GetLiveRecordTemplateResponseBodyDataBackgrounds> backgrounds) {
            this.backgrounds = backgrounds;
            return this;
        }
        public java.util.List<GetLiveRecordTemplateResponseBodyDataBackgrounds> getBackgrounds() {
            return this.backgrounds;
        }

        public GetLiveRecordTemplateResponseBodyData setClockWidgets(java.util.List<GetLiveRecordTemplateResponseBodyDataClockWidgets> clockWidgets) {
            this.clockWidgets = clockWidgets;
            return this;
        }
        public java.util.List<GetLiveRecordTemplateResponseBodyDataClockWidgets> getClockWidgets() {
            return this.clockWidgets;
        }

        public GetLiveRecordTemplateResponseBodyData setCreatedAt(Integer createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Integer getCreatedAt() {
            return this.createdAt;
        }

        public GetLiveRecordTemplateResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLiveRecordTemplateResponseBodyData setDisabled(String disabled) {
            this.disabled = disabled;
            return this;
        }
        public String getDisabled() {
            return this.disabled;
        }

        public GetLiveRecordTemplateResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLiveRecordTemplateResponseBodyData setLayoutIds(java.util.List<byte[]> layoutIds) {
            this.layoutIds = layoutIds;
            return this;
        }
        public java.util.List<byte[]> getLayoutIds() {
            return this.layoutIds;
        }

        public GetLiveRecordTemplateResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLiveRecordTemplateResponseBodyData setRtcCode(String rtcCode) {
            this.rtcCode = rtcCode;
            return this;
        }
        public String getRtcCode() {
            return this.rtcCode;
        }

        public GetLiveRecordTemplateResponseBodyData setWatermarks(java.util.List<GetLiveRecordTemplateResponseBodyDataWatermarks> watermarks) {
            this.watermarks = watermarks;
            return this;
        }
        public java.util.List<GetLiveRecordTemplateResponseBodyDataWatermarks> getWatermarks() {
            return this.watermarks;
        }

    }

}
