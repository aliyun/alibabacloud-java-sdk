// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListPublicDatasetResponseBody extends TeaModel {
    @NameInMap("Datasets")
    public java.util.List<ListPublicDatasetResponseBodyDatasets> datasets;

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
        /**
         * <strong>example:</strong>
         * <p>This is description about dataset.</p>
         */
        @NameInMap("About")
        public String about;

        /**
         * <strong>example:</strong>
         * <p>This are access requirements.</p>
         */
        @NameInMap("AccessRequirements")
        public String accessRequirements;

        /**
         * <strong>example:</strong>
         * <p>This is copyright.</p>
         */
        @NameInMap("Copyright")
        public String copyright;

        /**
         * <strong>example:</strong>
         * <p>This are access requirements</p>
         */
        @NameInMap("DatasetDescription")
        public String datasetDescription;

        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <strong>example:</strong>
         * <p>西蒙斯基因组多样性计划</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

        /**
         * <strong>example:</strong>
         * <p>yyyy/MM/dd HH:mm:ss</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        @NameInMap("Locations")
        public java.util.List<String> locations;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        /**
         * <strong>example:</strong>
         * <p>源站更新后及时同步</p>
         */
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
