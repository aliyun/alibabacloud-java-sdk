// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListClientPluginVersionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClientPluginVersions")
    public java.util.List<ListClientPluginVersionsResponseBodyClientPluginVersions> clientPluginVersions;

    public static ListClientPluginVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClientPluginVersionsResponseBody self = new ListClientPluginVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClientPluginVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClientPluginVersionsResponseBody setClientPluginVersions(java.util.List<ListClientPluginVersionsResponseBodyClientPluginVersions> clientPluginVersions) {
        this.clientPluginVersions = clientPluginVersions;
        return this;
    }
    public java.util.List<ListClientPluginVersionsResponseBodyClientPluginVersions> getClientPluginVersions() {
        return this.clientPluginVersions;
    }

    public static class ListClientPluginVersionsResponseBodyClientPluginVersions extends TeaModel {
        @NameInMap("PkgName")
        public String pkgName;

        @NameInMap("VersionCode")
        public Long versionCode;

        @NameInMap("Version")
        public String version;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Id")
        public Long id;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        public static ListClientPluginVersionsResponseBodyClientPluginVersions build(java.util.Map<String, ?> map) throws Exception {
            ListClientPluginVersionsResponseBodyClientPluginVersions self = new ListClientPluginVersionsResponseBodyClientPluginVersions();
            return TeaModel.build(map, self);
        }

        public ListClientPluginVersionsResponseBodyClientPluginVersions setPkgName(String pkgName) {
            this.pkgName = pkgName;
            return this;
        }
        public String getPkgName() {
            return this.pkgName;
        }

        public ListClientPluginVersionsResponseBodyClientPluginVersions setVersionCode(Long versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public Long getVersionCode() {
            return this.versionCode;
        }

        public ListClientPluginVersionsResponseBodyClientPluginVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListClientPluginVersionsResponseBodyClientPluginVersions setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListClientPluginVersionsResponseBodyClientPluginVersions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListClientPluginVersionsResponseBodyClientPluginVersions setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

    }

}
