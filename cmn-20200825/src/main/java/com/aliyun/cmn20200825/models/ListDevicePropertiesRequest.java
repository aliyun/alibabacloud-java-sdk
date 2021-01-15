// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDevicePropertiesRequest extends TeaModel {
    // 返回结果的最大个数。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public String nextToken;

    // 设备形态ID
    @NameInMap("DeviceFormId")
    public String deviceFormId;

    public static ListDevicePropertiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDevicePropertiesRequest self = new ListDevicePropertiesRequest();
        return TeaModel.build(map, self);
    }

    public ListDevicePropertiesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDevicePropertiesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDevicePropertiesRequest setDeviceFormId(String deviceFormId) {
        this.deviceFormId = deviceFormId;
        return this;
    }
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

}
