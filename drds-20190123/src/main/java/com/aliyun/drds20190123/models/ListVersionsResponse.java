// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ListVersionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("versions")
    @Validation(required = true)
    public ListVersionsResponseVersions versions;

    public static ListVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVersionsResponse self = new ListVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListVersionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVersionsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListVersionsResponse setVersions(ListVersionsResponseVersions versions) {
        this.versions = versions;
        return this;
    }
    public ListVersionsResponseVersions getVersions() {
        return this.versions;
    }

    public static class ListVersionsResponseVersionsVersions extends TeaModel {
        @NameInMap("DrdsVersion")
        @Validation(required = true)
        public String drdsVersion;

        @NameInMap("Latest")
        @Validation(required = true)
        public Boolean latest;

        public static ListVersionsResponseVersionsVersions build(java.util.Map<String, ?> map) throws Exception {
            ListVersionsResponseVersionsVersions self = new ListVersionsResponseVersionsVersions();
            return TeaModel.build(map, self);
        }

        public ListVersionsResponseVersionsVersions setDrdsVersion(String drdsVersion) {
            this.drdsVersion = drdsVersion;
            return this;
        }
        public String getDrdsVersion() {
            return this.drdsVersion;
        }

        public ListVersionsResponseVersionsVersions setLatest(Boolean latest) {
            this.latest = latest;
            return this;
        }
        public Boolean getLatest() {
            return this.latest;
        }

    }

    public static class ListVersionsResponseVersions extends TeaModel {
        @NameInMap("versions")
        @Validation(required = true)
        public java.util.List<ListVersionsResponseVersionsVersions> versions;

        public static ListVersionsResponseVersions build(java.util.Map<String, ?> map) throws Exception {
            ListVersionsResponseVersions self = new ListVersionsResponseVersions();
            return TeaModel.build(map, self);
        }

        public ListVersionsResponseVersions setVersions(java.util.List<ListVersionsResponseVersionsVersions> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<ListVersionsResponseVersionsVersions> getVersions() {
            return this.versions;
        }

    }

}
