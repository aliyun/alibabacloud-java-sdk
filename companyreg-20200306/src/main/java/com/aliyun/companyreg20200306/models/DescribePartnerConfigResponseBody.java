// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class DescribePartnerConfigResponseBody extends TeaModel {
    @NameInMap("Contact")
    public String contact;

    /**
     * <strong>example:</strong>
     * <p>jinsan</p>
     */
    @NameInMap("PartnerCode")
    public String partnerCode;

    @NameInMap("PartnerName")
    public String partnerName;

    /**
     * <strong>example:</strong>
     * <p>8179A0B3-A5D3-52F4-8845-F0ABC3CC6783</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePartnerConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePartnerConfigResponseBody self = new DescribePartnerConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePartnerConfigResponseBody setContact(String contact) {
        this.contact = contact;
        return this;
    }
    public String getContact() {
        return this.contact;
    }

    public DescribePartnerConfigResponseBody setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }
    public String getPartnerCode() {
        return this.partnerCode;
    }

    public DescribePartnerConfigResponseBody setPartnerName(String partnerName) {
        this.partnerName = partnerName;
        return this;
    }
    public String getPartnerName() {
        return this.partnerName;
    }

    public DescribePartnerConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
