// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class GetQualificationUploadPolicyRequest extends TeaModel {
    /**
     * <p>Language of the error message returned by the API. Valid values:  </p>
     * <ul>
     * <li>zh: Chinese  </li>
     * <li>en: English</li>
     * </ul>
     * <p>Default value: en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>User IP address, which can be set to <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static GetQualificationUploadPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualificationUploadPolicyRequest self = new GetQualificationUploadPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetQualificationUploadPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetQualificationUploadPolicyRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
