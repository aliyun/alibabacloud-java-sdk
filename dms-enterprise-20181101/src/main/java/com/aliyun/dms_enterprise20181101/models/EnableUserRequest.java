// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class EnableUserRequest extends TeaModel {
    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p> To obtain the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">Tenant information</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The UID of the Alibaba Cloud account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("Uid")
    public String uid;

    public static EnableUserRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableUserRequest self = new EnableUserRequest();
        return TeaModel.build(map, self);
    }

    public EnableUserRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public EnableUserRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
