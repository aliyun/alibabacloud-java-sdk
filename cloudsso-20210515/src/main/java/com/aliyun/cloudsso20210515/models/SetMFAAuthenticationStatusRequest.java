// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetMFAAuthenticationStatusRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("MFAAuthenticationStatus")
    public String MFAAuthenticationStatus;

    public static SetMFAAuthenticationStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetMFAAuthenticationStatusRequest self = new SetMFAAuthenticationStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetMFAAuthenticationStatusRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public SetMFAAuthenticationStatusRequest setMFAAuthenticationStatus(String MFAAuthenticationStatus) {
        this.MFAAuthenticationStatus = MFAAuthenticationStatus;
        return this;
    }
    public String getMFAAuthenticationStatus() {
        return this.MFAAuthenticationStatus;
    }

}
