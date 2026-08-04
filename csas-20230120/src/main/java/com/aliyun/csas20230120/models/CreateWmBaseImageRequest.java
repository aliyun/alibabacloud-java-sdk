// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmBaseImageRequest extends TeaModel {
    /**
     * <p>Height of the watermark image, in pixels. Valid values: 100 to 5000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1080</p>
     */
    @NameInMap("Height")
    public Integer height;

    /**
     * <p>Image watermark control parameters.</p>
     */
    @NameInMap("ImageControl")
    public CreateWmBaseImageRequestImageControl imageControl;

    /**
     * <p>Opacity of the watermark image. Valid values: 1 to 255. Higher values mean lower transparency.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>255</p>
     */
    @NameInMap("Opacity")
    public Integer opacity;

    /**
     * <p>Scaling factor of the watermark image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Scale")
    public Integer scale;

    /**
     * <p>Width of the watermark image, in pixels. Valid values: 100 to 5000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1920</p>
     */
    @NameInMap("Width")
    public Integer width;

    /**
     * <p>Base64-encoded watermark information. Length: 1 to 300 characters. Do not set this parameter if you set WmInfoUint.</p>
     * 
     * <strong>example:</strong>
     * <p>aGVsbG8gc2F*****</p>
     */
    @NameInMap("WmInfoBytesB64")
    public String wmInfoBytesB64;

    /**
     * <p>Bit width of the watermark information. Default value: 32. This value must be the same during embedding and extraction. For example, if you use a 40-bit SDK to embed the watermark, set this value to 40 when extracting it.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("WmInfoSize")
    public Long wmInfoSize;

    /**
     * <p>Decimal-form watermark information. Do not set this parameter if you set WmInfoBytesB64.</p>
     * <p>The valid range depends on the WmInfoSize value:</p>
     * <ul>
     * <li><p>If WmInfoSize is <strong>32</strong>, the valid range is 1 to 4294967295.</p>
     * </li>
     * <li><p>If WmInfoSize is <strong>40</strong>, the valid range is 1 to 1099511627775.</p>
     * </li>
     * <li><p>If WmInfoSize is <strong>64</strong>, the valid range is 1 to 18446744073709551615.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>12*****</p>
     */
    @NameInMap("WmInfoUint")
    public String wmInfoUint;

    /**
     * <p>Watermark type. Valid values:</p>
     * <ul>
     * <li><p><strong>PureWebappInvisible</strong>: Web watermark.</p>
     * </li>
     * <li><p><strong>PureAppInvisible</strong>: App watermark.</p>
     * </li>
     * <li><p><strong>PureScreenInvisible</strong>: Screen watermark.</p>
     * </li>
     * <li><p><strong>AigcWebappInvisible</strong>: AIGC web watermark.</p>
     * </li>
     * <li><p><strong>AigcAppInvisible</strong>: AIGC app watermark.</p>
     * </li>
     * <li><p><strong>AigcScreenInvisible</strong>: AIGC screen watermark.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PureWebappInvisible</p>
     */
    @NameInMap("WmType")
    public String wmType;

    /**
     * <p>Comments.</p>
     * 
     * <strong>example:</strong>
     * <p>备注</p>
     */
    @NameInMap("comment")
    public String comment;

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

    public CreateWmBaseImageRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public static class CreateWmBaseImageRequestImageControlLogoVisibleControlMargin extends TeaModel {
        /**
         * <p>Applies when Mode is bottom-left or bottom-right. The bottom margin.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Bottom")
        public Float bottom;

        /**
         * <p>Applies when Mode is top-left or bottom-left. The left margin.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Left")
        public Float left;

        /**
         * <p>The right margin. This parameter is valid only when Mode is set to top-right or bottom-right.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Right")
        public Float right;

        /**
         * <p>Applies when Mode is top-left or top-right. The top margin.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Top")
        public Float top;

        public static CreateWmBaseImageRequestImageControlLogoVisibleControlMargin build(java.util.Map<String, ?> map) throws Exception {
            CreateWmBaseImageRequestImageControlLogoVisibleControlMargin self = new CreateWmBaseImageRequestImageControlLogoVisibleControlMargin();
            return TeaModel.build(map, self);
        }

        public CreateWmBaseImageRequestImageControlLogoVisibleControlMargin setBottom(Float bottom) {
            this.bottom = bottom;
            return this;
        }
        public Float getBottom() {
            return this.bottom;
        }

        public CreateWmBaseImageRequestImageControlLogoVisibleControlMargin setLeft(Float left) {
            this.left = left;
            return this;
        }
        public Float getLeft() {
            return this.left;
        }

        public CreateWmBaseImageRequestImageControlLogoVisibleControlMargin setRight(Float right) {
            this.right = right;
            return this;
        }
        public Float getRight() {
            return this.right;
        }

        public CreateWmBaseImageRequestImageControlLogoVisibleControlMargin setTop(Float top) {
            this.top = top;
            return this;
        }
        public Float getTop() {
            return this.top;
        }

    }

    public static class CreateWmBaseImageRequestImageControlLogoVisibleControl extends TeaModel {
        /**
         * <p>The clockwise rotation angle of the logo watermark text. Valid values: 1 to 360.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Angle")
        public Long angle;

        /**
         * <p>Enable enhanced visible logo watermark. If enabled, the logo is converted into a watermark and added to the image.</p>
         */
        @NameInMap("Enhance")
        public Boolean enhance;

        /**
         * <p>Base64-encoded logo watermark. The logo file must be a PNG image encoded in Base64 format.</p>
         * 
         * <strong>example:</strong>
         * <p>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</p>
         */
        @NameInMap("LogoBase64")
        public String logoBase64;

        /**
         * <p>Applies when Mode is top-left, top-right, bottom-left, or bottom-right. Specifies the margin.</p>
         */
        @NameInMap("Margin")
        public CreateWmBaseImageRequestImageControlLogoVisibleControlMargin margin;

        /**
         * <p>The display mode for the logo watermark. Valid values:</p>
         * <ul>
         * <li><p><strong>pos</strong>: Fixed position pattern.</p>
         * </li>
         * <li><p><strong>repeat</strong>: Tile pattern.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pos</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>Logo watermark opacity. Valid values: 1 to 255. A higher value means lower transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("Opacity")
        public Integer opacity;

        /**
         * <p>The horizontal anchor point for the logo watermark. Valid values: 0 to 1. When (PosAx, PosAy) is (0, 0), the watermark anchors to the top-left corner of the text. When the value is 0.5, the watermark anchors to the centroid of the text. When (PosAx, PosAy) is (1, 1), the watermark anchors to the bottom-right corner of the text.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosAx")
        public Float posAx;

        /**
         * <p>The vertical anchor point for the logo watermark. The value ranges from 0 to 1. The coordinates (PosAx, PosAy) define the anchor point on the watermark. For example, (0,0) represents the top-left corner, (0.5, 0.5) represents the centroid, and (1,1) represents the bottom-right corner.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosAy")
        public Float posAy;

        /**
         * <p>Takes effect when Mode is set to pos. This parameter controls the horizontal position of a visible watermark, using pixel coordinates with the top-left corner as the origin.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosX")
        public Long posX;

        /**
         * <p>Specifies the vertical position of the visible watermark in pixels. The top-left corner is the origin. This parameter is valid only when Mode is set to pos.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosY")
        public Long posY;

        /**
         * <p>This parameter takes effect when Mode is set to repeat. It specifies the horizontal pitch for the tiled visible watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SpaceX")
        public Long spaceX;

        /**
         * <p>Applies only when Mode is set to repeat. Controls the vertical pitch between tiled visible watermarks.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SpaceY")
        public Long spaceY;

        /**
         * <p>Visibility:</p>
         * <p><strong>true</strong>: Display</p>
         * <p><strong>false</strong>: Hide</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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

        public CreateWmBaseImageRequestImageControlLogoVisibleControl setEnhance(Boolean enhance) {
            this.enhance = enhance;
            return this;
        }
        public Boolean getEnhance() {
            return this.enhance;
        }

        public CreateWmBaseImageRequestImageControlLogoVisibleControl setLogoBase64(String logoBase64) {
            this.logoBase64 = logoBase64;
            return this;
        }
        public String getLogoBase64() {
            return this.logoBase64;
        }

        public CreateWmBaseImageRequestImageControlLogoVisibleControl setMargin(CreateWmBaseImageRequestImageControlLogoVisibleControlMargin margin) {
            this.margin = margin;
            return this;
        }
        public CreateWmBaseImageRequestImageControlLogoVisibleControlMargin getMargin() {
            return this.margin;
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

    public static class CreateWmBaseImageRequestImageControlTextVisibleControlMargin extends TeaModel {
        /**
         * <p>Takes effect only when Mode is bottom-left or bottom-right. Bottom margin.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Bottom")
        public Float bottom;

        /**
         * <p>Takes effect only when Mode is top-left or bottom-left. Left margin.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Left")
        public Float left;

        /**
         * <p>Takes effect only when Mode is top-right or bottom-right. Right margin.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Right")
        public Float right;

        /**
         * <p>Takes effect only when Mode is top-left or top-right. Top margin.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Top")
        public Float top;

        public static CreateWmBaseImageRequestImageControlTextVisibleControlMargin build(java.util.Map<String, ?> map) throws Exception {
            CreateWmBaseImageRequestImageControlTextVisibleControlMargin self = new CreateWmBaseImageRequestImageControlTextVisibleControlMargin();
            return TeaModel.build(map, self);
        }

        public CreateWmBaseImageRequestImageControlTextVisibleControlMargin setBottom(Float bottom) {
            this.bottom = bottom;
            return this;
        }
        public Float getBottom() {
            return this.bottom;
        }

        public CreateWmBaseImageRequestImageControlTextVisibleControlMargin setLeft(Float left) {
            this.left = left;
            return this;
        }
        public Float getLeft() {
            return this.left;
        }

        public CreateWmBaseImageRequestImageControlTextVisibleControlMargin setRight(Float right) {
            this.right = right;
            return this;
        }
        public Float getRight() {
            return this.right;
        }

        public CreateWmBaseImageRequestImageControlTextVisibleControlMargin setTop(Float top) {
            this.top = top;
            return this;
        }
        public Float getTop() {
            return this.top;
        }

    }

    public static class CreateWmBaseImageRequestImageControlTextVisibleControl extends TeaModel {
        /**
         * <p>Rotation angle of the text watermark, in degrees clockwise. Valid values: 0 to 360.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Angle")
        public Long angle;

        /**
         * <p>Text watermark color. Format: RGB, such as 0xFFFFFF or #FFFFFF. For example, 0x000000 or #000000 means black.</p>
         * 
         * <strong>example:</strong>
         * <p>#FF0000</p>
         */
        @NameInMap("FontColor")
        public String fontColor;

        /**
         * <p>Font size of the text watermark. Larger values produce larger fonts.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("FontSize")
        public Long fontSize;

        /**
         * <p>Takes effect only when Mode is top-left, top-right, bottom-left, or bottom-right. Margin settings.</p>
         */
        @NameInMap("Margin")
        public CreateWmBaseImageRequestImageControlTextVisibleControlMargin margin;

        /**
         * <p>Text watermark display mode. Valid values:</p>
         * <ul>
         * <li><p><strong>pos</strong>: Fixed position mode.</p>
         * </li>
         * <li><p><strong>repeat</strong>: Tiled mode.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pos</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>Text watermark opacity. Valid values: 1 to 255. Higher values mean less transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("Opacity")
        public Integer opacity;

        /**
         * <p>Horizontal anchor point for the text watermark. Valid values: 0 to 1. When (PosAx, PosAy) is (0, 0), the top-left corner of the text is used as the anchor point. When it is 0.5, the center point is used. When it is (1, 1), the bottom-right corner is used.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosAx")
        public Float posAx;

        /**
         * <p>Vertical anchor point for the text watermark. Valid values: 0 to 1. When (PosAx, PosAy) is (0, 0), the top-left corner of the text is used as the anchor point. When it is 0.5, the center point is used. When it is (1, 1), the bottom-right corner is used.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosAy")
        public Float posAy;

        /**
         * <p>Takes effect only when Mode is pos. Horizontal position of the text watermark, measured in pixels from the top-left corner.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosX")
        public Long posX;

        /**
         * <p>Takes effect only when Mode is pos. Vertical position of the text watermark, measured in pixels from the top-left corner.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosY")
        public Long posY;

        /**
         * <p>Takes effect only when Mode is repeat. Horizontal spacing between repeated text watermarks.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SpaceX")
        public Long spaceX;

        /**
         * <p>Takes effect only when Mode is repeat. Vertical spacing between repeated text watermarks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpaceY")
        public Long spaceY;

        /**
         * <p>Visibility setting:</p>
         * <p>true: Show the watermark.</p>
         * <p>false: Hide the watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Visible")
        public Boolean visible;

        /**
         * <p>Text watermark content. Format: UTF-8 string.</p>
         * 
         * <strong>example:</strong>
         * <p>水印文本</p>
         */
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

        public CreateWmBaseImageRequestImageControlTextVisibleControl setMargin(CreateWmBaseImageRequestImageControlTextVisibleControlMargin margin) {
            this.margin = margin;
            return this;
        }
        public CreateWmBaseImageRequestImageControlTextVisibleControlMargin getMargin() {
            return this.margin;
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
        /**
         * <p>Logo watermark control parameters.</p>
         */
        @NameInMap("LogoVisibleControl")
        public CreateWmBaseImageRequestImageControlLogoVisibleControl logoVisibleControl;

        /**
         * <p>Text watermark control parameters.</p>
         */
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
