// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class DeleteContactTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ContactTemplateId")
    public Long contactTemplateId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static DeleteContactTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactTemplateRequest self = new DeleteContactTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContactTemplateRequest setContactTemplateId(Long contactTemplateId) {
        this.contactTemplateId = contactTemplateId;
        return this;
    }
    public Long getContactTemplateId() {
        return this.contactTemplateId;
    }

    public DeleteContactTemplateRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteContactTemplateRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
