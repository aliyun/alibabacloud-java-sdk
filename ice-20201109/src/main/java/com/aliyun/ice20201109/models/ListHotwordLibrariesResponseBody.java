// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListHotwordLibrariesResponseBody extends TeaModel {
    @NameInMap("HotwordLibraryList")
    public java.util.List<ListHotwordLibrariesResponseBodyHotwordLibraryList> hotwordLibraryList;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>CBB6BC61D08</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>9262E3DA-07FA-4862-FCBB6BC61D08</strong></strong>*</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListHotwordLibrariesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotwordLibrariesResponseBody self = new ListHotwordLibrariesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotwordLibrariesResponseBody setHotwordLibraryList(java.util.List<ListHotwordLibrariesResponseBodyHotwordLibraryList> hotwordLibraryList) {
        this.hotwordLibraryList = hotwordLibraryList;
        return this;
    }
    public java.util.List<ListHotwordLibrariesResponseBodyHotwordLibraryList> getHotwordLibraryList() {
        return this.hotwordLibraryList;
    }

    public ListHotwordLibrariesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListHotwordLibrariesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListHotwordLibrariesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotwordLibrariesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListHotwordLibrariesResponseBodyHotwordLibraryList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>a93b91141c0f422fa114af203f8b****</p>
         */
        @NameInMap("HotwordLibraryId")
        public String hotwordLibraryId;

        /**
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>my_hotwords</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>ASR</p>
         */
        @NameInMap("UsageScenario")
        public String usageScenario;

        public static ListHotwordLibrariesResponseBodyHotwordLibraryList build(java.util.Map<String, ?> map) throws Exception {
            ListHotwordLibrariesResponseBodyHotwordLibraryList self = new ListHotwordLibrariesResponseBodyHotwordLibraryList();
            return TeaModel.build(map, self);
        }

        public ListHotwordLibrariesResponseBodyHotwordLibraryList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListHotwordLibrariesResponseBodyHotwordLibraryList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListHotwordLibrariesResponseBodyHotwordLibraryList setHotwordLibraryId(String hotwordLibraryId) {
            this.hotwordLibraryId = hotwordLibraryId;
            return this;
        }
        public String getHotwordLibraryId() {
            return this.hotwordLibraryId;
        }

        public ListHotwordLibrariesResponseBodyHotwordLibraryList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListHotwordLibrariesResponseBodyHotwordLibraryList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListHotwordLibrariesResponseBodyHotwordLibraryList setUsageScenario(String usageScenario) {
            this.usageScenario = usageScenario;
            return this;
        }
        public String getUsageScenario() {
            return this.usageScenario;
        }

    }

}
