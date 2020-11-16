// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRecordRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("RecordId")
    @Validation(required = true)
    public String recordId;

    public static DescribeRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordRequest self = new DescribeRecordRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecordRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeRecordRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}
