// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListContainerImagesResponseBody extends TeaModel {
    @NameInMap("ContainerImages")
    public java.util.List<ListContainerImagesResponseBodyContainerImages> containerImages;

    /**
     * <strong>example:</strong>
     * <p>easygene.cn-beijing.aliyuncs.com</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>ba6d88e2-a6f2-4d2c-a2ae-68b76b078445</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>DA980AD0-158F-44F3-847D-5EAB96C0EB6B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListContainerImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContainerImagesResponseBody self = new ListContainerImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContainerImagesResponseBody setContainerImages(java.util.List<ListContainerImagesResponseBodyContainerImages> containerImages) {
        this.containerImages = containerImages;
        return this;
    }
    public java.util.List<ListContainerImagesResponseBodyContainerImages> getContainerImages() {
        return this.containerImages;
    }

    public ListContainerImagesResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ListContainerImagesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListContainerImagesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListContainerImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContainerImagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListContainerImagesResponseBodyContainerImages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>a suite of programs for interacting with high-throughput sequencing data.</p>
         */
        @NameInMap("ContainerImageDescription")
        public String containerImageDescription;

        /**
         * <strong>example:</strong>
         * <p>samtools</p>
         */
        @NameInMap("ContainerImageName")
        public String containerImageName;

        /**
         * <strong>example:</strong>
         * <p>samtools</p>
         */
        @NameInMap("ContainerImageNamespace")
        public String containerImageNamespace;

        @NameInMap("ContainerImageVersions")
        public java.util.List<String> containerImageVersions;

        /**
         * <strong>example:</strong>
         * <p>registry-vpc.cn-shenzhen.aliyuncs.com</p>
         */
        @NameInMap("ContainerRegistry")
        public String containerRegistry;

        /**
         * <strong>example:</strong>
         * <p>yyyy/MM/dd HH:mm:ss</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("Location")
        public String location;

        public static ListContainerImagesResponseBodyContainerImages build(java.util.Map<String, ?> map) throws Exception {
            ListContainerImagesResponseBodyContainerImages self = new ListContainerImagesResponseBodyContainerImages();
            return TeaModel.build(map, self);
        }

        public ListContainerImagesResponseBodyContainerImages setContainerImageDescription(String containerImageDescription) {
            this.containerImageDescription = containerImageDescription;
            return this;
        }
        public String getContainerImageDescription() {
            return this.containerImageDescription;
        }

        public ListContainerImagesResponseBodyContainerImages setContainerImageName(String containerImageName) {
            this.containerImageName = containerImageName;
            return this;
        }
        public String getContainerImageName() {
            return this.containerImageName;
        }

        public ListContainerImagesResponseBodyContainerImages setContainerImageNamespace(String containerImageNamespace) {
            this.containerImageNamespace = containerImageNamespace;
            return this;
        }
        public String getContainerImageNamespace() {
            return this.containerImageNamespace;
        }

        public ListContainerImagesResponseBodyContainerImages setContainerImageVersions(java.util.List<String> containerImageVersions) {
            this.containerImageVersions = containerImageVersions;
            return this;
        }
        public java.util.List<String> getContainerImageVersions() {
            return this.containerImageVersions;
        }

        public ListContainerImagesResponseBodyContainerImages setContainerRegistry(String containerRegistry) {
            this.containerRegistry = containerRegistry;
            return this;
        }
        public String getContainerRegistry() {
            return this.containerRegistry;
        }

        public ListContainerImagesResponseBodyContainerImages setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public ListContainerImagesResponseBodyContainerImages setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

    }

}
