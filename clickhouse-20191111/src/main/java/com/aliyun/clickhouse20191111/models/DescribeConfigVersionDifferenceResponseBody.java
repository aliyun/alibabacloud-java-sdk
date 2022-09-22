// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeConfigVersionDifferenceResponseBody extends TeaModel {
    @NameInMap("NewConfigXML")
    public String newConfigXML;

    @NameInMap("OldConfigXML")
    public String oldConfigXML;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeConfigVersionDifferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigVersionDifferenceResponseBody self = new DescribeConfigVersionDifferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConfigVersionDifferenceResponseBody setNewConfigXML(String newConfigXML) {
        this.newConfigXML = newConfigXML;
        return this;
    }
    public String getNewConfigXML() {
        return this.newConfigXML;
    }

    public DescribeConfigVersionDifferenceResponseBody setOldConfigXML(String oldConfigXML) {
        this.oldConfigXML = oldConfigXML;
        return this;
    }
    public String getOldConfigXML() {
        return this.oldConfigXML;
    }

    public DescribeConfigVersionDifferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
