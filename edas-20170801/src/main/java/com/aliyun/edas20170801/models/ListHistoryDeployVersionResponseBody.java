// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListHistoryDeployVersionResponseBody extends TeaModel {
    @NameInMap("PackageVersionList")
    public ListHistoryDeployVersionResponseBodyPackageVersionList packageVersionList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    public static ListHistoryDeployVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHistoryDeployVersionResponseBody self = new ListHistoryDeployVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHistoryDeployVersionResponseBody setPackageVersionList(ListHistoryDeployVersionResponseBodyPackageVersionList packageVersionList) {
        this.packageVersionList = packageVersionList;
        return this;
    }
    public ListHistoryDeployVersionResponseBodyPackageVersionList getPackageVersionList() {
        return this.packageVersionList;
    }

    public ListHistoryDeployVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHistoryDeployVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHistoryDeployVersionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("PublicUrl")
        public String publicUrl;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("WarUrl")
        public String warUrl;

        @NameInMap("Id")
        public String id;

        @NameInMap("PackageVersion")
        public String packageVersion;

        public static ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion build(java.util.Map<String, ?> map) throws Exception {
            ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion self = new ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion();
            return TeaModel.build(map, self);
        }

        public ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion setPublicUrl(String publicUrl) {
            this.publicUrl = publicUrl;
            return this;
        }
        public String getPublicUrl() {
            return this.publicUrl;
        }

        public ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListHistoryDeployVersionResponseBodyPackageVersionListPackageVersion setWarUrl(String warUrl) {
            this.warUrl = warUrl;
            return this;
        }
        public String getWarUrl() {
            return this.warUrl;
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
