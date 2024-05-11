// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class InputFile extends TeaModel {
    @NameInMap("Addresses")
    public java.util.List<Address> addresses;

    @NameInMap("Album")
    public String album;

    @NameInMap("AlbumArtist")
    public String albumArtist;

    @NameInMap("Artist")
    public String artist;

    @NameInMap("Composer")
    public String composer;

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

    @NameInMap("Labels")
    public java.util.List<Label> labels;

    @NameInMap("LatLong")
    public String latLong;

    @NameInMap("MediaType")
    public String mediaType;

    @NameInMap("OSSURI")
    public String OSSURI;

    @NameInMap("Performer")
    public String performer;

    @NameInMap("ProduceTime")
    public String produceTime;

    @NameInMap("Title")
    public String title;

    @NameInMap("URI")
    public String URI;

    public static InputFile build(java.util.Map<String, ?> map) throws Exception {
        InputFile self = new InputFile();
        return TeaModel.build(map, self);
    }

    public InputFile setAddresses(java.util.List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }
    public java.util.List<Address> getAddresses() {
        return this.addresses;
    }

    public InputFile setAlbum(String album) {
        this.album = album;
        return this;
    }
    public String getAlbum() {
        return this.album;
    }

    public InputFile setAlbumArtist(String albumArtist) {
        this.albumArtist = albumArtist;
        return this;
    }
    public String getAlbumArtist() {
        return this.albumArtist;
    }

    public InputFile setArtist(String artist) {
        this.artist = artist;
        return this;
    }
    public String getArtist() {
        return this.artist;
    }

    public InputFile setComposer(String composer) {
        this.composer = composer;
        return this;
    }
    public String getComposer() {
        return this.composer;
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

    public InputFile setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
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

    public InputFile setPerformer(String performer) {
        this.performer = performer;
        return this;
    }
    public String getPerformer() {
        return this.performer;
    }

    public InputFile setProduceTime(String produceTime) {
        this.produceTime = produceTime;
        return this;
    }
    public String getProduceTime() {
        return this.produceTime;
    }

    public InputFile setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
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
