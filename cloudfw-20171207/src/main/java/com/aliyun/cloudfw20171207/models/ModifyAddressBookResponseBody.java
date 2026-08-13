// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyAddressBookResponseBody extends TeaModel {
    /**
     * <p>Indicates that this is a successful dry run response. A value of true indicates that only the dry run was completed and no actual modification was performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAddressBookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAddressBookResponseBody self = new ModifyAddressBookResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAddressBookResponseBody setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyAddressBookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
