// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmBaseImageRequest extends TeaModel {
    /**
     * <p>The height of the watermark image, in pixels. Valid values: 100 to 5000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1080</p>
     */
    @NameInMap("Height")
    public Integer height;

    /**
     * <p>The image watermark control parameters.</p>
     */
    @NameInMap("ImageControl")
    public CreateWmBaseImageRequestImageControl imageControl;

    /**
     * <p>The opacity of the watermark image. Valid values: 1 to 255. A larger value indicates lower transparency.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>255</p>
     */
    @NameInMap("Opacity")
    public Integer opacity;

    /**
     * <p>The scaling ratio of the watermark image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Scale")
    public Integer scale;

    /**
     * <p>The width of the watermark image, in pixels. Valid values: 100 to 5000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1920</p>
     */
    @NameInMap("Width")
    public Integer width;

    /**
     * <p>The watermark information in Base64-encoded string format. The length is 1 to 300 characters. If this parameter is set, the WmInfoUint parameter cannot be set.</p>
     * 
     * <strong>example:</strong>
     * <p>aGVsbG8gc2F*****</p>
     */
    @NameInMap("WmInfoBytesB64")
    public String wmInfoBytesB64;

    /**
     * <p>The bit width of the watermark information capacity. Default value: 32. This parameter must be consistent between embedding and extraction. For example, if the SDK used for embedding is 40-bit, set this parameter to 40 during extraction as well.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("WmInfoSize")
    public Long wmInfoSize;

    /**
     * <p>The watermark information in decimal number format. If this parameter is set, WmInfoBytesB64 cannot be set.</p>
     * <p>The valid range depends on the WmInfoSize parameter:</p>
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
     * <p>The watermark type. Valid values:</p>
     * <ul>
     * <li><strong>PureWebappInvisible</strong>: web watermark.</li>
     * <li><strong>PureAppInvisible</strong>: App watermark.</li>
     * <li><strong>PureScreenInvisible</strong>: screen watermark.</li>
     * <li><strong>AigcWebappInvisible</strong>: AIGC web watermark.</li>
     * <li><strong>AigcAppInvisible</strong>: AIGC App watermark.</li>
     * <li><strong>AigcScreenInvisible</strong>: AIGC screen watermark.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PureWebappInvisible</p>
     */
    @NameInMap("WmType")
    public String wmType;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>Remarks</p>
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
         * <p>Takes effect when Mode is set to bottom-left or bottom-right. The bottom margin.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Bottom")
        public Float bottom;

        /**
         * <p>Takes effect when Mode is set to top-left or bottom-left. The left margin.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Left")
        public Float left;

        /**
         * <p>Takes effect when Mode is set to top-right or bottom-right. The right margin.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Right")
        public Float right;

        /**
         * <p>Takes effect when Mode is set to top-left or top-right. The top margin.</p>
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
         * <p>The clockwise rotation angle of the logo watermark. Valid values: 1 to 360.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Angle")
        public Long angle;

        /**
         * <p>Specifies whether to enable enhanced visible watermark. When enabled, the logo is converted to a watermark logo and added to the image.</p>
         */
        @NameInMap("Enhance")
        public Boolean enhance;

        /**
         * <p>The logo watermark in Base64 format. The logo file is a PNG image converted to Base64 format.</p>
         * 
         * <strong>example:</strong>
         * <p>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</p>
         */
        @NameInMap("LogoBase64")
        public String logoBase64;

        /**
         * <p>Takes effect when Mode is set to top-left, top-right, bottom-left, or bottom-right. The margin settings.</p>
         */
        @NameInMap("Margin")
        public CreateWmBaseImageRequestImageControlLogoVisibleControlMargin margin;

        /**
         * <p>The logo watermark display mode. Valid values:</p>
         * <ul>
         * <li><strong>pos</strong>: fixed position mode.</li>
         * <li><strong>repeat</strong>: tile mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pos</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The opacity of the logo watermark. Valid values: 1 to 255. A larger value indicates lower transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("Opacity")
        public Integer opacity;

        /**
         * <p>The horizontal anchor point of the logo watermark. Valid values: 0 to 1. When (PosAx, PosAy) is set to (0, 0), the logo is drawn from the upper-left corner. When set to 0.5, the logo is drawn from the center. When set to (1, 1), the logo is drawn from the lower-right corner.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosAx")
        public Float posAx;

        /**
         * <p>The vertical anchor point of the logo watermark. Valid values: 0 to 1. When (PosAx, PosAy) is set to (0, 0), the logo is drawn from the upper-left corner. When set to 0.5, the logo is drawn from the center. When set to (1, 1), the logo is drawn from the lower-right corner.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosAy")
        public Float posAy;

        /**
         * <p>Takes effect when Mode is set to pos. Specifies the horizontal position of the visible watermark in pixels, with the upper-left corner as the origin.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosX")
        public Long posX;

        /**
         * <p>Takes effect when Mode is set to pos. Specifies the vertical position of the visible watermark in pixels, with the upper-left corner as the origin.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosY")
        public Long posY;

        /**
         * <p>Takes effect when Mode is set to repeat. Specifies the horizontal spacing for tiled visible watermarks.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SpaceX")
        public Long spaceX;

        /**
         * <p>Takes effect when Mode is set to repeat. Specifies the vertical spacing for tiled visible watermarks.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SpaceY")
        public Long spaceY;

        /**
         * <p>The visibility. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: displayed.</p>
         * </li>
         * <li><p><strong>false</strong>: not displayed.</p>
         * </li>
         * </ul>
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
         * <p>Takes effect when Mode is set to bottom-left or bottom-right. The bottom margin.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Bottom")
        public Float bottom;

        /**
         * <p>Takes effect when Mode is set to top-left or bottom-left. The left margin.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Left")
        public Float left;

        /**
         * <p>Takes effect when Mode is set to top-right or bottom-right. The right margin.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Right")
        public Float right;

        /**
         * <p>Takes effect when Mode is set to top-left or top-right. The top margin.</p>
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
         * <p>The clockwise rotation angle of the text watermark. Valid values: 0 to 360.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Angle")
        public Long angle;

        /**
         * <p>The font color of the text watermark. The format is 0xFFFFFF or #FFFFFF RGB color format. For example, 0x000000 or #000000 represents black.</p>
         * 
         * <strong>example:</strong>
         * <p>#FF0000</p>
         */
        @NameInMap("FontColor")
        public String fontColor;

        /**
         * <p>The font size of the text watermark. A larger value indicates a larger font.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("FontSize")
        public Long fontSize;

        /**
         * <p>Takes effect when Mode is set to top-left, top-right, bottom-left, or bottom-right. The margin settings.</p>
         */
        @NameInMap("Margin")
        public CreateWmBaseImageRequestImageControlTextVisibleControlMargin margin;

        /**
         * <p>The text watermark display mode. Valid values:</p>
         * <ul>
         * <li><strong>pos</strong>: fixed position mode.</li>
         * <li><strong>repeat</strong>: tile mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pos</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The opacity of the text watermark. Valid values: 1 to 255. A larger value indicates lower transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("Opacity")
        public Integer opacity;

        /**
         * <p>The horizontal anchor point of the text watermark. Valid values: 0 to 1. When (PosAx, PosAy) is set to (0, 0), the text is drawn from the upper-left corner. When set to 0.5, the text is drawn from the center. When set to (1, 1), the text is drawn from the lower-right corner.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosAx")
        public Float posAx;

        /**
         * <p>The vertical anchor point of the text watermark. Valid values: 0 to 1. When (PosAx, PosAy) is set to (0, 0), the text is drawn from the upper-left corner. When set to 0.5, the text is drawn from the center. When set to (1, 1), the text is drawn from the lower-right corner.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosAy")
        public Float posAy;

        /**
         * <p>Takes effect when Mode is set to pos. Specifies the horizontal position of the text watermark in pixels, with the upper-left corner as the origin.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosX")
        public Long posX;

        /**
         * <p>Takes effect when Mode is set to pos. Specifies the vertical position of the text watermark in pixels, with the upper-left corner as the origin.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PosY")
        public Long posY;

        /**
         * <p>Takes effect when Mode is set to repeat. Specifies the horizontal spacing for tiled text watermarks.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SpaceX")
        public Long spaceX;

        /**
         * <p>Takes effect when Mode is set to repeat. Specifies the vertical spacing for tiled text watermarks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpaceY")
        public Long spaceY;

        /**
         * <p>The visibility. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: displayed.</p>
         * </li>
         * <li><p><strong>false</strong>: not displayed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Visible")
        public Boolean visible;

        /**
         * <p>The text watermark content. The format is a UTF-8 string.</p>
         * 
         * <strong>example:</strong>
         * <p>Watermark text</p>
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
         * <p>The logo watermark control parameters.</p>
         */
        @NameInMap("LogoVisibleControl")
        public CreateWmBaseImageRequestImageControlLogoVisibleControl logoVisibleControl;

        /**
         * <p>The text watermark control parameters for the image.</p>
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
