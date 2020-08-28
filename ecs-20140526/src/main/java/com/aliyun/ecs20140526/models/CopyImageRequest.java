// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CopyImageRequest extends TeaModel {
    @NameInMap("DestinationImageName")
    public String destinationImageName;

    @NameInMap("DestinationDescription")
    public String destinationDescription;

    @NameInMap("ImageId")
    @Validation(required = true)
    public String imageId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DestinationRegionId")
    public String destinationRegionId;

    @NameInMap("Tag")
    public java.util.List<CopyImageRequestTag> tag;

    @NameInMap("Encrypted")
    public Boolean encrypted;

    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    @NameInMap("EncryptAlgorithm")
    public String encryptAlgorithm;

    public static CopyImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyImageRequest self = new CopyImageRequest();
        return TeaModel.build(map, self);
    }

    public static class CopyImageRequestTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static CopyImageRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CopyImageRequestTag self = new CopyImageRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
