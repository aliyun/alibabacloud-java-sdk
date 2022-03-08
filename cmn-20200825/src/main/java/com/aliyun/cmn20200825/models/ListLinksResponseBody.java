// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListLinksResponseBody extends TeaModel {
    // 数组，返回示例目录。
    @NameInMap("Content")
    public java.util.List<ListLinksResponseBodyContent> content;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public Integer nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListLinksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinksResponseBody self = new ListLinksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinksResponseBody setContent(java.util.List<ListLinksResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<ListLinksResponseBodyContent> getContent() {
        return this.content;
    }

    public ListLinksResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListLinksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListLinksResponseBodyContent extends TeaModel {
        // A端设备名
        @NameInMap("DeviceNameA")
        public String deviceNameA;

        // B端设备名
        @NameInMap("DeviceNameB")
        public String deviceNameB;

        // 创建时间
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // 修改时间
        @NameInMap("GmtModified")
        public String gmtModified;

        // A端端口索引
        @NameInMap("IdxA")
        public String idxA;

        // B端端口索引
        @NameInMap("IdxB")
        public String idxB;

        // A端IP
        @NameInMap("IpA")
        public String ipA;

        // B端IP
        @NameInMap("IpB")
        public String ipB;

        // 链路发现任务
        @NameInMap("JobId")
        public String jobId;

        // 链路名称
        @NameInMap("LinkName")
        public String linkName;

        // 链路编号
        @NameInMap("LinkNo")
        public String linkNo;

        // 链路状态
        @NameInMap("LinkStatus")
        public String linkStatus;

        // 链路类型（单端、双端）
        @NameInMap("LinkType")
        public String linkType;

        // 报错信息或者日志
        @NameInMap("Message")
        public String message;

        // A端端口名
        @NameInMap("PortA")
        public String portA;

        // B端端口名
        @NameInMap("PortB")
        public String portB;

        // A端描述
        @NameInMap("PortDescA")
        public String portDescA;

        // B端描述
        @NameInMap("PortDescB")
        public String portDescB;

        // A端端口状态
        @NameInMap("PortStatusA")
        public String portStatusA;

        // B端端口状态
        @NameInMap("PortStatusB")
        public String portStatusB;

        // A端端口类型
        @NameInMap("PortTypeA")
        public String portTypeA;

        // B端端口类型
        @NameInMap("PortTypeB")
        public String portTypeB;

        // 地域ID
        @NameInMap("RegionId")
        public String regionId;

        public static ListLinksResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListLinksResponseBodyContent self = new ListLinksResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListLinksResponseBodyContent setDeviceNameA(String deviceNameA) {
            this.deviceNameA = deviceNameA;
            return this;
        }
        public String getDeviceNameA() {
            return this.deviceNameA;
        }

        public ListLinksResponseBodyContent setDeviceNameB(String deviceNameB) {
            this.deviceNameB = deviceNameB;
            return this;
        }
        public String getDeviceNameB() {
            return this.deviceNameB;
        }

        public ListLinksResponseBodyContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListLinksResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListLinksResponseBodyContent setIdxA(String idxA) {
            this.idxA = idxA;
            return this;
        }
        public String getIdxA() {
            return this.idxA;
        }

        public ListLinksResponseBodyContent setIdxB(String idxB) {
            this.idxB = idxB;
            return this;
        }
        public String getIdxB() {
            return this.idxB;
        }

        public ListLinksResponseBodyContent setIpA(String ipA) {
            this.ipA = ipA;
            return this;
        }
        public String getIpA() {
            return this.ipA;
        }

        public ListLinksResponseBodyContent setIpB(String ipB) {
            this.ipB = ipB;
            return this;
        }
        public String getIpB() {
            return this.ipB;
        }

        public ListLinksResponseBodyContent setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListLinksResponseBodyContent setLinkName(String linkName) {
            this.linkName = linkName;
            return this;
        }
        public String getLinkName() {
            return this.linkName;
        }

        public ListLinksResponseBodyContent setLinkNo(String linkNo) {
            this.linkNo = linkNo;
            return this;
        }
        public String getLinkNo() {
            return this.linkNo;
        }

        public ListLinksResponseBodyContent setLinkStatus(String linkStatus) {
            this.linkStatus = linkStatus;
            return this;
        }
        public String getLinkStatus() {
            return this.linkStatus;
        }

        public ListLinksResponseBodyContent setLinkType(String linkType) {
            this.linkType = linkType;
            return this;
        }
        public String getLinkType() {
            return this.linkType;
        }

        public ListLinksResponseBodyContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListLinksResponseBodyContent setPortA(String portA) {
            this.portA = portA;
            return this;
        }
        public String getPortA() {
            return this.portA;
        }

        public ListLinksResponseBodyContent setPortB(String portB) {
            this.portB = portB;
            return this;
        }
        public String getPortB() {
            return this.portB;
        }

        public ListLinksResponseBodyContent setPortDescA(String portDescA) {
            this.portDescA = portDescA;
            return this;
        }
        public String getPortDescA() {
            return this.portDescA;
        }

        public ListLinksResponseBodyContent setPortDescB(String portDescB) {
            this.portDescB = portDescB;
            return this;
        }
        public String getPortDescB() {
            return this.portDescB;
        }

        public ListLinksResponseBodyContent setPortStatusA(String portStatusA) {
            this.portStatusA = portStatusA;
            return this;
        }
        public String getPortStatusA() {
            return this.portStatusA;
        }

        public ListLinksResponseBodyContent setPortStatusB(String portStatusB) {
            this.portStatusB = portStatusB;
            return this;
        }
        public String getPortStatusB() {
            return this.portStatusB;
        }

        public ListLinksResponseBodyContent setPortTypeA(String portTypeA) {
            this.portTypeA = portTypeA;
            return this;
        }
        public String getPortTypeA() {
            return this.portTypeA;
        }

        public ListLinksResponseBodyContent setPortTypeB(String portTypeB) {
            this.portTypeB = portTypeB;
            return this;
        }
        public String getPortTypeB() {
            return this.portTypeB;
        }

        public ListLinksResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
