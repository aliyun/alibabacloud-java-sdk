// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListIpBlocksRequest extends TeaModel {
    @NameInMap("BottomNode")
    public Boolean bottomNode;

    @NameInMap("Category")
    public String category;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("IpBlockCode")
    public String ipBlockCode;

    @NameInMap("IpList")
    public java.util.List<String> ipList;

    @NameInMap("LeafNode")
    public Boolean leafNode;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NetBusiness")
    public String netBusiness;

    @NameInMap("NetType")
    public String netType;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ParentUid")
    public String parentUid;

    @NameInMap("Status")
    public String status;

    @NameInMap("SubNetBusiness")
    public String subNetBusiness;

    @NameInMap("TopParent")
    public Boolean topParent;

    @NameInMap("TreeType")
    public Boolean treeType;

    @NameInMap("ZoneName")
    public String zoneName;

    public static ListIpBlocksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIpBlocksRequest self = new ListIpBlocksRequest();
        return TeaModel.build(map, self);
    }

    public ListIpBlocksRequest setBottomNode(Boolean bottomNode) {
        this.bottomNode = bottomNode;
        return this;
    }
    public Boolean getBottomNode() {
        return this.bottomNode;
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

    public ListIpBlocksRequest setIpList(java.util.List<String> ipList) {
        this.ipList = ipList;
        return this;
    }
    public java.util.List<String> getIpList() {
        return this.ipList;
    }

    public ListIpBlocksRequest setLeafNode(Boolean leafNode) {
        this.leafNode = leafNode;
        return this;
    }
    public Boolean getLeafNode() {
        return this.leafNode;
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

    public ListIpBlocksRequest setParentUid(String parentUid) {
        this.parentUid = parentUid;
        return this;
    }
    public String getParentUid() {
        return this.parentUid;
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

    public ListIpBlocksRequest setTopParent(Boolean topParent) {
        this.topParent = topParent;
        return this;
    }
    public Boolean getTopParent() {
        return this.topParent;
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
