// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoTagLayersResponseBody extends TeaModel {
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Layers")
    public java.util.List<GetRepoTagLayersResponseBodyLayers> layers;

    public static GetRepoTagLayersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepoTagLayersResponseBody self = new GetRepoTagLayersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRepoTagLayersResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetRepoTagLayersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRepoTagLayersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRepoTagLayersResponseBody setLayers(java.util.List<GetRepoTagLayersResponseBodyLayers> layers) {
        this.layers = layers;
        return this;
    }
    public java.util.List<GetRepoTagLayersResponseBodyLayers> getLayers() {
        return this.layers;
    }

    public static class GetRepoTagLayersResponseBodyLayers extends TeaModel {
        @NameInMap("BlobDigest")
        public String blobDigest;

        @NameInMap("LayerIndex")
        public Integer layerIndex;

        @NameInMap("LayerInstruction")
        public String layerInstruction;

        @NameInMap("LayerCMD")
        public String layerCMD;

        @NameInMap("BlobSize")
        public Long blobSize;

        public static GetRepoTagLayersResponseBodyLayers build(java.util.Map<String, ?> map) throws Exception {
            GetRepoTagLayersResponseBodyLayers self = new GetRepoTagLayersResponseBodyLayers();
            return TeaModel.build(map, self);
        }

        public GetRepoTagLayersResponseBodyLayers setBlobDigest(String blobDigest) {
            this.blobDigest = blobDigest;
            return this;
        }
        public String getBlobDigest() {
            return this.blobDigest;
        }

        public GetRepoTagLayersResponseBodyLayers setLayerIndex(Integer layerIndex) {
            this.layerIndex = layerIndex;
            return this;
        }
        public Integer getLayerIndex() {
            return this.layerIndex;
        }

        public GetRepoTagLayersResponseBodyLayers setLayerInstruction(String layerInstruction) {
            this.layerInstruction = layerInstruction;
            return this;
        }
        public String getLayerInstruction() {
            return this.layerInstruction;
        }

        public GetRepoTagLayersResponseBodyLayers setLayerCMD(String layerCMD) {
            this.layerCMD = layerCMD;
            return this;
        }
        public String getLayerCMD() {
            return this.layerCMD;
        }

        public GetRepoTagLayersResponseBodyLayers setBlobSize(Long blobSize) {
            this.blobSize = blobSize;
            return this;
        }
        public Long getBlobSize() {
            return this.blobSize;
        }

    }

}
