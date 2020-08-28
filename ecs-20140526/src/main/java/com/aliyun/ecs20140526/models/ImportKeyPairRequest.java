// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ImportKeyPairRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("KeyPairName")
    @Validation(required = true)
    public String keyPairName;

    @NameInMap("PublicKeyBody")
    @Validation(required = true)
    public String publicKeyBody;

    @NameInMap("Tag")
    public java.util.List<ImportKeyPairRequestTag> tag;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ImportKeyPairRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportKeyPairRequest self = new ImportKeyPairRequest();
        return TeaModel.build(map, self);
    }

    public static class ImportKeyPairRequestTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static ImportKeyPairRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ImportKeyPairRequestTag self = new ImportKeyPairRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
