// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeAssetDetailByUuidsRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("Bid")
    public String bid;

    @NameInMap("From")
    public String from;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Uuids")
    public String uuids;

    public static DescribeAssetDetailByUuidsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetDetailByUuidsRequest self = new DescribeAssetDetailByUuidsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAssetDetailByUuidsRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeAssetDetailByUuidsRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public DescribeAssetDetailByUuidsRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeAssetDetailByUuidsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAssetDetailByUuidsRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAssetDetailByUuidsRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
