// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListIpBlocksRequest extends TeaModel {
    // 返回结果的最大个数。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("InstanceId")
    public String instanceId;

    // 网络类型 PRIVATE PUBLIC
    @NameInMap("NetType")
    public String netType;

    // 是否树状展示地址段
    @NameInMap("TreeType")
    public Boolean treeType;

    // 地址段
    @NameInMap("IpBlock")
    public String ipBlock;

    // IP地址
    @NameInMap("Ip")
    public String ip;

    // 地址段状态
    @NameInMap("Status")
    public String status;

    // 园区名称，NetType为PUBLIC有效
    @NameInMap("ZoneName")
    public String zoneName;

    // 公网地址类型，NetType为PUBLIC有效
    @NameInMap("NetBusiness")
    public String netBusiness;

    public static ListIpBlocksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIpBlocksRequest self = new ListIpBlocksRequest();
        return TeaModel.build(map, self);
    }

    public ListIpBlocksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIpBlocksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpBlocksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListIpBlocksRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public ListIpBlocksRequest setTreeType(Boolean treeType) {
        this.treeType = treeType;
        return this;
    }
    public Boolean getTreeType() {
        return this.treeType;
    }

    public ListIpBlocksRequest setIpBlock(String ipBlock) {
        this.ipBlock = ipBlock;
        return this;
    }
    public String getIpBlock() {
        return this.ipBlock;
    }

    public ListIpBlocksRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ListIpBlocksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListIpBlocksRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public ListIpBlocksRequest setNetBusiness(String netBusiness) {
        this.netBusiness = netBusiness;
        return this;
    }
    public String getNetBusiness() {
        return this.netBusiness;
    }

}
