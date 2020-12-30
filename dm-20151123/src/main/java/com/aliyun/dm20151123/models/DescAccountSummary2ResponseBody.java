// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DescAccountSummary2ResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MnsForceMigrating")
    public Integer mnsForceMigrating;

    @NameInMap("MnsBag")
    public Integer mnsBag;

    @NameInMap("MnsMigrating")
    public Integer mnsMigrating;

    public static DescAccountSummary2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescAccountSummary2ResponseBody self = new DescAccountSummary2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescAccountSummary2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescAccountSummary2ResponseBody setMnsForceMigrating(Integer mnsForceMigrating) {
        this.mnsForceMigrating = mnsForceMigrating;
        return this;
    }
    public Integer getMnsForceMigrating() {
        return this.mnsForceMigrating;
    }

    public DescAccountSummary2ResponseBody setMnsBag(Integer mnsBag) {
        this.mnsBag = mnsBag;
        return this;
    }
    public Integer getMnsBag() {
        return this.mnsBag;
    }

    public DescAccountSummary2ResponseBody setMnsMigrating(Integer mnsMigrating) {
        this.mnsMigrating = mnsMigrating;
        return this;
    }
    public Integer getMnsMigrating() {
        return this.mnsMigrating;
    }

}
