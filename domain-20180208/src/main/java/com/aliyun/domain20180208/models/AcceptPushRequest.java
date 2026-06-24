// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class AcceptPushRequest extends TeaModel {
    /**
     * <p>实名认证通过的模板，域名过户时用于WHOIS信息变更</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13862458</p>
     */
    @NameInMap("ContactTemplateId")
    public Long contactTemplateId;

    /**
     * <p>Push编号</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>push_20250101_abc123</p>
     */
    @NameInMap("PushNo")
    public String pushNo;

    public static AcceptPushRequest build(java.util.Map<String, ?> map) throws Exception {
        AcceptPushRequest self = new AcceptPushRequest();
        return TeaModel.build(map, self);
    }

    public AcceptPushRequest setContactTemplateId(Long contactTemplateId) {
        this.contactTemplateId = contactTemplateId;
        return this;
    }
    public Long getContactTemplateId() {
        return this.contactTemplateId;
    }

    public AcceptPushRequest setPushNo(String pushNo) {
        this.pushNo = pushNo;
        return this;
    }
    public String getPushNo() {
        return this.pushNo;
    }

}
