// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveDomainGroupResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the group is being deleted.  </p>
     * <blockquote>
     * <p>For groups containing more than 1,000 domain names, deletion is an asynchronous procedure that requires some time for the system to process. During this period, this field is <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BeingDeleted")
    public Boolean beingDeleted;

    /**
     * <p>Creation Time of the domain name group.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-04-02 15:59:06</p>
     */
    @NameInMap("CreationDate")
    public String creationDate;

    /**
     * <p>Domain group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("DomainGroupId")
    public Long domainGroupId;

    /**
     * <p>Domain Name Group Name.</p>
     * 
     * <strong>example:</strong>
     * <p>测试分组</p>
     */
    @NameInMap("DomainGroupName")
    public String domainGroupName;

    /**
     * <p>Status of the domain name group. Valid values:  </p>
     * <ul>
     * <li><strong>PROCESSING</strong>: Processing;  </li>
     * <li><strong>COMPLETE</strong>: Complete.</li>
     * </ul>
     * <blockquote>
     * <p>In cases such as setting a group via a file or replacing a group with more than 1,000 domain names, the operation is asynchronous and requires waiting for system processing. During this time, this field is <strong>PROCESSING</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>COMPLETE</p>
     */
    @NameInMap("DomainGroupStatus")
    public String domainGroupStatus;

    /**
     * <p>Updated At time of the domain name group.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-04-02 15:59:06</p>
     */
    @NameInMap("ModificationDate")
    public String modificationDate;

    /**
     * <p>Unique request identity.</p>
     * 
     * <strong>example:</strong>
     * <p>80011ABC-F573-4795-B0E8-377BFBBA3422</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Quantity of domain names.</p>
     * 
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
