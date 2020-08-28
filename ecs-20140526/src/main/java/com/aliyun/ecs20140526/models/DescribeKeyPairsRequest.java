// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeKeyPairsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("KeyPairFingerPrint")
    public String keyPairFingerPrint;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Tag")
    public java.util.List<DescribeKeyPairsRequestTag> tag;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeKeyPairsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeyPairsRequest self = new DescribeKeyPairsRequest();
        return TeaModel.build(map, self);
    }

    public static class DescribeKeyPairsRequestTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeKeyPairsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyPairsRequestTag self = new DescribeKeyPairsRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
