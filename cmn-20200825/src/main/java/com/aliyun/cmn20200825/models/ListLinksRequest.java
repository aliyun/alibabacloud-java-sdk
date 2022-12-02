// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListLinksRequest extends TeaModel {
    @NameInMap("DeviceNameA")
    public String deviceNameA;

    @NameInMap("DeviceNameB")
    public String deviceNameB;

    @NameInMap("IpA")
    public String ipA;

    @NameInMap("IpB")
    public String ipB;

    @NameInMap("LinkName")
    public String linkName;

    @NameInMap("LinkNo")
    public String linkNo;

    @NameInMap("LinkStatus")
    public String linkStatus;

    @NameInMap("LinkType")
    public String linkType;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PortA")
    public String portA;

    @NameInMap("PortB")
    public String portB;

    public static ListLinksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinksRequest self = new ListLinksRequest();
        return TeaModel.build(map, self);
    }

    public ListLinksRequest setDeviceNameA(String deviceNameA) {
        this.deviceNameA = deviceNameA;
        return this;
    }
    public String getDeviceNameA() {
        return this.deviceNameA;
    }

    public ListLinksRequest setDeviceNameB(String deviceNameB) {
        this.deviceNameB = deviceNameB;
        return this;
    }
    public String getDeviceNameB() {
        return this.deviceNameB;
    }

    public ListLinksRequest setIpA(String ipA) {
        this.ipA = ipA;
        return this;
    }
    public String getIpA() {
        return this.ipA;
    }

    public ListLinksRequest setIpB(String ipB) {
        this.ipB = ipB;
        return this;
    }
    public String getIpB() {
        return this.ipB;
    }

    public ListLinksRequest setLinkName(String linkName) {
        this.linkName = linkName;
        return this;
    }
    public String getLinkName() {
        return this.linkName;
    }

    public ListLinksRequest setLinkNo(String linkNo) {
        this.linkNo = linkNo;
        return this;
    }
    public String getLinkNo() {
        return this.linkNo;
    }

    public ListLinksRequest setLinkStatus(String linkStatus) {
        this.linkStatus = linkStatus;
        return this;
    }
    public String getLinkStatus() {
        return this.linkStatus;
    }

    public ListLinksRequest setLinkType(String linkType) {
        this.linkType = linkType;
        return this;
    }
    public String getLinkType() {
        return this.linkType;
    }

    public ListLinksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListLinksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListLinksRequest setPortA(String portA) {
        this.portA = portA;
        return this;
    }
    public String getPortA() {
        return this.portA;
    }

    public ListLinksRequest setPortB(String portB) {
        this.portB = portB;
        return this;
    }
    public String getPortB() {
        return this.portB;
    }

}
