// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class UpgradeMinorVersionResponseBody extends TeaModel {
    @NameInMap("NewVersion")
    public String newVersion;

    @NameInMap("OldVersion")
    public String oldVersion;

    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeMinorVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeMinorVersionResponseBody self = new UpgradeMinorVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeMinorVersionResponseBody setNewVersion(String newVersion) {
        this.newVersion = newVersion;
        return this;
    }
    public String getNewVersion() {
        return this.newVersion;
    }

    public UpgradeMinorVersionResponseBody setOldVersion(String oldVersion) {
        this.oldVersion = oldVersion;
        return this;
    }
    public String getOldVersion() {
        return this.oldVersion;
    }

    public UpgradeMinorVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
