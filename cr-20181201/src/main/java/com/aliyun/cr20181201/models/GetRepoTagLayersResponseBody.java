// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoTagLayersResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request is successful.</p>
     * <p>*   `false`: The request fails.</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The queried image layers.</p>
     */
    @NameInMap("Layers")
    public java.util.List<GetRepoTagLayersResponseBodyLayers> layers;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRepoTagLayersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepoTagLayersResponseBody self = new GetRepoTagLayersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRepoTagLayersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRepoTagLayersResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetRepoTagLayersResponseBody setLayers(java.util.List<GetRepoTagLayersResponseBodyLayers> layers) {
        this.layers = layers;
        return this;
    }
    public java.util.List<GetRepoTagLayersResponseBodyLayers> getLayers() {
        return this.layers;
    }

    public GetRepoTagLayersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRepoTagLayersResponseBodyLayers extends TeaModel {
        /**
         * <p>The digest of a single image layer.</p>
         */
        @NameInMap("BlobDigest")
        public String blobDigest;

        /**
         * <p>The size of the image layer.</p>
         */
        @NameInMap("BlobSize")
        public Long blobSize;

        /**
         * <p>Operation on the image layer.</p>
         */
        @NameInMap("LayerCMD")
        public String layerCMD;

        /**
         * <p>The sequence number of the layer stack.</p>
         */
        @NameInMap("LayerIndex")
        public Integer layerIndex;

        /**
         * <p>The command for the image layer.</p>
         */
        @NameInMap("LayerInstruction")
        public String layerInstruction;

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

        public GetRepoTagLayersResponseBodyLayers setBlobSize(Long blobSize) {
            this.blobSize = blobSize;
            return this;
        }
        public Long getBlobSize() {
            return this.blobSize;
        }

        public GetRepoTagLayersResponseBodyLayers setLayerCMD(String layerCMD) {
            this.layerCMD = layerCMD;
            return this;
        }
        public String getLayerCMD() {
            return this.layerCMD;
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

    }

}
