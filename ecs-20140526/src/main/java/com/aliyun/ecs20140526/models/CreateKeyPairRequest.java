// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateKeyPairRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("KeyPairName")
    @Validation(required = true)
    public String keyPairName;

    @NameInMap("Tag")
    public java.util.List<CreateKeyPairRequestTag> tag;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateKeyPairRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyPairRequest self = new CreateKeyPairRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateKeyPairRequestTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static CreateKeyPairRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateKeyPairRequestTag self = new CreateKeyPairRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
