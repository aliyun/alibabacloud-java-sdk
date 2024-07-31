// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDagsRequest extends TeaModel {
    /**
     * <p>The sequence number that uniquely identifies the data backfill operation. You can call the <a href="https://help.aliyun.com/document_detail/189753.html">GetDag</a> operation to query the sequence number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("OpSeq")
    public Long opSeq;

    /**
     * <p>The environment of the workspace. Valid values: PROD and DEV. The value PROD indicates the production environment, and the value DEV indicates the development environment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    public static ListDagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDagsRequest self = new ListDagsRequest();
        return TeaModel.build(map, self);
    }

    public ListDagsRequest setOpSeq(Long opSeq) {
        this.opSeq = opSeq;
        return this;
    }
    public Long getOpSeq() {
        return this.opSeq;
    }

    public ListDagsRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

}
