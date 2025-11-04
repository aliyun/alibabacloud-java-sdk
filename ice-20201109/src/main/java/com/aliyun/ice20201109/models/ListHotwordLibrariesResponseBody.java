// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListHotwordLibrariesResponseBody extends TeaModel {
    /**
     * <p>The hotword libraries.</p>
     */
    @NameInMap("HotwordLibraryList")
    public java.util.List<ListHotwordLibrariesResponseBodyHotwordLibraryList> hotwordLibraryList;

    /**
     * <p>The maximum number of hotword libraries that can be returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token that can be used in the next request to retrieve a new page of results. If it is empty, all results are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>CBB6BC61D08</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>9262E3DA-07FA-4862-FCBB6BC61D08</strong></strong>*</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of hotword libraries.</p>
     * 
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
         * <p>The time when the hotword library was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the hotword library. It can be up to 200 characters in length.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the hotword library.</p>
         * 
         * <strong>example:</strong>
         * <p>a93b91141c0f422fa114af203f8b****</p>
         */
        @NameInMap("HotwordLibraryId")
        public String hotwordLibraryId;

        /**
         * <p>The time when the hotword library was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The name of the hotword library.</p>
         * 
         * <strong>example:</strong>
         * <p>my_hotwords</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The usage scenario of the hotword library. Valid values:</p>
         * <ul>
         * <li>ASR: Automatic Speech Recognition</li>
         * <li>StructuredMediaAssets: structured media analysis</li>
         * <li>VideoTranslation: Video translation This field cannot be modified after the hotword library is created.</li>
         * </ul>
         * 
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
