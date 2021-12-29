// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AddBsnFabricBizChainRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("Name")
    public String name;

    @NameInMap("NodeList")
    public String nodeList;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("UserCode")
    public String userCode;

    public static AddBsnFabricBizChainRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBsnFabricBizChainRequest self = new AddBsnFabricBizChainRequest();
        return TeaModel.build(map, self);
    }

    public AddBsnFabricBizChainRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public AddBsnFabricBizChainRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddBsnFabricBizChainRequest setNodeList(String nodeList) {
        this.nodeList = nodeList;
        return this;
    }
    public String getNodeList() {
        return this.nodeList;
    }

    public AddBsnFabricBizChainRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AddBsnFabricBizChainRequest setUserCode(String userCode) {
        this.userCode = userCode;
        return this;
    }
    public String getUserCode() {
        return this.userCode;
    }

}
