// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class SearchAlertContactGroupRequest extends TeaModel {
    @NameInMap("ContactGroupName")
    public String contactGroupName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("ContactId")
    public Long contactId;

    @NameInMap("ContactGroupIds")
    public String contactGroupIds;

    @NameInMap("IsDetail")
    public Boolean isDetail;

    public static SearchAlertContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertContactGroupRequest self = new SearchAlertContactGroupRequest();
        return TeaModel.build(map, self);
    }

    public SearchAlertContactGroupRequest setContactGroupName(String contactGroupName) {
        this.contactGroupName = contactGroupName;
        return this;
    }
    public String getContactGroupName() {
        return this.contactGroupName;
    }

    public SearchAlertContactGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SearchAlertContactGroupRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public SearchAlertContactGroupRequest setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public SearchAlertContactGroupRequest setContactGroupIds(String contactGroupIds) {
        this.contactGroupIds = contactGroupIds;
        return this;
    }
    public String getContactGroupIds() {
        return this.contactGroupIds;
    }

    public SearchAlertContactGroupRequest setIsDetail(Boolean isDetail) {
        this.isDetail = isDetail;
        return this;
    }
    public Boolean getIsDetail() {
        return this.isDetail;
    }

}
