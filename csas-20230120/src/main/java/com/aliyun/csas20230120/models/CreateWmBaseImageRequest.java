// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmBaseImageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1080</p>
     */
    @NameInMap("Height")
    public Integer height;

    @NameInMap("ImageControl")
    public CreateWmBaseImageRequestImageControl imageControl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>255</p>
     */
    @NameInMap("Opacity")
    public Integer opacity;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Scale")
    public Integer scale;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1920</p>
     */
    @NameInMap("Width")
    public Integer width;

    /**
     * <strong>example:</strong>
     * <p>aGVsbG8gc2F*****</p>
     */
    @NameInMap("WmInfoBytesB64")
    public String wmInfoBytesB64;

    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("WmInfoSize")
    public Long wmInfoSize;

    /**
     * <strong>example:</strong>
     * <p>12*****</p>
     */
    @NameInMap("WmInfoUint")
    public String wmInfoUint;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PureWebappInvisible</p>
     */
    @NameInMap("WmType")
    public String wmType;

    public static CreateWmBaseImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWmBaseImageRequest self = new CreateWmBaseImageRequest();
        return TeaModel.build(map, self);
    }

    public CreateWmBaseImageRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public CreateWmBaseImageRequest setImageControl(CreateWmBaseImageRequestImageControl imageControl) {
        this.imageControl = imageControl;
        return this;
    }
    public CreateWmBaseImageRequestImageControl getImageControl() {
        return this.imageControl;
    }

    public CreateWmBaseImageRequest setOpacity(Integer opacity) {
        this.opacity = opacity;
        return this;
    }
    public Integer getOpacity() {
        return this.opacity;
    }

    public CreateWmBaseImageRequest setScale(Integer scale) {
        this.scale = scale;
        return this;
    }
    public Integer getScale() {
        return this.scale;
    }

    public CreateWmBaseImageRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

    public CreateWmBaseImageRequest setWmInfoBytesB64(String wmInfoBytesB64) {
        this.wmInfoBytesB64 = wmInfoBytesB64;
        return this;
    }
    public String getWmInfoBytesB64() {
        return this.wmInfoBytesB64;
    }

    public CreateWmBaseImageRequest setWmInfoSize(Long wmInfoSize) {
        this.wmInfoSize = wmInfoSize;
        return this;
    }
    public Long getWmInfoSize() {
        return this.wmInfoSize;
    }

    public CreateWmBaseImageRequest setWmInfoUint(String wmInfoUint) {
        this.wmInfoUint = wmInfoUint;
        return this;
    }
    public String getWmInfoUint() {
        return this.wmInfoUint;
    }

    public CreateWmBaseImageRequest setWmType(String wmType) {
        this.wmType = wmType;
        return this;
    }
    public String getWmType() {
        return this.wmType;
    }

    public static class CreateWmBaseImageRequestImageControlLogoVisibleControl extends TeaModel {
        @NameInMap("Angle")
        public Long angle;

        @NameInMap("LogoBase64")
        public String logoBase64;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Opacity")
        public Integer opacity;

        @NameInMap("PosAx")
        public Float posAx;

        @NameInMap("PosAy")
        public Float posAy;

        @NameInMap("PosX")
        public Long posX;

        @NameInMap("PosY")
        public Long posY;

        @NameInMap("SpaceX")
        public Long spaceX;

        @NameInMap("SpaceY")
        public Long spaceY;

        @NameInMap("Visible")
        public Boolean visible;

        public static CreateWmBaseImageRequestImageControlLogoVisibleControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmBaseImageRequestImageControlLogoVisibleControl self = new CreateWmBaseImageRequestImageControlLogoVisibleControl();
            return TeaModel.build(map, self);
        }

        public CreateWmBaseImageRequestImageControlLogoVisibleControl setAngle(Long angle) {
            this.angle = angle;
            return this;
        }
        public Long getAngle() {
            return this.angle;
        }

        public CreateWmBaseImageRequestImageControlLogoVisibleControl setLogoBase64(String logoBase64) {
            this.logoBase64 = logoBase64;
            return this;
        }
        public String getLogoBase64() {
            return this.logoBase64;
        }

        public CreateWmBaseImageRequestImageControlLogoVisibleControl setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateWmBaseImageRequestImageControlLogoVisibleControl setOpacity(Integer opacity) {
            this.opacity = opacity;
            return this;
        }
        public Integer getOpacity() {
            return this.opacity;
        }

        public CreateWmBaseImageRequestImageControlLogoVisibleControl setPosAx(Float posAx) {
            this.posAx = posAx;
            return this;
        }
        public Float getPosAx() {
            return this.posAx;
        }

        public CreateWmBaseImageRequestImageControlLogoVisibleControl setPosAy(Float posAy) {
            this.posAy = posAy;
            return this;
        }
        public Float getPosAy() {
            return this.posAy;
        }

        public CreateWmBaseImageRequestImageControlLogoVisibleControl setPosX(Long posX) {
            this.posX = posX;
            return this;
        }
        public Long getPosX() {
            return this.posX;
        }

        public CreateWmBaseImageRequestImageControlLogoVisibleControl setPosY(Long posY) {
            this.posY = posY;
            return this;
        }
        public Long getPosY() {
            return this.posY;
        }

        public CreateWmBaseImageRequestImageControlLogoVisibleControl setSpaceX(Long spaceX) {
            this.spaceX = spaceX;
            return this;
        }
        public Long getSpaceX() {
            return this.spaceX;
        }

        public CreateWmBaseImageRequestImageControlLogoVisibleControl setSpaceY(Long spaceY) {
            this.spaceY = spaceY;
            return this;
        }
        public Long getSpaceY() {
            return this.spaceY;
        }

        public CreateWmBaseImageRequestImageControlLogoVisibleControl setVisible(Boolean visible) {
            this.visible = visible;
            return this;
        }
        public Boolean getVisible() {
            return this.visible;
        }

    }

    public static class CreateWmBaseImageRequestImageControlTextVisibleControl extends TeaModel {
        @NameInMap("Angle")
        public Long angle;

        @NameInMap("FontColor")
        public String fontColor;

        @NameInMap("FontSize")
        public Long fontSize;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Opacity")
        public Integer opacity;

        @NameInMap("PosAx")
        public Float posAx;

        @NameInMap("PosAy")
        public Float posAy;

        @NameInMap("PosX")
        public Long posX;

        @NameInMap("PosY")
        public Long posY;

        @NameInMap("SpaceX")
        public Long spaceX;

        @NameInMap("SpaceY")
        public Long spaceY;

        @NameInMap("Visible")
        public Boolean visible;

        @NameInMap("VisibleText")
        public String visibleText;

        public static CreateWmBaseImageRequestImageControlTextVisibleControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmBaseImageRequestImageControlTextVisibleControl self = new CreateWmBaseImageRequestImageControlTextVisibleControl();
            return TeaModel.build(map, self);
        }

        public CreateWmBaseImageRequestImageControlTextVisibleControl setAngle(Long angle) {
            this.angle = angle;
            return this;
        }
        public Long getAngle() {
            return this.angle;
        }

        public CreateWmBaseImageRequestImageControlTextVisibleControl setFontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public String getFontColor() {
            return this.fontColor;
        }

        public CreateWmBaseImageRequestImageControlTextVisibleControl setFontSize(Long fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Long getFontSize() {
            return this.fontSize;
        }

        public CreateWmBaseImageRequestImageControlTextVisibleControl setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateWmBaseImageRequestImageControlTextVisibleControl setOpacity(Integer opacity) {
            this.opacity = opacity;
            return this;
        }
        public Integer getOpacity() {
            return this.opacity;
        }

        public CreateWmBaseImageRequestImageControlTextVisibleControl setPosAx(Float posAx) {
            this.posAx = posAx;
            return this;
        }
        public Float getPosAx() {
            return this.posAx;
        }

        public CreateWmBaseImageRequestImageControlTextVisibleControl setPosAy(Float posAy) {
            this.posAy = posAy;
            return this;
        }
        public Float getPosAy() {
            return this.posAy;
        }

        public CreateWmBaseImageRequestImageControlTextVisibleControl setPosX(Long posX) {
            this.posX = posX;
            return this;
        }
        public Long getPosX() {
            return this.posX;
        }

        public CreateWmBaseImageRequestImageControlTextVisibleControl setPosY(Long posY) {
            this.posY = posY;
            return this;
        }
        public Long getPosY() {
            return this.posY;
        }

        public CreateWmBaseImageRequestImageControlTextVisibleControl setSpaceX(Long spaceX) {
            this.spaceX = spaceX;
            return this;
        }
        public Long getSpaceX() {
            return this.spaceX;
        }

        public CreateWmBaseImageRequestImageControlTextVisibleControl setSpaceY(Long spaceY) {
            this.spaceY = spaceY;
            return this;
        }
        public Long getSpaceY() {
            return this.spaceY;
        }

        public CreateWmBaseImageRequestImageControlTextVisibleControl setVisible(Boolean visible) {
            this.visible = visible;
            return this;
        }
        public Boolean getVisible() {
            return this.visible;
        }

        public CreateWmBaseImageRequestImageControlTextVisibleControl setVisibleText(String visibleText) {
            this.visibleText = visibleText;
            return this;
        }
        public String getVisibleText() {
            return this.visibleText;
        }

    }

    public static class CreateWmBaseImageRequestImageControl extends TeaModel {
        @NameInMap("LogoVisibleControl")
        public CreateWmBaseImageRequestImageControlLogoVisibleControl logoVisibleControl;

        @NameInMap("TextVisibleControl")
        public CreateWmBaseImageRequestImageControlTextVisibleControl textVisibleControl;

        public static CreateWmBaseImageRequestImageControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmBaseImageRequestImageControl self = new CreateWmBaseImageRequestImageControl();
            return TeaModel.build(map, self);
        }

        public CreateWmBaseImageRequestImageControl setLogoVisibleControl(CreateWmBaseImageRequestImageControlLogoVisibleControl logoVisibleControl) {
            this.logoVisibleControl = logoVisibleControl;
            return this;
        }
        public CreateWmBaseImageRequestImageControlLogoVisibleControl getLogoVisibleControl() {
            return this.logoVisibleControl;
        }

        public CreateWmBaseImageRequestImageControl setTextVisibleControl(CreateWmBaseImageRequestImageControlTextVisibleControl textVisibleControl) {
            this.textVisibleControl = textVisibleControl;
            return this;
        }
        public CreateWmBaseImageRequestImageControlTextVisibleControl getTextVisibleControl() {
            return this.textVisibleControl;
        }

    }

}
