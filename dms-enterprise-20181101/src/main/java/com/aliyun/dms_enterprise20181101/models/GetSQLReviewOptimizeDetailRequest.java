// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetSQLReviewOptimizeDetailRequest extends TeaModel {
    /**
     * <p>The key that is used to query the details of optimization suggestions. You can call the <a href="https://help.aliyun.com/document_detail/257870.html">ListSQLReviewOriginSQL</a> operation to query the key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a57e54ec5433475ea3082d882fdb****</p>
     */
    @NameInMap("SQLReviewQueryKey")
    public String SQLReviewQueryKey;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to query the ID of the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetSQLReviewOptimizeDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSQLReviewOptimizeDetailRequest self = new GetSQLReviewOptimizeDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetSQLReviewOptimizeDetailRequest setSQLReviewQueryKey(String SQLReviewQueryKey) {
        this.SQLReviewQueryKey = SQLReviewQueryKey;
        return this;
    }
    public String getSQLReviewQueryKey() {
        return this.SQLReviewQueryKey;
    }

    public GetSQLReviewOptimizeDetailRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
