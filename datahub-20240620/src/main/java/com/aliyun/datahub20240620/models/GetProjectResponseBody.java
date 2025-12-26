// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class GetProjectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <strong>example:</strong>
     * <p>1724041098000</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>1559031978056215</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <strong>example:</strong>
     * <p>test_project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>A20A7093-8FE0-058C-BE0C-3C8057D5F1A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>12252454</p>
     */
    @NameInMap("Storage")
    public Long storage;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1724041098000</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <strong>example:</strong>
     * <p>[11.22.33.44]</p>
     */
    @NameInMap("VpcWhitelist")
    public String vpcWhitelist;

    public static GetProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectResponseBody self = new GetProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectResponseBody setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public GetProjectResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetProjectResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetProjectResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectResponseBody setStorage(Long storage) {
        this.storage = storage;
        return this;
    }
    public Long getStorage() {
        return this.storage;
    }

    public GetProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetProjectResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetProjectResponseBody setVpcWhitelist(String vpcWhitelist) {
        this.vpcWhitelist = vpcWhitelist;
        return this;
    }
    public String getVpcWhitelist() {
        return this.vpcWhitelist;
    }

}
