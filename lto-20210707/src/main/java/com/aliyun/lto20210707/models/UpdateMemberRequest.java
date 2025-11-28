// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class UpdateMemberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuthorizedCount")
    public Long authorizedCount;

    @NameInMap("AuthorizedDeviceCount")
    public Integer authorizedDeviceCount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Contactor")
    public String contactor;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MemberId")
    public String memberId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Remark")
    public String remark;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Telephony")
    public String telephony;

    @NameInMap("Uid")
    public String uid;

    public static UpdateMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemberRequest self = new UpdateMemberRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMemberRequest setAuthorizedCount(Long authorizedCount) {
        this.authorizedCount = authorizedCount;
        return this;
    }
    public Long getAuthorizedCount() {
        return this.authorizedCount;
    }

    public UpdateMemberRequest setAuthorizedDeviceCount(Integer authorizedDeviceCount) {
        this.authorizedDeviceCount = authorizedDeviceCount;
        return this;
    }
    public Integer getAuthorizedDeviceCount() {
        return this.authorizedDeviceCount;
    }

    public UpdateMemberRequest setContactor(String contactor) {
        this.contactor = contactor;
        return this;
    }
    public String getContactor() {
        return this.contactor;
    }

    public UpdateMemberRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public UpdateMemberRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMemberRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateMemberRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateMemberRequest setTelephony(String telephony) {
        this.telephony = telephony;
        return this;
    }
    public String getTelephony() {
        return this.telephony;
    }

    public UpdateMemberRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
