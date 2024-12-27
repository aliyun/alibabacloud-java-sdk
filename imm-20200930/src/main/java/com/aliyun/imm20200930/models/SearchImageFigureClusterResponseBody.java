// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SearchImageFigureClusterResponseBody extends TeaModel {
    /**
     * <p>The face clusters.</p>
     */
    @NameInMap("Clusters")
    public java.util.List<SearchImageFigureClusterResponseBodyClusters> clusters;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C2734912-E6D5-052C-AC67-6A9FD02*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SearchImageFigureClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchImageFigureClusterResponseBody self = new SearchImageFigureClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchImageFigureClusterResponseBody setClusters(java.util.List<SearchImageFigureClusterResponseBodyClusters> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<SearchImageFigureClusterResponseBodyClusters> getClusters() {
        return this.clusters;
    }

    public SearchImageFigureClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SearchImageFigureClusterResponseBodyClusters extends TeaModel {
        /**
         * <p>The bounding box of the face.</p>
         */
        @NameInMap("Boundary")
        public Boundary boundary;

        /**
         * <p>The ID of the face cluster that contains faces similar to the face within the bounding box.</p>
         * 
         * <strong>example:</strong>
         * <p>Cluster-ca730577-06b1-42c7-a25b-8f2c7******</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The similarity between the face within the bounding box and the face cluster. Valid value: 0 to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0.87413794</p>
         */
        @NameInMap("Similarity")
        public Float similarity;

        public static SearchImageFigureClusterResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            SearchImageFigureClusterResponseBodyClusters self = new SearchImageFigureClusterResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public SearchImageFigureClusterResponseBodyClusters setBoundary(Boundary boundary) {
            this.boundary = boundary;
            return this;
        }
        public Boundary getBoundary() {
            return this.boundary;
        }

        public SearchImageFigureClusterResponseBodyClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public SearchImageFigureClusterResponseBodyClusters setSimilarity(Float similarity) {
            this.similarity = similarity;
            return this;
        }
        public Float getSimilarity() {
            return this.similarity;
        }

    }

}
