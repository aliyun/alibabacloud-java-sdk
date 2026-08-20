// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListProhibitedSoftwareShrinkRequest extends TeaModel {
    /**
     * <p>The page number of the current page in a paged query. Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The operating system type for which the prohibited software has configured processes.</p>
     * 
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("DeviceType")
    public String deviceType;

    /**
     * <p>The name of the prohibited software.</p>
     * 
     * <strong>example:</strong>
     * <p>Thunder</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries per page in a paged query. Valid values: 1 to 500.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the software prohibition policy. You can obtain the value from the following operations:</p>
     * <ul>
     * <li><a href="~~ListProhibitedPolicies~~">ListProhibitedPolicies</a>: Lists software prohibition policies.</li>
     * <li><a href="~~CreateProhibitedPolicy~~">CreateProhibitedPolicy</a>: Creates a software prohibition policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pid-5a1e8c3f7b09****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The process name.</p>
     * 
     * <strong>example:</strong>
     * <p>Thunder.exe</p>
     */
    @NameInMap("ProcessName")
    public String processName;

    /**
     * <p>The collection of prohibited software IDs. Duplicate values are not allowed.</p>
     */
    @NameInMap("SoftwareIds")
    public java.util.List<ListProhibitedSoftwareShrinkRequestSoftwareIds> softwareIds;

    /**
     * <p>The unique identifier of the prohibited software tag.</p>
     */
    @NameInMap("TagId")
    public String tagIdShrink;

    public static ListProhibitedSoftwareShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProhibitedSoftwareShrinkRequest self = new ListProhibitedSoftwareShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListProhibitedSoftwareShrinkRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListProhibitedSoftwareShrinkRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public ListProhibitedSoftwareShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListProhibitedSoftwareShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListProhibitedSoftwareShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ListProhibitedSoftwareShrinkRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public ListProhibitedSoftwareShrinkRequest setSoftwareIds(java.util.List<ListProhibitedSoftwareShrinkRequestSoftwareIds> softwareIds) {
        this.softwareIds = softwareIds;
        return this;
    }
    public java.util.List<ListProhibitedSoftwareShrinkRequestSoftwareIds> getSoftwareIds() {
        return this.softwareIds;
    }

    public ListProhibitedSoftwareShrinkRequest setTagIdShrink(String tagIdShrink) {
        this.tagIdShrink = tagIdShrink;
        return this;
    }
    public String getTagIdShrink() {
        return this.tagIdShrink;
    }

    public static class ListProhibitedSoftwareShrinkRequestSoftwareIds extends TeaModel {
        /**
         * <p>Indicates whether the prohibited software is a system built-in prohibited software. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: A system built-in prohibited software that is shared across all Alibaba Cloud accounts and cannot be modified or deleted.</li>
         * <li><strong>false</strong>: Custom prohibited software under the current Alibaba Cloud account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The ID of the prohibited software. You can obtain the value from the following operations:</p>
         * <ul>
         * <li><a href="~~ListProhibitedSoftware~~">ListProhibitedSoftware</a>: Lists prohibited software.</li>
         * <li><a href="~~CreateProhibitedSoftware~~">CreateProhibitedSoftware</a>: Creates custom prohibited software.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>swb-d9f669a09746****</p>
         */
        @NameInMap("SoftwareId")
        public String softwareId;

        public static ListProhibitedSoftwareShrinkRequestSoftwareIds build(java.util.Map<String, ?> map) throws Exception {
            ListProhibitedSoftwareShrinkRequestSoftwareIds self = new ListProhibitedSoftwareShrinkRequestSoftwareIds();
            return TeaModel.build(map, self);
        }

        public ListProhibitedSoftwareShrinkRequestSoftwareIds setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListProhibitedSoftwareShrinkRequestSoftwareIds setSoftwareId(String softwareId) {
            this.softwareId = softwareId;
            return this;
        }
        public String getSoftwareId() {
            return this.softwareId;
        }

    }

}
