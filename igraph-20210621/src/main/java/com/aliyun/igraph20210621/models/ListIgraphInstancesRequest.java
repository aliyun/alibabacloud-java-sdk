// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class ListIgraphInstancesRequest extends TeaModel {
    @NameInMap("pageContinue")
    public String pageContinue;

    @NameInMap("pageLimit")
    public String pageLimit;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("tags")
    public java.util.List<ListIgraphInstancesRequestTags> tags;

    public static ListIgraphInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIgraphInstancesRequest self = new ListIgraphInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListIgraphInstancesRequest setPageContinue(String pageContinue) {
        this.pageContinue = pageContinue;
        return this;
    }
    public String getPageContinue() {
        return this.pageContinue;
    }

    public ListIgraphInstancesRequest setPageLimit(String pageLimit) {
        this.pageLimit = pageLimit;
        return this;
    }
    public String getPageLimit() {
        return this.pageLimit;
    }

    public ListIgraphInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListIgraphInstancesRequest setTags(java.util.List<ListIgraphInstancesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListIgraphInstancesRequestTags> getTags() {
        return this.tags;
    }

    public static class ListIgraphInstancesRequestTags extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static ListIgraphInstancesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListIgraphInstancesRequestTags self = new ListIgraphInstancesRequestTags();
            return TeaModel.build(map, self);
        }

        public ListIgraphInstancesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListIgraphInstancesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
