// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAppInstanceGroupRequest extends TeaModel {
    /**
     * <p>The ID of the app image. You can obtain the ID from the Image Management page in the WUYING Cloud App console.</p>
     * 
     * <strong>example:</strong>
     * <p>img-8z4nztpaqvay4****</p>
     */
    @NameInMap("AppCenterImageId")
    public String appCenterImageId;

    /**
     * <p>The ID of the app instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The name of the app instance group. Fuzzy match is supported. For example, if you specify <code>Office App</code>, app instance groups whose names contain <code>Office App</code> are queried, such as <code>My Office App</code> and <code>Office App A</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Office App</p>
     */
    @NameInMap("AppInstanceGroupName")
    public String appInstanceGroupName;

    /**
     * <p>The ID of the region to which the app instance group belongs. For more information about supported regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Limits</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The list of excluded authorization user group IDs.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("ExcludedUserGroupIds")
    public java.util.List<String> excludedUserGroupIds;

    /**
     * <p>The ID of the instance type for the purchased resources. You can obtain the ID by calling the <a href="~~ListNodeInstanceType~~">ListNodeInstanceType</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>appstreaming.vgpu.4c8g.2g</p>
     */
    @NameInMap("NodeInstanceType")
    public String nodeInstanceType;

    /**
     * <p>The ID of the office network.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hongkong+dir-643067****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. The value cannot exceed <code>100</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    @Deprecated
    public String regionId;

    /**
     * <p>The statuses of the app instance groups.</p>
     */
    @NameInMap("Status")
    public java.util.List<String> status;

    /**
     * <p>The list of tags.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListAppInstanceGroupRequestTag> tag;

    /**
     * <p>The list of authorized user group IDs.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    public static ListAppInstanceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppInstanceGroupRequest self = new ListAppInstanceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListAppInstanceGroupRequest setAppCenterImageId(String appCenterImageId) {
        this.appCenterImageId = appCenterImageId;
        return this;
    }
    public String getAppCenterImageId() {
        return this.appCenterImageId;
    }

    public ListAppInstanceGroupRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public ListAppInstanceGroupRequest setAppInstanceGroupName(String appInstanceGroupName) {
        this.appInstanceGroupName = appInstanceGroupName;
        return this;
    }
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    public ListAppInstanceGroupRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public ListAppInstanceGroupRequest setExcludedUserGroupIds(java.util.List<String> excludedUserGroupIds) {
        this.excludedUserGroupIds = excludedUserGroupIds;
        return this;
    }
    public java.util.List<String> getExcludedUserGroupIds() {
        return this.excludedUserGroupIds;
    }

    public ListAppInstanceGroupRequest setNodeInstanceType(String nodeInstanceType) {
        this.nodeInstanceType = nodeInstanceType;
        return this;
    }
    public String getNodeInstanceType() {
        return this.nodeInstanceType;
    }

    public ListAppInstanceGroupRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ListAppInstanceGroupRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppInstanceGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppInstanceGroupRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    @Deprecated
    public ListAppInstanceGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAppInstanceGroupRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

    public ListAppInstanceGroupRequest setTag(java.util.List<ListAppInstanceGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListAppInstanceGroupRequestTag> getTag() {
        return this.tag;
    }

    public ListAppInstanceGroupRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public static class ListAppInstanceGroupRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>design</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAppInstanceGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListAppInstanceGroupRequestTag self = new ListAppInstanceGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public ListAppInstanceGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAppInstanceGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
