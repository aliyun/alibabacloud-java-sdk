// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class BatchAddDirectionalAddressRequest extends TeaModel {
    @NameInMap("AddressType")
    public String addressType;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("ListAddress")
    public java.util.List<String> listAddress;

    @NameInMap("Source")
    public String source;

    public static BatchAddDirectionalAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddDirectionalAddressRequest self = new BatchAddDirectionalAddressRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddDirectionalAddressRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public BatchAddDirectionalAddressRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public BatchAddDirectionalAddressRequest setListAddress(java.util.List<String> listAddress) {
        this.listAddress = listAddress;
        return this;
    }
    public java.util.List<String> getListAddress() {
        return this.listAddress;
    }

    public BatchAddDirectionalAddressRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
