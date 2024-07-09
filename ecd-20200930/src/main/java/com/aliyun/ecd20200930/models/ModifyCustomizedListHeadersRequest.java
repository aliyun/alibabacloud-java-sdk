// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCustomizedListHeadersRequest extends TeaModel {
    /**
     * <p>The headers.</p>
     */
    @NameInMap("Headers")
    public java.util.List<ModifyCustomizedListHeadersRequestHeaders> headers;

    /**
     * <p>The type of the list.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>desktop: cloud computer</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desktop</p>
     */
    @NameInMap("ListType")
    public String listType;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyCustomizedListHeadersRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomizedListHeadersRequest self = new ModifyCustomizedListHeadersRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCustomizedListHeadersRequest setHeaders(java.util.List<ModifyCustomizedListHeadersRequestHeaders> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.List<ModifyCustomizedListHeadersRequestHeaders> getHeaders() {
        return this.headers;
    }

    public ModifyCustomizedListHeadersRequest setListType(String listType) {
        this.listType = listType;
        return this;
    }
    public String getListType() {
        return this.listType;
    }

    public ModifyCustomizedListHeadersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyCustomizedListHeadersRequestHeaders extends TeaModel {
        /**
         * <p>The display type of the header.</p>
         * <blockquote>
         * <p>For the desktop_id_name and office_site_id_name head keys, set the value of this parameter to required. For other header keys, set the value of this parameter to display or hide based on your requirements.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>display</p>
         */
        @NameInMap("DisplayType")
        public String displayType;

        /**
         * <p>The key of the header.</p>
         * <blockquote>
         * <p>All header keys of the list must be specified.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>desktop_id_name: the IDs and names of the cloud computers.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>system_data_disk: the system disks and data disks of the cloud computers.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>office_site_type: the office network types of the cloud computers.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>create_time: the time when the cloud computers are created.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>ip: the IP addresses of the cloud computers.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>spec_system_protocol: the instance types, OSs, and protocol types of the cloud computers.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>monitor: the monitoring information of the cloud computers.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>assigned_users: the number of end users that are assigned to the cloud computers.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>encryption: indicates whether the cloud computers are encrypted.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>office_site_id_name: the IDs and names of the office networks.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>pay_type: the billing methods of the cloud computers.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>tag: the tags that are attached to the cloud computers.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>hostname: the hostnames of the cloud computers.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>status: the statuses of the cloud computers.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>current_user: the current end users of the cloud computers.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pay_type</p>
         */
        @NameInMap("HeaderKey")
        public String headerKey;

        public static ModifyCustomizedListHeadersRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            ModifyCustomizedListHeadersRequestHeaders self = new ModifyCustomizedListHeadersRequestHeaders();
            return TeaModel.build(map, self);
        }

        public ModifyCustomizedListHeadersRequestHeaders setDisplayType(String displayType) {
            this.displayType = displayType;
            return this;
        }
        public String getDisplayType() {
            return this.displayType;
        }

        public ModifyCustomizedListHeadersRequestHeaders setHeaderKey(String headerKey) {
            this.headerKey = headerKey;
            return this;
        }
        public String getHeaderKey() {
            return this.headerKey;
        }

    }

}
