// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class InputFile extends TeaModel {
    /**
     * <p>The addresses.</p>
     */
    @NameInMap("Addresses")
    public java.util.List<Address> addresses;

    /**
     * <p>The album.</p>
     * 
     * <strong>example:</strong>
     * <p>FirstAlbum</p>
     */
    @NameInMap("Album")
    public String album;

    /**
     * <p>The album artist.</p>
     * 
     * <strong>example:</strong>
     * <p>Jane</p>
     */
    @NameInMap("AlbumArtist")
    public String albumArtist;

    /**
     * <p>The artist.</p>
     * 
     * <strong>example:</strong>
     * <p>Jane</p>
     */
    @NameInMap("Artist")
    public String artist;

    /**
     * <p>The composer.</p>
     * 
     * <strong>example:</strong>
     * <p>Jane</p>
     */
    @NameInMap("Composer")
    public String composer;

    /**
     * <p>In most cases, you can leave this parameter empty. The Multipurpose Internet Mail Extensions (MIME) type of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>image/jpeg</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The custom ID of the file. This parameter is optional. When the metadata of the file is indexed into the dataset, the custom ID is stored as the data attribute. You can map the custom ID to other data in your business system. You can configure this parameter based on your business requirements. For example, you can associate a URI with an ID in your business system. We recommend that you set this parameter to a unique value.</p>
     * <p>This parameter supports prefix searches and sorting during queries. For more information, see <a href="https://help.aliyun.com/document_detail/252856.html">Supported fields and operators</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>member-image-id-0001</p>
     */
    @NameInMap("CustomId")
    public String customId;

    /**
     * <p>The custom labels of the file. This parameter is optional. The parameter stores custom key-value labels, which can be used to filter data. For more information, see <a href="https://help.aliyun.com/document_detail/252856.html">Supported fields and operators</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;MemberName&quot;: &quot;Tim&quot;,
     *       &quot;Enabled&quot;: &quot;True&quot;,
     *       &quot;ItemCount&quot;: &quot;10&quot;
     * }</p>
     */
    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    /**
     * <p>This parameter is optional. The persons. This parameter is used to remove a face from a face group or modify a face group. For more information, see <a href="https://help.aliyun.com/document_detail/477175.html">Face clustering</a>.</p>
     * <blockquote>
     * <p> This parameter takes effect only for the UpdateFileMeta or BatchUpdateFileMeta operation.</p>
     * </blockquote>
     */
    @NameInMap("Figures")
    public java.util.List<InputFileFigures> figures;

    /**
     * <p>The file hash. In most cases, you can leave this parameter empty. This parameter is required only when the URI parameter specifies a file in Photo and Drive Service.</p>
     * 
     * <strong>example:</strong>
     * <p>1d9c280a7c4f67f7ef873e28449dbe17</p>
     */
    @NameInMap("FileHash")
    public String fileHash;

    /**
     * <p>The intelligent labels.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The GPS latitude and longitude information.</p>
     * 
     * <strong>example:</strong>
     * <p>30.134390,120.074997</p>
     */
    @NameInMap("LatLong")
    public String latLong;

    /**
     * <p>In most cases, you can leave this parameter empty. The media type of the file.</p>
     * <p>Enumerated values:</p>
     * <ul>
     * <li>image</li>
     * <li>other</li>
     * <li>document</li>
     * <li>archive</li>
     * <li>video</li>
     * <li>audio</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>The path of the OSS object. In most cases, you can leave this parameter empty. You can specify this parameter only if the URI parameter specifies a file in Photo and Drive Service.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object.jpg</p>
     */
    @NameInMap("OSSURI")
    public String OSSURI;

    /**
     * <p>The performer.</p>
     * 
     * <strong>example:</strong>
     * <p>Jane</p>
     */
    @NameInMap("Performer")
    public String performer;

    /**
     * <p>The time when the image was taken.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-29T14:50:13.011643661+08:00</p>
     */
    @NameInMap("ProduceTime")
    public String produceTime;

    /**
     * <p>The file title.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The URI of the file for which you want to create or update an index in the request. This parameter is required. The URI can represent an object in Object Storage Service (OSS) or a file in Photo and Drive Service.</p>
     * <p>The OSS URI must be in the oss://${Bucket}/${Object} format. <code>${Bucket}</code> specifies the name of the OSS bucket that is in the same region as the current project. <code>${Object}</code> specifies the full file path that contains the object name extension.</p>
     * <p>The URI of a file in Photo and Drive Service must be in the <code>pds://domains/${domain}/drives/${drive}/files/${file}/revisions/${revision}</code> format.</p>
     * <blockquote>
     * <p> URIs that start with HTTP are not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss://examplebucket/sampleobject.jpg</p>
     */
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
        /**
         * <p>The ID of the face cluster. The following IDs of special face clusters are reserved:</p>
         * <ul>
         * <li>figure-cluster-id-independent: indicates that the face does not belong to any face cluster. The face may be added to a face cluster in subsequent face clustering tasks after new images are added to the dataset.</li>
         * <li>figure-cluster-id-unavailable: indicates that the face has not been included in a face clustering task since a new image was added to the dataset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Cluster-dbe72fec-b84c-4ab6-885b-3678e64****</p>
         */
        @NameInMap("FigureClusterId")
        public String figureClusterId;

        /**
         * <p>The person ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2cb3c51e-b406-4b0c-af1b-897d88e1****</p>
         */
        @NameInMap("FigureId")
        public String figureId;

        /**
         * <p>The figure type. Set this parameter to <code>face</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>face</p>
         */
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
