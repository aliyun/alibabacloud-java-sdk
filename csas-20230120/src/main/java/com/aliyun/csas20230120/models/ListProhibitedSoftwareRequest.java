// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListProhibitedSoftwareRequest extends TeaModel {
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
    public java.util.List<ListProhibitedSoftwareRequestSoftwareIds> softwareIds;

    /**
     * <p>The unique identifier of the prohibited software tag.</p>
     */
    @NameInMap("TagId")
    public ListProhibitedSoftwareRequestTagId tagId;

    public static ListProhibitedSoftwareRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProhibitedSoftwareRequest self = new ListProhibitedSoftwareRequest();
        return TeaModel.build(map, self);
    }

    public ListProhibitedSoftwareRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListProhibitedSoftwareRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public ListProhibitedSoftwareRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListProhibitedSoftwareRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListProhibitedSoftwareRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ListProhibitedSoftwareRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public ListProhibitedSoftwareRequest setSoftwareIds(java.util.List<ListProhibitedSoftwareRequestSoftwareIds> softwareIds) {
        this.softwareIds = softwareIds;
        return this;
    }
    public java.util.List<ListProhibitedSoftwareRequestSoftwareIds> getSoftwareIds() {
        return this.softwareIds;
    }

    public ListProhibitedSoftwareRequest setTagId(ListProhibitedSoftwareRequestTagId tagId) {
        this.tagId = tagId;
        return this;
    }
    public ListProhibitedSoftwareRequestTagId getTagId() {
        return this.tagId;
    }

    public static class ListProhibitedSoftwareRequestSoftwareIds extends TeaModel {
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

        public static ListProhibitedSoftwareRequestSoftwareIds build(java.util.Map<String, ?> map) throws Exception {
            ListProhibitedSoftwareRequestSoftwareIds self = new ListProhibitedSoftwareRequestSoftwareIds();
            return TeaModel.build(map, self);
        }

        public ListProhibitedSoftwareRequestSoftwareIds setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListProhibitedSoftwareRequestSoftwareIds setSoftwareId(String softwareId) {
            this.softwareId = softwareId;
            return this;
        }
        public String getSoftwareId() {
            return this.softwareId;
        }

    }

    public static class ListProhibitedSoftwareRequestTagId extends TeaModel {
        /**
         * <p>Indicates whether the prohibited software tag is a system built-in tag. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: A system built-in tag that is shared across all Alibaba Cloud accounts and cannot be modified or deleted.</li>
         * <li><strong>false</strong>: A custom tag under the current Alibaba Cloud account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The ID of the prohibited software tag. You can obtain the value from the following operations:</p>
         * <ul>
         * <li><a href="~~ListProhibitedTags~~">ListProhibitedTags</a>: Lists prohibited software tags.</li>
         * <li><a href="~~CreateProhibitedTag~~">CreateProhibitedTag</a>: Creates a custom prohibited software tag.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tag-7b2c9e4a1d8f****</p>
         */
        @NameInMap("TagId")
        public String tagId;

        public static ListProhibitedSoftwareRequestTagId build(java.util.Map<String, ?> map) throws Exception {
            ListProhibitedSoftwareRequestTagId self = new ListProhibitedSoftwareRequestTagId();
            return TeaModel.build(map, self);
        }

        public ListProhibitedSoftwareRequestTagId setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListProhibitedSoftwareRequestTagId setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

    }

}
