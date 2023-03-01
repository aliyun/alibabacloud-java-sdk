// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListReservedCapacitiesResponseBody extends TeaModel {
    /**
     * <p>The token used to obtain more results.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The information about subscription instances.</p>
     */
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
