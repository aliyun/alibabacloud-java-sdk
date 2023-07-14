// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTraceAppByNameRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<SearchTraceAppByNameRequestTags> tags;

    /**
     * <p>The name of the application.</p>
     * <br>
     * <p>> If you do not specify this parameter, all application monitoring tasks in the specified region are queried.</p>
     */
    @NameInMap("TraceAppName")
    public String traceAppName;

    public static SearchTraceAppByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchTraceAppByNameRequest self = new SearchTraceAppByNameRequest();
        return TeaModel.build(map, self);
    }

    public SearchTraceAppByNameRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SearchTraceAppByNameRequest setTags(java.util.List<SearchTraceAppByNameRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<SearchTraceAppByNameRequestTags> getTags() {
        return this.tags;
    }

    public SearchTraceAppByNameRequest setTraceAppName(String traceAppName) {
        this.traceAppName = traceAppName;
        return this;
    }
    public String getTraceAppName() {
        return this.traceAppName;
    }

    public static class SearchTraceAppByNameRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static SearchTraceAppByNameRequestTags build(java.util.Map<String, ?> map) throws Exception {
            SearchTraceAppByNameRequestTags self = new SearchTraceAppByNameRequestTags();
            return TeaModel.build(map, self);
        }

        public SearchTraceAppByNameRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SearchTraceAppByNameRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
