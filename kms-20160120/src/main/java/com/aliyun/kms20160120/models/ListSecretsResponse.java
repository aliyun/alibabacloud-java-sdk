// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListSecretsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("SecretList")
    @Validation(required = true)
    public ListSecretsResponseSecretList secretList;

    public static ListSecretsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSecretsResponse self = new ListSecretsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListSecretsResponseSecretListSecretTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static ListSecretsResponseSecretListSecretTagsTag build(java.util.Map<String, ?> map) throws Exception {
            ListSecretsResponseSecretListSecretTagsTag self = new ListSecretsResponseSecretListSecretTagsTag();
            return TeaModel.build(map, self);
        }

    }

    public static class ListSecretsResponseSecretListSecretTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<ListSecretsResponseSecretListSecretTagsTag> tag;

        public static ListSecretsResponseSecretListSecretTags build(java.util.Map<String, ?> map) throws Exception {
            ListSecretsResponseSecretListSecretTags self = new ListSecretsResponseSecretListSecretTags();
            return TeaModel.build(map, self);
        }

    }

    public static class ListSecretsResponseSecretListSecret extends TeaModel {
        @NameInMap("SecretName")
        @Validation(required = true)
        public String secretName;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("PlannedDeleteTime")
        @Validation(required = true)
        public String plannedDeleteTime;

        @NameInMap("Tags")
        @Validation(required = true)
        public ListSecretsResponseSecretListSecretTags tags;

        public static ListSecretsResponseSecretListSecret build(java.util.Map<String, ?> map) throws Exception {
            ListSecretsResponseSecretListSecret self = new ListSecretsResponseSecretListSecret();
            return TeaModel.build(map, self);
        }

    }

    public static class ListSecretsResponseSecretList extends TeaModel {
        @NameInMap("Secret")
        @Validation(required = true)
        public java.util.List<ListSecretsResponseSecretListSecret> secret;

        public static ListSecretsResponseSecretList build(java.util.Map<String, ?> map) throws Exception {
            ListSecretsResponseSecretList self = new ListSecretsResponseSecretList();
            return TeaModel.build(map, self);
        }

    }

}
