// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRecursionRecordRemarkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>e432232342423ew423</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>record id</p>
     * 
     * <strong>example:</strong>
     * <p>173671468000010</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static UpdateRecursionRecordRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecursionRecordRemarkRequest self = new UpdateRecursionRecordRemarkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecursionRecordRemarkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRecursionRecordRemarkRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public UpdateRecursionRecordRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
