// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertContactGroupRequest extends TeaModel {
    // The ID of the alert contact group. You can query multiple alert contact groups at a time. Separate multiple group IDs with commas (,).
    @NameInMap("ContactGroupIds")
    public String contactGroupIds;

    // The name of the alert contact group.
    @NameInMap("ContactGroupName")
    public String contactGroupName;

    // The ID of the alert contact. You can call the SearchAlertContact operation to query the contact IDs. For more information, see [SearchAlertContact](~~130703~~).
    @NameInMap("ContactId")
    public Long contactId;

    // The name of the alert contact.
    @NameInMap("ContactName")
    public String contactName;

    // Specifies whether to return all the alert contacts in the queried alert contact group. Default value: false.
    @NameInMap("IsDetail")
    public Boolean isDetail;

    // The ID of the region. Default value: `cn-hangzhou`.
    @NameInMap("RegionId")
    public String regionId;

    public static SearchAlertContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertContactGroupRequest self = new SearchAlertContactGroupRequest();
        return TeaModel.build(map, self);
    }

    public SearchAlertContactGroupRequest setContactGroupIds(String contactGroupIds) {
        this.contactGroupIds = contactGroupIds;
        return this;
    }
    public String getContactGroupIds() {
        return this.contactGroupIds;
    }

    public SearchAlertContactGroupRequest setContactGroupName(String contactGroupName) {
        this.contactGroupName = contactGroupName;
        return this;
    }
    public String getContactGroupName() {
        return this.contactGroupName;
    }

    public SearchAlertContactGroupRequest setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public SearchAlertContactGroupRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public SearchAlertContactGroupRequest setIsDetail(Boolean isDetail) {
        this.isDetail = isDetail;
        return this;
    }
    public Boolean getIsDetail() {
        return this.isDetail;
    }

    public SearchAlertContactGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
