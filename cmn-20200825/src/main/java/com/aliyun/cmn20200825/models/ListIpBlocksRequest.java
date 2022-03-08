// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListIpBlocksRequest extends TeaModel {
    // 地址类别
    @NameInMap("Category")
    public String category;

    @NameInMap("InstanceId")
    public String instanceId;

    // IP地址
    @NameInMap("Ip")
    public String ip;

    // 地址段
    @NameInMap("IpBlockCode")
    public String ipBlockCode;

    // 返回结果的最大个数。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 公网地址类型，NetType为PUBLIC有效
    @NameInMap("NetBusiness")
    public String netBusiness;

    // 网络类型 PRIVATE PUBLIC
    @NameInMap("NetType")
    public String netType;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public String nextToken;

    // 地址段状态
    @NameInMap("Status")
    public String status;

    // 业务类型小类
    @NameInMap("SubNetBusiness")
    public String subNetBusiness;

    // 是否树状展示地址段
    @NameInMap("TreeType")
    public Boolean treeType;

    // 园区名称，NetType为PUBLIC有效
    @NameInMap("ZoneName")
    public String zoneName;

    public static ListIpBlocksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIpBlocksRequest self = new ListIpBlocksRequest();
        return TeaModel.build(map, self);
    }

    public ListIpBlocksRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListIpBlocksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListIpBlocksRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ListIpBlocksRequest setIpBlockCode(String ipBlockCode) {
        this.ipBlockCode = ipBlockCode;
        return this;
    }
    public String getIpBlockCode() {
        return this.ipBlockCode;
    }

    public ListIpBlocksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIpBlocksRequest setNetBusiness(String netBusiness) {
        this.netBusiness = netBusiness;
        return this;
    }
    public String getNetBusiness() {
        return this.netBusiness;
    }

    public ListIpBlocksRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public ListIpBlocksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpBlocksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListIpBlocksRequest setSubNetBusiness(String subNetBusiness) {
        this.subNetBusiness = subNetBusiness;
        return this;
    }
    public String getSubNetBusiness() {
        return this.subNetBusiness;
    }

    public ListIpBlocksRequest setTreeType(Boolean treeType) {
        this.treeType = treeType;
        return this;
    }
    public Boolean getTreeType() {
        return this.treeType;
    }

    public ListIpBlocksRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

}
