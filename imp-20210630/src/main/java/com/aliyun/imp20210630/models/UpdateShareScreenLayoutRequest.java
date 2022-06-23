// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateShareScreenLayoutRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 课堂唯一标识，由调用CreateClass返回。
    @NameInMap("ClassId")
    public String classId;

    // 是否开启叠加老师画面
    @NameInMap("EnableOverlay")
    public Boolean enableOverlay;

    // 叠加画面高度，归一化为1
    @NameInMap("OverlayHeight")
    public Float overlayHeight;

    // 叠加画面宽度，归一化为1
    @NameInMap("OverlayWidth")
    public Float overlayWidth;

    // 叠加画面X坐标，归一化为1
    @NameInMap("OverlayX")
    public Float overlayX;

    // 叠加画面Y坐标，归一化为1
    @NameInMap("OverlayY")
    public Float overlayY;

    public static UpdateShareScreenLayoutRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateShareScreenLayoutRequest self = new UpdateShareScreenLayoutRequest();
        return TeaModel.build(map, self);
    }

    public UpdateShareScreenLayoutRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateShareScreenLayoutRequest setClassId(String classId) {
        this.classId = classId;
        return this;
    }
    public String getClassId() {
        return this.classId;
    }

    public UpdateShareScreenLayoutRequest setEnableOverlay(Boolean enableOverlay) {
        this.enableOverlay = enableOverlay;
        return this;
    }
    public Boolean getEnableOverlay() {
        return this.enableOverlay;
    }

    public UpdateShareScreenLayoutRequest setOverlayHeight(Float overlayHeight) {
        this.overlayHeight = overlayHeight;
        return this;
    }
    public Float getOverlayHeight() {
        return this.overlayHeight;
    }

    public UpdateShareScreenLayoutRequest setOverlayWidth(Float overlayWidth) {
        this.overlayWidth = overlayWidth;
        return this;
    }
    public Float getOverlayWidth() {
        return this.overlayWidth;
    }

    public UpdateShareScreenLayoutRequest setOverlayX(Float overlayX) {
        this.overlayX = overlayX;
        return this;
    }
    public Float getOverlayX() {
        return this.overlayX;
    }

    public UpdateShareScreenLayoutRequest setOverlayY(Float overlayY) {
        this.overlayY = overlayY;
        return this;
    }
    public Float getOverlayY() {
        return this.overlayY;
    }

}
