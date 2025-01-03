// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteGroupMemberRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f0b1e61db5961df5975a93f9129d2513</p>
     */
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1789095186553536</p>
     */
    @NameInMap("aliyunPk")
    public String aliyunPk;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>USERS</p>
     */
    @NameInMap("memberType")
    public String memberType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6082a9b0c7972588ac363793</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static DeleteGroupMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupMemberRequest self = new DeleteGroupMemberRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGroupMemberRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public DeleteGroupMemberRequest setAliyunPk(String aliyunPk) {
        this.aliyunPk = aliyunPk;
        return this;
    }
    public String getAliyunPk() {
        return this.aliyunPk;
    }

    public DeleteGroupMemberRequest setMemberType(String memberType) {
        this.memberType = memberType;
        return this;
    }
    public String getMemberType() {
        return this.memberType;
    }

    public DeleteGroupMemberRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
