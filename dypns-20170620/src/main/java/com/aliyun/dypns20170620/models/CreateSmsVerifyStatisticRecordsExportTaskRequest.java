// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CreateSmsVerifyStatisticRecordsExportTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1772294400000</p>
     */
    @NameInMap("FromDate")
    public Long fromDate;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("SchemeName")
    public String schemeName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1772899200000</p>
     */
    @NameInMap("ToDate")
    public Long toDate;

    public static CreateSmsVerifyStatisticRecordsExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsVerifyStatisticRecordsExportTaskRequest self = new CreateSmsVerifyStatisticRecordsExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmsVerifyStatisticRecordsExportTaskRequest setFromDate(Long fromDate) {
        this.fromDate = fromDate;
        return this;
    }
    public Long getFromDate() {
        return this.fromDate;
    }

    public CreateSmsVerifyStatisticRecordsExportTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmsVerifyStatisticRecordsExportTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmsVerifyStatisticRecordsExportTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSmsVerifyStatisticRecordsExportTaskRequest setSchemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }
    public String getSchemeName() {
        return this.schemeName;
    }

    public CreateSmsVerifyStatisticRecordsExportTaskRequest setToDate(Long toDate) {
        this.toDate = toDate;
        return this;
    }
    public Long getToDate() {
        return this.toDate;
    }

}
