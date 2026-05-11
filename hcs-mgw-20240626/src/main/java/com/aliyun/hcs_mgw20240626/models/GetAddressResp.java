// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetAddressResp extends TeaModel {
    /**
     * <p>The details of the data address.</p>
     */
    @NameInMap("AddressDetail")
    public AddressDetail addressDetail;

    /**
     * <p>The time when the data address was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-01 12:00:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The time when the data address was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-01 12:00:00</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <p>The name of the data address.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The owner of the data address.</p>
     * 
     * <strong>example:</strong>
     * <p>test_owner</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The state of the data address.</p>
     * 
     * <strong>example:</strong>
     * <p>avaliable</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags.</p>
     * 
     * <strong>example:</strong>
     * <p>K1:V1,K2:V2</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The verification result of the data address.</p>
     */
    @NameInMap("VerifyResult")
    public VerifyResp verifyResult;

    /**
     * <p>The time when the data address was verified.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-01 12:00:00</p>
     */
    @NameInMap("VerifyTime")
    public String verifyTime;

    /**
     * <p>The ID of the data address.</p>
     * 
     * <strong>example:</strong>
     * <p>test_id</p>
     */
    @NameInMap("Version")
    public String version;

    public static GetAddressResp build(java.util.Map<String, ?> map) throws Exception {
        GetAddressResp self = new GetAddressResp();
        return TeaModel.build(map, self);
    }

    public GetAddressResp setAddressDetail(AddressDetail addressDetail) {
        this.addressDetail = addressDetail;
        return this;
    }
    public AddressDetail getAddressDetail() {
        return this.addressDetail;
    }

    public GetAddressResp setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetAddressResp setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public GetAddressResp setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetAddressResp setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public GetAddressResp setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetAddressResp setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public GetAddressResp setVerifyResult(VerifyResp verifyResult) {
        this.verifyResult = verifyResult;
        return this;
    }
    public VerifyResp getVerifyResult() {
        return this.verifyResult;
    }

    public GetAddressResp setVerifyTime(String verifyTime) {
        this.verifyTime = verifyTime;
        return this;
    }
    public String getVerifyTime() {
        return this.verifyTime;
    }

    public GetAddressResp setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
