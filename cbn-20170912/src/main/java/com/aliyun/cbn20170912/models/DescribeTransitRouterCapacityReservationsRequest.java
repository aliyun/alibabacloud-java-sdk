// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeTransitRouterCapacityReservationsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-uf6llz2286805i44g****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    @NameInMap("Version")
    public String version;

    public static DescribeTransitRouterCapacityReservationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitRouterCapacityReservationsRequest self = new DescribeTransitRouterCapacityReservationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTransitRouterCapacityReservationsRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public DescribeTransitRouterCapacityReservationsRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
