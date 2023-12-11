// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSQAConfigResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SQAStatus")
    public String SQAStatus;

    public static DescribeSQAConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQAConfigResponseBody self = new DescribeSQAConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQAConfigResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSQAConfigResponseBody setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeSQAConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQAConfigResponseBody setSQAStatus(String SQAStatus) {
        this.SQAStatus = SQAStatus;
        return this;
    }
    public String getSQAStatus() {
        return this.SQAStatus;
    }

}
