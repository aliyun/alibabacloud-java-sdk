// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class MetaData extends TeaModel {
    @NameInMap("Identifier")
    public String identifier;

    @NameInMap("Provider")
    public String provider;

    @NameInMap("Version")
    public String version;

    public static MetaData build(java.util.Map<String, ?> map) throws Exception {
        MetaData self = new MetaData();
        return TeaModel.build(map, self);
    }

    public MetaData setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public MetaData setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public MetaData setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
