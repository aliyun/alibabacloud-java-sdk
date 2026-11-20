// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetResourceRenewPriceRequest extends TeaModel {
    /**
     * <p>The ID of the delivery group. You can call the <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> operation to retrieve the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The numeric value of the subscription duration. This parameter is used together with PeriodUnit to specify the complete subscription duration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Long period;

    /**
     * <p>The unit of the subscription duration. Request parameter is used together with Period to specify the complete subscription duration. Valid combinations of Period and PeriodUnit are as follows:</p>
     * <ul>
     * <li>1 Week (1 week)</li>
     * <li>1 Month (1 month)</li>
     * <li>2 Months (2 months)</li>
     * <li>3 Months (3 months)</li>
     * <li>6 Months (6 months)</li>
     * <li>1 Year (1 year)</li>
     * <li>2 Years (2 years)</li>
     * <li>3 Years (3 years)</li>
     * </ul>
     * <blockquote>
     * <p>Request parameter is case-sensitive. For example, Week is valid, but week is invalid. If the combination of Period and PeriodUnit does not match the preceding valid combinations, such as 2 Week, the API call succeeds but an error occurs during the order placement stage.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Week</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The product type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static GetResourceRenewPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceRenewPriceRequest self = new GetResourceRenewPriceRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceRenewPriceRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public GetResourceRenewPriceRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public GetResourceRenewPriceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public GetResourceRenewPriceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
