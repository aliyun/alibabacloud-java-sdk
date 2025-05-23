// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListServiceVersionsResponseBody extends TeaModel {
    /**
     * <p>The order in which the returned versions are sorted. Valid values:</p>
     * <ul>
     * <li><strong>FORWARD</strong>: The results are sorted in ascending order.</li>
     * <li><strong>BACKWARD</strong>: The results are sorted in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BACKWARD</p>
     */
    @NameInMap("direction")
    public String direction;

    /**
     * <p>The token required to obtain more results. If the number of layers exceeds the limit, the nextToken parameter is returned. You can include the parameter in subsequent calls to obtain more results. You do not need to provide this parameter in the first call.</p>
     * 
     * <strong>example:</strong>
     * <p>eJhojW7N****</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The versions.</p>
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
         * <p>The time when the service version was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03-16T06:23:50Z</p>
         */
        @NameInMap("createdTime")
        public String createdTime;

        /**
         * <p>The description of the service version.</p>
         * 
         * <strong>example:</strong>
         * <p>test_description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The last time when the service version was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-15T06:12:31Z</p>
         */
        @NameInMap("lastModifiedTime")
        public String lastModifiedTime;

        /**
         * <p>The version of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
