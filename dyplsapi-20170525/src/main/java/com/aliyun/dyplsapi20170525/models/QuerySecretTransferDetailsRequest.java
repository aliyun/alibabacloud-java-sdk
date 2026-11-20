// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySecretTransferDetailsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>迁移记录的id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>55</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    public static QuerySecretTransferDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySecretTransferDetailsRequest self = new QuerySecretTransferDetailsRequest();
        return TeaModel.build(map, self);
    }

    public QuerySecretTransferDetailsRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QuerySecretTransferDetailsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QuerySecretTransferDetailsRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

}
