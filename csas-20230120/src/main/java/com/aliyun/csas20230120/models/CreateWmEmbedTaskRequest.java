// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmEmbedTaskRequest extends TeaModel {
    @NameInMap("CsvControl")
    public CreateWmEmbedTaskRequestCsvControl csvControl;

    @NameInMap("DocumentControl")
    public CreateWmEmbedTaskRequestDocumentControl documentControl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/abc****.pdf">https://example.com/abc****.pdf</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc****.pdf</p>
     */
    @NameInMap("Filename")
    public String filename;

    @NameInMap("ImageControl")
    public CreateWmEmbedTaskRequestImageControl imageControl;

    /**
     * <strong>example:</strong>
     * <p>95</p>
     */
    @NameInMap("ImageEmbedJpegQuality")
    public Long imageEmbedJpegQuality;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ImageEmbedLevel")
    public Long imageEmbedLevel;

    /**
     * <strong>example:</strong>
     * <p>3000k</p>
     */
    @NameInMap("VideoBitrate")
    public String videoBitrate;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("VideoIsLong")
    public Boolean videoIsLong;

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
     * <p>123***</p>
     */
    @NameInMap("WmInfoUint")
    public String wmInfoUint;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PureDocument</p>
     */
    @NameInMap("WmType")
    public String wmType;

    public static CreateWmEmbedTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWmEmbedTaskRequest self = new CreateWmEmbedTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateWmEmbedTaskRequest setCsvControl(CreateWmEmbedTaskRequestCsvControl csvControl) {
        this.csvControl = csvControl;
        return this;
    }
    public CreateWmEmbedTaskRequestCsvControl getCsvControl() {
        return this.csvControl;
    }

    public CreateWmEmbedTaskRequest setDocumentControl(CreateWmEmbedTaskRequestDocumentControl documentControl) {
        this.documentControl = documentControl;
        return this;
    }
    public CreateWmEmbedTaskRequestDocumentControl getDocumentControl() {
        return this.documentControl;
    }

    public CreateWmEmbedTaskRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreateWmEmbedTaskRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public CreateWmEmbedTaskRequest setImageControl(CreateWmEmbedTaskRequestImageControl imageControl) {
        this.imageControl = imageControl;
        return this;
    }
    public CreateWmEmbedTaskRequestImageControl getImageControl() {
        return this.imageControl;
    }

    public CreateWmEmbedTaskRequest setImageEmbedJpegQuality(Long imageEmbedJpegQuality) {
        this.imageEmbedJpegQuality = imageEmbedJpegQuality;
        return this;
    }
    public Long getImageEmbedJpegQuality() {
        return this.imageEmbedJpegQuality;
    }

    public CreateWmEmbedTaskRequest setImageEmbedLevel(Long imageEmbedLevel) {
        this.imageEmbedLevel = imageEmbedLevel;
        return this;
    }
    public Long getImageEmbedLevel() {
        return this.imageEmbedLevel;
    }

    public CreateWmEmbedTaskRequest setVideoBitrate(String videoBitrate) {
        this.videoBitrate = videoBitrate;
        return this;
    }
    public String getVideoBitrate() {
        return this.videoBitrate;
    }

    public CreateWmEmbedTaskRequest setVideoIsLong(Boolean videoIsLong) {
        this.videoIsLong = videoIsLong;
        return this;
    }
    public Boolean getVideoIsLong() {
        return this.videoIsLong;
    }

    public CreateWmEmbedTaskRequest setWmInfoBytesB64(String wmInfoBytesB64) {
        this.wmInfoBytesB64 = wmInfoBytesB64;
        return this;
    }
    public String getWmInfoBytesB64() {
        return this.wmInfoBytesB64;
    }

    public CreateWmEmbedTaskRequest setWmInfoSize(Long wmInfoSize) {
        this.wmInfoSize = wmInfoSize;
        return this;
    }
    public Long getWmInfoSize() {
        return this.wmInfoSize;
    }

    public CreateWmEmbedTaskRequest setWmInfoUint(String wmInfoUint) {
        this.wmInfoUint = wmInfoUint;
        return this;
    }
    public String getWmInfoUint() {
        return this.wmInfoUint;
    }

    public CreateWmEmbedTaskRequest setWmType(String wmType) {
        this.wmType = wmType;
        return this;
    }
    public String getWmType() {
        return this.wmType;
    }

    public static class CreateWmEmbedTaskRequestCsvControl extends TeaModel {
        @NameInMap("EmbedBitsNumberInEachTime")
        public Long embedBitsNumberInEachTime;

        @NameInMap("EmbedColumn")
        public Long embedColumn;

        @NameInMap("EmbedDensity")
        public String embedDensity;

        @NameInMap("EmbedPrecision")
        public Long embedPrecision;

        @NameInMap("EmbedTimePosition")
        public String embedTimePosition;

        @NameInMap("Method")
        public String method;

        @NameInMap("TimeFormat")
        public String timeFormat;

        public static CreateWmEmbedTaskRequestCsvControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestCsvControl self = new CreateWmEmbedTaskRequestCsvControl();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestCsvControl setEmbedBitsNumberInEachTime(Long embedBitsNumberInEachTime) {
            this.embedBitsNumberInEachTime = embedBitsNumberInEachTime;
            return this;
        }
        public Long getEmbedBitsNumberInEachTime() {
            return this.embedBitsNumberInEachTime;
        }

        public CreateWmEmbedTaskRequestCsvControl setEmbedColumn(Long embedColumn) {
            this.embedColumn = embedColumn;
            return this;
        }
        public Long getEmbedColumn() {
            return this.embedColumn;
        }

        public CreateWmEmbedTaskRequestCsvControl setEmbedDensity(String embedDensity) {
            this.embedDensity = embedDensity;
            return this;
        }
        public String getEmbedDensity() {
            return this.embedDensity;
        }

        public CreateWmEmbedTaskRequestCsvControl setEmbedPrecision(Long embedPrecision) {
            this.embedPrecision = embedPrecision;
            return this;
        }
        public Long getEmbedPrecision() {
            return this.embedPrecision;
        }

        public CreateWmEmbedTaskRequestCsvControl setEmbedTimePosition(String embedTimePosition) {
            this.embedTimePosition = embedTimePosition;
            return this;
        }
        public String getEmbedTimePosition() {
            return this.embedTimePosition;
        }

        public CreateWmEmbedTaskRequestCsvControl setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public CreateWmEmbedTaskRequestCsvControl setTimeFormat(String timeFormat) {
            this.timeFormat = timeFormat;
            return this;
        }
        public String getTimeFormat() {
            return this.timeFormat;
        }

    }

    public static class CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgInvisibleControl extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Opacity")
        public Long opacity;

        public static CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgInvisibleControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgInvisibleControl self = new CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgInvisibleControl();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgInvisibleControl setOpacity(Long opacity) {
            this.opacity = opacity;
            return this;
        }
        public Long getOpacity() {
            return this.opacity;
        }

    }

    public static class CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Angle")
        public Long angle;

        /**
         * <strong>example:</strong>
         * <p>0x000000</p>
         */
        @NameInMap("FontColor")
        public String fontColor;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("FontSize")
        public Long fontSize;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HorizontalNumber")
        public Long horizontalNumber;

        /**
         * <strong>example:</strong>
         * <p>pos</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Opacity")
        public Long opacity;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("PosX")
        public String posX;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("PosY")
        public String posY;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("VerticalNumber")
        public Long verticalNumber;

        /**
         * <strong>example:</strong>
         * <p>hello ****</p>
         */
        @NameInMap("VisibleText")
        public String visibleText;

        public static CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl self = new CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl setAngle(Long angle) {
            this.angle = angle;
            return this;
        }
        public Long getAngle() {
            return this.angle;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl setFontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public String getFontColor() {
            return this.fontColor;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl setFontSize(Long fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Long getFontSize() {
            return this.fontSize;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl setHorizontalNumber(Long horizontalNumber) {
            this.horizontalNumber = horizontalNumber;
            return this;
        }
        public Long getHorizontalNumber() {
            return this.horizontalNumber;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl setOpacity(Long opacity) {
            this.opacity = opacity;
            return this;
        }
        public Long getOpacity() {
            return this.opacity;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl setPosX(String posX) {
            this.posX = posX;
            return this;
        }
        public String getPosX() {
            return this.posX;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl setPosY(String posY) {
            this.posY = posY;
            return this;
        }
        public String getPosY() {
            return this.posY;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl setVerticalNumber(Long verticalNumber) {
            this.verticalNumber = verticalNumber;
            return this;
        }
        public Long getVerticalNumber() {
            return this.verticalNumber;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl setVisibleText(String visibleText) {
            this.visibleText = visibleText;
            return this;
        }
        public String getVisibleText() {
            return this.visibleText;
        }

    }

    public static class CreateWmEmbedTaskRequestDocumentControlBackgroundControl extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BgAddInvisible")
        public Boolean bgAddInvisible;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BgAddVisible")
        public Boolean bgAddVisible;

        @NameInMap("BgInvisibleControl")
        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgInvisibleControl bgInvisibleControl;

        @NameInMap("BgVisibleControl")
        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl bgVisibleControl;

        public static CreateWmEmbedTaskRequestDocumentControlBackgroundControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestDocumentControlBackgroundControl self = new CreateWmEmbedTaskRequestDocumentControlBackgroundControl();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControl setBgAddInvisible(Boolean bgAddInvisible) {
            this.bgAddInvisible = bgAddInvisible;
            return this;
        }
        public Boolean getBgAddInvisible() {
            return this.bgAddInvisible;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControl setBgAddVisible(Boolean bgAddVisible) {
            this.bgAddVisible = bgAddVisible;
            return this;
        }
        public Boolean getBgAddVisible() {
            return this.bgAddVisible;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControl setBgInvisibleControl(CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgInvisibleControl bgInvisibleControl) {
            this.bgInvisibleControl = bgInvisibleControl;
            return this;
        }
        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgInvisibleControl getBgInvisibleControl() {
            return this.bgInvisibleControl;
        }

        public CreateWmEmbedTaskRequestDocumentControlBackgroundControl setBgVisibleControl(CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl bgVisibleControl) {
            this.bgVisibleControl = bgVisibleControl;
            return this;
        }
        public CreateWmEmbedTaskRequestDocumentControlBackgroundControlBgVisibleControl getBgVisibleControl() {
            return this.bgVisibleControl;
        }

    }

    public static class CreateWmEmbedTaskRequestDocumentControl extends TeaModel {
        @NameInMap("BackgroundControl")
        public CreateWmEmbedTaskRequestDocumentControlBackgroundControl backgroundControl;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("InvisibleAntiAllCopy")
        public Boolean invisibleAntiAllCopy;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("InvisibleAntiTextCopy")
        public Boolean invisibleAntiTextCopy;

        public static CreateWmEmbedTaskRequestDocumentControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestDocumentControl self = new CreateWmEmbedTaskRequestDocumentControl();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestDocumentControl setBackgroundControl(CreateWmEmbedTaskRequestDocumentControlBackgroundControl backgroundControl) {
            this.backgroundControl = backgroundControl;
            return this;
        }
        public CreateWmEmbedTaskRequestDocumentControlBackgroundControl getBackgroundControl() {
            return this.backgroundControl;
        }

        public CreateWmEmbedTaskRequestDocumentControl setInvisibleAntiAllCopy(Boolean invisibleAntiAllCopy) {
            this.invisibleAntiAllCopy = invisibleAntiAllCopy;
            return this;
        }
        public Boolean getInvisibleAntiAllCopy() {
            return this.invisibleAntiAllCopy;
        }

        public CreateWmEmbedTaskRequestDocumentControl setInvisibleAntiTextCopy(Boolean invisibleAntiTextCopy) {
            this.invisibleAntiTextCopy = invisibleAntiTextCopy;
            return this;
        }
        public Boolean getInvisibleAntiTextCopy() {
            return this.invisibleAntiTextCopy;
        }

    }

    public static class CreateWmEmbedTaskRequestImageControlLogoVisibleControlMargin extends TeaModel {
        @NameInMap("Bottom")
        public Float bottom;

        @NameInMap("Left")
        public Float left;

        @NameInMap("Right")
        public Float right;

        @NameInMap("Top")
        public Float top;

        public static CreateWmEmbedTaskRequestImageControlLogoVisibleControlMargin build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestImageControlLogoVisibleControlMargin self = new CreateWmEmbedTaskRequestImageControlLogoVisibleControlMargin();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControlMargin setBottom(Float bottom) {
            this.bottom = bottom;
            return this;
        }
        public Float getBottom() {
            return this.bottom;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControlMargin setLeft(Float left) {
            this.left = left;
            return this;
        }
        public Float getLeft() {
            return this.left;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControlMargin setRight(Float right) {
            this.right = right;
            return this;
        }
        public Float getRight() {
            return this.right;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControlMargin setTop(Float top) {
            this.top = top;
            return this;
        }
        public Float getTop() {
            return this.top;
        }

    }

    public static class CreateWmEmbedTaskRequestImageControlLogoVisibleControl extends TeaModel {
        @NameInMap("Angle")
        public Long angle;

        @NameInMap("LogoBase64")
        public String logoBase64;

        @NameInMap("Margin")
        public CreateWmEmbedTaskRequestImageControlLogoVisibleControlMargin margin;

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

        public static CreateWmEmbedTaskRequestImageControlLogoVisibleControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestImageControlLogoVisibleControl self = new CreateWmEmbedTaskRequestImageControlLogoVisibleControl();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setAngle(Long angle) {
            this.angle = angle;
            return this;
        }
        public Long getAngle() {
            return this.angle;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setLogoBase64(String logoBase64) {
            this.logoBase64 = logoBase64;
            return this;
        }
        public String getLogoBase64() {
            return this.logoBase64;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setMargin(CreateWmEmbedTaskRequestImageControlLogoVisibleControlMargin margin) {
            this.margin = margin;
            return this;
        }
        public CreateWmEmbedTaskRequestImageControlLogoVisibleControlMargin getMargin() {
            return this.margin;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setOpacity(Integer opacity) {
            this.opacity = opacity;
            return this;
        }
        public Integer getOpacity() {
            return this.opacity;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setPosAx(Float posAx) {
            this.posAx = posAx;
            return this;
        }
        public Float getPosAx() {
            return this.posAx;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setPosAy(Float posAy) {
            this.posAy = posAy;
            return this;
        }
        public Float getPosAy() {
            return this.posAy;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setPosX(Long posX) {
            this.posX = posX;
            return this;
        }
        public Long getPosX() {
            return this.posX;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setPosY(Long posY) {
            this.posY = posY;
            return this;
        }
        public Long getPosY() {
            return this.posY;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setSpaceX(Long spaceX) {
            this.spaceX = spaceX;
            return this;
        }
        public Long getSpaceX() {
            return this.spaceX;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setSpaceY(Long spaceY) {
            this.spaceY = spaceY;
            return this;
        }
        public Long getSpaceY() {
            return this.spaceY;
        }

        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl setVisible(Boolean visible) {
            this.visible = visible;
            return this;
        }
        public Boolean getVisible() {
            return this.visible;
        }

    }

    public static class CreateWmEmbedTaskRequestImageControlMetadataControl extends TeaModel {
        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("XmpKvBase64")
        public String xmpKvBase64;

        public static CreateWmEmbedTaskRequestImageControlMetadataControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestImageControlMetadataControl self = new CreateWmEmbedTaskRequestImageControlMetadataControl();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestImageControlMetadataControl setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateWmEmbedTaskRequestImageControlMetadataControl setXmpKvBase64(String xmpKvBase64) {
            this.xmpKvBase64 = xmpKvBase64;
            return this;
        }
        public String getXmpKvBase64() {
            return this.xmpKvBase64;
        }

    }

    public static class CreateWmEmbedTaskRequestImageControlTextVisibleControlMargin extends TeaModel {
        @NameInMap("Bottom")
        public Float bottom;

        @NameInMap("Left")
        public Float left;

        @NameInMap("Right")
        public Float right;

        @NameInMap("Top")
        public Float top;

        public static CreateWmEmbedTaskRequestImageControlTextVisibleControlMargin build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestImageControlTextVisibleControlMargin self = new CreateWmEmbedTaskRequestImageControlTextVisibleControlMargin();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControlMargin setBottom(Float bottom) {
            this.bottom = bottom;
            return this;
        }
        public Float getBottom() {
            return this.bottom;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControlMargin setLeft(Float left) {
            this.left = left;
            return this;
        }
        public Float getLeft() {
            return this.left;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControlMargin setRight(Float right) {
            this.right = right;
            return this;
        }
        public Float getRight() {
            return this.right;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControlMargin setTop(Float top) {
            this.top = top;
            return this;
        }
        public Float getTop() {
            return this.top;
        }

    }

    public static class CreateWmEmbedTaskRequestImageControlTextVisibleControl extends TeaModel {
        @NameInMap("Angle")
        public Long angle;

        @NameInMap("FontColor")
        public String fontColor;

        @NameInMap("FontSize")
        public Long fontSize;

        @NameInMap("Margin")
        public CreateWmEmbedTaskRequestImageControlTextVisibleControlMargin margin;

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

        public static CreateWmEmbedTaskRequestImageControlTextVisibleControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestImageControlTextVisibleControl self = new CreateWmEmbedTaskRequestImageControlTextVisibleControl();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setAngle(Long angle) {
            this.angle = angle;
            return this;
        }
        public Long getAngle() {
            return this.angle;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setFontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public String getFontColor() {
            return this.fontColor;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setFontSize(Long fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Long getFontSize() {
            return this.fontSize;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setMargin(CreateWmEmbedTaskRequestImageControlTextVisibleControlMargin margin) {
            this.margin = margin;
            return this;
        }
        public CreateWmEmbedTaskRequestImageControlTextVisibleControlMargin getMargin() {
            return this.margin;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setOpacity(Integer opacity) {
            this.opacity = opacity;
            return this;
        }
        public Integer getOpacity() {
            return this.opacity;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setPosAx(Float posAx) {
            this.posAx = posAx;
            return this;
        }
        public Float getPosAx() {
            return this.posAx;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setPosAy(Float posAy) {
            this.posAy = posAy;
            return this;
        }
        public Float getPosAy() {
            return this.posAy;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setPosX(Long posX) {
            this.posX = posX;
            return this;
        }
        public Long getPosX() {
            return this.posX;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setPosY(Long posY) {
            this.posY = posY;
            return this;
        }
        public Long getPosY() {
            return this.posY;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setSpaceX(Long spaceX) {
            this.spaceX = spaceX;
            return this;
        }
        public Long getSpaceX() {
            return this.spaceX;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setSpaceY(Long spaceY) {
            this.spaceY = spaceY;
            return this;
        }
        public Long getSpaceY() {
            return this.spaceY;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setVisible(Boolean visible) {
            this.visible = visible;
            return this;
        }
        public Boolean getVisible() {
            return this.visible;
        }

        public CreateWmEmbedTaskRequestImageControlTextVisibleControl setVisibleText(String visibleText) {
            this.visibleText = visibleText;
            return this;
        }
        public String getVisibleText() {
            return this.visibleText;
        }

    }

    public static class CreateWmEmbedTaskRequestImageControl extends TeaModel {
        @NameInMap("LogoVisibleControl")
        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl logoVisibleControl;

        @NameInMap("MetadataControl")
        public CreateWmEmbedTaskRequestImageControlMetadataControl metadataControl;

        @NameInMap("TextVisibleControl")
        public CreateWmEmbedTaskRequestImageControlTextVisibleControl textVisibleControl;

        public static CreateWmEmbedTaskRequestImageControl build(java.util.Map<String, ?> map) throws Exception {
            CreateWmEmbedTaskRequestImageControl self = new CreateWmEmbedTaskRequestImageControl();
            return TeaModel.build(map, self);
        }

        public CreateWmEmbedTaskRequestImageControl setLogoVisibleControl(CreateWmEmbedTaskRequestImageControlLogoVisibleControl logoVisibleControl) {
            this.logoVisibleControl = logoVisibleControl;
            return this;
        }
        public CreateWmEmbedTaskRequestImageControlLogoVisibleControl getLogoVisibleControl() {
            return this.logoVisibleControl;
        }

        public CreateWmEmbedTaskRequestImageControl setMetadataControl(CreateWmEmbedTaskRequestImageControlMetadataControl metadataControl) {
            this.metadataControl = metadataControl;
            return this;
        }
        public CreateWmEmbedTaskRequestImageControlMetadataControl getMetadataControl() {
            return this.metadataControl;
        }

        public CreateWmEmbedTaskRequestImageControl setTextVisibleControl(CreateWmEmbedTaskRequestImageControlTextVisibleControl textVisibleControl) {
            this.textVisibleControl = textVisibleControl;
            return this;
        }
        public CreateWmEmbedTaskRequestImageControlTextVisibleControl getTextVisibleControl() {
            return this.textVisibleControl;
        }

    }

}
