// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListPublicDatasetResponseBody extends TeaModel {
    // 公共数据集信息
    @NameInMap("Datasets")
    public java.util.List<ListPublicDatasetResponseBodyDatasets> datasets;

    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 分页数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 翻页Token用来表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("NextToken")
    public String nextToken;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 总记录数
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPublicDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublicDatasetResponseBody self = new ListPublicDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublicDatasetResponseBody setDatasets(java.util.List<ListPublicDatasetResponseBodyDatasets> datasets) {
        this.datasets = datasets;
        return this;
    }
    public java.util.List<ListPublicDatasetResponseBodyDatasets> getDatasets() {
        return this.datasets;
    }

    public ListPublicDatasetResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ListPublicDatasetResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPublicDatasetResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPublicDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPublicDatasetResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPublicDatasetResponseBodyDatasets extends TeaModel {
        // 关于公共数据集
        @NameInMap("About")
        public String about;

        // 公共数据集访问要求
        @NameInMap("AccessRequirements")
        public String accessRequirements;

        // 公共数据集版权信息
        @NameInMap("Copyright")
        public String copyright;

        // 公共数据集描述
        @NameInMap("DatasetDescription")
        public String datasetDescription;

        // 公共数据集UUID
        @NameInMap("DatasetId")
        public String datasetId;

        // 公共数据集名称
        @NameInMap("DatasetName")
        public String datasetName;

        // 最后更新时间
        @NameInMap("LastModified")
        public String lastModified;

        // 公共数据集可用区域
        @NameInMap("Locations")
        public java.util.List<String> locations;

        // 公共数据集标签
        @NameInMap("Tags")
        public java.util.List<String> tags;

        // 公共数据集更新频率
        @NameInMap("UpdateFrequency")
        public String updateFrequency;

        public static ListPublicDatasetResponseBodyDatasets build(java.util.Map<String, ?> map) throws Exception {
            ListPublicDatasetResponseBodyDatasets self = new ListPublicDatasetResponseBodyDatasets();
            return TeaModel.build(map, self);
        }

        public ListPublicDatasetResponseBodyDatasets setAbout(String about) {
            this.about = about;
            return this;
        }
        public String getAbout() {
            return this.about;
        }

        public ListPublicDatasetResponseBodyDatasets setAccessRequirements(String accessRequirements) {
            this.accessRequirements = accessRequirements;
            return this;
        }
        public String getAccessRequirements() {
            return this.accessRequirements;
        }

        public ListPublicDatasetResponseBodyDatasets setCopyright(String copyright) {
            this.copyright = copyright;
            return this;
        }
        public String getCopyright() {
            return this.copyright;
        }

        public ListPublicDatasetResponseBodyDatasets setDatasetDescription(String datasetDescription) {
            this.datasetDescription = datasetDescription;
            return this;
        }
        public String getDatasetDescription() {
            return this.datasetDescription;
        }

        public ListPublicDatasetResponseBodyDatasets setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public ListPublicDatasetResponseBodyDatasets setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public ListPublicDatasetResponseBodyDatasets setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public ListPublicDatasetResponseBodyDatasets setLocations(java.util.List<String> locations) {
            this.locations = locations;
            return this;
        }
        public java.util.List<String> getLocations() {
            return this.locations;
        }

        public ListPublicDatasetResponseBodyDatasets setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public ListPublicDatasetResponseBodyDatasets setUpdateFrequency(String updateFrequency) {
            this.updateFrequency = updateFrequency;
            return this;
        }
        public String getUpdateFrequency() {
            return this.updateFrequency;
        }

    }

}
