// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeClusterServiceConfigTagResponseBody extends TeaModel {
    @NameInMap("ConfigTagList")
    public DescribeClusterServiceConfigTagResponseBodyConfigTagList configTagList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterServiceConfigTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterServiceConfigTagResponseBody self = new DescribeClusterServiceConfigTagResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterServiceConfigTagResponseBody setConfigTagList(DescribeClusterServiceConfigTagResponseBodyConfigTagList configTagList) {
        this.configTagList = configTagList;
        return this;
    }
    public DescribeClusterServiceConfigTagResponseBodyConfigTagList getConfigTagList() {
        return this.configTagList;
    }

    public DescribeClusterServiceConfigTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTagValueListValue extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("ValueDesc")
        public String valueDesc;

        public static DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTagValueListValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTagValueListValue self = new DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTagValueListValue();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTagValueListValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTagValueListValue setValueDesc(String valueDesc) {
            this.valueDesc = valueDesc;
            return this;
        }
        public String getValueDesc() {
            return this.valueDesc;
        }

    }

    public static class DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTagValueList extends TeaModel {
        @NameInMap("Value")
        public java.util.List<DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTagValueListValue> value;

        public static DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTagValueList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTagValueList self = new DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTagValueList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTagValueList setValue(java.util.List<DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTagValueListValue> value) {
            this.value = value;
            return this;
        }
        public java.util.List<DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTagValueListValue> getValue() {
            return this.value;
        }

    }

    public static class DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTag extends TeaModel {
        @NameInMap("ValueList")
        public DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTagValueList valueList;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("TagDesc")
        public String tagDesc;

        public static DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTag self = new DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTag();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTag setValueList(DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTagValueList valueList) {
            this.valueList = valueList;
            return this;
        }
        public DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTagValueList getValueList() {
            return this.valueList;
        }

        public DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTag setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTag setTagDesc(String tagDesc) {
            this.tagDesc = tagDesc;
            return this;
        }
        public String getTagDesc() {
            return this.tagDesc;
        }

    }

    public static class DescribeClusterServiceConfigTagResponseBodyConfigTagList extends TeaModel {
        @NameInMap("ConfigTag")
        public java.util.List<DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTag> configTag;

        public static DescribeClusterServiceConfigTagResponseBodyConfigTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterServiceConfigTagResponseBodyConfigTagList self = new DescribeClusterServiceConfigTagResponseBodyConfigTagList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterServiceConfigTagResponseBodyConfigTagList setConfigTag(java.util.List<DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTag> configTag) {
            this.configTag = configTag;
            return this;
        }
        public java.util.List<DescribeClusterServiceConfigTagResponseBodyConfigTagListConfigTag> getConfigTag() {
            return this.configTag;
        }

    }

}
