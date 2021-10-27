// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ListVersionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("versions")
    public ListVersionsResponseBodyVersions versions;

    public static ListVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVersionsResponseBody self = new ListVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVersionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListVersionsResponseBody setVersions(ListVersionsResponseBodyVersions versions) {
        this.versions = versions;
        return this;
    }
    public ListVersionsResponseBodyVersions getVersions() {
        return this.versions;
    }

    public static class ListVersionsResponseBodyVersionsVersions extends TeaModel {
        @NameInMap("DrdsVersion")
        public String drdsVersion;

        @NameInMap("Latest")
        public Boolean latest;

        public static ListVersionsResponseBodyVersionsVersions build(java.util.Map<String, ?> map) throws Exception {
            ListVersionsResponseBodyVersionsVersions self = new ListVersionsResponseBodyVersionsVersions();
            return TeaModel.build(map, self);
        }

        public ListVersionsResponseBodyVersionsVersions setDrdsVersion(String drdsVersion) {
            this.drdsVersion = drdsVersion;
            return this;
        }
        public String getDrdsVersion() {
            return this.drdsVersion;
        }

        public ListVersionsResponseBodyVersionsVersions setLatest(Boolean latest) {
            this.latest = latest;
            return this;
        }
        public Boolean getLatest() {
            return this.latest;
        }

    }

    public static class ListVersionsResponseBodyVersions extends TeaModel {
        @NameInMap("versions")
        public java.util.List<ListVersionsResponseBodyVersionsVersions> versions;

        public static ListVersionsResponseBodyVersions build(java.util.Map<String, ?> map) throws Exception {
            ListVersionsResponseBodyVersions self = new ListVersionsResponseBodyVersions();
            return TeaModel.build(map, self);
        }

        public ListVersionsResponseBodyVersions setVersions(java.util.List<ListVersionsResponseBodyVersionsVersions> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<ListVersionsResponseBodyVersionsVersions> getVersions() {
            return this.versions;
        }

    }

}
