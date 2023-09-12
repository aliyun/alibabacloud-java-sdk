// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class File extends TeaModel {
    @NameInMap("AccessControlAllowOrigin")
    public String accessControlAllowOrigin;

    @NameInMap("AccessControlRequestMethod")
    public String accessControlRequestMethod;

    @NameInMap("Addresses")
    public java.util.List<Address> addresses;

    @NameInMap("Album")
    public String album;

    @NameInMap("AlbumArtist")
    public String albumArtist;

    @NameInMap("Artist")
    public String artist;

    @NameInMap("AudioCovers")
    public java.util.List<Image> audioCovers;

    @NameInMap("AudioStreams")
    public java.util.List<AudioStream> audioStreams;

    @NameInMap("Bitrate")
    public Long bitrate;

    @NameInMap("CacheControl")
    public String cacheControl;

    @NameInMap("Composer")
    public String composer;

    @NameInMap("ContentDisposition")
    public String contentDisposition;

    @NameInMap("ContentEncoding")
    public String contentEncoding;

    @NameInMap("ContentLanguage")
    public String contentLanguage;

    @NameInMap("ContentMd5")
    public String contentMd5;

    @NameInMap("ContentType")
    public String contentType;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CroppingSuggestions")
    public java.util.List<CroppingSuggestion> croppingSuggestions;

    @NameInMap("CustomId")
    public String customId;

    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("Duration")
    public Double duration;

    @NameInMap("ETag")
    public String ETag;

    @NameInMap("EXIF")
    public String EXIF;

    @NameInMap("FigureCount")
    public Long figureCount;

    @NameInMap("Figures")
    public java.util.List<Figure> figures;

    @NameInMap("FileAccessTime")
    public String fileAccessTime;

    @NameInMap("FileCreateTime")
    public String fileCreateTime;

    @NameInMap("FileHash")
    public String fileHash;

    @NameInMap("FileModifiedTime")
    public String fileModifiedTime;

    @NameInMap("Filename")
    public String filename;

    @NameInMap("FormatLongName")
    public String formatLongName;

    @NameInMap("FormatName")
    public String formatName;

    @NameInMap("ImageHeight")
    public Long imageHeight;

    @NameInMap("ImageScore")
    public ImageScore imageScore;

    @NameInMap("ImageWidth")
    public Long imageWidth;

    @NameInMap("Labels")
    public java.util.List<Label> labels;

    @NameInMap("Language")
    public String language;

    @NameInMap("LatLong")
    public String latLong;

    @NameInMap("MediaType")
    public String mediaType;

    @NameInMap("OCRContents")
    public java.util.List<OCRContents> OCRContents;

    @NameInMap("OSSCRC64")
    public String OSSCRC64;

    @NameInMap("OSSDeleteMarker")
    public String OSSDeleteMarker;

    @NameInMap("OSSExpiration")
    public String OSSExpiration;

    @NameInMap("OSSObjectType")
    public String OSSObjectType;

    @NameInMap("OSSStorageClass")
    public String OSSStorageClass;

    @NameInMap("OSSTagging")
    public java.util.Map<String, ?> OSSTagging;

    @NameInMap("OSSTaggingCount")
    public Long OSSTaggingCount;

    @NameInMap("OSSURI")
    public String OSSURI;

    @NameInMap("OSSUserMeta")
    public java.util.Map<String, ?> OSSUserMeta;

    @NameInMap("OSSVersionId")
    public String OSSVersionId;

    @NameInMap("ObjectACL")
    public String objectACL;

    @NameInMap("ObjectId")
    public String objectId;

    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("Orientation")
    public Long orientation;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("PageCount")
    public Long pageCount;

    @NameInMap("Performer")
    public String performer;

    @NameInMap("ProduceTime")
    public String produceTime;

    @NameInMap("ProgramCount")
    public Long programCount;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("ServerSideDataEncryption")
    public String serverSideDataEncryption;

    @NameInMap("ServerSideEncryption")
    public String serverSideEncryption;

    @NameInMap("ServerSideEncryptionCustomerAlgorithm")
    public String serverSideEncryptionCustomerAlgorithm;

    @NameInMap("ServerSideEncryptionKeyId")
    public String serverSideEncryptionKeyId;

    @NameInMap("Size")
    public Long size;

    @NameInMap("StartTime")
    public Double startTime;

    @NameInMap("StreamCount")
    public Long streamCount;

    @NameInMap("Subtitles")
    public java.util.List<SubtitleStream> subtitles;

    @NameInMap("Timezone")
    public String timezone;

    @NameInMap("Title")
    public String title;

    @NameInMap("TravelClusterId")
    public String travelClusterId;

    @NameInMap("URI")
    public String URI;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("VideoHeight")
    public Long videoHeight;

    @NameInMap("VideoStreams")
    public java.util.List<VideoStream> videoStreams;

    @NameInMap("VideoWidth")
    public Long videoWidth;

    public static File build(java.util.Map<String, ?> map) throws Exception {
        File self = new File();
        return TeaModel.build(map, self);
    }

    public File setAccessControlAllowOrigin(String accessControlAllowOrigin) {
        this.accessControlAllowOrigin = accessControlAllowOrigin;
        return this;
    }
    public String getAccessControlAllowOrigin() {
        return this.accessControlAllowOrigin;
    }

    public File setAccessControlRequestMethod(String accessControlRequestMethod) {
        this.accessControlRequestMethod = accessControlRequestMethod;
        return this;
    }
    public String getAccessControlRequestMethod() {
        return this.accessControlRequestMethod;
    }

    public File setAddresses(java.util.List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }
    public java.util.List<Address> getAddresses() {
        return this.addresses;
    }

    public File setAlbum(String album) {
        this.album = album;
        return this;
    }
    public String getAlbum() {
        return this.album;
    }

    public File setAlbumArtist(String albumArtist) {
        this.albumArtist = albumArtist;
        return this;
    }
    public String getAlbumArtist() {
        return this.albumArtist;
    }

    public File setArtist(String artist) {
        this.artist = artist;
        return this;
    }
    public String getArtist() {
        return this.artist;
    }

    public File setAudioCovers(java.util.List<Image> audioCovers) {
        this.audioCovers = audioCovers;
        return this;
    }
    public java.util.List<Image> getAudioCovers() {
        return this.audioCovers;
    }

    public File setAudioStreams(java.util.List<AudioStream> audioStreams) {
        this.audioStreams = audioStreams;
        return this;
    }
    public java.util.List<AudioStream> getAudioStreams() {
        return this.audioStreams;
    }

    public File setBitrate(Long bitrate) {
        this.bitrate = bitrate;
        return this;
    }
    public Long getBitrate() {
        return this.bitrate;
    }

    public File setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }
    public String getCacheControl() {
        return this.cacheControl;
    }

    public File setComposer(String composer) {
        this.composer = composer;
        return this;
    }
    public String getComposer() {
        return this.composer;
    }

    public File setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }
    public String getContentDisposition() {
        return this.contentDisposition;
    }

    public File setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public File setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }
    public String getContentLanguage() {
        return this.contentLanguage;
    }

    public File setContentMd5(String contentMd5) {
        this.contentMd5 = contentMd5;
        return this;
    }
    public String getContentMd5() {
        return this.contentMd5;
    }

    public File setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public File setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public File setCroppingSuggestions(java.util.List<CroppingSuggestion> croppingSuggestions) {
        this.croppingSuggestions = croppingSuggestions;
        return this;
    }
    public java.util.List<CroppingSuggestion> getCroppingSuggestions() {
        return this.croppingSuggestions;
    }

    public File setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public File setCustomLabels(java.util.Map<String, ?> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.Map<String, ?> getCustomLabels() {
        return this.customLabels;
    }

    public File setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public File setDuration(Double duration) {
        this.duration = duration;
        return this;
    }
    public Double getDuration() {
        return this.duration;
    }

    public File setETag(String ETag) {
        this.ETag = ETag;
        return this;
    }
    public String getETag() {
        return this.ETag;
    }

    public File setEXIF(String EXIF) {
        this.EXIF = EXIF;
        return this;
    }
    public String getEXIF() {
        return this.EXIF;
    }

    public File setFigureCount(Long figureCount) {
        this.figureCount = figureCount;
        return this;
    }
    public Long getFigureCount() {
        return this.figureCount;
    }

    public File setFigures(java.util.List<Figure> figures) {
        this.figures = figures;
        return this;
    }
    public java.util.List<Figure> getFigures() {
        return this.figures;
    }

    public File setFileAccessTime(String fileAccessTime) {
        this.fileAccessTime = fileAccessTime;
        return this;
    }
    public String getFileAccessTime() {
        return this.fileAccessTime;
    }

    public File setFileCreateTime(String fileCreateTime) {
        this.fileCreateTime = fileCreateTime;
        return this;
    }
    public String getFileCreateTime() {
        return this.fileCreateTime;
    }

    public File setFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }
    public String getFileHash() {
        return this.fileHash;
    }

    public File setFileModifiedTime(String fileModifiedTime) {
        this.fileModifiedTime = fileModifiedTime;
        return this;
    }
    public String getFileModifiedTime() {
        return this.fileModifiedTime;
    }

    public File setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public File setFormatLongName(String formatLongName) {
        this.formatLongName = formatLongName;
        return this;
    }
    public String getFormatLongName() {
        return this.formatLongName;
    }

    public File setFormatName(String formatName) {
        this.formatName = formatName;
        return this;
    }
    public String getFormatName() {
        return this.formatName;
    }

    public File setImageHeight(Long imageHeight) {
        this.imageHeight = imageHeight;
        return this;
    }
    public Long getImageHeight() {
        return this.imageHeight;
    }

    public File setImageScore(ImageScore imageScore) {
        this.imageScore = imageScore;
        return this;
    }
    public ImageScore getImageScore() {
        return this.imageScore;
    }

    public File setImageWidth(Long imageWidth) {
        this.imageWidth = imageWidth;
        return this;
    }
    public Long getImageWidth() {
        return this.imageWidth;
    }

    public File setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public File setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public File setLatLong(String latLong) {
        this.latLong = latLong;
        return this;
    }
    public String getLatLong() {
        return this.latLong;
    }

    public File setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public File setOCRContents(java.util.List<OCRContents> OCRContents) {
        this.OCRContents = OCRContents;
        return this;
    }
    public java.util.List<OCRContents> getOCRContents() {
        return this.OCRContents;
    }

    public File setOSSCRC64(String OSSCRC64) {
        this.OSSCRC64 = OSSCRC64;
        return this;
    }
    public String getOSSCRC64() {
        return this.OSSCRC64;
    }

    public File setOSSDeleteMarker(String OSSDeleteMarker) {
        this.OSSDeleteMarker = OSSDeleteMarker;
        return this;
    }
    public String getOSSDeleteMarker() {
        return this.OSSDeleteMarker;
    }

    public File setOSSExpiration(String OSSExpiration) {
        this.OSSExpiration = OSSExpiration;
        return this;
    }
    public String getOSSExpiration() {
        return this.OSSExpiration;
    }

    public File setOSSObjectType(String OSSObjectType) {
        this.OSSObjectType = OSSObjectType;
        return this;
    }
    public String getOSSObjectType() {
        return this.OSSObjectType;
    }

    public File setOSSStorageClass(String OSSStorageClass) {
        this.OSSStorageClass = OSSStorageClass;
        return this;
    }
    public String getOSSStorageClass() {
        return this.OSSStorageClass;
    }

    public File setOSSTagging(java.util.Map<String, ?> OSSTagging) {
        this.OSSTagging = OSSTagging;
        return this;
    }
    public java.util.Map<String, ?> getOSSTagging() {
        return this.OSSTagging;
    }

    public File setOSSTaggingCount(Long OSSTaggingCount) {
        this.OSSTaggingCount = OSSTaggingCount;
        return this;
    }
    public Long getOSSTaggingCount() {
        return this.OSSTaggingCount;
    }

    public File setOSSURI(String OSSURI) {
        this.OSSURI = OSSURI;
        return this;
    }
    public String getOSSURI() {
        return this.OSSURI;
    }

    public File setOSSUserMeta(java.util.Map<String, ?> OSSUserMeta) {
        this.OSSUserMeta = OSSUserMeta;
        return this;
    }
    public java.util.Map<String, ?> getOSSUserMeta() {
        return this.OSSUserMeta;
    }

    public File setOSSVersionId(String OSSVersionId) {
        this.OSSVersionId = OSSVersionId;
        return this;
    }
    public String getOSSVersionId() {
        return this.OSSVersionId;
    }

    public File setObjectACL(String objectACL) {
        this.objectACL = objectACL;
        return this;
    }
    public String getObjectACL() {
        return this.objectACL;
    }

    public File setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public File setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public File setOrientation(Long orientation) {
        this.orientation = orientation;
        return this;
    }
    public Long getOrientation() {
        return this.orientation;
    }

    public File setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public File setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public File setPerformer(String performer) {
        this.performer = performer;
        return this;
    }
    public String getPerformer() {
        return this.performer;
    }

    public File setProduceTime(String produceTime) {
        this.produceTime = produceTime;
        return this;
    }
    public String getProduceTime() {
        return this.produceTime;
    }

    public File setProgramCount(Long programCount) {
        this.programCount = programCount;
        return this;
    }
    public Long getProgramCount() {
        return this.programCount;
    }

    public File setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public File setServerSideDataEncryption(String serverSideDataEncryption) {
        this.serverSideDataEncryption = serverSideDataEncryption;
        return this;
    }
    public String getServerSideDataEncryption() {
        return this.serverSideDataEncryption;
    }

    public File setServerSideEncryption(String serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption;
        return this;
    }
    public String getServerSideEncryption() {
        return this.serverSideEncryption;
    }

    public File setServerSideEncryptionCustomerAlgorithm(String serverSideEncryptionCustomerAlgorithm) {
        this.serverSideEncryptionCustomerAlgorithm = serverSideEncryptionCustomerAlgorithm;
        return this;
    }
    public String getServerSideEncryptionCustomerAlgorithm() {
        return this.serverSideEncryptionCustomerAlgorithm;
    }

    public File setServerSideEncryptionKeyId(String serverSideEncryptionKeyId) {
        this.serverSideEncryptionKeyId = serverSideEncryptionKeyId;
        return this;
    }
    public String getServerSideEncryptionKeyId() {
        return this.serverSideEncryptionKeyId;
    }

    public File setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public File setStartTime(Double startTime) {
        this.startTime = startTime;
        return this;
    }
    public Double getStartTime() {
        return this.startTime;
    }

    public File setStreamCount(Long streamCount) {
        this.streamCount = streamCount;
        return this;
    }
    public Long getStreamCount() {
        return this.streamCount;
    }

    public File setSubtitles(java.util.List<SubtitleStream> subtitles) {
        this.subtitles = subtitles;
        return this;
    }
    public java.util.List<SubtitleStream> getSubtitles() {
        return this.subtitles;
    }

    public File setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public File setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public File setTravelClusterId(String travelClusterId) {
        this.travelClusterId = travelClusterId;
        return this;
    }
    public String getTravelClusterId() {
        return this.travelClusterId;
    }

    public File setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

    public File setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public File setVideoHeight(Long videoHeight) {
        this.videoHeight = videoHeight;
        return this;
    }
    public Long getVideoHeight() {
        return this.videoHeight;
    }

    public File setVideoStreams(java.util.List<VideoStream> videoStreams) {
        this.videoStreams = videoStreams;
        return this;
    }
    public java.util.List<VideoStream> getVideoStreams() {
        return this.videoStreams;
    }

    public File setVideoWidth(Long videoWidth) {
        this.videoWidth = videoWidth;
        return this;
    }
    public Long getVideoWidth() {
        return this.videoWidth;
    }

}
