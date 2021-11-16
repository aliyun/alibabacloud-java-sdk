// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListSourceEventsRequest extends TeaModel {
    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    // 报警或者事件ID
    @NameInMap("instanceId")
    public Long instanceId;

    // INCIDENT 事件、ALERT 报警、PROBLEM 故障
    @NameInMap("instanceType")
    public String instanceType;

    // 当前页
    @NameInMap("pageNumber")
    public Long pageNumber;

    // 页大小
    @NameInMap("pageSize")
    public Long pageSize;

    // startRowKey 用来查询下一页的数据
    @NameInMap("startRowKey")
    public String startRowKey;

    // stopRowKey 用来查询上一页的数据
    @NameInMap("stopRowKey")
    public String stopRowKey;

    public static ListSourceEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSourceEventsRequest self = new ListSourceEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListSourceEventsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListSourceEventsRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public ListSourceEventsRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ListSourceEventsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListSourceEventsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSourceEventsRequest setStartRowKey(String startRowKey) {
        this.startRowKey = startRowKey;
        return this;
    }
    public String getStartRowKey() {
        return this.startRowKey;
    }

    public ListSourceEventsRequest setStopRowKey(String stopRowKey) {
        this.stopRowKey = stopRowKey;
        return this;
    }
    public String getStopRowKey() {
        return this.stopRowKey;
    }

}
