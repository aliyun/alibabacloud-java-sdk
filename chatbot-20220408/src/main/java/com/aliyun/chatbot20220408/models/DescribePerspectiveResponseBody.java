// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DescribePerspectiveResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2021-07-27T07:05:37Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>2021-07-26T07:05:37Z</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <strong>example:</strong>
     * <p>移动端视角</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>FZJBY3raWr</p>
     */
    @NameInMap("PerspectiveCode")
    public String perspectiveCode;

    /**
     * <strong>example:</strong>
     * <p>3001</p>
     */
    @NameInMap("PerspectiveId")
    public String perspectiveId;

    /**
     * <strong>example:</strong>
     * <p>F285D735-D580-18A8-B97F-B2E72B00F101</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SelfDefine")
    public Boolean selfDefine;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
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

    public DescribePerspectiveResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
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
