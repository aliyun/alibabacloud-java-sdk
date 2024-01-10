// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dg20190327.models;

import com.aliyun.tea.*;

public class DownloadGatewayProgramRequest extends TeaModel {
    @NameInMap("DgVersion")
    public String dgVersion;

    @NameInMap("UserOS")
    public String userOS;

    public static DownloadGatewayProgramRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadGatewayProgramRequest self = new DownloadGatewayProgramRequest();
        return TeaModel.build(map, self);
    }

    public DownloadGatewayProgramRequest setDgVersion(String dgVersion) {
        this.dgVersion = dgVersion;
        return this;
    }
    public String getDgVersion() {
        return this.dgVersion;
    }

    public DownloadGatewayProgramRequest setUserOS(String userOS) {
        this.userOS = userOS;
        return this;
    }
    public String getUserOS() {
        return this.userOS;
    }

}
