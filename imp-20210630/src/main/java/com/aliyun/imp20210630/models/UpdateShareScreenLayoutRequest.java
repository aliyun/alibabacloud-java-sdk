// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateShareScreenLayoutRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ClassId")
    public String classId;

    @NameInMap("EnableOverlay")
    public Boolean enableOverlay;

    @NameInMap("OverlayHeight")
    public Float overlayHeight;

    @NameInMap("OverlayWidth")
    public Float overlayWidth;

    @NameInMap("OverlayX")
    public Float overlayX;

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
