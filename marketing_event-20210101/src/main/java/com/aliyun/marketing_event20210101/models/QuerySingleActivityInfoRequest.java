// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class QuerySingleActivityInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ActivityId")
    public String activityId;

    @NameInMap("CompanyName")
    public String companyName;

    @NameInMap("CustomerName")
    public String customerName;

    /**
     * <strong>example:</strong>
     * <p>12233445</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("QRCode")
    public String QRCode;

    public static QuerySingleActivityInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySingleActivityInfoRequest self = new QuerySingleActivityInfoRequest();
        return TeaModel.build(map, self);
    }

    public QuerySingleActivityInfoRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public QuerySingleActivityInfoRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public QuerySingleActivityInfoRequest setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public QuerySingleActivityInfoRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QuerySingleActivityInfoRequest setQRCode(String QRCode) {
        this.QRCode = QRCode;
        return this;
    }
    public String getQRCode() {
        return this.QRCode;
    }

}
