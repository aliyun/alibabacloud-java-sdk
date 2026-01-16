// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ConfigBucketPrefixFilterConfigValue extends TeaModel {
    @NameInMap("PrefixFilterType")
    public String prefixFilterType;

    @NameInMap("PrefixFilters")
    public java.util.List<String> prefixFilters;

    public static ConfigBucketPrefixFilterConfigValue build(java.util.Map<String, ?> map) throws Exception {
        ConfigBucketPrefixFilterConfigValue self = new ConfigBucketPrefixFilterConfigValue();
        return TeaModel.build(map, self);
    }

    public ConfigBucketPrefixFilterConfigValue setPrefixFilterType(String prefixFilterType) {
        this.prefixFilterType = prefixFilterType;
        return this;
    }
    public String getPrefixFilterType() {
        return this.prefixFilterType;
    }

    public ConfigBucketPrefixFilterConfigValue setPrefixFilters(java.util.List<String> prefixFilters) {
        this.prefixFilters = prefixFilters;
        return this;
    }
    public java.util.List<String> getPrefixFilters() {
        return this.prefixFilters;
    }

}
