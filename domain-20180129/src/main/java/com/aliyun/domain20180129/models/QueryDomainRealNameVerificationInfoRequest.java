// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainRealNameVerificationInfoRequest extends TeaModel {
    /**
     * <p>Domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Specifies whether to retrieve the real-name verification image. Valid values:  </p>
     * <ul>
     * <li><strong>true</strong>: Retrieve the image.  </li>
     * <li><strong>false</strong>: Do not retrieve the image.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FetchImage")
    public Boolean fetchImage;

    /**
     * <p>Language of error messages returned by the API. Valid values:  </p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.  </li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>User IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryDomainRealNameVerificationInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainRealNameVerificationInfoRequest self = new QueryDomainRealNameVerificationInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryDomainRealNameVerificationInfoRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryDomainRealNameVerificationInfoRequest setFetchImage(Boolean fetchImage) {
        this.fetchImage = fetchImage;
        return this;
    }
    public Boolean getFetchImage() {
        return this.fetchImage;
    }

    public QueryDomainRealNameVerificationInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryDomainRealNameVerificationInfoRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
