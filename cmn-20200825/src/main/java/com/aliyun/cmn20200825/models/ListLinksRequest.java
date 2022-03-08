// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListLinksRequest extends TeaModel {
    // A端设备名
    @NameInMap("DeviceNameA")
    public String deviceNameA;

    // B端设备名
    @NameInMap("DeviceNameB")
    public String deviceNameB;

    // A端IP
    @NameInMap("IpA")
    public String ipA;

    // B端IP
    @NameInMap("IpB")
    public String ipB;

    // 链路名称
    @NameInMap("LinkName")
    public String linkName;

    // 链路状态
    @NameInMap("LinkStatus")
    public String linkStatus;

    // 链路类型（单端、双端）
    @NameInMap("LinkType")
    public String linkType;

    // 返回结果的最大个数。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public String nextToken;

    // A端端口名
    @NameInMap("PortA")
    public String portA;

    // B端端口名
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
