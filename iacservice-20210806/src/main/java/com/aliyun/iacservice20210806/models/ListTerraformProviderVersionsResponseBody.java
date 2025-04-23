// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListTerraformProviderVersionsResponseBody extends TeaModel {
    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>73588ebb-9d40-4660-a59f-764636ae6034</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    @NameInMap("verisonList")
    public java.util.List<String> verisonList;

    @NameInMap("versions")
    public java.util.List<ListTerraformProviderVersionsResponseBodyVersions> versions;

    public static ListTerraformProviderVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTerraformProviderVersionsResponseBody self = new ListTerraformProviderVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTerraformProviderVersionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTerraformProviderVersionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTerraformProviderVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTerraformProviderVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTerraformProviderVersionsResponseBody setVerisonList(java.util.List<String> verisonList) {
        this.verisonList = verisonList;
        return this;
    }
    public java.util.List<String> getVerisonList() {
        return this.verisonList;
    }

    public ListTerraformProviderVersionsResponseBody setVersions(java.util.List<ListTerraformProviderVersionsResponseBodyVersions> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<ListTerraformProviderVersionsResponseBodyVersions> getVersions() {
        return this.versions;
    }

    public static class ListTerraformProviderVersionsResponseBodyVersions extends TeaModel {
        @NameInMap("publishedTime")
        public String publishedTime;

        @NameInMap("status")
        public String status;

        @NameInMap("version")
        public String version;

        public static ListTerraformProviderVersionsResponseBodyVersions build(java.util.Map<String, ?> map) throws Exception {
            ListTerraformProviderVersionsResponseBodyVersions self = new ListTerraformProviderVersionsResponseBodyVersions();
            return TeaModel.build(map, self);
        }

        public ListTerraformProviderVersionsResponseBodyVersions setPublishedTime(String publishedTime) {
            this.publishedTime = publishedTime;
            return this;
        }
        public String getPublishedTime() {
            return this.publishedTime;
        }

        public ListTerraformProviderVersionsResponseBodyVersions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTerraformProviderVersionsResponseBodyVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
