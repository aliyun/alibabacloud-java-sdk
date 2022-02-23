// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class DataSpecVersionInfoMapValue extends TeaModel {
    @NameInMap("SpecVersion")
    public String specVersion;

    @NameInMap("SpecVersionEn")
    public String specVersionEn;

    @NameInMap("MultiAZPermission")
    public Boolean multiAZPermission;

    public static DataSpecVersionInfoMapValue build(java.util.Map<String, ?> map) throws Exception {
        DataSpecVersionInfoMapValue self = new DataSpecVersionInfoMapValue();
        return TeaModel.build(map, self);
    }

    public DataSpecVersionInfoMapValue setSpecVersion(String specVersion) {
        this.specVersion = specVersion;
        return this;
    }
    public String getSpecVersion() {
        return this.specVersion;
    }

    public DataSpecVersionInfoMapValue setSpecVersionEn(String specVersionEn) {
        this.specVersionEn = specVersionEn;
        return this;
    }
    public String getSpecVersionEn() {
        return this.specVersionEn;
    }

    public DataSpecVersionInfoMapValue setMultiAZPermission(Boolean multiAZPermission) {
        this.multiAZPermission = multiAZPermission;
        return this;
    }
    public Boolean getMultiAZPermission() {
        return this.multiAZPermission;
    }

}
