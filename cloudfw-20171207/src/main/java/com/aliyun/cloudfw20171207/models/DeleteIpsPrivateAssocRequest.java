// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteIpsPrivateAssocRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>ngw-c5vhmjdfp5t****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    public static DeleteIpsPrivateAssocRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpsPrivateAssocRequest self = new DeleteIpsPrivateAssocRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIpsPrivateAssocRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteIpsPrivateAssocRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
