// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindCustomerSnapshotRequest extends TeaModel {
    @NameInMap("InfoType")
    public String infoType;

    @NameInMap("Pk")
    public Long pk;

    @NameInMap("VersionId")
    public String versionId;

    public static FindCustomerSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        FindCustomerSnapshotRequest self = new FindCustomerSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public FindCustomerSnapshotRequest setInfoType(String infoType) {
        this.infoType = infoType;
        return this;
    }
    public String getInfoType() {
        return this.infoType;
    }

    public FindCustomerSnapshotRequest setPk(Long pk) {
        this.pk = pk;
        return this;
    }
    public Long getPk() {
        return this.pk;
    }

    public FindCustomerSnapshotRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
