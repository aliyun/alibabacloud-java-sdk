// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribePerspectiveResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreateUserName")
    public String createUserName;

    @NameInMap("ModifyTime")
    public String modifyTime;

    @NameInMap("ModifyUserName")
    public String modifyUserName;

    @NameInMap("Name")
    public String name;

    @NameInMap("PerspectiveCode")
    public String perspectiveCode;

    @NameInMap("PerspectiveId")
    public String perspectiveId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SelfDefine")
    public Boolean selfDefine;

    @NameInMap("Status")
    public Integer status;

    public static DescribePerspectiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePerspectiveResponseBody self = new DescribePerspectiveResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePerspectiveResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribePerspectiveResponseBody setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }
    public String getCreateUserName() {
        return this.createUserName;
    }

    public DescribePerspectiveResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public DescribePerspectiveResponseBody setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
        return this;
    }
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    public DescribePerspectiveResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribePerspectiveResponseBody setPerspectiveCode(String perspectiveCode) {
        this.perspectiveCode = perspectiveCode;
        return this;
    }
    public String getPerspectiveCode() {
        return this.perspectiveCode;
    }

    public DescribePerspectiveResponseBody setPerspectiveId(String perspectiveId) {
        this.perspectiveId = perspectiveId;
        return this;
    }
    public String getPerspectiveId() {
        return this.perspectiveId;
    }

    public DescribePerspectiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePerspectiveResponseBody setSelfDefine(Boolean selfDefine) {
        this.selfDefine = selfDefine;
        return this;
    }
    public Boolean getSelfDefine() {
        return this.selfDefine;
    }

    public DescribePerspectiveResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
