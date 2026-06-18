// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteRecordRequest extends TeaModel {
    /**
     * <p>The ID of the DNS record. You can get this ID by calling the <a href="https://help.aliyun.com/document_detail/2850265.html">ListRecords</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecordRequest self = new DeleteRecordRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRecordRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public DeleteRecordRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
