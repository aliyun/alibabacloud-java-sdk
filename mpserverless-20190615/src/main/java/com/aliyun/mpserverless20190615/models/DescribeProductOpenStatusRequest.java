// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeProductOpenStatusRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("Labels")
    public java.util.List<DescribeProductOpenStatusRequestLabels> labels;

    public static DescribeProductOpenStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductOpenStatusRequest self = new DescribeProductOpenStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProductOpenStatusRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeProductOpenStatusRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public DescribeProductOpenStatusRequest setLabels(java.util.List<DescribeProductOpenStatusRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<DescribeProductOpenStatusRequestLabels> getLabels() {
        return this.labels;
    }

    public static class DescribeProductOpenStatusRequestLabels extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        public static DescribeProductOpenStatusRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductOpenStatusRequestLabels self = new DescribeProductOpenStatusRequestLabels();
            return TeaModel.build(map, self);
        }

        public DescribeProductOpenStatusRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeProductOpenStatusRequestLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
