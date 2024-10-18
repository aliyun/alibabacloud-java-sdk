// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class QueryGateVerifyStatisticPublicRequest extends TeaModel {
    /**
     * <p>The verification method. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: one-click logon</li>
     * <li><strong>2</strong>: phone number verification, including the verification of the phone number used in HTML5 pages</li>
     * <li><strong>3</strong>: SMS verification</li>
     * <li><strong>4</strong>: facial recognition</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuthenticationType")
    public Integer authenticationType;

    /**
     * <p>The end date. Specify this parameter in the YYYYMMDD format. Example: 20220106.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20220106</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The type of the operating system. Valid values:</p>
     * <ul>
     * <li><strong>Android</strong></li>
     * <li><strong>iOS</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Android</p>
     */
    @NameInMap("OsType")
    public String osType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The service code.</p>
     * 
     * <strong>example:</strong>
     * <p>FC100000038194004</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>The start date. Specify this parameter in the YYYYMMDD format. Example: 20220101.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20220101</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static QueryGateVerifyStatisticPublicRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGateVerifyStatisticPublicRequest self = new QueryGateVerifyStatisticPublicRequest();
        return TeaModel.build(map, self);
    }

    public QueryGateVerifyStatisticPublicRequest setAuthenticationType(Integer authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }
    public Integer getAuthenticationType() {
        return this.authenticationType;
    }

    public QueryGateVerifyStatisticPublicRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryGateVerifyStatisticPublicRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public QueryGateVerifyStatisticPublicRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryGateVerifyStatisticPublicRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryGateVerifyStatisticPublicRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryGateVerifyStatisticPublicRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
