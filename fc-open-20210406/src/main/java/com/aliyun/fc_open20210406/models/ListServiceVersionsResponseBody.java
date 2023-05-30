// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListServiceVersionsResponseBody extends TeaModel {
    /**
     * <p>The information about the version.</p>
     */
    @NameInMap("direction")
    public String direction;

    /**
     * <p>$.parameters[9].schema.description</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>$.parameters[9].schema.enumValueTitles</p>
     */
    @NameInMap("versions")
    public java.util.List<ListServiceVersionsResponseBodyVersions> versions;

    public static ListServiceVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceVersionsResponseBody self = new ListServiceVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceVersionsResponseBody setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ListServiceVersionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceVersionsResponseBody setVersions(java.util.List<ListServiceVersionsResponseBodyVersions> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<ListServiceVersionsResponseBodyVersions> getVersions() {
        return this.versions;
    }

    public static class ListServiceVersionsResponseBodyVersions extends TeaModel {
        /**
         * <p>$.parameters[10].schema.enumValueTitles</p>
         */
        @NameInMap("createdTime")
        public String createdTime;

        /**
         * <p>Queries all the versions of a service.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Xiaoqi</p>
         */
        @NameInMap("lastModifiedTime")
        public String lastModifiedTime;

        @NameInMap("versionId")
        public String versionId;

        public static ListServiceVersionsResponseBodyVersions build(java.util.Map<String, ?> map) throws Exception {
            ListServiceVersionsResponseBodyVersions self = new ListServiceVersionsResponseBodyVersions();
            return TeaModel.build(map, self);
        }

        public ListServiceVersionsResponseBodyVersions setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListServiceVersionsResponseBodyVersions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListServiceVersionsResponseBodyVersions setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListServiceVersionsResponseBodyVersions setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

}
