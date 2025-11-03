// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class WebsiteDeleteDnsRecordRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("Rr")
    public String rr;

    /**
     * <strong>example:</strong>
     * <p>WAN_WANG</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <strong>example:</strong>
     * <p>CNAME</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>example.aliyun.com</p>
     */
    @NameInMap("Value")
    public String value;

    /**
     * <strong>example:</strong>
     * <p>af917c716e7c4bb8bbe798b99825fdb6</p>
     */
    @NameInMap("WebsiteNo")
    public String websiteNo;

    public static WebsiteDeleteDnsRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        WebsiteDeleteDnsRecordRequest self = new WebsiteDeleteDnsRecordRequest();
        return TeaModel.build(map, self);
    }

    public WebsiteDeleteDnsRecordRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public WebsiteDeleteDnsRecordRequest setRr(String rr) {
        this.rr = rr;
        return this;
    }
    public String getRr() {
        return this.rr;
    }

    public WebsiteDeleteDnsRecordRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public WebsiteDeleteDnsRecordRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public WebsiteDeleteDnsRecordRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public WebsiteDeleteDnsRecordRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public WebsiteDeleteDnsRecordRequest setWebsiteNo(String websiteNo) {
        this.websiteNo = websiteNo;
        return this;
    }
    public String getWebsiteNo() {
        return this.websiteNo;
    }

}
