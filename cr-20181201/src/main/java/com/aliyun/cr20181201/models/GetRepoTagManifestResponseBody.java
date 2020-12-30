// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoTagManifestResponseBody extends TeaModel {
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Manifest")
    public GetRepoTagManifestResponseBodyManifest manifest;

    @NameInMap("Code")
    public String code;

    public static GetRepoTagManifestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepoTagManifestResponseBody self = new GetRepoTagManifestResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRepoTagManifestResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetRepoTagManifestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRepoTagManifestResponseBody setManifest(GetRepoTagManifestResponseBodyManifest manifest) {
        this.manifest = manifest;
        return this;
    }
    public GetRepoTagManifestResponseBodyManifest getManifest() {
        return this.manifest;
    }

    public GetRepoTagManifestResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetRepoTagManifestResponseBodyManifestHistory extends TeaModel {
        @NameInMap("V1Compatibility")
        public java.util.Map<String, ?> v1Compatibility;

        public static GetRepoTagManifestResponseBodyManifestHistory build(java.util.Map<String, ?> map) throws Exception {
            GetRepoTagManifestResponseBodyManifestHistory self = new GetRepoTagManifestResponseBodyManifestHistory();
            return TeaModel.build(map, self);
        }

        public GetRepoTagManifestResponseBodyManifestHistory setV1Compatibility(java.util.Map<String, ?> v1Compatibility) {
            this.v1Compatibility = v1Compatibility;
            return this;
        }
        public java.util.Map<String, ?> getV1Compatibility() {
            return this.v1Compatibility;
        }

    }

    public static class GetRepoTagManifestResponseBodyManifestLayers extends TeaModel {
        @NameInMap("Digest")
        public String digest;

        @NameInMap("Size")
        public Long size;

        @NameInMap("MediaType")
        public String mediaType;

        public static GetRepoTagManifestResponseBodyManifestLayers build(java.util.Map<String, ?> map) throws Exception {
            GetRepoTagManifestResponseBodyManifestLayers self = new GetRepoTagManifestResponseBodyManifestLayers();
            return TeaModel.build(map, self);
        }

        public GetRepoTagManifestResponseBodyManifestLayers setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public GetRepoTagManifestResponseBodyManifestLayers setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetRepoTagManifestResponseBodyManifestLayers setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

    }

    public static class GetRepoTagManifestResponseBodyManifestFsLayers extends TeaModel {
        @NameInMap("BlobSum")
        public String blobSum;

        public static GetRepoTagManifestResponseBodyManifestFsLayers build(java.util.Map<String, ?> map) throws Exception {
            GetRepoTagManifestResponseBodyManifestFsLayers self = new GetRepoTagManifestResponseBodyManifestFsLayers();
            return TeaModel.build(map, self);
        }

        public GetRepoTagManifestResponseBodyManifestFsLayers setBlobSum(String blobSum) {
            this.blobSum = blobSum;
            return this;
        }
        public String getBlobSum() {
            return this.blobSum;
        }

    }

    public static class GetRepoTagManifestResponseBodyManifestSignatures extends TeaModel {
        @NameInMap("Signature")
        public String signature;

        @NameInMap("Protected")
        public String _protected;

        @NameInMap("Header")
        public java.util.Map<String, ?> header;

        public static GetRepoTagManifestResponseBodyManifestSignatures build(java.util.Map<String, ?> map) throws Exception {
            GetRepoTagManifestResponseBodyManifestSignatures self = new GetRepoTagManifestResponseBodyManifestSignatures();
            return TeaModel.build(map, self);
        }

        public GetRepoTagManifestResponseBodyManifestSignatures setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public GetRepoTagManifestResponseBodyManifestSignatures set_protected(String _protected) {
            this._protected = _protected;
            return this;
        }
        public String get_protected() {
            return this._protected;
        }

        public GetRepoTagManifestResponseBodyManifestSignatures setHeader(java.util.Map<String, ?> header) {
            this.header = header;
            return this;
        }
        public java.util.Map<String, ?> getHeader() {
            return this.header;
        }

    }

    public static class GetRepoTagManifestResponseBodyManifestConfig extends TeaModel {
        @NameInMap("Digest")
        public String digest;

        @NameInMap("Size")
        public Long size;

        @NameInMap("MediaType")
        public String mediaType;

        public static GetRepoTagManifestResponseBodyManifestConfig build(java.util.Map<String, ?> map) throws Exception {
            GetRepoTagManifestResponseBodyManifestConfig self = new GetRepoTagManifestResponseBodyManifestConfig();
            return TeaModel.build(map, self);
        }

        public GetRepoTagManifestResponseBodyManifestConfig setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public GetRepoTagManifestResponseBodyManifestConfig setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetRepoTagManifestResponseBodyManifestConfig setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

    }

    public static class GetRepoTagManifestResponseBodyManifest extends TeaModel {
        @NameInMap("History")
        public java.util.List<GetRepoTagManifestResponseBodyManifestHistory> history;

        @NameInMap("SchemaVersion")
        public Integer schemaVersion;

        @NameInMap("Layers")
        public java.util.List<GetRepoTagManifestResponseBodyManifestLayers> layers;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Name")
        public String name;

        @NameInMap("MediaType")
        public String mediaType;

        @NameInMap("FsLayers")
        public java.util.List<GetRepoTagManifestResponseBodyManifestFsLayers> fsLayers;

        @NameInMap("Signatures")
        public java.util.List<GetRepoTagManifestResponseBodyManifestSignatures> signatures;

        @NameInMap("Config")
        public GetRepoTagManifestResponseBodyManifestConfig config;

        @NameInMap("Architecture")
        public String architecture;

        public static GetRepoTagManifestResponseBodyManifest build(java.util.Map<String, ?> map) throws Exception {
            GetRepoTagManifestResponseBodyManifest self = new GetRepoTagManifestResponseBodyManifest();
            return TeaModel.build(map, self);
        }

        public GetRepoTagManifestResponseBodyManifest setHistory(java.util.List<GetRepoTagManifestResponseBodyManifestHistory> history) {
            this.history = history;
            return this;
        }
        public java.util.List<GetRepoTagManifestResponseBodyManifestHistory> getHistory() {
            return this.history;
        }

        public GetRepoTagManifestResponseBodyManifest setSchemaVersion(Integer schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public Integer getSchemaVersion() {
            return this.schemaVersion;
        }

        public GetRepoTagManifestResponseBodyManifest setLayers(java.util.List<GetRepoTagManifestResponseBodyManifestLayers> layers) {
            this.layers = layers;
            return this;
        }
        public java.util.List<GetRepoTagManifestResponseBodyManifestLayers> getLayers() {
            return this.layers;
        }

        public GetRepoTagManifestResponseBodyManifest setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetRepoTagManifestResponseBodyManifest setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRepoTagManifestResponseBodyManifest setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public GetRepoTagManifestResponseBodyManifest setFsLayers(java.util.List<GetRepoTagManifestResponseBodyManifestFsLayers> fsLayers) {
            this.fsLayers = fsLayers;
            return this;
        }
        public java.util.List<GetRepoTagManifestResponseBodyManifestFsLayers> getFsLayers() {
            return this.fsLayers;
        }

        public GetRepoTagManifestResponseBodyManifest setSignatures(java.util.List<GetRepoTagManifestResponseBodyManifestSignatures> signatures) {
            this.signatures = signatures;
            return this;
        }
        public java.util.List<GetRepoTagManifestResponseBodyManifestSignatures> getSignatures() {
            return this.signatures;
        }

        public GetRepoTagManifestResponseBodyManifest setConfig(GetRepoTagManifestResponseBodyManifestConfig config) {
            this.config = config;
            return this;
        }
        public GetRepoTagManifestResponseBodyManifestConfig getConfig() {
            return this.config;
        }

        public GetRepoTagManifestResponseBodyManifest setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

    }

}
