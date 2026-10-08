// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SetDefaultRegistrantProfileRequest extends TeaModel {
    /**
     * <p>The ID of the contact template to be set as default.</p>
     * <p>The system automatically generates this ID after the template is successfully created. You can invoke the <a href="https://help.aliyun.com/document_detail/67701.html">QueryRegistrantProfiles</a> API to query the template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567</p>
     */
    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    /**
     * <p>The user IP address. The default value is <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SetDefaultRegistrantProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultRegistrantProfileRequest self = new SetDefaultRegistrantProfileRequest();
        return TeaModel.build(map, self);
    }

    public SetDefaultRegistrantProfileRequest setRegistrantProfileId(Long registrantProfileId) {
        this.registrantProfileId = registrantProfileId;
        return this;
    }
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    public SetDefaultRegistrantProfileRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
