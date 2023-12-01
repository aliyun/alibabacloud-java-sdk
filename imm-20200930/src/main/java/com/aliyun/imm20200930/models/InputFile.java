// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class InputFile extends TeaModel {
    @NameInMap("ContentType")
    public String contentType;

    @NameInMap("CustomId")
    public String customId;

    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    @NameInMap("Figures")
    public java.util.List<InputFileFigures> figures;

    @NameInMap("FileHash")
    public String fileHash;

    @NameInMap("LatLong")
    public String latLong;

    @NameInMap("MediaType")
    public String mediaType;

    @NameInMap("OSSURI")
    public String OSSURI;

    @NameInMap("ProduceTime")
    public String produceTime;

    @NameInMap("URI")
    public String URI;

    public static InputFile build(java.util.Map<String, ?> map) throws Exception {
        InputFile self = new InputFile();
        return TeaModel.build(map, self);
    }

    public InputFile setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public InputFile setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public InputFile setCustomLabels(java.util.Map<String, ?> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
    }

    public InputFile setFigures(java.util.List<InputFileFigures> figures) {
        this.figures = figures;
        return this;
    }
    public java.util.List<InputFileFigures> getFigures() {
        return this.figures;
    }

    public InputFile setFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }
    public String getFileHash() {
        return this.fileHash;
    }

    public InputFile setLatLong(String latLong) {
        this.latLong = latLong;
        return this;
    }
    public String getLatLong() {
        return this.latLong;
    }

    public InputFile setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public InputFile setOSSURI(String OSSURI) {
        this.OSSURI = OSSURI;
        return this;
    }
    public String getOSSURI() {
        return this.OSSURI;
    }

    public InputFile setProduceTime(String produceTime) {
        this.produceTime = produceTime;
        return this;
    }
    public String getProduceTime() {
        return this.produceTime;
    }

    public InputFile setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

    public static class InputFileFigures extends TeaModel {
        @NameInMap("FigureClusterId")
        public String figureClusterId;

        @NameInMap("FigureId")
        public String figureId;

        @NameInMap("FigureType")
        public String figureType;

        public static InputFileFigures build(java.util.Map<String, ?> map) throws Exception {
            InputFileFigures self = new InputFileFigures();
            return TeaModel.build(map, self);
        }

        public InputFileFigures setFigureClusterId(String figureClusterId) {
            this.figureClusterId = figureClusterId;
            return this;
        }
        public String getFigureClusterId() {
            return this.figureClusterId;
        }

        public InputFileFigures setFigureId(String figureId) {
            this.figureId = figureId;
            return this;
        }
        public String getFigureId() {
            return this.figureId;
        }

        public InputFileFigures setFigureType(String figureType) {
            this.figureType = figureType;
            return this;
        }
        public String getFigureType() {
            return this.figureType;
        }

    }

}
