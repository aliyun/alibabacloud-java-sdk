// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListHotlineTransferRegisterFileRequest extends TeaModel {
    /**
     * <p>The China 400 number.</p>
     */
    @NameInMap("HotlineNumber")
    public String hotlineNumber;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: **1**.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Valid values: 1 to 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The qualification ID. You can call the [GetHotlineQualificationByOrder](~~393548~~) operation to obtain the qualification ID.</p>
     */
    @NameInMap("QualificationId")
    public String qualificationId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListHotlineTransferRegisterFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotlineTransferRegisterFileRequest self = new ListHotlineTransferRegisterFileRequest();
        return TeaModel.build(map, self);
    }

    public ListHotlineTransferRegisterFileRequest setHotlineNumber(String hotlineNumber) {
        this.hotlineNumber = hotlineNumber;
        return this;
    }
    public String getHotlineNumber() {
        return this.hotlineNumber;
    }

    public ListHotlineTransferRegisterFileRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListHotlineTransferRegisterFileRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListHotlineTransferRegisterFileRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHotlineTransferRegisterFileRequest setQualificationId(String qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public String getQualificationId() {
        return this.qualificationId;
    }

    public ListHotlineTransferRegisterFileRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListHotlineTransferRegisterFileRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
