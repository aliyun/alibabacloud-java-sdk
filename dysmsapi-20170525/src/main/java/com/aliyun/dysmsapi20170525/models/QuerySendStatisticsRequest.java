// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySendStatisticsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Format: yyyyMMdd. Example: 20181225.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20201003</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The site from where the message is sent. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: China site</li>
     * <li><strong>2</strong>: international site</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsGlobe")
    public Integer isGlobe;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1 to 50</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The signature.</p>
     * 
     * <strong>example:</strong>
     * <p>Aliyun</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>The beginning of the time range to query. Format: yyyyMMdd. Example: 20181225.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20201002</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The type of the message template. Valid values: Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: verification code</li>
     * <li><strong>1</strong>: notification</li>
     * <li><strong>2</strong>: promotional message (Enterprise users only)</li>
     * <li><strong>3</strong>: international purpose (Enterprise users only)</li>
     * <li><strong>7</strong>: digital message</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TemplateType")
    public Integer templateType;

    public static QuerySendStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySendStatisticsRequest self = new QuerySendStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public QuerySendStatisticsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QuerySendStatisticsRequest setIsGlobe(Integer isGlobe) {
        this.isGlobe = isGlobe;
        return this;
    }
    public Integer getIsGlobe() {
        return this.isGlobe;
    }

    public QuerySendStatisticsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySendStatisticsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public QuerySendStatisticsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySendStatisticsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySendStatisticsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySendStatisticsRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public QuerySendStatisticsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QuerySendStatisticsRequest setTemplateType(Integer templateType) {
        this.templateType = templateType;
        return this;
    }
    public Integer getTemplateType() {
        return this.templateType;
    }

}
