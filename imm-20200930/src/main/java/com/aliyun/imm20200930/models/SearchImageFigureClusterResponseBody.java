// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SearchImageFigureClusterResponseBody extends TeaModel {
    @NameInMap("Clusters")
    public java.util.List<SearchImageFigureClusterResponseBodyClusters> clusters;

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
        @NameInMap("Boundary")
        public Boundary boundary;

        @NameInMap("ClusterId")
        public String clusterId;

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
