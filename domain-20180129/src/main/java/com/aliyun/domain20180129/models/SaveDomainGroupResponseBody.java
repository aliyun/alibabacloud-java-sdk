// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveDomainGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BeingDeleted")
    public Boolean beingDeleted;

    /**
     * <strong>example:</strong>
     * <p>2018-04-02 15:59:06</p>
     */
    @NameInMap("CreationDate")
    public String creationDate;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("DomainGroupId")
    public Long domainGroupId;

    @NameInMap("DomainGroupName")
    public String domainGroupName;

    /**
     * <strong>example:</strong>
     * <p>COMPLETE</p>
     */
    @NameInMap("DomainGroupStatus")
    public String domainGroupStatus;

    /**
     * <strong>example:</strong>
     * <p>2018-04-02 15:59:06</p>
     */
    @NameInMap("ModificationDate")
    public String modificationDate;

    /**
     * <strong>example:</strong>
     * <p>80011ABC-F573-4795-B0E8-377BFBBA3422</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
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

    public SaveDomainGroupResponseBody setDomainGroupId(Long domainGroupId) {
        this.domainGroupId = domainGroupId;
        return this;
    }
    public Long getDomainGroupId() {
        return this.domainGroupId;
    }

    public SaveDomainGroupResponseBody setDomainGroupName(String domainGroupName) {
        this.domainGroupName = domainGroupName;
        return this;
    }
    public String getDomainGroupName() {
        return this.domainGroupName;
    }

    public SaveDomainGroupResponseBody setDomainGroupStatus(String domainGroupStatus) {
        this.domainGroupStatus = domainGroupStatus;
        return this;
    }
    public String getDomainGroupStatus() {
        return this.domainGroupStatus;
    }

    public SaveDomainGroupResponseBody setModificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
        return this;
    }
    public String getModificationDate() {
        return this.modificationDate;
    }

    public SaveDomainGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveDomainGroupResponseBody setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }
    public Integer getTotalNumber() {
        return this.totalNumber;
    }

}
