// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class SendCustomEventRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1214484929940219</p>
     */
    @NameInMap("CustomerId")
    public String customerId;

    /**
     * <strong>example:</strong>
     * <p>aegis_suspicious_event</p>
     */
    @NameInMap("DataSource")
    public String dataSource;

    @NameInMap("EventDescription")
    public String eventDescription;

    @NameInMap("EventDetails")
    public String eventDetails;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SUSP_CUSTOM_CFW</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-23 14:47:34</p>
     */
    @NameInMap("FindTime")
    public Long findTime;

    /**
     * <strong>example:</strong>
     * <p>i-uf60h3ns25bzq9eyf8ps</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsSend")
    public String isSend;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>serious</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <strong>example:</strong>
     * <p>1724956996000</p>
     */
    @NameInMap("OccurrenceTime")
    public Long occurrenceTime;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <strong>example:</strong>
     * <p>CloudSecCenter</p>
     */
    @NameInMap("Product")
    public String product;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>68888f02-98f2-492b-a2b2-5b13295755b7</p>
     */
    @NameInMap("UniqueId")
    public String uniqueId;

    /**
     * <p>UUID。</p>
     * 
     * <strong>example:</strong>
     * <p>93B6CDAB-7D2E-33D2-9EBA-25D561A2E95F</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static SendCustomEventRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCustomEventRequest self = new SendCustomEventRequest();
        return TeaModel.build(map, self);
    }

    public SendCustomEventRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public SendCustomEventRequest setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

    public SendCustomEventRequest setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
        return this;
    }
    public String getEventDescription() {
        return this.eventDescription;
    }

    public SendCustomEventRequest setEventDetails(String eventDetails) {
        this.eventDetails = eventDetails;
        return this;
    }
    public String getEventDetails() {
        return this.eventDetails;
    }

    public SendCustomEventRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public SendCustomEventRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public SendCustomEventRequest setFindTime(Long findTime) {
        this.findTime = findTime;
        return this;
    }
    public Long getFindTime() {
        return this.findTime;
    }

    public SendCustomEventRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SendCustomEventRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public SendCustomEventRequest setIsSend(String isSend) {
        this.isSend = isSend;
        return this;
    }
    public String getIsSend() {
        return this.isSend;
    }

    public SendCustomEventRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public SendCustomEventRequest setOccurrenceTime(Long occurrenceTime) {
        this.occurrenceTime = occurrenceTime;
        return this;
    }
    public Long getOccurrenceTime() {
        return this.occurrenceTime;
    }

    public SendCustomEventRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public SendCustomEventRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public SendCustomEventRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public SendCustomEventRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
