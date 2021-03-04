// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListSecretVersionIdsResponseBody extends TeaModel {
    @NameInMap("SecretName")
    public String secretName;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("VersionIds")
    public ListSecretVersionIdsResponseBodyVersionIds versionIds;

    public static ListSecretVersionIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecretVersionIdsResponseBody self = new ListSecretVersionIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecretVersionIdsResponseBody setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public ListSecretVersionIdsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListSecretVersionIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSecretVersionIdsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSecretVersionIdsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSecretVersionIdsResponseBody setVersionIds(ListSecretVersionIdsResponseBodyVersionIds versionIds) {
        this.versionIds = versionIds;
        return this;
    }
    public ListSecretVersionIdsResponseBodyVersionIds getVersionIds() {
        return this.versionIds;
    }

    public static class ListSecretVersionIdsResponseBodyVersionIdsVersionIdVersionStages extends TeaModel {
        @NameInMap("VersionStage")
        public java.util.List<String> versionStage;

        public static ListSecretVersionIdsResponseBodyVersionIdsVersionIdVersionStages build(java.util.Map<String, ?> map) throws Exception {
            ListSecretVersionIdsResponseBodyVersionIdsVersionIdVersionStages self = new ListSecretVersionIdsResponseBodyVersionIdsVersionIdVersionStages();
            return TeaModel.build(map, self);
        }

        public ListSecretVersionIdsResponseBodyVersionIdsVersionIdVersionStages setVersionStage(java.util.List<String> versionStage) {
            this.versionStage = versionStage;
            return this;
        }
        public java.util.List<String> getVersionStage() {
            return this.versionStage;
        }

    }

    public static class ListSecretVersionIdsResponseBodyVersionIdsVersionId extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("VersionId")
        public String versionId;

        @NameInMap("VersionStages")
        public ListSecretVersionIdsResponseBodyVersionIdsVersionIdVersionStages versionStages;

        public static ListSecretVersionIdsResponseBodyVersionIdsVersionId build(java.util.Map<String, ?> map) throws Exception {
            ListSecretVersionIdsResponseBodyVersionIdsVersionId self = new ListSecretVersionIdsResponseBodyVersionIdsVersionId();
            return TeaModel.build(map, self);
        }

        public ListSecretVersionIdsResponseBodyVersionIdsVersionId setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSecretVersionIdsResponseBodyVersionIdsVersionId setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public ListSecretVersionIdsResponseBodyVersionIdsVersionId setVersionStages(ListSecretVersionIdsResponseBodyVersionIdsVersionIdVersionStages versionStages) {
            this.versionStages = versionStages;
            return this;
        }
        public ListSecretVersionIdsResponseBodyVersionIdsVersionIdVersionStages getVersionStages() {
            return this.versionStages;
        }

    }

    public static class ListSecretVersionIdsResponseBodyVersionIds extends TeaModel {
        @NameInMap("VersionId")
        public java.util.List<ListSecretVersionIdsResponseBodyVersionIdsVersionId> versionId;

        public static ListSecretVersionIdsResponseBodyVersionIds build(java.util.Map<String, ?> map) throws Exception {
            ListSecretVersionIdsResponseBodyVersionIds self = new ListSecretVersionIdsResponseBodyVersionIds();
            return TeaModel.build(map, self);
        }

        public ListSecretVersionIdsResponseBodyVersionIds setVersionId(java.util.List<ListSecretVersionIdsResponseBodyVersionIdsVersionId> versionId) {
            this.versionId = versionId;
            return this;
        }
        public java.util.List<ListSecretVersionIdsResponseBodyVersionIdsVersionId> getVersionId() {
            return this.versionId;
        }

    }

}
