// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ForeignInstanceCredInfo extends TeaModel {
    @NameInMap("CredInfo")
    public java.util.Map<String, String> credInfo;

    @NameInMap("CredType")
    public String credType;

    public static ForeignInstanceCredInfo build(java.util.Map<String, ?> map) throws Exception {
        ForeignInstanceCredInfo self = new ForeignInstanceCredInfo();
        return TeaModel.build(map, self);
    }

    public ForeignInstanceCredInfo setCredInfo(java.util.Map<String, String> credInfo) {
        this.credInfo = credInfo;
        return this;
    }
    public java.util.Map<String, String> getCredInfo() {
        return this.credInfo;
    }

    public ForeignInstanceCredInfo setCredType(String credType) {
        this.credType = credType;
        return this;
    }
    public String getCredType() {
        return this.credType;
    }

}
