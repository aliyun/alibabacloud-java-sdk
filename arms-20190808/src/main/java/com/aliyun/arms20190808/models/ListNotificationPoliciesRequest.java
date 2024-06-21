// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListNotificationPoliciesRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable simple mode.</p>
     */
    @NameInMap("DirectedMode")
    public Boolean directedMode;

    /**
     * <p>The ID of the notification policy.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>Specifies whether to query the details about notification policies. Valid values:</p>
     * <ul>
     * <li><code>true</code>: Details about notification policies are queried.</li>
     * <li><code>false</code>: Details about notification policies are not queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsDetail")
    public Boolean isDetail;

    /**
     * <p>The name of the notification policy.</p>
     * 
     * <strong>example:</strong>
     * <p>notificationpolicy_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of the page to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Long page;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Size")
    public Long size;

    public static ListNotificationPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNotificationPoliciesRequest self = new ListNotificationPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListNotificationPoliciesRequest setDirectedMode(Boolean directedMode) {
        this.directedMode = directedMode;
        return this;
    }
    public Boolean getDirectedMode() {
        return this.directedMode;
    }

    public ListNotificationPoliciesRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public ListNotificationPoliciesRequest setIsDetail(Boolean isDetail) {
        this.isDetail = isDetail;
        return this;
    }
    public Boolean getIsDetail() {
        return this.isDetail;
    }

    public ListNotificationPoliciesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListNotificationPoliciesRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListNotificationPoliciesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListNotificationPoliciesRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
