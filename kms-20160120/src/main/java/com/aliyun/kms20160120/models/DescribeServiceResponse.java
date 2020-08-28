// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeServiceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ProtectionLevels")
    @Validation(required = true)
    public DescribeServiceResponseProtectionLevels protectionLevels;

    @NameInMap("KeySpecs")
    @Validation(required = true)
    public DescribeServiceResponseKeySpecs keySpecs;

    public static DescribeServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceResponse self = new DescribeServiceResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeServiceResponseProtectionLevelsProtectionLevel extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static DescribeServiceResponseProtectionLevelsProtectionLevel build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceResponseProtectionLevelsProtectionLevel self = new DescribeServiceResponseProtectionLevelsProtectionLevel();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeServiceResponseProtectionLevels extends TeaModel {
        @NameInMap("ProtectionLevel")
        @Validation(required = true)
        public java.util.List<DescribeServiceResponseProtectionLevelsProtectionLevel> protectionLevel;

        public static DescribeServiceResponseProtectionLevels build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceResponseProtectionLevels self = new DescribeServiceResponseProtectionLevels();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeServiceResponseKeySpecsKeySpecSupportedProtectionLevels extends TeaModel {
        @NameInMap("SupportedProtectionLevel")
        @Validation(required = true)
        public java.util.List<String> supportedProtectionLevel;

        public static DescribeServiceResponseKeySpecsKeySpecSupportedProtectionLevels build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceResponseKeySpecsKeySpecSupportedProtectionLevels self = new DescribeServiceResponseKeySpecsKeySpecSupportedProtectionLevels();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeServiceResponseKeySpecsKeySpecUsages extends TeaModel {
        @NameInMap("Usage")
        @Validation(required = true)
        public java.util.List<String> usage;

        public static DescribeServiceResponseKeySpecsKeySpecUsages build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceResponseKeySpecsKeySpecUsages self = new DescribeServiceResponseKeySpecsKeySpecUsages();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeServiceResponseKeySpecsKeySpec extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("SupportedProtectionLevels")
        @Validation(required = true)
        public DescribeServiceResponseKeySpecsKeySpecSupportedProtectionLevels supportedProtectionLevels;

        @NameInMap("Usages")
        @Validation(required = true)
        public DescribeServiceResponseKeySpecsKeySpecUsages usages;

        public static DescribeServiceResponseKeySpecsKeySpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceResponseKeySpecsKeySpec self = new DescribeServiceResponseKeySpecsKeySpec();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeServiceResponseKeySpecs extends TeaModel {
        @NameInMap("KeySpec")
        @Validation(required = true)
        public java.util.List<DescribeServiceResponseKeySpecsKeySpec> keySpec;

        public static DescribeServiceResponseKeySpecs build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceResponseKeySpecs self = new DescribeServiceResponseKeySpecs();
            return TeaModel.build(map, self);
        }

    }

}
