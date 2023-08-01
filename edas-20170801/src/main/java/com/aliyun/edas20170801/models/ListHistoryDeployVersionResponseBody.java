// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListHistoryDeployVersionResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The information about historical deployment packages.</p>
     */
    @NameInMap("PackageVersionList")
    public ListHistoryDeployVersionResponseBodyPackageVersionList packageVersionList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListHistoryDeployVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHistoryDeployVersionResponseBody self = new ListHistoryDeployVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHistoryDeployVersionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListHistoryDeployVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHistoryDeployVersionResponseBody setPackageVersionList(ListHistoryDeployVersionResponseBodyPackageVersionList packageVersionList) {
        this.packageVersionList = packageVersionList;
        return this;
    }
    public ListHistoryDeployVersionResponseBodyPackageVersionList getPackageVersionList() {
        return this.packageVersionList;
    }

    public ListHistoryDeployVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The time when the deployment package was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the deployment package.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The unique ID of the deployment package.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The version of the application that was released by using the deployment package. This version can be used to call the RollbackApplication operation.</p>
         */
        @NameInMap("PackageVersion")
        public String packageVersion;

        /**
         * <p>The URL of the deployment package.</p>
         */
        @NameInMap("PublicUrl")
        public String publicUrl;

        /**
         * <p>The deployment mode of the application. Valid values:</p>
         * <br>
         * <p>*   url: The application is deployed by using a JAR or WAR package.</p>
         * <p>*   image: The application is deployed by using an image.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The time when the deployment package was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The URL of the deployment package.</p>
         */
        @NameInMap("WarUrl")
        public String warUrl;

        public static ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion build(java.util.Map<String, ?> map) throws Exception {
            ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion self = new ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion();
            return TeaModel.build(map, self);
        }

        public ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

        public ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion setPublicUrl(String publicUrl) {
            this.publicUrl = publicUrl;
            return this;
        }
        public String getPublicUrl() {
            return this.publicUrl;
        }

        public ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion setWarUrl(String warUrl) {
            this.warUrl = warUrl;
            return this;
        }
        public String getWarUrl() {
            return this.warUrl;
        }

    }

    public static class ListHistoryDeployVersionResponseBodyPackageVersionList extends TeaModel {
        @NameInMap("PackageVersion")
        public java.util.List<ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion> packageVersion;

        public static ListHistoryDeployVersionResponseBodyPackageVersionList build(java.util.Map<String, ?> map) throws Exception {
            ListHistoryDeployVersionResponseBodyPackageVersionList self = new ListHistoryDeployVersionResponseBodyPackageVersionList();
            return TeaModel.build(map, self);
        }

        public ListHistoryDeployVersionResponseBodyPackageVersionList setPackageVersion(java.util.List<ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion> packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public java.util.List<ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion> getPackageVersion() {
            return this.packageVersion;
        }

    }

}
