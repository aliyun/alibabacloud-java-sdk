// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class DescribePartnerConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esp.wangwen</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>jinsan</p>
     */
    @NameInMap("PartnerCode")
    public String partnerCode;

    public static DescribePartnerConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePartnerConfigRequest self = new DescribePartnerConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribePartnerConfigRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribePartnerConfigRequest setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }
    public String getPartnerCode() {
        return this.partnerCode;
    }

}
