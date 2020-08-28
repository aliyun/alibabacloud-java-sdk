// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeSecretResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Arn")
    @Validation(required = true)
    public String arn;

    @NameInMap("SecretName")
    @Validation(required = true)
    public String secretName;

    @NameInMap("EncryptionKeyId")
    @Validation(required = true)
    public String encryptionKeyId;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

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
    public DescribeSecretResponseTags tags;

    public static DescribeSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecretResponse self = new DescribeSecretResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSecretResponseTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static DescribeSecretResponseTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecretResponseTagsTag self = new DescribeSecretResponseTagsTag();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSecretResponseTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeSecretResponseTagsTag> tag;

        public static DescribeSecretResponseTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecretResponseTags self = new DescribeSecretResponseTags();
            return TeaModel.build(map, self);
        }

    }

}
