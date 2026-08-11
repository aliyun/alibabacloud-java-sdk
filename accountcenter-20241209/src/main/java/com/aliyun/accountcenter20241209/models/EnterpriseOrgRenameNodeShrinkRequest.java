// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseOrgRenameNodeShrinkRequest extends TeaModel {
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

    @NameInMap("ShowCompleteInfo")
    public Boolean showCompleteInfo;

    @NameInMap("TreeId")
    public Long treeId;

    public static EnterpriseOrgRenameNodeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseOrgRenameNodeShrinkRequest self = new EnterpriseOrgRenameNodeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseOrgRenameNodeShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EnterpriseOrgRenameNodeShrinkRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public EnterpriseOrgRenameNodeShrinkRequest setExtShrink(String extShrink) {
        this.extShrink = extShrink;
        return this;
    }
    public String getExtShrink() {
        return this.extShrink;
    }

    public EnterpriseOrgRenameNodeShrinkRequest setIsOpenApi(Boolean isOpenApi) {
        this.isOpenApi = isOpenApi;
        return this;
    }
    public Boolean getIsOpenApi() {
        return this.isOpenApi;
    }

    public EnterpriseOrgRenameNodeShrinkRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public EnterpriseOrgRenameNodeShrinkRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public EnterpriseOrgRenameNodeShrinkRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public EnterpriseOrgRenameNodeShrinkRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseOrgRenameNodeShrinkRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseOrgRenameNodeShrinkRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public EnterpriseOrgRenameNodeShrinkRequest setShowCompleteInfo(Boolean showCompleteInfo) {
        this.showCompleteInfo = showCompleteInfo;
        return this;
    }
    public Boolean getShowCompleteInfo() {
        return this.showCompleteInfo;
    }

    public EnterpriseOrgRenameNodeShrinkRequest setTreeId(Long treeId) {
        this.treeId = treeId;
        return this;
    }
    public Long getTreeId() {
        return this.treeId;
    }

}
