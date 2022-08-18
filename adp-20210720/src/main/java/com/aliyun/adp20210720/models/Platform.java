// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class Platform extends TeaModel {
    @NameInMap("architecture")
    public String architecture;

    @NameInMap("os")
    public String os;

    public static Platform build(java.util.Map<String, ?> map) throws Exception {
        Platform self = new Platform();
        return TeaModel.build(map, self);
    }

    public Platform setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public Platform setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

}
