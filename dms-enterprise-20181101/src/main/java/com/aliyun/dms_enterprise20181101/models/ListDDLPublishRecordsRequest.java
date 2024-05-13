// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDDLPublishRecordsRequest extends TeaModel {
    /**
     * <p>The ID of the ticket.</p>
     * <br>
     * <p>> You can create a schema design ticket in the Data Management (DMS) console. For more information, see [Design schemas](https://help.aliyun.com/document_detail/69711.html). You can also call the [CreateOrder](https://help.aliyun.com/document_detail/144649.html) operation to create a schema design ticket and obtain the ID of the ticket.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> To view the ID of the tenant, log on to the DMS console and move the pointer over the profile picture in the upper-right corner. For more information, see [Manage DMS tenants](https://help.aliyun.com/document_detail/181330.html).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListDDLPublishRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDDLPublishRecordsRequest self = new ListDDLPublishRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListDDLPublishRecordsRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ListDDLPublishRecordsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
