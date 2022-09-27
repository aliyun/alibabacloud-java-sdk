// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDefaultCollectorConfigurationsRequest extends TeaModel {
    @NameInMap("resType")
    public String resType;

    @NameInMap("resVersion")
    public String resVersion;

    @NameInMap("sourceType")
    public String sourceType;

    public static ListDefaultCollectorConfigurationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDefaultCollectorConfigurationsRequest self = new ListDefaultCollectorConfigurationsRequest();
        return TeaModel.build(map, self);
    }

    public ListDefaultCollectorConfigurationsRequest setResType(String resType) {
        this.resType = resType;
        return this;
    }
    public String getResType() {
        return this.resType;
    }

    public ListDefaultCollectorConfigurationsRequest setResVersion(String resVersion) {
        this.resVersion = resVersion;
        return this;
    }
    public String getResVersion() {
        return this.resVersion;
    }

    public ListDefaultCollectorConfigurationsRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
