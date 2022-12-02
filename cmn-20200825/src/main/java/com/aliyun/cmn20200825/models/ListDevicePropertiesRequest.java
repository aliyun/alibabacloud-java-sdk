// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDevicePropertiesRequest extends TeaModel {
    @NameInMap("DeviceFormId")
    public String deviceFormId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    public static ListDevicePropertiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDevicePropertiesRequest self = new ListDevicePropertiesRequest();
        return TeaModel.build(map, self);
    }

    public ListDevicePropertiesRequest setDeviceFormId(String deviceFormId) {
        this.deviceFormId = deviceFormId;
        return this;
    }
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

    public ListDevicePropertiesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
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

}
