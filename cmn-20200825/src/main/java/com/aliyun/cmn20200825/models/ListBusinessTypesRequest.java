// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListBusinessTypesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    // 返回结果的最大个数。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public String nextToken;

    // 业务类型名称
    @NameInMap("Name")
    public String name;

    // 保留地址数目
    @NameInMap("ReserveNumber")
    public Long reserveNumber;

    // 业务类型大类
    @NameInMap("Type")
    public String type;

    // 绑定的园区类型
    @NameInMap("ZoneType")
    public String zoneType;

    public static ListBusinessTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBusinessTypesRequest self = new ListBusinessTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListBusinessTypesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListBusinessTypesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListBusinessTypesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBusinessTypesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListBusinessTypesRequest setReserveNumber(Long reserveNumber) {
        this.reserveNumber = reserveNumber;
        return this;
    }
    public Long getReserveNumber() {
        return this.reserveNumber;
    }

    public ListBusinessTypesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListBusinessTypesRequest setZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }
    public String getZoneType() {
        return this.zoneType;
    }

}
