// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class FileForReq extends TeaModel {
    // ContentType
    @NameInMap("ContentType")
    public String contentType;

    // CustomId
    @NameInMap("CustomId")
    public String customId;

    // CustomLabels
    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    // Figures
    @NameInMap("Figures")
    public java.util.List<FileForReqFigures> figures;

    // FileHash
    @NameInMap("FileHash")
    public String fileHash;

    // MediaType
    @NameInMap("MediaType")
    public String mediaType;

    // OSSURI
    @NameInMap("OSSURI")
    public String OSSURI;

    // URI
    @NameInMap("URI")
    public String URI;

    public static FileForReq build(java.util.Map<String, ?> map) throws Exception {
        FileForReq self = new FileForReq();
        return TeaModel.build(map, self);
    }

    public FileForReq setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public FileForReq setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public FileForReq setCustomLabels(java.util.Map<String, ?> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
    }

    public FileForReq setFigures(java.util.List<FileForReqFigures> figures) {
        this.figures = figures;
        return this;
    }
    public java.util.List<FileForReqFigures> getFigures() {
        return this.figures;
    }

    public FileForReq setFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }
    public String getFileHash() {
        return this.fileHash;
    }

    public FileForReq setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public FileForReq setOSSURI(String OSSURI) {
        this.OSSURI = OSSURI;
        return this;
    }
    public String getOSSURI() {
        return this.OSSURI;
    }

    public FileForReq setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

    public static class FileForReqFigures extends TeaModel {
        // FigureClusterId
        @NameInMap("FigureClusterId")
        public String figureClusterId;

        // FigureId
        @NameInMap("FigureId")
        public String figureId;

        // FigureType
        @NameInMap("FigureType")
        public String figureType;

        public static FileForReqFigures build(java.util.Map<String, ?> map) throws Exception {
            FileForReqFigures self = new FileForReqFigures();
            return TeaModel.build(map, self);
        }

        public FileForReqFigures setFigureClusterId(String figureClusterId) {
            this.figureClusterId = figureClusterId;
            return this;
        }
        public String getFigureClusterId() {
            return this.figureClusterId;
        }

        public FileForReqFigures setFigureId(String figureId) {
            this.figureId = figureId;
            return this;
        }
        public String getFigureId() {
            return this.figureId;
        }

        public FileForReqFigures setFigureType(String figureType) {
            this.figureType = figureType;
            return this;
        }
        public String getFigureType() {
            return this.figureType;
        }

    }

}
