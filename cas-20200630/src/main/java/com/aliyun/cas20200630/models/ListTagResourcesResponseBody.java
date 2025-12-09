// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListTagResourcesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListTagResourcesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>2D69A58F-345C-4FDE-88E4-BF5189484043</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListTagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesResponseBody self = new ListTagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesResponseBody setData(ListTagResourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTagResourcesResponseBodyData getData() {
        return this.data;
    }

    public ListTagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTagResourcesResponseBodyDataTagResourcesTagResources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cas-upload-xgjcng</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>ALIYUN::CAS::PCACERTIFICATE</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>PVDCDC</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListTagResourcesResponseBodyDataTagResourcesTagResources build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyDataTagResourcesTagResources self = new ListTagResourcesResponseBodyDataTagResourcesTagResources();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyDataTagResourcesTagResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTagResourcesResponseBodyDataTagResourcesTagResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListTagResourcesResponseBodyDataTagResourcesTagResources setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTagResourcesResponseBodyDataTagResourcesTagResources setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListTagResourcesResponseBodyDataTagResources extends TeaModel {
        @NameInMap("TagResources")
        public java.util.List<ListTagResourcesResponseBodyDataTagResourcesTagResources> tagResources;

        public static ListTagResourcesResponseBodyDataTagResources build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyDataTagResources self = new ListTagResourcesResponseBodyDataTagResources();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyDataTagResources setTagResources(java.util.List<ListTagResourcesResponseBodyDataTagResourcesTagResources> tagResources) {
            this.tagResources = tagResources;
            return this;
        }
        public java.util.List<ListTagResourcesResponseBodyDataTagResourcesTagResources> getTagResources() {
            return this.tagResources;
        }

    }

    public static class ListTagResourcesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>24262</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("TagResources")
        public ListTagResourcesResponseBodyDataTagResources tagResources;

        public static ListTagResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesResponseBodyData self = new ListTagResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListTagResourcesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListTagResourcesResponseBodyData setTagResources(ListTagResourcesResponseBodyDataTagResources tagResources) {
            this.tagResources = tagResources;
            return this;
        }
        public ListTagResourcesResponseBodyDataTagResources getTagResources() {
            return this.tagResources;
        }

    }

}
