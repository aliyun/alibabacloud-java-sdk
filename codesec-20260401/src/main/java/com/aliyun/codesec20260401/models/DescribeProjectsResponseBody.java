// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class DescribeProjectsResponseBody extends TeaModel {
    @NameInMap("items")
    public java.util.List<DescribeProjectsResponseBodyItems> items;

    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Long totalCount;

    public static DescribeProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectsResponseBody self = new DescribeProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProjectsResponseBody setItems(java.util.List<DescribeProjectsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeProjectsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeProjectsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeProjectsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProjectsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeProjectsResponseBodyItemsEngines extends TeaModel {
        @NameInMap("sast")
        public Boolean sast;

        @NameInMap("sca")
        public Boolean sca;

        public static DescribeProjectsResponseBodyItemsEngines build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectsResponseBodyItemsEngines self = new DescribeProjectsResponseBodyItemsEngines();
            return TeaModel.build(map, self);
        }

        public DescribeProjectsResponseBodyItemsEngines setSast(Boolean sast) {
            this.sast = sast;
            return this;
        }
        public Boolean getSast() {
            return this.sast;
        }

        public DescribeProjectsResponseBodyItemsEngines setSca(Boolean sca) {
            this.sca = sca;
            return this;
        }
        public Boolean getSca() {
            return this.sca;
        }

    }

    public static class DescribeProjectsResponseBodyItemsSource extends TeaModel {
        @NameInMap("type")
        public String type;

        public static DescribeProjectsResponseBodyItemsSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectsResponseBodyItemsSource self = new DescribeProjectsResponseBodyItemsSource();
            return TeaModel.build(map, self);
        }

        public DescribeProjectsResponseBodyItemsSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeProjectsResponseBodyItems extends TeaModel {
        @NameInMap("configRevision")
        public Long configRevision;

        /**
         * <p>扫描项目创建时间（RFC3339）</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("createdBy")
        public String createdBy;

        @NameInMap("description")
        public String description;

        @NameInMap("engines")
        public DescribeProjectsResponseBodyItemsEngines engines;

        @NameInMap("id")
        public Long id;

        @NameInMap("instructionPrompt")
        public String instructionPrompt;

        @NameInMap("name")
        public String name;

        @NameInMap("source")
        public DescribeProjectsResponseBodyItemsSource source;

        /**
         * <p>扫描项目更新时间（RFC3339）</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static DescribeProjectsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectsResponseBodyItems self = new DescribeProjectsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeProjectsResponseBodyItems setConfigRevision(Long configRevision) {
            this.configRevision = configRevision;
            return this;
        }
        public Long getConfigRevision() {
            return this.configRevision;
        }

        public DescribeProjectsResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DescribeProjectsResponseBodyItems setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public DescribeProjectsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeProjectsResponseBodyItems setEngines(DescribeProjectsResponseBodyItemsEngines engines) {
            this.engines = engines;
            return this;
        }
        public DescribeProjectsResponseBodyItemsEngines getEngines() {
            return this.engines;
        }

        public DescribeProjectsResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeProjectsResponseBodyItems setInstructionPrompt(String instructionPrompt) {
            this.instructionPrompt = instructionPrompt;
            return this;
        }
        public String getInstructionPrompt() {
            return this.instructionPrompt;
        }

        public DescribeProjectsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProjectsResponseBodyItems setSource(DescribeProjectsResponseBodyItemsSource source) {
            this.source = source;
            return this;
        }
        public DescribeProjectsResponseBodyItemsSource getSource() {
            return this.source;
        }

        public DescribeProjectsResponseBodyItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
