// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListSecretVersionIdsResponse extends TeaModel {
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SecretName")
    @Validation(required = true)
    public String secretName;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("VersionIds")
    @Validation(required = true)
    public ListSecretVersionIdsResponseVersionIds versionIds;

    public static ListSecretVersionIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSecretVersionIdsResponse self = new ListSecretVersionIdsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListSecretVersionIdsResponseVersionIdsVersionIdVersionStages extends TeaModel {
        @NameInMap("VersionStage")
        @Validation(required = true)
        public java.util.List<String> versionStage;

        public static ListSecretVersionIdsResponseVersionIdsVersionIdVersionStages build(java.util.Map<String, ?> map) throws Exception {
            ListSecretVersionIdsResponseVersionIdsVersionIdVersionStages self = new ListSecretVersionIdsResponseVersionIdsVersionIdVersionStages();
            return TeaModel.build(map, self);
        }

    }

    public static class ListSecretVersionIdsResponseVersionIdsVersionId extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("VersionId")
        @Validation(required = true)
        public String versionId;

        @NameInMap("VersionStages")
        @Validation(required = true)
        public ListSecretVersionIdsResponseVersionIdsVersionIdVersionStages versionStages;

        public static ListSecretVersionIdsResponseVersionIdsVersionId build(java.util.Map<String, ?> map) throws Exception {
            ListSecretVersionIdsResponseVersionIdsVersionId self = new ListSecretVersionIdsResponseVersionIdsVersionId();
            return TeaModel.build(map, self);
        }

    }

    public static class ListSecretVersionIdsResponseVersionIds extends TeaModel {
        @NameInMap("VersionId")
        @Validation(required = true)
        public java.util.List<ListSecretVersionIdsResponseVersionIdsVersionId> versionId;

        public static ListSecretVersionIdsResponseVersionIds build(java.util.Map<String, ?> map) throws Exception {
            ListSecretVersionIdsResponseVersionIds self = new ListSecretVersionIdsResponseVersionIds();
            return TeaModel.build(map, self);
        }

    }

}
