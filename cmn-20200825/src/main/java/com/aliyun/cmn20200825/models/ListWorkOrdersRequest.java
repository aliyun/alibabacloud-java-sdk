// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListWorkOrdersRequest extends TeaModel {
    @NameInMap("DeviceSnA")
    public String deviceSnA;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("WorkOrderSource")
    public String workOrderSource;

    @NameInMap("WorkOrderStep")
    public String workOrderStep;

    @NameInMap("WorkOrderTitle")
    public String workOrderTitle;

    public static ListWorkOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkOrdersRequest self = new ListWorkOrdersRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkOrdersRequest setDeviceSnA(String deviceSnA) {
        this.deviceSnA = deviceSnA;
        return this;
    }
    public String getDeviceSnA() {
        return this.deviceSnA;
    }

    public ListWorkOrdersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListWorkOrdersRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListWorkOrdersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkOrdersRequest setWorkOrderSource(String workOrderSource) {
        this.workOrderSource = workOrderSource;
        return this;
    }
    public String getWorkOrderSource() {
        return this.workOrderSource;
    }

    public ListWorkOrdersRequest setWorkOrderStep(String workOrderStep) {
        this.workOrderStep = workOrderStep;
        return this;
    }
    public String getWorkOrderStep() {
        return this.workOrderStep;
    }

    public ListWorkOrdersRequest setWorkOrderTitle(String workOrderTitle) {
        this.workOrderTitle = workOrderTitle;
        return this;
    }
    public String getWorkOrderTitle() {
        return this.workOrderTitle;
    }

}
