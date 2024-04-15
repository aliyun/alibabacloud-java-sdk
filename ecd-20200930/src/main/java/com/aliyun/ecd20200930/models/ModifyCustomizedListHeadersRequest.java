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
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   desktop: cloud computer</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("ListType")
    public String listType;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
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
         * <br>
         * <p>> For the desktop_id_name and office_site_id_name head keys, set the value of this parameter to required. For other header keys, set the value of this parameter to display or hide based on your requirements.</p>
         */
        @NameInMap("DisplayType")
        public String displayType;

        /**
         * <p>The key of the header.</p>
         * <br>
         * <p>> All header keys of the list must be specified.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   desktop_id_name: the IDs and names of the cloud computers.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   system_data_disk: the system disks and data disks of the cloud computers.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   office_site_type: the office network types of the cloud computers.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   create_time: the time when the cloud computers are created.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   ip: the IP addresses of the cloud computers.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   spec_system_protocol: the instance types, OSs, and protocol types of the cloud computers.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   monitor: the monitoring information of the cloud computers.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   assigned_users: the number of end users that are assigned to the cloud computers.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   encryption: indicates whether the cloud computers are encrypted.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   office_site_id_name: the IDs and names of the office networks.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   pay_type: the billing methods of the cloud computers.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   tag: the tags that are attached to the cloud computers.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   hostname: the hostnames of the cloud computers.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   status: the statuses of the cloud computers.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   current_user: the current end users of the cloud computers.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
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
