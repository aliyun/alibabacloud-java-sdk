// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySlsStatusNewResponseBody extends TeaModel {
    @NameInMap("AuthorizeStatus")
    public Boolean authorizeStatus;

    @NameInMap("OpenStatus")
    public Boolean openStatus;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SaveTime")
    public Integer saveTime;

    @NameInMap("Uid")
    public String uid;

    public static QuerySlsStatusNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySlsStatusNewResponseBody self = new QuerySlsStatusNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySlsStatusNewResponseBody setAuthorizeStatus(Boolean authorizeStatus) {
        this.authorizeStatus = authorizeStatus;
        return this;
    }
    public Boolean getAuthorizeStatus() {
        return this.authorizeStatus;
    }

    public QuerySlsStatusNewResponseBody setOpenStatus(Boolean openStatus) {
        this.openStatus = openStatus;
        return this;
    }
    public Boolean getOpenStatus() {
        return this.openStatus;
    }

    public QuerySlsStatusNewResponseBody setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QuerySlsStatusNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySlsStatusNewResponseBody setSaveTime(Integer saveTime) {
        this.saveTime = saveTime;
        return this;
    }
    public Integer getSaveTime() {
        return this.saveTime;
    }

    public QuerySlsStatusNewResponseBody setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
