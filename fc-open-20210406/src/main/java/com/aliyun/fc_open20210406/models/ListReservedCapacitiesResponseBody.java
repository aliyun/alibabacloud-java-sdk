// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListReservedCapacitiesResponseBody extends TeaModel {
    // The pagination token to request the next page of results.
    @NameInMap("nextToken")
    public String nextToken;

    // The information about subscription instances.
    @NameInMap("reservedCapacities")
    public java.util.List<OpenReservedCapacity> reservedCapacities;

    public static ListReservedCapacitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListReservedCapacitiesResponseBody self = new ListReservedCapacitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListReservedCapacitiesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListReservedCapacitiesResponseBody setReservedCapacities(java.util.List<OpenReservedCapacity> reservedCapacities) {
        this.reservedCapacities = reservedCapacities;
        return this;
    }
    public java.util.List<OpenReservedCapacity> getReservedCapacities() {
        return this.reservedCapacities;
    }

}
