// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmEmbedTaskRequest extends TeaModel {
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

}
