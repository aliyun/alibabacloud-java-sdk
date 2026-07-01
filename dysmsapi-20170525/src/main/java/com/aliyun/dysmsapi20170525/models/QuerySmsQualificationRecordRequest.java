// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsQualificationRecordRequest extends TeaModel {
    /**
     * <p>The company name.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云云通信有限公司</p>
     */
    @NameInMap("CompanyName")
    public String companyName;

    /**
     * <p>The name of the legal representative.</p>
     * 
     * <strong>example:</strong>
     * <p>李华</p>
     */
    @NameInMap("LegalPersonName")
    public String legalPersonName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. Valid values: <strong>1 to 50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The qualification name.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云云通信有限公司李华</p>
     */
    @NameInMap("QualificationGroupName")
    public String qualificationGroupName;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The review status. Valid values:</p>
     * <ul>
     * <li>INIT: Under review.</li>
     * <li>NOT_PASS: Review rejected. </li>
     * <li>PASS: Review approved.</li>
     * <li>NOT_FINISH: Additional information required.</li>
     * <li>CANCEL: Withdrawn.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PASS</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The purpose of the qualification application. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: For self-use.</li>
     * <li><strong>false</strong>: For use by others.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseBySelf")
    public Boolean useBySelf;

    /**
     * <p>The review ticket ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2001****</p>
     */
    @NameInMap("WorkOrderId")
    public Long workOrderId;

    public static QuerySmsQualificationRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsQualificationRecordRequest self = new QuerySmsQualificationRecordRequest();
        return TeaModel.build(map, self);
    }

    public QuerySmsQualificationRecordRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public QuerySmsQualificationRecordRequest setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    public QuerySmsQualificationRecordRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySmsQualificationRecordRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QuerySmsQualificationRecordRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QuerySmsQualificationRecordRequest setQualificationGroupName(String qualificationGroupName) {
        this.qualificationGroupName = qualificationGroupName;
        return this;
    }
    public String getQualificationGroupName() {
        return this.qualificationGroupName;
    }

    public QuerySmsQualificationRecordRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySmsQualificationRecordRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySmsQualificationRecordRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public QuerySmsQualificationRecordRequest setUseBySelf(Boolean useBySelf) {
        this.useBySelf = useBySelf;
        return this;
    }
    public Boolean getUseBySelf() {
        return this.useBySelf;
    }

    public QuerySmsQualificationRecordRequest setWorkOrderId(Long workOrderId) {
        this.workOrderId = workOrderId;
        return this;
    }
    public Long getWorkOrderId() {
        return this.workOrderId;
    }

}
