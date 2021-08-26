// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class File extends TeaModel {
    // OwnerId
    @NameInMap("OwnerId")
    public String ownerId;

    // ProjectName
    @NameInMap("ProjectName")
    public String projectName;

    // DatasetName
    @NameInMap("DatasetName")
    public String datasetName;

    // ObjectType
    @NameInMap("ObjectType")
    public String objectType;

    // ObjectId
    @NameInMap("ObjectId")
    public String objectId;

    // UpdateTime
    @NameInMap("UpdateTime")
    public String updateTime;

    // CreateTime
    @NameInMap("CreateTime")
    public String createTime;

    // URI
    @NameInMap("URI")
    public String URI;

    // Filename
    @NameInMap("Filename")
    public String filename;

    // MediaType
    @NameInMap("MediaType")
    public String mediaType;

    // ContentType
    @NameInMap("ContentType")
    public String contentType;

    // Size
    @NameInMap("Size")
    public Long size;

    // FileHash
    @NameInMap("FileHash")
    public String fileHash;

    // FileModifiedTime
    @NameInMap("FileModifiedTime")
    public String fileModifiedTime;

    // FileCreateTime
    @NameInMap("FileCreateTime")
    public String fileCreateTime;

    // FileAccessTime
    @NameInMap("FileAccessTime")
    public String fileAccessTime;

    // ProduceTime
    @NameInMap("ProduceTime")
    public String produceTime;

    // LatLong
    @NameInMap("LatLong")
    public String latLong;

    // Timezone
    @NameInMap("Timezone")
    public String timezone;

    // Addresses
    @NameInMap("Addresses")
    public java.util.List<Address> addresses;

    // TravelClusterId
    @NameInMap("TravelClusterId")
    public String travelClusterId;

    // Orientation
    @NameInMap("Orientation")
    public String orientation;

    // Faces
    @NameInMap("Faces")
    public java.util.List<Face> faces;

    // FaceCount
    @NameInMap("FaceCount")
    public Long faceCount;

    // Labels
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    // Title
    @NameInMap("Title")
    public String title;

    // ImageWidth
    @NameInMap("ImageWidth")
    public Long imageWidth;

    // ImageHeight
    @NameInMap("ImageHeight")
    public Long imageHeight;

    // EXIF
    @NameInMap("EXIF")
    public String EXIF;

    @NameInMap("ImageScore")
    public ImageScore imageScore;

    // CroppingSuggestions
    @NameInMap("CroppingSuggestions")
    public java.util.List<CroppingSuggestion> croppingSuggestions;

    // OCRContents
    @NameInMap("OCRContents")
    public java.util.List<OCRContents> OCRContents;

    // ImageEmbeddingsFloat32
    @NameInMap("ImageEmbeddingsFloat32")
    public java.util.List<Float> imageEmbeddingsFloat32;

    // ImageEmbeddingsInt8
    @NameInMap("ImageEmbeddingsInt8")
    public java.util.List<Integer> imageEmbeddingsInt8;

    // VideoWidth
    @NameInMap("VideoWidth")
    public Long videoWidth;

    // VideoHeight
    @NameInMap("VideoHeight")
    public Long videoHeight;

    // VideoTakenTime
    @NameInMap("VideoTakenTime")
    public String videoTakenTime;

    // VideoDuration
    @NameInMap("VideoDuration")
    public Float videoDuration;

    // VideoBitrate
    @NameInMap("VideoBitrate")
    public Long videoBitrate;

    // VideoStartTime
    @NameInMap("VideoStartTime")
    public Float videoStartTime;

    // VideoStreams
    @NameInMap("VideoStreams")
    public java.util.List<VideoStream> videoStreams;

    // Subtitles
    @NameInMap("Subtitles")
    public java.util.List<SubtitleStream> subtitles;

    // VideoEmbeddingsFloat32
    @NameInMap("VideoEmbeddingsFloat32")
    public java.util.List<Float> videoEmbeddingsFloat32;

    // VideoEmbeddingsInt8
    @NameInMap("VideoEmbeddingsInt8")
    public java.util.List<Integer> videoEmbeddingsInt8;

    // AudioTakenTime
    @NameInMap("AudioTakenTime")
    public String audioTakenTime;

    // AudioDuration
    @NameInMap("AudioDuration")
    public Float audioDuration;

    // AudioBitrate
    @NameInMap("AudioBitrate")
    public Float audioBitrate;

    // AudioStreams
    @NameInMap("AudioStreams")
    public java.util.List<AudioStream> audioStreams;

    // Artists
    @NameInMap("Artists")
    public java.util.List<String> artists;

    // AudioCovers
    @NameInMap("AudioCovers")
    public java.util.List<Image> audioCovers;

    // Composer
    @NameInMap("Composer")
    public String composer;

    // Performer
    @NameInMap("Performer")
    public String performer;

    // AudioLanguage
    @NameInMap("AudioLanguage")
    public String audioLanguage;

    // Album
    @NameInMap("Album")
    public String album;

    // AlbumArtist
    @NameInMap("AlbumArtist")
    public String albumArtist;

    // AudioEmbeddingsFloat32
    @NameInMap("AudioEmbeddingsFloat32")
    public java.util.List<Float> audioEmbeddingsFloat32;

    // AudioEmbeddingsInt8
    @NameInMap("AudioEmbeddingsInt8")
    public java.util.List<Integer> audioEmbeddingsInt8;

    // DocumentLanguage
    @NameInMap("DocumentLanguage")
    public String documentLanguage;

    // PageCount
    @NameInMap("PageCount")
    public Long pageCount;

    // DocumentContent
    @NameInMap("DocumentContent")
    public String documentContent;

    // DocumentEmbeddingsFloat32
    @NameInMap("DocumentEmbeddingsFloat32")
    public java.util.List<Float> documentEmbeddingsFloat32;

    // DocumentEmbeddingsInt8
    @NameInMap("DocumentEmbeddingsInt8")
    public java.util.List<Integer> documentEmbeddingsInt8;

    // ETag
    @NameInMap("ETag")
    public String ETag;

    // CacheControl
    @NameInMap("CacheControl")
    public String cacheControl;

    // ContentDisposition
    @NameInMap("ContentDisposition")
    public String contentDisposition;

    // ContentEncoding
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    // ContentLanguage
    @NameInMap("ContentLanguage")
    public String contentLanguage;

    // AccessControlAllowOrigin
    @NameInMap("AccessControlAllowOrigin")
    public String accessControlAllowOrigin;

    // AccessControlRequestMethod
    @NameInMap("AccessControlRequestMethod")
    public String accessControlRequestMethod;

    // ServerSideEncryptionCustomerAlgorithm
    @NameInMap("ServerSideEncryptionCustomerAlgorithm")
    public String serverSideEncryptionCustomerAlgorithm;

    // ServerSideEncryption
    @NameInMap("ServerSideEncryption")
    public String serverSideEncryption;

    // ServerSideDataEncryption
    @NameInMap("ServerSideDataEncryption")
    public String serverSideDataEncryption;

    // ServerSideEncryptionKeyId
    @NameInMap("ServerSideEncryptionKeyId")
    public String serverSideEncryptionKeyId;

    // StorageClass
    @NameInMap("StorageClass")
    public String storageClass;

    // ObjectACL
    @NameInMap("ObjectACL")
    public String objectACL;

    // ContentMd5
    @NameInMap("ContentMd5")
    public String contentMd5;

    // OSSUserMeta
    @NameInMap("OSSUserMeta")
    public java.util.Map<String, ?> OSSUserMeta;

    // OSSTaggingCount
    @NameInMap("OSSTaggingCount")
    public Long OSSTaggingCount;

    // OSSTagging
    @NameInMap("OSSTagging")
    public java.util.Map<String, ?> OSSTagging;

    // OSSExpiration
    @NameInMap("OSSExpiration")
    public String OSSExpiration;

    // OSSVersionId
    @NameInMap("OSSVersionId")
    public String OSSVersionId;

    // OSSDeleteMarker
    @NameInMap("OSSDeleteMarker")
    public String OSSDeleteMarker;

    // OSSObjectType
    @NameInMap("OSSObjectType")
    public String OSSObjectType;

    // CustomId
    @NameInMap("CustomId")
    public String customId;

    // CustomLabels
    @NameInMap("CustomLabels")
    public java.util.Map<String, ?> customLabels;

    public static File build(java.util.Map<String, ?> map) throws Exception {
        File self = new File();
        return TeaModel.build(map, self);
    }

    public File setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public File setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public File setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public File setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public File setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public File setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public File setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public File setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

    public File setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public File setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public File setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public File setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
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

    public File setFileCreateTime(String fileCreateTime) {
        this.fileCreateTime = fileCreateTime;
        return this;
    }
    public String getFileCreateTime() {
        return this.fileCreateTime;
    }

    public File setFileAccessTime(String fileAccessTime) {
        this.fileAccessTime = fileAccessTime;
        return this;
    }
    public String getFileAccessTime() {
        return this.fileAccessTime;
    }

    public File setProduceTime(String produceTime) {
        this.produceTime = produceTime;
        return this;
    }
    public String getProduceTime() {
        return this.produceTime;
    }

    public File setLatLong(String latLong) {
        this.latLong = latLong;
        return this;
    }
    public String getLatLong() {
        return this.latLong;
    }

    public File setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public File setAddresses(java.util.List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }
    public java.util.List<Address> getAddresses() {
        return this.addresses;
    }

    public File setTravelClusterId(String travelClusterId) {
        this.travelClusterId = travelClusterId;
        return this;
    }
    public String getTravelClusterId() {
        return this.travelClusterId;
    }

    public File setOrientation(String orientation) {
        this.orientation = orientation;
        return this;
    }
    public String getOrientation() {
        return this.orientation;
    }

    public File setFaces(java.util.List<Face> faces) {
        this.faces = faces;
        return this;
    }
    public java.util.List<Face> getFaces() {
        return this.faces;
    }

    public File setFaceCount(Long faceCount) {
        this.faceCount = faceCount;
        return this;
    }
    public Long getFaceCount() {
        return this.faceCount;
    }

    public File setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public File setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public File setImageWidth(Long imageWidth) {
        this.imageWidth = imageWidth;
        return this;
    }
    public Long getImageWidth() {
        return this.imageWidth;
    }

    public File setImageHeight(Long imageHeight) {
        this.imageHeight = imageHeight;
        return this;
    }
    public Long getImageHeight() {
        return this.imageHeight;
    }

    public File setEXIF(String EXIF) {
        this.EXIF = EXIF;
        return this;
    }
    public String getEXIF() {
        return this.EXIF;
    }

    public File setImageScore(ImageScore imageScore) {
        this.imageScore = imageScore;
        return this;
    }
    public ImageScore getImageScore() {
        return this.imageScore;
    }

    public File setCroppingSuggestions(java.util.List<CroppingSuggestion> croppingSuggestions) {
        this.croppingSuggestions = croppingSuggestions;
        return this;
    }
    public java.util.List<CroppingSuggestion> getCroppingSuggestions() {
        return this.croppingSuggestions;
    }

    public File setOCRContents(java.util.List<OCRContents> OCRContents) {
        this.OCRContents = OCRContents;
        return this;
    }
    public java.util.List<OCRContents> getOCRContents() {
        return this.OCRContents;
    }

    public File setImageEmbeddingsFloat32(java.util.List<Float> imageEmbeddingsFloat32) {
        this.imageEmbeddingsFloat32 = imageEmbeddingsFloat32;
        return this;
    }
    public java.util.List<Float> getImageEmbeddingsFloat32() {
        return this.imageEmbeddingsFloat32;
    }

    public File setImageEmbeddingsInt8(java.util.List<Integer> imageEmbeddingsInt8) {
        this.imageEmbeddingsInt8 = imageEmbeddingsInt8;
        return this;
    }
    public java.util.List<Integer> getImageEmbeddingsInt8() {
        return this.imageEmbeddingsInt8;
    }

    public File setVideoWidth(Long videoWidth) {
        this.videoWidth = videoWidth;
        return this;
    }
    public Long getVideoWidth() {
        return this.videoWidth;
    }

    public File setVideoHeight(Long videoHeight) {
        this.videoHeight = videoHeight;
        return this;
    }
    public Long getVideoHeight() {
        return this.videoHeight;
    }

    public File setVideoTakenTime(String videoTakenTime) {
        this.videoTakenTime = videoTakenTime;
        return this;
    }
    public String getVideoTakenTime() {
        return this.videoTakenTime;
    }

    public File setVideoDuration(Float videoDuration) {
        this.videoDuration = videoDuration;
        return this;
    }
    public Float getVideoDuration() {
        return this.videoDuration;
    }

    public File setVideoBitrate(Long videoBitrate) {
        this.videoBitrate = videoBitrate;
        return this;
    }
    public Long getVideoBitrate() {
        return this.videoBitrate;
    }

    public File setVideoStartTime(Float videoStartTime) {
        this.videoStartTime = videoStartTime;
        return this;
    }
    public Float getVideoStartTime() {
        return this.videoStartTime;
    }

    public File setVideoStreams(java.util.List<VideoStream> videoStreams) {
        this.videoStreams = videoStreams;
        return this;
    }
    public java.util.List<VideoStream> getVideoStreams() {
        return this.videoStreams;
    }

    public File setSubtitles(java.util.List<SubtitleStream> subtitles) {
        this.subtitles = subtitles;
        return this;
    }
    public java.util.List<SubtitleStream> getSubtitles() {
        return this.subtitles;
    }

    public File setVideoEmbeddingsFloat32(java.util.List<Float> videoEmbeddingsFloat32) {
        this.videoEmbeddingsFloat32 = videoEmbeddingsFloat32;
        return this;
    }
    public java.util.List<Float> getVideoEmbeddingsFloat32() {
        return this.videoEmbeddingsFloat32;
    }

    public File setVideoEmbeddingsInt8(java.util.List<Integer> videoEmbeddingsInt8) {
        this.videoEmbeddingsInt8 = videoEmbeddingsInt8;
        return this;
    }
    public java.util.List<Integer> getVideoEmbeddingsInt8() {
        return this.videoEmbeddingsInt8;
    }

    public File setAudioTakenTime(String audioTakenTime) {
        this.audioTakenTime = audioTakenTime;
        return this;
    }
    public String getAudioTakenTime() {
        return this.audioTakenTime;
    }

    public File setAudioDuration(Float audioDuration) {
        this.audioDuration = audioDuration;
        return this;
    }
    public Float getAudioDuration() {
        return this.audioDuration;
    }

    public File setAudioBitrate(Float audioBitrate) {
        this.audioBitrate = audioBitrate;
        return this;
    }
    public Float getAudioBitrate() {
        return this.audioBitrate;
    }

    public File setAudioStreams(java.util.List<AudioStream> audioStreams) {
        this.audioStreams = audioStreams;
        return this;
    }
    public java.util.List<AudioStream> getAudioStreams() {
        return this.audioStreams;
    }

    public File setArtists(java.util.List<String> artists) {
        this.artists = artists;
        return this;
    }
    public java.util.List<String> getArtists() {
        return this.artists;
    }

    public File setAudioCovers(java.util.List<Image> audioCovers) {
        this.audioCovers = audioCovers;
        return this;
    }
    public java.util.List<Image> getAudioCovers() {
        return this.audioCovers;
    }

    public File setComposer(String composer) {
        this.composer = composer;
        return this;
    }
    public String getComposer() {
        return this.composer;
    }

    public File setPerformer(String performer) {
        this.performer = performer;
        return this;
    }
    public String getPerformer() {
        return this.performer;
    }

    public File setAudioLanguage(String audioLanguage) {
        this.audioLanguage = audioLanguage;
        return this;
    }
    public String getAudioLanguage() {
        return this.audioLanguage;
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

    public File setAudioEmbeddingsFloat32(java.util.List<Float> audioEmbeddingsFloat32) {
        this.audioEmbeddingsFloat32 = audioEmbeddingsFloat32;
        return this;
    }
    public java.util.List<Float> getAudioEmbeddingsFloat32() {
        return this.audioEmbeddingsFloat32;
    }

    public File setAudioEmbeddingsInt8(java.util.List<Integer> audioEmbeddingsInt8) {
        this.audioEmbeddingsInt8 = audioEmbeddingsInt8;
        return this;
    }
    public java.util.List<Integer> getAudioEmbeddingsInt8() {
        return this.audioEmbeddingsInt8;
    }

    public File setDocumentLanguage(String documentLanguage) {
        this.documentLanguage = documentLanguage;
        return this;
    }
    public String getDocumentLanguage() {
        return this.documentLanguage;
    }

    public File setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public File setDocumentContent(String documentContent) {
        this.documentContent = documentContent;
        return this;
    }
    public String getDocumentContent() {
        return this.documentContent;
    }

    public File setDocumentEmbeddingsFloat32(java.util.List<Float> documentEmbeddingsFloat32) {
        this.documentEmbeddingsFloat32 = documentEmbeddingsFloat32;
        return this;
    }
    public java.util.List<Float> getDocumentEmbeddingsFloat32() {
        return this.documentEmbeddingsFloat32;
    }

    public File setDocumentEmbeddingsInt8(java.util.List<Integer> documentEmbeddingsInt8) {
        this.documentEmbeddingsInt8 = documentEmbeddingsInt8;
        return this;
    }
    public java.util.List<Integer> getDocumentEmbeddingsInt8() {
        return this.documentEmbeddingsInt8;
    }

    public File setETag(String ETag) {
        this.ETag = ETag;
        return this;
    }
    public String getETag() {
        return this.ETag;
    }

    public File setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }
    public String getCacheControl() {
        return this.cacheControl;
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

    public File setServerSideEncryptionCustomerAlgorithm(String serverSideEncryptionCustomerAlgorithm) {
        this.serverSideEncryptionCustomerAlgorithm = serverSideEncryptionCustomerAlgorithm;
        return this;
    }
    public String getServerSideEncryptionCustomerAlgorithm() {
        return this.serverSideEncryptionCustomerAlgorithm;
    }

    public File setServerSideEncryption(String serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption;
        return this;
    }
    public String getServerSideEncryption() {
        return this.serverSideEncryption;
    }

    public File setServerSideDataEncryption(String serverSideDataEncryption) {
        this.serverSideDataEncryption = serverSideDataEncryption;
        return this;
    }
    public String getServerSideDataEncryption() {
        return this.serverSideDataEncryption;
    }

    public File setServerSideEncryptionKeyId(String serverSideEncryptionKeyId) {
        this.serverSideEncryptionKeyId = serverSideEncryptionKeyId;
        return this;
    }
    public String getServerSideEncryptionKeyId() {
        return this.serverSideEncryptionKeyId;
    }

    public File setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

    public File setObjectACL(String objectACL) {
        this.objectACL = objectACL;
        return this;
    }
    public String getObjectACL() {
        return this.objectACL;
    }

    public File setContentMd5(String contentMd5) {
        this.contentMd5 = contentMd5;
        return this;
    }
    public String getContentMd5() {
        return this.contentMd5;
    }

    public File setOSSUserMeta(java.util.Map<String, ?> OSSUserMeta) {
        this.OSSUserMeta = OSSUserMeta;
        return this;
    }
    public java.util.Map<String, ?> getOSSUserMeta() {
        return this.OSSUserMeta;
    }

    public File setOSSTaggingCount(Long OSSTaggingCount) {
        this.OSSTaggingCount = OSSTaggingCount;
        return this;
    }
    public Long getOSSTaggingCount() {
        return this.OSSTaggingCount;
    }

    public File setOSSTagging(java.util.Map<String, ?> OSSTagging) {
        this.OSSTagging = OSSTagging;
        return this;
    }
    public java.util.Map<String, ?> getOSSTagging() {
        return this.OSSTagging;
    }

    public File setOSSExpiration(String OSSExpiration) {
        this.OSSExpiration = OSSExpiration;
        return this;
    }
    public String getOSSExpiration() {
        return this.OSSExpiration;
    }

    public File setOSSVersionId(String OSSVersionId) {
        this.OSSVersionId = OSSVersionId;
        return this;
    }
    public String getOSSVersionId() {
        return this.OSSVersionId;
    }

    public File setOSSDeleteMarker(String OSSDeleteMarker) {
        this.OSSDeleteMarker = OSSDeleteMarker;
        return this;
    }
    public String getOSSDeleteMarker() {
        return this.OSSDeleteMarker;
    }

    public File setOSSObjectType(String OSSObjectType) {
        this.OSSObjectType = OSSObjectType;
        return this;
    }
    public String getOSSObjectType() {
        return this.OSSObjectType;
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

}
