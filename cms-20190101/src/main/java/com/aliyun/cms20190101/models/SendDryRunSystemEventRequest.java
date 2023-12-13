// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class SendDryRunSystemEventRequest extends TeaModel {
    /**
     * <p>The content of the system event.</p>
     * <br>
     * <p>>  The value of this parameter is a JSON object. We recommend that you include the `product`, `resourceId`, and `regionId` fields in the JSON object.</p>
     */
    @NameInMap("EventContent")
    public String eventContent;

    /**
     * <p>The name of the system event.</p>
     * <br>
     * <p>>  For more information, see [DescribeSystemEventMetaList](~~114972~~).</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The ID of the application group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the cloud service.</p>
     * <br>
     * <p>>  For information about the system events supported by Cloud Monitor for Alibaba Cloud services, see [System events](~~167388~~).</p>
     */
    @NameInMap("Product")
    public String product;

    @NameInMap("RegionId")
    public String regionId;

    public static SendDryRunSystemEventRequest build(java.util.Map<String, ?> map) throws Exception {
        SendDryRunSystemEventRequest self = new SendDryRunSystemEventRequest();
        return TeaModel.build(map, self);
    }

    public SendDryRunSystemEventRequest setEventContent(String eventContent) {
        this.eventContent = eventContent;
        return this;
    }
    public String getEventContent() {
        return this.eventContent;
    }

    public SendDryRunSystemEventRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public SendDryRunSystemEventRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SendDryRunSystemEventRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public SendDryRunSystemEventRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
