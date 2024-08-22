// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateAlertContactGroupRequest extends TeaModel {
    /**
     * <p>The name of the alert contact group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestGroup</p>
     */
    @NameInMap("ContactGroupName")
    public String contactGroupName;

    /**
     * <p>The IDs of contacts in the contact group. Separate multiple contact IDs with spaces. You can call the SearchAlertContact operation to query the contact IDs. For more information, see <a href="https://help.aliyun.com/document_detail/130703.html">SearchAlertContact</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>12* 23* 34*</p>
     */
    @NameInMap("ContactIds")
    public String contactIds;

    /**
     * <p>The ID of the region. Default value: <code>cn-hangzhou</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateAlertContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertContactGroupRequest self = new CreateAlertContactGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlertContactGroupRequest setContactGroupName(String contactGroupName) {
        this.contactGroupName = contactGroupName;
        return this;
    }
    public String getContactGroupName() {
        return this.contactGroupName;
    }

    public CreateAlertContactGroupRequest setContactIds(String contactIds) {
        this.contactIds = contactIds;
        return this;
    }
    public String getContactIds() {
        return this.contactIds;
    }

    public CreateAlertContactGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
