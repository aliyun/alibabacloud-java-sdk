// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseOrgDeleteNodeRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BizName")
    public String bizName;

    @NameInMap("Ext")
    public java.util.Map<String, ?> ext;

    @NameInMap("IsOpenApi")
    public Boolean isOpenApi;

    @NameInMap("NodeId")
    public String nodeId;

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

    public static EnterpriseOrgDeleteNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseOrgDeleteNodeRequest self = new EnterpriseOrgDeleteNodeRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseOrgDeleteNodeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EnterpriseOrgDeleteNodeRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public EnterpriseOrgDeleteNodeRequest setExt(java.util.Map<String, ?> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, ?> getExt() {
        return this.ext;
    }

    public EnterpriseOrgDeleteNodeRequest setIsOpenApi(Boolean isOpenApi) {
        this.isOpenApi = isOpenApi;
        return this;
    }
    public Boolean getIsOpenApi() {
        return this.isOpenApi;
    }

    public EnterpriseOrgDeleteNodeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public EnterpriseOrgDeleteNodeRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public EnterpriseOrgDeleteNodeRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseOrgDeleteNodeRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseOrgDeleteNodeRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public EnterpriseOrgDeleteNodeRequest setShowCompleteInfo(Boolean showCompleteInfo) {
        this.showCompleteInfo = showCompleteInfo;
        return this;
    }
    public Boolean getShowCompleteInfo() {
        return this.showCompleteInfo;
    }

    public EnterpriseOrgDeleteNodeRequest setTreeId(Long treeId) {
        this.treeId = treeId;
        return this;
    }
    public Long getTreeId() {
        return this.treeId;
    }

}
