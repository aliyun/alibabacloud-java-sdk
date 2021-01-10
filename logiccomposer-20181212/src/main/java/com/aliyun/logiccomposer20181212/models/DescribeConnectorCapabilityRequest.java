// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DescribeConnectorCapabilityRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Preset")
    public String preset;

    public static DescribeConnectorCapabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConnectorCapabilityRequest self = new DescribeConnectorCapabilityRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConnectorCapabilityRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeConnectorCapabilityRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeConnectorCapabilityRequest setPreset(String preset) {
        this.preset = preset;
        return this;
    }
    public String getPreset() {
        return this.preset;
    }

}
