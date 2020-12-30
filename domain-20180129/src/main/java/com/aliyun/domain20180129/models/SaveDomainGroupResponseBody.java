// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveDomainGroupResponseBody extends TeaModel {
    @NameInMap("BeingDeleted")
    public Boolean beingDeleted;

    @NameInMap("CreationDate")
    public String creationDate;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainGroupName")
    public String domainGroupName;

    @NameInMap("ModificationDate")
    public String modificationDate;

    @NameInMap("DomainGroupStatus")
    public String domainGroupStatus;

    @NameInMap("DomainGroupId")
    public Long domainGroupId;

    @NameInMap("TotalNumber")
    public Integer totalNumber;

    public static SaveDomainGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveDomainGroupResponseBody self = new SaveDomainGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveDomainGroupResponseBody setBeingDeleted(Boolean beingDeleted) {
        this.beingDeleted = beingDeleted;
        return this;
    }
    public Boolean getBeingDeleted() {
        return this.beingDeleted;
    }

    public SaveDomainGroupResponseBody setCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }
    public String getCreationDate() {
        return this.creationDate;
    }

    public SaveDomainGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveDomainGroupResponseBody setDomainGroupName(String domainGroupName) {
        this.domainGroupName = domainGroupName;
        return this;
    }
    public String getDomainGroupName() {
        return this.domainGroupName;
    }

    public SaveDomainGroupResponseBody setModificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
        return this;
    }
    public String getModificationDate() {
        return this.modificationDate;
    }

    public SaveDomainGroupResponseBody setDomainGroupStatus(String domainGroupStatus) {
        this.domainGroupStatus = domainGroupStatus;
        return this;
    }
    public String getDomainGroupStatus() {
        return this.domainGroupStatus;
    }

    public SaveDomainGroupResponseBody setDomainGroupId(Long domainGroupId) {
        this.domainGroupId = domainGroupId;
        return this;
    }
    public Long getDomainGroupId() {
        return this.domainGroupId;
    }

    public SaveDomainGroupResponseBody setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }
    public Integer getTotalNumber() {
        return this.totalNumber;
    }

}
