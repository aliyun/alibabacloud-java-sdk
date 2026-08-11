// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseOrgCreateNodeShrinkRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BizName")
    public String bizName;

    @NameInMap("Ext")
    public String extShrink;

    @NameInMap("IsOpenApi")
    public Boolean isOpenApi;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("NodeName")
    public String nodeName;

    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("OrientedEcId")
    public String orientedEcId;

    @NameInMap("OrientedLeId")
    public String orientedLeId;

    @NameInMap("OrientedNbId")
    public String orientedNbId;

    @NameInMap("ParentNodeId")
    public String parentNodeId;

    @NameInMap("ParentNodeType")
    public String parentNodeType;

    @NameInMap("ShowCompleteInfo")
    public Boolean showCompleteInfo;

    @NameInMap("TreeId")
    public Long treeId;

    public static EnterpriseOrgCreateNodeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseOrgCreateNodeShrinkRequest self = new EnterpriseOrgCreateNodeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseOrgCreateNodeShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EnterpriseOrgCreateNodeShrinkRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public EnterpriseOrgCreateNodeShrinkRequest setExtShrink(String extShrink) {
        this.extShrink = extShrink;
        return this;
    }
    public String getExtShrink() {
        return this.extShrink;
    }

    public EnterpriseOrgCreateNodeShrinkRequest setIsOpenApi(Boolean isOpenApi) {
        this.isOpenApi = isOpenApi;
        return this;
    }
    public Boolean getIsOpenApi() {
        return this.isOpenApi;
    }

    public EnterpriseOrgCreateNodeShrinkRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public EnterpriseOrgCreateNodeShrinkRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public EnterpriseOrgCreateNodeShrinkRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public EnterpriseOrgCreateNodeShrinkRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseOrgCreateNodeShrinkRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseOrgCreateNodeShrinkRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public EnterpriseOrgCreateNodeShrinkRequest setParentNodeId(String parentNodeId) {
        this.parentNodeId = parentNodeId;
        return this;
    }
    public String getParentNodeId() {
        return this.parentNodeId;
    }

    public EnterpriseOrgCreateNodeShrinkRequest setParentNodeType(String parentNodeType) {
        this.parentNodeType = parentNodeType;
        return this;
    }
    public String getParentNodeType() {
        return this.parentNodeType;
    }

    public EnterpriseOrgCreateNodeShrinkRequest setShowCompleteInfo(Boolean showCompleteInfo) {
        this.showCompleteInfo = showCompleteInfo;
        return this;
    }
    public Boolean getShowCompleteInfo() {
        return this.showCompleteInfo;
    }

    public EnterpriseOrgCreateNodeShrinkRequest setTreeId(Long treeId) {
        this.treeId = treeId;
        return this;
    }
    public Long getTreeId() {
        return this.treeId;
    }

}
