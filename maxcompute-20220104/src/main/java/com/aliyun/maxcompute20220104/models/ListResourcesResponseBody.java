// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListResourcesResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListResourcesResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc3b4ae16685836687916212e7850</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesResponseBody self = new ListResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourcesResponseBody setData(ListResourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListResourcesResponseBodyData getData() {
        return this.data;
    }

    public ListResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListResourcesResponseBodyDataResources extends TeaModel {
        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("comment")
        public String comment;

        /**
         * <p>The Base64-encoded 128-bit MD5 hash value of the HTTP request body.</p>
         * 
         * <strong>example:</strong>
         * <p>MACiECZtnLiNkNS1v5****=1</p>
         */
        @NameInMap("contentMD5")
        public String contentMD5;

        /**
         * <p>The time when the resource was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-29T03:34:09Z</p>
         */
        @NameInMap("creationTime")
        public Long creationTime;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>res_1</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The time when the resource was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-18T06:15:05Z</p>
         */
        @NameInMap("lastModifiedTime")
        public Long lastModifiedTime;

        /**
         * <p>The user who updated the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN$<a href="mailto:xxx@test.aliyunid.com">xxx@test.aliyunid.com</a></p>
         */
        @NameInMap("lastUpdator")
        public String lastUpdator;

        /**
         * <p>The name of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>res_1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The owner of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>1265860483008101</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <p>The schema to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>schemaA</p>
         */
        @NameInMap("schema")
        public String schema;

        /**
         * <p>The size of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <p>The resource type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>file</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>py</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>jar</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>volumefile</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>table</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("type")
        public String type;

        public static ListResourcesResponseBodyDataResources build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyDataResources self = new ListResourcesResponseBodyDataResources();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyDataResources setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListResourcesResponseBodyDataResources setContentMD5(String contentMD5) {
            this.contentMD5 = contentMD5;
            return this;
        }
        public String getContentMD5() {
            return this.contentMD5;
        }

        public ListResourcesResponseBodyDataResources setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public ListResourcesResponseBodyDataResources setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListResourcesResponseBodyDataResources setLastModifiedTime(Long lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public Long getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListResourcesResponseBodyDataResources setLastUpdator(String lastUpdator) {
            this.lastUpdator = lastUpdator;
            return this;
        }
        public String getLastUpdator() {
            return this.lastUpdator;
        }

        public ListResourcesResponseBodyDataResources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourcesResponseBodyDataResources setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListResourcesResponseBodyDataResources setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public ListResourcesResponseBodyDataResources setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListResourcesResponseBodyDataResources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListResourcesResponseBodyData extends TeaModel {
        /**
         * <p>Indicates the marker after which the returned list begins.</p>
         * 
         * <strong>example:</strong>
         * <p>ZmN0X21vbnRoX3Rhb2Jhb19pbmRleCE=</p>
         */
        @NameInMap("marker")
        public String marker;

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxItem")
        public Integer maxItem;

        /**
         * <p>The list of resources.</p>
         */
        @NameInMap("resources")
        public java.util.List<ListResourcesResponseBodyDataResources> resources;

        public static ListResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyData self = new ListResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyData setMarker(String marker) {
            this.marker = marker;
            return this;
        }
        public String getMarker() {
            return this.marker;
        }

        public ListResourcesResponseBodyData setMaxItem(Integer maxItem) {
            this.maxItem = maxItem;
            return this;
        }
        public Integer getMaxItem() {
            return this.maxItem;
        }

        public ListResourcesResponseBodyData setResources(java.util.List<ListResourcesResponseBodyDataResources> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<ListResourcesResponseBodyDataResources> getResources() {
            return this.resources;
        }

    }

}
