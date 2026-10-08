// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryRegistrantProfileRealNameVerificationInfoRequest extends TeaModel {
    /**
     * <p>Specifies whether to retrieve the identity verification image. Valid values:  </p>
     * <ul>
     * <li><strong>true</strong>: Retrieve the image.  </li>
     * <li><strong>false</strong>: Do not retrieve the image.</li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FetchImage")
    public Boolean fetchImage;

    /**
     * <p>The language of error messages returned by the API. Valid values:  </p>
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
     * <p>The ID of the information template to be queried.  </p>
     * <p>The system automatically generates this ID after the information template is created. You can call the <a href="https://help.aliyun.com/document_detail/67701.html">QueryRegistrantProfiles</a> API to query the information template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567</p>
     */
    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    /**
     * <p>The user IP address. You can set it to 127.0.0.1.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryRegistrantProfileRealNameVerificationInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRegistrantProfileRealNameVerificationInfoRequest self = new QueryRegistrantProfileRealNameVerificationInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryRegistrantProfileRealNameVerificationInfoRequest setFetchImage(Boolean fetchImage) {
        this.fetchImage = fetchImage;
        return this;
    }
    public Boolean getFetchImage() {
        return this.fetchImage;
    }

    public QueryRegistrantProfileRealNameVerificationInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryRegistrantProfileRealNameVerificationInfoRequest setRegistrantProfileId(Long registrantProfileId) {
        this.registrantProfileId = registrantProfileId;
        return this;
    }
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    public QueryRegistrantProfileRealNameVerificationInfoRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
