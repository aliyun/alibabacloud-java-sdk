// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20200324.models;

import com.aliyun.tea.*;

public class TransferUserToResellerRequest extends TeaModel {
    @NameInMap("EmpId")
    public String empId;

    @NameInMap("ParentUid")
    public Long parentUid;

    @NameInMap("RealName")
    public String realName;

    @NameInMap("SiteId")
    public String siteId;

    @NameInMap("TransferUid")
    public Long transferUid;

    public static TransferUserToResellerRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferUserToResellerRequest self = new TransferUserToResellerRequest();
        return TeaModel.build(map, self);
    }

    public TransferUserToResellerRequest setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public TransferUserToResellerRequest setParentUid(Long parentUid) {
        this.parentUid = parentUid;
        return this;
    }
    public Long getParentUid() {
        return this.parentUid;
    }

    public TransferUserToResellerRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public TransferUserToResellerRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public TransferUserToResellerRequest setTransferUid(Long transferUid) {
        this.transferUid = transferUid;
        return this;
    }
    public Long getTransferUid() {
        return this.transferUid;
    }

}
