// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20200324.models;

import com.aliyun.tea.*;

public class TransferResellerToUserRequest extends TeaModel {
    @NameInMap("EmpId")
    public String empId;

    @NameInMap("RealName")
    public String realName;

    @NameInMap("SiteId")
    public String siteId;

    @NameInMap("TransferUid")
    public Long transferUid;

    public static TransferResellerToUserRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferResellerToUserRequest self = new TransferResellerToUserRequest();
        return TeaModel.build(map, self);
    }

    public TransferResellerToUserRequest setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public TransferResellerToUserRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public TransferResellerToUserRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public TransferResellerToUserRequest setTransferUid(Long transferUid) {
        this.transferUid = transferUid;
        return this;
    }
    public Long getTransferUid() {
        return this.transferUid;
    }

}
