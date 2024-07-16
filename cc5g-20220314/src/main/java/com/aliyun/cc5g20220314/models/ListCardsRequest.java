// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListCardsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>bjaliyun01s.5gbj.bjiot</p>
     */
    @NameInMap("Apn")
    public String apn;

    /**
     * <strong>example:</strong>
     * <p>8909123123121912</p>
     */
    @NameInMap("Iccid")
    public String iccid;

    @NameInMap("Iccids")
    public java.util.List<String> iccids;

    /**
     * <strong>example:</strong>
     * <p>10.0.0.1</p>
     */
    @NameInMap("IpAddress")
    public String ipAddress;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Lock")
    public Boolean lock;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>1441204374591</p>
     */
    @NameInMap("Msisdn")
    public String msisdn;

    /**
     * <strong>example:</strong>
     * <p>cciot-xxxx</p>
     */
    @NameInMap("NetLinkId")
    public String netLinkId;

    /**
     * <strong>example:</strong>
     * <p>iou001238joojjaere</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Online")
    public Boolean online;

    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc5g-xxxx</p>
     */
    @NameInMap("WirelessCloudConnectorId")
    public String wirelessCloudConnectorId;

    public static ListCardsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCardsRequest self = new ListCardsRequest();
        return TeaModel.build(map, self);
    }

    public ListCardsRequest setApn(String apn) {
        this.apn = apn;
        return this;
    }
    public String getApn() {
        return this.apn;
    }

    public ListCardsRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

    public ListCardsRequest setIccids(java.util.List<String> iccids) {
        this.iccids = iccids;
        return this;
    }
    public java.util.List<String> getIccids() {
        return this.iccids;
    }

    public ListCardsRequest setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public ListCardsRequest setLock(Boolean lock) {
        this.lock = lock;
        return this;
    }
    public Boolean getLock() {
        return this.lock;
    }

    public ListCardsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListCardsRequest setMsisdn(String msisdn) {
        this.msisdn = msisdn;
        return this;
    }
    public String getMsisdn() {
        return this.msisdn;
    }

    public ListCardsRequest setNetLinkId(String netLinkId) {
        this.netLinkId = netLinkId;
        return this;
    }
    public String getNetLinkId() {
        return this.netLinkId;
    }

    public ListCardsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCardsRequest setOnline(Boolean online) {
        this.online = online;
        return this;
    }
    public Boolean getOnline() {
        return this.online;
    }

    public ListCardsRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public ListCardsRequest setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
        this.wirelessCloudConnectorId = wirelessCloudConnectorId;
        return this;
    }
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

}
