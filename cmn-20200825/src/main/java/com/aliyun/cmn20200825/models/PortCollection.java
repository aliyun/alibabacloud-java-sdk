// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class PortCollection extends TeaModel {
    // 创建时间
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // 修改时间
    @NameInMap("GmtModified")
    public String gmtModified;

    // 描述
    @NameInMap("PortCollectionDescription")
    public String portCollectionDescription;

    // 端口集ID
    @NameInMap("PortCollectionId")
    public String portCollectionId;

    // 端口集名称
    @NameInMap("PortCollectionName")
    public String portCollectionName;

    // 端口列表
    @NameInMap("PortList")
    public java.util.List<Port> portList;

    public static PortCollection build(java.util.Map<String, ?> map) throws Exception {
        PortCollection self = new PortCollection();
        return TeaModel.build(map, self);
    }

    public PortCollection setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public PortCollection setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public PortCollection setPortCollectionDescription(String portCollectionDescription) {
        this.portCollectionDescription = portCollectionDescription;
        return this;
    }
    public String getPortCollectionDescription() {
        return this.portCollectionDescription;
    }

    public PortCollection setPortCollectionId(String portCollectionId) {
        this.portCollectionId = portCollectionId;
        return this;
    }
    public String getPortCollectionId() {
        return this.portCollectionId;
    }

    public PortCollection setPortCollectionName(String portCollectionName) {
        this.portCollectionName = portCollectionName;
        return this;
    }
    public String getPortCollectionName() {
        return this.portCollectionName;
    }

    public PortCollection setPortList(java.util.List<Port> portList) {
        this.portList = portList;
        return this;
    }
    public java.util.List<Port> getPortList() {
        return this.portList;
    }

}
