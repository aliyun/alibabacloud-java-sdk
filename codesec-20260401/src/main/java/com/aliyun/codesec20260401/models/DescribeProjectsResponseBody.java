// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class DescribeProjectsResponseBody extends TeaModel {
    /**
     * <p>The list of projects.</p>
     */
    @NameInMap("items")
    public java.util.List<DescribeProjectsResponseBodyItems> items;

    /**
     * <p>The page size.</p>
     * <blockquote>
     * <p>If this parameter is not specified, all projects are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. An empty value indicates the last page.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJ0IjoiMjAyNi0wNy0xNlQwNzo1MzozOC4wMjFaIiwiaSI6MTAwMDQ0OH0</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9A1F403F-0A85-5578-8B7C-55E3E9408659</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <p>Indicates whether SAST is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("sast")
        public Boolean sast;

        /**
         * <p>Indicates whether SCA is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>The project type.</p>
         * 
         * <strong>example:</strong>
         * <p>manual_upload</p>
         */
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
        /**
         * <p>The project configuration version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("configRevision")
        public Long configRevision;

        /**
         * <p>The time when the project was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-28T03:36:31.573Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The user ID of the project creator.</p>
         * 
         * <strong>example:</strong>
         * <p>11111</p>
         */
        @NameInMap("createdBy")
        public String createdBy;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The engine switches for the project or scan snapshot. Only SAST and SCA are supported.</p>
         */
        @NameInMap("engines")
        public DescribeProjectsResponseBodyItemsEngines engines;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>934</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The natural language prompt provided by the user that describes scanning or result processing preferences, such as ignoring low-risk vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("instructionPrompt")
        public String instructionPrompt;

        /**
         * <p>The time when a task was last created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-28T03:36:31.573Z</p>
         */
        @NameInMap("lastScanTime")
        public String lastScanTime;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>manual-hDecBn</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The project source.</p>
         */
        @NameInMap("source")
        public DescribeProjectsResponseBodyItemsSource source;

        /**
         * <p>The time when the project was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-28T03:36:31.573Z</p>
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

        public DescribeProjectsResponseBodyItems setLastScanTime(String lastScanTime) {
            this.lastScanTime = lastScanTime;
            return this;
        }
        public String getLastScanTime() {
            return this.lastScanTime;
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
