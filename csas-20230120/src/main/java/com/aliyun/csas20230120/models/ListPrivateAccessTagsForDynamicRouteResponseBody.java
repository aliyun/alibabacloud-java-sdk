// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessTagsForDynamicRouteResponseBody extends TeaModel {
    @NameInMap("DynamicRoutes")
    public java.util.List<ListPrivateAccessTagsForDynamicRouteResponseBodyDynamicRoutes> dynamicRoutes;

    /**
     * <strong>example:</strong>
     * <p>B608C6AE-623D-55C4-9454-601B88AE937E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPrivateAccessTagsForDynamicRouteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateAccessTagsForDynamicRouteResponseBody self = new ListPrivateAccessTagsForDynamicRouteResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrivateAccessTagsForDynamicRouteResponseBody setDynamicRoutes(java.util.List<ListPrivateAccessTagsForDynamicRouteResponseBodyDynamicRoutes> dynamicRoutes) {
        this.dynamicRoutes = dynamicRoutes;
        return this;
    }
    public java.util.List<ListPrivateAccessTagsForDynamicRouteResponseBodyDynamicRoutes> getDynamicRoutes() {
        return this.dynamicRoutes;
    }

    public ListPrivateAccessTagsForDynamicRouteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPrivateAccessTagsForDynamicRouteResponseBodyDynamicRoutesTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-10-23 14:02:56</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>tag_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>tag-d3f64e8bdd4a****</p>
         */
        @NameInMap("TagId")
        public String tagId;

        /**
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("TagType")
        public String tagType;

        public static ListPrivateAccessTagsForDynamicRouteResponseBodyDynamicRoutesTags build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateAccessTagsForDynamicRouteResponseBodyDynamicRoutesTags self = new ListPrivateAccessTagsForDynamicRouteResponseBodyDynamicRoutesTags();
            return TeaModel.build(map, self);
        }

        public ListPrivateAccessTagsForDynamicRouteResponseBodyDynamicRoutesTags setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPrivateAccessTagsForDynamicRouteResponseBodyDynamicRoutesTags setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPrivateAccessTagsForDynamicRouteResponseBodyDynamicRoutesTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPrivateAccessTagsForDynamicRouteResponseBodyDynamicRoutesTags setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public ListPrivateAccessTagsForDynamicRouteResponseBodyDynamicRoutesTags setTagType(String tagType) {
            this.tagType = tagType;
            return this;
        }
        public String getTagType() {
            return this.tagType;
        }

    }

    public static class ListPrivateAccessTagsForDynamicRouteResponseBodyDynamicRoutes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dr-ca9fddfac7c6****</p>
         */
        @NameInMap("DynamicRouteId")
        public String dynamicRouteId;

        @NameInMap("Tags")
        public java.util.List<ListPrivateAccessTagsForDynamicRouteResponseBodyDynamicRoutesTags> tags;

        public static ListPrivateAccessTagsForDynamicRouteResponseBodyDynamicRoutes build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateAccessTagsForDynamicRouteResponseBodyDynamicRoutes self = new ListPrivateAccessTagsForDynamicRouteResponseBodyDynamicRoutes();
            return TeaModel.build(map, self);
        }

        public ListPrivateAccessTagsForDynamicRouteResponseBodyDynamicRoutes setDynamicRouteId(String dynamicRouteId) {
            this.dynamicRouteId = dynamicRouteId;
            return this;
        }
        public String getDynamicRouteId() {
            return this.dynamicRouteId;
        }

        public ListPrivateAccessTagsForDynamicRouteResponseBodyDynamicRoutes setTags(java.util.List<ListPrivateAccessTagsForDynamicRouteResponseBodyDynamicRoutesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListPrivateAccessTagsForDynamicRouteResponseBodyDynamicRoutesTags> getTags() {
            return this.tags;
        }

    }

}
