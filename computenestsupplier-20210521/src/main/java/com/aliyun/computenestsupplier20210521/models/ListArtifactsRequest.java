// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListArtifactsRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<ListArtifactsRequestFilter> filter;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public java.util.List<ListArtifactsRequestTag> tag;

    public static ListArtifactsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactsRequest self = new ListArtifactsRequest();
        return TeaModel.build(map, self);
    }

    public ListArtifactsRequest setFilter(java.util.List<ListArtifactsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListArtifactsRequestFilter> getFilter() {
        return this.filter;
    }

    public ListArtifactsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListArtifactsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListArtifactsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListArtifactsRequest setTag(java.util.List<ListArtifactsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListArtifactsRequestTag> getTag() {
        return this.tag;
    }

    public static class ListArtifactsRequestFilter extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListArtifactsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListArtifactsRequestFilter self = new ListArtifactsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListArtifactsRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListArtifactsRequestFilter setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListArtifactsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListArtifactsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListArtifactsRequestTag self = new ListArtifactsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListArtifactsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListArtifactsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
