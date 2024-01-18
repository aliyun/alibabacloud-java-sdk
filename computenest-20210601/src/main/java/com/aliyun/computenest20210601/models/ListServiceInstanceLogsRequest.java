// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServiceInstanceLogsRequest extends TeaModel {
    @NameInMap("LogSource")
    public String logSource;

    @NameInMap("Logstore")
    public String logstore;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    public static ListServiceInstanceLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceLogsRequest self = new ListServiceInstanceLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceLogsRequest setLogSource(String logSource) {
        this.logSource = logSource;
        return this;
    }
    public String getLogSource() {
        return this.logSource;
    }

    public ListServiceInstanceLogsRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ListServiceInstanceLogsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceInstanceLogsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceInstanceLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListServiceInstanceLogsRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

}
