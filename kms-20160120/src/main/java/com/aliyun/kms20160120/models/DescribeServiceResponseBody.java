// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeServiceResponseBody extends TeaModel {
    @NameInMap("ProtectionLevels")
    public DescribeServiceResponseBodyProtectionLevels protectionLevels;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("KeySpecs")
    public DescribeServiceResponseBodyKeySpecs keySpecs;

    public static DescribeServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceResponseBody self = new DescribeServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceResponseBody setProtectionLevels(DescribeServiceResponseBodyProtectionLevels protectionLevels) {
        this.protectionLevels = protectionLevels;
        return this;
    }
    public DescribeServiceResponseBodyProtectionLevels getProtectionLevels() {
        return this.protectionLevels;
    }

    public DescribeServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceResponseBody setKeySpecs(DescribeServiceResponseBodyKeySpecs keySpecs) {
        this.keySpecs = keySpecs;
        return this;
    }
    public DescribeServiceResponseBodyKeySpecs getKeySpecs() {
        return this.keySpecs;
    }

    public static class DescribeServiceResponseBodyProtectionLevelsProtectionLevel extends TeaModel {
        @NameInMap("Type")
        public String type;

        public static DescribeServiceResponseBodyProtectionLevelsProtectionLevel build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceResponseBodyProtectionLevelsProtectionLevel self = new DescribeServiceResponseBodyProtectionLevelsProtectionLevel();
            return TeaModel.build(map, self);
        }

        public DescribeServiceResponseBodyProtectionLevelsProtectionLevel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeServiceResponseBodyProtectionLevels extends TeaModel {
        @NameInMap("ProtectionLevel")
        public java.util.List<DescribeServiceResponseBodyProtectionLevelsProtectionLevel> protectionLevel;

        public static DescribeServiceResponseBodyProtectionLevels build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceResponseBodyProtectionLevels self = new DescribeServiceResponseBodyProtectionLevels();
            return TeaModel.build(map, self);
        }

        public DescribeServiceResponseBodyProtectionLevels setProtectionLevel(java.util.List<DescribeServiceResponseBodyProtectionLevelsProtectionLevel> protectionLevel) {
            this.protectionLevel = protectionLevel;
            return this;
        }
        public java.util.List<DescribeServiceResponseBodyProtectionLevelsProtectionLevel> getProtectionLevel() {
            return this.protectionLevel;
        }

    }

    public static class DescribeServiceResponseBodyKeySpecsKeySpecSupportedProtectionLevels extends TeaModel {
        @NameInMap("SupportedProtectionLevel")
        public java.util.List<String> supportedProtectionLevel;

        public static DescribeServiceResponseBodyKeySpecsKeySpecSupportedProtectionLevels build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceResponseBodyKeySpecsKeySpecSupportedProtectionLevels self = new DescribeServiceResponseBodyKeySpecsKeySpecSupportedProtectionLevels();
            return TeaModel.build(map, self);
        }

        public DescribeServiceResponseBodyKeySpecsKeySpecSupportedProtectionLevels setSupportedProtectionLevel(java.util.List<String> supportedProtectionLevel) {
            this.supportedProtectionLevel = supportedProtectionLevel;
            return this;
        }
        public java.util.List<String> getSupportedProtectionLevel() {
            return this.supportedProtectionLevel;
        }

    }

    public static class DescribeServiceResponseBodyKeySpecsKeySpecUsages extends TeaModel {
        @NameInMap("Usage")
        public java.util.List<String> usage;

        public static DescribeServiceResponseBodyKeySpecsKeySpecUsages build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceResponseBodyKeySpecsKeySpecUsages self = new DescribeServiceResponseBodyKeySpecsKeySpecUsages();
            return TeaModel.build(map, self);
        }

        public DescribeServiceResponseBodyKeySpecsKeySpecUsages setUsage(java.util.List<String> usage) {
            this.usage = usage;
            return this;
        }
        public java.util.List<String> getUsage() {
            return this.usage;
        }

    }

    public static class DescribeServiceResponseBodyKeySpecsKeySpec extends TeaModel {
        @NameInMap("SupportedProtectionLevels")
        public DescribeServiceResponseBodyKeySpecsKeySpecSupportedProtectionLevels supportedProtectionLevels;

        @NameInMap("Name")
        public String name;

        @NameInMap("Usages")
        public DescribeServiceResponseBodyKeySpecsKeySpecUsages usages;

        public static DescribeServiceResponseBodyKeySpecsKeySpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceResponseBodyKeySpecsKeySpec self = new DescribeServiceResponseBodyKeySpecsKeySpec();
            return TeaModel.build(map, self);
        }

        public DescribeServiceResponseBodyKeySpecsKeySpec setSupportedProtectionLevels(DescribeServiceResponseBodyKeySpecsKeySpecSupportedProtectionLevels supportedProtectionLevels) {
            this.supportedProtectionLevels = supportedProtectionLevels;
            return this;
        }
        public DescribeServiceResponseBodyKeySpecsKeySpecSupportedProtectionLevels getSupportedProtectionLevels() {
            return this.supportedProtectionLevels;
        }

        public DescribeServiceResponseBodyKeySpecsKeySpec setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServiceResponseBodyKeySpecsKeySpec setUsages(DescribeServiceResponseBodyKeySpecsKeySpecUsages usages) {
            this.usages = usages;
            return this;
        }
        public DescribeServiceResponseBodyKeySpecsKeySpecUsages getUsages() {
            return this.usages;
        }

    }

    public static class DescribeServiceResponseBodyKeySpecs extends TeaModel {
        @NameInMap("KeySpec")
        public java.util.List<DescribeServiceResponseBodyKeySpecsKeySpec> keySpec;

        public static DescribeServiceResponseBodyKeySpecs build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceResponseBodyKeySpecs self = new DescribeServiceResponseBodyKeySpecs();
            return TeaModel.build(map, self);
        }

        public DescribeServiceResponseBodyKeySpecs setKeySpec(java.util.List<DescribeServiceResponseBodyKeySpecsKeySpec> keySpec) {
            this.keySpec = keySpec;
            return this;
        }
        public java.util.List<DescribeServiceResponseBodyKeySpecsKeySpec> getKeySpec() {
            return this.keySpec;
        }

    }

}
