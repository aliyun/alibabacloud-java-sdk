// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddRecursionRecordRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6447728c8578e66aacf062d2df4446dc</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("RequestSource")
    public String requestSource;

    /**
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("Rr")
    public String rr;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>192.168.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <strong>example:</strong>
     * <p>1.1.1.1</p>
     */
    @NameInMap("Value")
    public String value;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    /**
     * <p>Zone ID。</p>
     * 
     * <strong>example:</strong>
     * <p>173671468000011</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static AddRecursionRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRecursionRecordRequest self = new AddRecursionRecordRequest();
        return TeaModel.build(map, self);
    }

    public AddRecursionRecordRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddRecursionRecordRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public AddRecursionRecordRequest setRequestSource(String requestSource) {
        this.requestSource = requestSource;
        return this;
    }
    public String getRequestSource() {
        return this.requestSource;
    }

    public AddRecursionRecordRequest setRr(String rr) {
        this.rr = rr;
        return this;
    }
    public String getRr() {
        return this.rr;
    }

    public AddRecursionRecordRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public AddRecursionRecordRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddRecursionRecordRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public AddRecursionRecordRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public AddRecursionRecordRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

    public AddRecursionRecordRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
