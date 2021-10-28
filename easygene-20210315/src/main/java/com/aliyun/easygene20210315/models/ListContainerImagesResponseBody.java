// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListContainerImagesResponseBody extends TeaModel {
    // 容器镜像
    @NameInMap("ContainerImages")
    public java.util.List<ListContainerImagesResponseBodyContainerImages> containerImages;

    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 分页数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 翻页Token用来表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("NextToken")
    public String nextToken;

    // 主机ID
    @NameInMap("RequestId")
    public String requestId;

    // 总记录数
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
        // 容器镜像描述
        @NameInMap("ContainerImageDescription")
        public String containerImageDescription;

        // 容器镜像名称
        @NameInMap("ContainerImageName")
        public String containerImageName;

        // 容器镜像名称空间名称
        @NameInMap("ContainerImageNamespace")
        public String containerImageNamespace;

        // 容器镜像版本
        @NameInMap("ContainerImageVersions")
        public java.util.List<String> containerImageVersions;

        // 容器镜像仓库名称
        @NameInMap("ContainerRegistry")
        public String containerRegistry;

        // 最后更新时间
        @NameInMap("LastModified")
        public String lastModified;

        // 容器镜像所在区域
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
